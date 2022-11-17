package at.jku.se.dbml.generator;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.module.eer.mm.moduleeer.*;
import org.module.eer.mm.moduleeer.Module;

import at.jku.se.dbml.dBML.*;
import at.jku.se.dbml.dBML.Attribute;

public class DBML2ER {
	public static void transform(Model model, URI uri) {
		Map<Table, EntityType> table2entity = new HashMap<>();
		MEERModel res = ModuleeerFactory.eINSTANCE.createMEERModel();
		Module module = ModuleeerFactory.eINSTANCE.createModule();
		res.getModules().add(module);
		for (Statement s : model.getStatements()) {
			if (s instanceof Table) {
				Table t = (Table) s;
				EntityType e = ModuleeerFactory.eINSTANCE.createEntityType();
				e.setName(t.getName());
				for(Attribute a:t.getAttributes()) {
					SingleAttribute attr = ModuleeerFactory.eINSTANCE.createSingleAttribute();
					attr.setName(a.getName());
					attr.setType(getAttrType(a.getType()));
					e.getAttributes().add(attr);
				}
				table2entity.put(t, e);
				module.getModularizableElements().add(e);
			} else if (s instanceof Ref) {
				Ref r = (Ref) s;
				RelationshipType relation = ModuleeerFactory.eINSTANCE.createRelationshipType();
				String left = r.getLeft().getTable().getName() + ":" + r.getLeft().getAttr();
				String right = r.getRight().getTable().getName() + ":" + r.getRight().getAttr();
				relation.setName(left + " - " + right);
				LinkToEntity lLink = ModuleeerFactory.eINSTANCE.createLinkToEntity();
				lLink.setEntity(table2entity.get(r.getLeft().getTable()));
				LinkToEntity rLink = ModuleeerFactory.eINSTANCE.createLinkToEntity();
				rLink.setEntity(table2entity.get(r.getRight().getTable()));
				relation.getLinksToEntities().add(lLink);
				relation.getLinksToEntities().add(rLink);
				module.getModularizableElements().add(relation);
			}
		}

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("er", new XMIResourceFactoryImpl());

        // Obtain a new resource set
        ResourceSet resSet = new ResourceSetImpl();

        // create a resource
        Resource resource = resSet.createResource(uri);
        // Get the first model element and cast it to the right type, in my
        // example everything is hierarchical included in this first node
        resource.getContents().add(res);

        // now save the content.
        saveRecourceAsXmi(resource, uri);
		
	}
	
	public static void saveRecourceAsXmi(Resource resource, URI uri) {
		try {
			Map<String, String> saveOptions = new HashMap<String, String>();
			Resource xmiResource = new XMIResourceImpl(uri);
			xmiResource.getContents().add(resource.getContents().get(0));
			saveOptions.put(org.eclipse.emf.ecore.xmi.XMLResource.OPTION_ENCODING,"UTF-8");
			xmiResource.save(saveOptions);
			System.out.println("Xmi file created.");
			System.out.println(xmiResource.getURI().toFileString());
		} catch (IOException e) {
			System.out.println("Error during creating Xmi.");
			e.printStackTrace();
		}
	}
	
	public static AttributeType getAttrType(String type) {
		for(Map.Entry<String, AttributeType> e: DBMLGenerator.myMap.entrySet()) {
			if(type.startsWith(e.getKey())) {
				return e.getValue();
			}
		}
		return AttributeType.STRING;
	}
}
