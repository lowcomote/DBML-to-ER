package at.jku.se.dbml.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import at.jku.se.dbml.services.DBMLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDBMLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'pk'", "'increment'", "'BOOLEAN'", "'BIT'", "'INT'", "'INTEGER'", "'FLOAT'", "'BIGINT'", "'SMALLINT'", "'BYTE'", "'TIMESTAMP'", "'DATE'", "'DATETIME'", "'TEXT'", "'LONGTEXT'", "'jsonb'", "'json'", "'JSON'", "'Table'", "'\"'", "'{'", "'}'", "'Indexes'", "'['", "'unique,'", "']'", "'('", "')'", "','", "'name:'", "'not'", "'null'", "'TINYINT'", "'MEDIUMTEXT'", "'CHAR('", "'VARCHAR('", "'NCHAR('", "'NVARCHAR('", "'DECIMAL('", "'DOUBLE'", "'timestamp('", "'Ref'", "':'", "'<'", "'\":'", "'.'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__10=10;
    public static final int T__54=54;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=6;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_SL_COMMENT=7;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=8;
    public static final int RULE_ANY_OTHER=9;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalDBMLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDBMLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDBMLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDBML.g"; }


    	private DBMLGrammarAccess grammarAccess;

    	public void setGrammarAccess(DBMLGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalDBML.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalDBML.g:54:1: ( ruleModel EOF )
            // InternalDBML.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalDBML.g:62:1: ruleModel : ( ( rule__Model__StatementsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:66:2: ( ( ( rule__Model__StatementsAssignment )* ) )
            // InternalDBML.g:67:2: ( ( rule__Model__StatementsAssignment )* )
            {
            // InternalDBML.g:67:2: ( ( rule__Model__StatementsAssignment )* )
            // InternalDBML.g:68:3: ( rule__Model__StatementsAssignment )*
            {
             before(grammarAccess.getModelAccess().getStatementsAssignment()); 
            // InternalDBML.g:69:3: ( rule__Model__StatementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==28||LA1_0==51) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDBML.g:69:4: rule__Model__StatementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__StatementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getStatementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleStatement"
    // InternalDBML.g:78:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalDBML.g:79:1: ( ruleStatement EOF )
            // InternalDBML.g:80:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalDBML.g:87:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:91:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalDBML.g:92:2: ( ( rule__Statement__Alternatives ) )
            {
            // InternalDBML.g:92:2: ( ( rule__Statement__Alternatives ) )
            // InternalDBML.g:93:3: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // InternalDBML.g:94:3: ( rule__Statement__Alternatives )
            // InternalDBML.g:94:4: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleTable"
    // InternalDBML.g:103:1: entryRuleTable : ruleTable EOF ;
    public final void entryRuleTable() throws RecognitionException {
        try {
            // InternalDBML.g:104:1: ( ruleTable EOF )
            // InternalDBML.g:105:1: ruleTable EOF
            {
             before(grammarAccess.getTableRule()); 
            pushFollow(FOLLOW_1);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getTableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTable"


    // $ANTLR start "ruleTable"
    // InternalDBML.g:112:1: ruleTable : ( ( rule__Table__Group__0 ) ) ;
    public final void ruleTable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:116:2: ( ( ( rule__Table__Group__0 ) ) )
            // InternalDBML.g:117:2: ( ( rule__Table__Group__0 ) )
            {
            // InternalDBML.g:117:2: ( ( rule__Table__Group__0 ) )
            // InternalDBML.g:118:3: ( rule__Table__Group__0 )
            {
             before(grammarAccess.getTableAccess().getGroup()); 
            // InternalDBML.g:119:3: ( rule__Table__Group__0 )
            // InternalDBML.g:119:4: rule__Table__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Table__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTable"


    // $ANTLR start "entryRuleIndex"
    // InternalDBML.g:128:1: entryRuleIndex : ruleIndex EOF ;
    public final void entryRuleIndex() throws RecognitionException {
        try {
            // InternalDBML.g:129:1: ( ruleIndex EOF )
            // InternalDBML.g:130:1: ruleIndex EOF
            {
             before(grammarAccess.getIndexRule()); 
            pushFollow(FOLLOW_1);
            ruleIndex();

            state._fsp--;

             after(grammarAccess.getIndexRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIndex"


    // $ANTLR start "ruleIndex"
    // InternalDBML.g:137:1: ruleIndex : ( ( rule__Index__Group__0 ) ) ;
    public final void ruleIndex() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:141:2: ( ( ( rule__Index__Group__0 ) ) )
            // InternalDBML.g:142:2: ( ( rule__Index__Group__0 ) )
            {
            // InternalDBML.g:142:2: ( ( rule__Index__Group__0 ) )
            // InternalDBML.g:143:3: ( rule__Index__Group__0 )
            {
             before(grammarAccess.getIndexAccess().getGroup()); 
            // InternalDBML.g:144:3: ( rule__Index__Group__0 )
            // InternalDBML.g:144:4: rule__Index__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Index__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIndexAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIndex"


    // $ANTLR start "entryRuleAttribute"
    // InternalDBML.g:153:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalDBML.g:154:1: ( ruleAttribute EOF )
            // InternalDBML.g:155:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalDBML.g:162:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:166:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalDBML.g:167:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalDBML.g:167:2: ( ( rule__Attribute__Group__0 ) )
            // InternalDBML.g:168:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalDBML.g:169:3: ( rule__Attribute__Group__0 )
            // InternalDBML.g:169:4: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleOptional"
    // InternalDBML.g:178:1: entryRuleOptional : ruleOptional EOF ;
    public final void entryRuleOptional() throws RecognitionException {
        try {
            // InternalDBML.g:179:1: ( ruleOptional EOF )
            // InternalDBML.g:180:1: ruleOptional EOF
            {
             before(grammarAccess.getOptionalRule()); 
            pushFollow(FOLLOW_1);
            ruleOptional();

            state._fsp--;

             after(grammarAccess.getOptionalRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOptional"


    // $ANTLR start "ruleOptional"
    // InternalDBML.g:187:1: ruleOptional : ( ( rule__Optional__Alternatives ) ) ;
    public final void ruleOptional() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:191:2: ( ( ( rule__Optional__Alternatives ) ) )
            // InternalDBML.g:192:2: ( ( rule__Optional__Alternatives ) )
            {
            // InternalDBML.g:192:2: ( ( rule__Optional__Alternatives ) )
            // InternalDBML.g:193:3: ( rule__Optional__Alternatives )
            {
             before(grammarAccess.getOptionalAccess().getAlternatives()); 
            // InternalDBML.g:194:3: ( rule__Optional__Alternatives )
            // InternalDBML.g:194:4: rule__Optional__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Optional__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOptionalAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOptional"


    // $ANTLR start "entryRuleType"
    // InternalDBML.g:203:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalDBML.g:204:1: ( ruleType EOF )
            // InternalDBML.g:205:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalDBML.g:212:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:216:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalDBML.g:217:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalDBML.g:217:2: ( ( rule__Type__Alternatives ) )
            // InternalDBML.g:218:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalDBML.g:219:3: ( rule__Type__Alternatives )
            // InternalDBML.g:219:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleRef"
    // InternalDBML.g:228:1: entryRuleRef : ruleRef EOF ;
    public final void entryRuleRef() throws RecognitionException {
        try {
            // InternalDBML.g:229:1: ( ruleRef EOF )
            // InternalDBML.g:230:1: ruleRef EOF
            {
             before(grammarAccess.getRefRule()); 
            pushFollow(FOLLOW_1);
            ruleRef();

            state._fsp--;

             after(grammarAccess.getRefRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRef"


    // $ANTLR start "ruleRef"
    // InternalDBML.g:237:1: ruleRef : ( ( rule__Ref__Group__0 ) ) ;
    public final void ruleRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:241:2: ( ( ( rule__Ref__Group__0 ) ) )
            // InternalDBML.g:242:2: ( ( rule__Ref__Group__0 ) )
            {
            // InternalDBML.g:242:2: ( ( rule__Ref__Group__0 ) )
            // InternalDBML.g:243:3: ( rule__Ref__Group__0 )
            {
             before(grammarAccess.getRefAccess().getGroup()); 
            // InternalDBML.g:244:3: ( rule__Ref__Group__0 )
            // InternalDBML.g:244:4: rule__Ref__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Ref__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRef"


    // $ANTLR start "entryRuleNestedRef"
    // InternalDBML.g:253:1: entryRuleNestedRef : ruleNestedRef EOF ;
    public final void entryRuleNestedRef() throws RecognitionException {
        try {
            // InternalDBML.g:254:1: ( ruleNestedRef EOF )
            // InternalDBML.g:255:1: ruleNestedRef EOF
            {
             before(grammarAccess.getNestedRefRule()); 
            pushFollow(FOLLOW_1);
            ruleNestedRef();

            state._fsp--;

             after(grammarAccess.getNestedRefRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNestedRef"


    // $ANTLR start "ruleNestedRef"
    // InternalDBML.g:262:1: ruleNestedRef : ( ( rule__NestedRef__Group__0 ) ) ;
    public final void ruleNestedRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:266:2: ( ( ( rule__NestedRef__Group__0 ) ) )
            // InternalDBML.g:267:2: ( ( rule__NestedRef__Group__0 ) )
            {
            // InternalDBML.g:267:2: ( ( rule__NestedRef__Group__0 ) )
            // InternalDBML.g:268:3: ( rule__NestedRef__Group__0 )
            {
             before(grammarAccess.getNestedRefAccess().getGroup()); 
            // InternalDBML.g:269:3: ( rule__NestedRef__Group__0 )
            // InternalDBML.g:269:4: rule__NestedRef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NestedRef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNestedRefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNestedRef"


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalDBML.g:277:1: rule__Statement__Alternatives : ( ( ruleTable ) | ( ruleRef ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:281:1: ( ( ruleTable ) | ( ruleRef ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==28) ) {
                alt2=1;
            }
            else if ( (LA2_0==51) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDBML.g:282:2: ( ruleTable )
                    {
                    // InternalDBML.g:282:2: ( ruleTable )
                    // InternalDBML.g:283:3: ruleTable
                    {
                     before(grammarAccess.getStatementAccess().getTableParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleTable();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getTableParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDBML.g:288:2: ( ruleRef )
                    {
                    // InternalDBML.g:288:2: ( ruleRef )
                    // InternalDBML.g:289:3: ruleRef
                    {
                     before(grammarAccess.getStatementAccess().getRefParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRef();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getRefParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__Index__Alternatives_0"
    // InternalDBML.g:298:1: rule__Index__Alternatives_0 : ( ( RULE_ID ) | ( ( rule__Index__Group_0_1__0 ) ) );
    public final void rule__Index__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:302:1: ( ( RULE_ID ) | ( ( rule__Index__Group_0_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==36) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalDBML.g:303:2: ( RULE_ID )
                    {
                    // InternalDBML.g:303:2: ( RULE_ID )
                    // InternalDBML.g:304:3: RULE_ID
                    {
                     before(grammarAccess.getIndexAccess().getIDTerminalRuleCall_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getIndexAccess().getIDTerminalRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDBML.g:309:2: ( ( rule__Index__Group_0_1__0 ) )
                    {
                    // InternalDBML.g:309:2: ( ( rule__Index__Group_0_1__0 ) )
                    // InternalDBML.g:310:3: ( rule__Index__Group_0_1__0 )
                    {
                     before(grammarAccess.getIndexAccess().getGroup_0_1()); 
                    // InternalDBML.g:311:3: ( rule__Index__Group_0_1__0 )
                    // InternalDBML.g:311:4: rule__Index__Group_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Index__Group_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getIndexAccess().getGroup_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Index__Alternatives_0"


    // $ANTLR start "rule__Index__Alternatives_3"
    // InternalDBML.g:319:1: rule__Index__Alternatives_3 : ( ( 'pk' ) | ( ( rule__Index__Group_3_1__0 ) ) );
    public final void rule__Index__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:323:1: ( ( 'pk' ) | ( ( rule__Index__Group_3_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==10) ) {
                alt4=1;
            }
            else if ( (LA4_0==39) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDBML.g:324:2: ( 'pk' )
                    {
                    // InternalDBML.g:324:2: ( 'pk' )
                    // InternalDBML.g:325:3: 'pk'
                    {
                     before(grammarAccess.getIndexAccess().getPkKeyword_3_0()); 
                    match(input,10,FOLLOW_2); 
                     after(grammarAccess.getIndexAccess().getPkKeyword_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDBML.g:330:2: ( ( rule__Index__Group_3_1__0 ) )
                    {
                    // InternalDBML.g:330:2: ( ( rule__Index__Group_3_1__0 ) )
                    // InternalDBML.g:331:3: ( rule__Index__Group_3_1__0 )
                    {
                     before(grammarAccess.getIndexAccess().getGroup_3_1()); 
                    // InternalDBML.g:332:3: ( rule__Index__Group_3_1__0 )
                    // InternalDBML.g:332:4: rule__Index__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Index__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getIndexAccess().getGroup_3_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Index__Alternatives_3"


    // $ANTLR start "rule__Optional__Alternatives"
    // InternalDBML.g:340:1: rule__Optional__Alternatives : ( ( 'pk' ) | ( ( rule__Optional__Group_1__0 ) ) | ( 'increment' ) );
    public final void rule__Optional__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:344:1: ( ( 'pk' ) | ( ( rule__Optional__Group_1__0 ) ) | ( 'increment' ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 10:
                {
                alt5=1;
                }
                break;
            case 40:
                {
                alt5=2;
                }
                break;
            case 11:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalDBML.g:345:2: ( 'pk' )
                    {
                    // InternalDBML.g:345:2: ( 'pk' )
                    // InternalDBML.g:346:3: 'pk'
                    {
                     before(grammarAccess.getOptionalAccess().getPkKeyword_0()); 
                    match(input,10,FOLLOW_2); 
                     after(grammarAccess.getOptionalAccess().getPkKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDBML.g:351:2: ( ( rule__Optional__Group_1__0 ) )
                    {
                    // InternalDBML.g:351:2: ( ( rule__Optional__Group_1__0 ) )
                    // InternalDBML.g:352:3: ( rule__Optional__Group_1__0 )
                    {
                     before(grammarAccess.getOptionalAccess().getGroup_1()); 
                    // InternalDBML.g:353:3: ( rule__Optional__Group_1__0 )
                    // InternalDBML.g:353:4: rule__Optional__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Optional__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOptionalAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDBML.g:357:2: ( 'increment' )
                    {
                    // InternalDBML.g:357:2: ( 'increment' )
                    // InternalDBML.g:358:3: 'increment'
                    {
                     before(grammarAccess.getOptionalAccess().getIncrementKeyword_2()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getOptionalAccess().getIncrementKeyword_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalDBML.g:367:1: rule__Type__Alternatives : ( ( 'BOOLEAN' ) | ( 'BIT' ) | ( 'INT' ) | ( 'INTEGER' ) | ( 'FLOAT' ) | ( ( rule__Type__Group_5__0 ) ) | ( 'BIGINT' ) | ( 'SMALLINT' ) | ( 'BYTE' ) | ( 'TIMESTAMP' ) | ( 'DATE' ) | ( 'DATETIME' ) | ( 'TEXT' ) | ( 'LONGTEXT' ) | ( ( rule__Type__Group_14__0 ) ) | ( ( rule__Type__Group_15__0 ) ) | ( ( rule__Type__Group_16__0 ) ) | ( ( rule__Type__Group_17__0 ) ) | ( ( rule__Type__Group_18__0 ) ) | ( ( rule__Type__Group_19__0 ) ) | ( ( rule__Type__Group_20__0 ) ) | ( ( rule__Type__Group_21__0 ) ) | ( 'jsonb' ) | ( 'json' ) | ( 'JSON' ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:371:1: ( ( 'BOOLEAN' ) | ( 'BIT' ) | ( 'INT' ) | ( 'INTEGER' ) | ( 'FLOAT' ) | ( ( rule__Type__Group_5__0 ) ) | ( 'BIGINT' ) | ( 'SMALLINT' ) | ( 'BYTE' ) | ( 'TIMESTAMP' ) | ( 'DATE' ) | ( 'DATETIME' ) | ( 'TEXT' ) | ( 'LONGTEXT' ) | ( ( rule__Type__Group_14__0 ) ) | ( ( rule__Type__Group_15__0 ) ) | ( ( rule__Type__Group_16__0 ) ) | ( ( rule__Type__Group_17__0 ) ) | ( ( rule__Type__Group_18__0 ) ) | ( ( rule__Type__Group_19__0 ) ) | ( ( rule__Type__Group_20__0 ) ) | ( ( rule__Type__Group_21__0 ) ) | ( 'jsonb' ) | ( 'json' ) | ( 'JSON' ) )
            int alt6=25;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt6=1;
                }
                break;
            case 13:
                {
                alt6=2;
                }
                break;
            case 14:
                {
                alt6=3;
                }
                break;
            case 15:
                {
                alt6=4;
                }
                break;
            case 16:
                {
                alt6=5;
                }
                break;
            case 42:
                {
                alt6=6;
                }
                break;
            case 17:
                {
                alt6=7;
                }
                break;
            case 18:
                {
                alt6=8;
                }
                break;
            case 19:
                {
                alt6=9;
                }
                break;
            case 20:
                {
                alt6=10;
                }
                break;
            case 21:
                {
                alt6=11;
                }
                break;
            case 22:
                {
                alt6=12;
                }
                break;
            case 23:
                {
                alt6=13;
                }
                break;
            case 24:
                {
                alt6=14;
                }
                break;
            case 43:
                {
                alt6=15;
                }
                break;
            case 44:
                {
                alt6=16;
                }
                break;
            case 45:
                {
                alt6=17;
                }
                break;
            case 46:
                {
                alt6=18;
                }
                break;
            case 47:
                {
                alt6=19;
                }
                break;
            case 48:
                {
                alt6=20;
                }
                break;
            case 49:
                {
                alt6=21;
                }
                break;
            case 50:
                {
                alt6=22;
                }
                break;
            case 25:
                {
                alt6=23;
                }
                break;
            case 26:
                {
                alt6=24;
                }
                break;
            case 27:
                {
                alt6=25;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalDBML.g:372:2: ( 'BOOLEAN' )
                    {
                    // InternalDBML.g:372:2: ( 'BOOLEAN' )
                    // InternalDBML.g:373:3: 'BOOLEAN'
                    {
                     before(grammarAccess.getTypeAccess().getBOOLEANKeyword_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getBOOLEANKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDBML.g:378:2: ( 'BIT' )
                    {
                    // InternalDBML.g:378:2: ( 'BIT' )
                    // InternalDBML.g:379:3: 'BIT'
                    {
                     before(grammarAccess.getTypeAccess().getBITKeyword_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getBITKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDBML.g:384:2: ( 'INT' )
                    {
                    // InternalDBML.g:384:2: ( 'INT' )
                    // InternalDBML.g:385:3: 'INT'
                    {
                     before(grammarAccess.getTypeAccess().getINTKeyword_2()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getINTKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDBML.g:390:2: ( 'INTEGER' )
                    {
                    // InternalDBML.g:390:2: ( 'INTEGER' )
                    // InternalDBML.g:391:3: 'INTEGER'
                    {
                     before(grammarAccess.getTypeAccess().getINTEGERKeyword_3()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getINTEGERKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDBML.g:396:2: ( 'FLOAT' )
                    {
                    // InternalDBML.g:396:2: ( 'FLOAT' )
                    // InternalDBML.g:397:3: 'FLOAT'
                    {
                     before(grammarAccess.getTypeAccess().getFLOATKeyword_4()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getFLOATKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalDBML.g:402:2: ( ( rule__Type__Group_5__0 ) )
                    {
                    // InternalDBML.g:402:2: ( ( rule__Type__Group_5__0 ) )
                    // InternalDBML.g:403:3: ( rule__Type__Group_5__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_5()); 
                    // InternalDBML.g:404:3: ( rule__Type__Group_5__0 )
                    // InternalDBML.g:404:4: rule__Type__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getGroup_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalDBML.g:408:2: ( 'BIGINT' )
                    {
                    // InternalDBML.g:408:2: ( 'BIGINT' )
                    // InternalDBML.g:409:3: 'BIGINT'
                    {
                     before(grammarAccess.getTypeAccess().getBIGINTKeyword_6()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getBIGINTKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalDBML.g:414:2: ( 'SMALLINT' )
                    {
                    // InternalDBML.g:414:2: ( 'SMALLINT' )
                    // InternalDBML.g:415:3: 'SMALLINT'
                    {
                     before(grammarAccess.getTypeAccess().getSMALLINTKeyword_7()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getSMALLINTKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalDBML.g:420:2: ( 'BYTE' )
                    {
                    // InternalDBML.g:420:2: ( 'BYTE' )
                    // InternalDBML.g:421:3: 'BYTE'
                    {
                     before(grammarAccess.getTypeAccess().getBYTEKeyword_8()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getBYTEKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalDBML.g:426:2: ( 'TIMESTAMP' )
                    {
                    // InternalDBML.g:426:2: ( 'TIMESTAMP' )
                    // InternalDBML.g:427:3: 'TIMESTAMP'
                    {
                     before(grammarAccess.getTypeAccess().getTIMESTAMPKeyword_9()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getTIMESTAMPKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalDBML.g:432:2: ( 'DATE' )
                    {
                    // InternalDBML.g:432:2: ( 'DATE' )
                    // InternalDBML.g:433:3: 'DATE'
                    {
                     before(grammarAccess.getTypeAccess().getDATEKeyword_10()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getDATEKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalDBML.g:438:2: ( 'DATETIME' )
                    {
                    // InternalDBML.g:438:2: ( 'DATETIME' )
                    // InternalDBML.g:439:3: 'DATETIME'
                    {
                     before(grammarAccess.getTypeAccess().getDATETIMEKeyword_11()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getDATETIMEKeyword_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalDBML.g:444:2: ( 'TEXT' )
                    {
                    // InternalDBML.g:444:2: ( 'TEXT' )
                    // InternalDBML.g:445:3: 'TEXT'
                    {
                     before(grammarAccess.getTypeAccess().getTEXTKeyword_12()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getTEXTKeyword_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalDBML.g:450:2: ( 'LONGTEXT' )
                    {
                    // InternalDBML.g:450:2: ( 'LONGTEXT' )
                    // InternalDBML.g:451:3: 'LONGTEXT'
                    {
                     before(grammarAccess.getTypeAccess().getLONGTEXTKeyword_13()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getLONGTEXTKeyword_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalDBML.g:456:2: ( ( rule__Type__Group_14__0 ) )
                    {
                    // InternalDBML.g:456:2: ( ( rule__Type__Group_14__0 ) )
                    // InternalDBML.g:457:3: ( rule__Type__Group_14__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_14()); 
                    // InternalDBML.g:458:3: ( rule__Type__Group_14__0 )
                    // InternalDBML.g:458:4: rule__Type__Group_14__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_14__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getGroup_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalDBML.g:462:2: ( ( rule__Type__Group_15__0 ) )
                    {
                    // InternalDBML.g:462:2: ( ( rule__Type__Group_15__0 ) )
                    // InternalDBML.g:463:3: ( rule__Type__Group_15__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_15()); 
                    // InternalDBML.g:464:3: ( rule__Type__Group_15__0 )
                    // InternalDBML.g:464:4: rule__Type__Group_15__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_15__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getGroup_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalDBML.g:468:2: ( ( rule__Type__Group_16__0 ) )
                    {
                    // InternalDBML.g:468:2: ( ( rule__Type__Group_16__0 ) )
                    // InternalDBML.g:469:3: ( rule__Type__Group_16__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_16()); 
                    // InternalDBML.g:470:3: ( rule__Type__Group_16__0 )
                    // InternalDBML.g:470:4: rule__Type__Group_16__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_16__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getGroup_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalDBML.g:474:2: ( ( rule__Type__Group_17__0 ) )
                    {
                    // InternalDBML.g:474:2: ( ( rule__Type__Group_17__0 ) )
                    // InternalDBML.g:475:3: ( rule__Type__Group_17__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_17()); 
                    // InternalDBML.g:476:3: ( rule__Type__Group_17__0 )
                    // InternalDBML.g:476:4: rule__Type__Group_17__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_17__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getGroup_17()); 

                    }


                    }
                    break;
                case 19 :
                    // InternalDBML.g:480:2: ( ( rule__Type__Group_18__0 ) )
                    {
                    // InternalDBML.g:480:2: ( ( rule__Type__Group_18__0 ) )
                    // InternalDBML.g:481:3: ( rule__Type__Group_18__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_18()); 
                    // InternalDBML.g:482:3: ( rule__Type__Group_18__0 )
                    // InternalDBML.g:482:4: rule__Type__Group_18__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_18__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getGroup_18()); 

                    }


                    }
                    break;
                case 20 :
                    // InternalDBML.g:486:2: ( ( rule__Type__Group_19__0 ) )
                    {
                    // InternalDBML.g:486:2: ( ( rule__Type__Group_19__0 ) )
                    // InternalDBML.g:487:3: ( rule__Type__Group_19__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_19()); 
                    // InternalDBML.g:488:3: ( rule__Type__Group_19__0 )
                    // InternalDBML.g:488:4: rule__Type__Group_19__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_19__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getGroup_19()); 

                    }


                    }
                    break;
                case 21 :
                    // InternalDBML.g:492:2: ( ( rule__Type__Group_20__0 ) )
                    {
                    // InternalDBML.g:492:2: ( ( rule__Type__Group_20__0 ) )
                    // InternalDBML.g:493:3: ( rule__Type__Group_20__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_20()); 
                    // InternalDBML.g:494:3: ( rule__Type__Group_20__0 )
                    // InternalDBML.g:494:4: rule__Type__Group_20__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_20__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getGroup_20()); 

                    }


                    }
                    break;
                case 22 :
                    // InternalDBML.g:498:2: ( ( rule__Type__Group_21__0 ) )
                    {
                    // InternalDBML.g:498:2: ( ( rule__Type__Group_21__0 ) )
                    // InternalDBML.g:499:3: ( rule__Type__Group_21__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_21()); 
                    // InternalDBML.g:500:3: ( rule__Type__Group_21__0 )
                    // InternalDBML.g:500:4: rule__Type__Group_21__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_21__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getGroup_21()); 

                    }


                    }
                    break;
                case 23 :
                    // InternalDBML.g:504:2: ( 'jsonb' )
                    {
                    // InternalDBML.g:504:2: ( 'jsonb' )
                    // InternalDBML.g:505:3: 'jsonb'
                    {
                     before(grammarAccess.getTypeAccess().getJsonbKeyword_22()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getJsonbKeyword_22()); 

                    }


                    }
                    break;
                case 24 :
                    // InternalDBML.g:510:2: ( 'json' )
                    {
                    // InternalDBML.g:510:2: ( 'json' )
                    // InternalDBML.g:511:3: 'json'
                    {
                     before(grammarAccess.getTypeAccess().getJsonKeyword_23()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getJsonKeyword_23()); 

                    }


                    }
                    break;
                case 25 :
                    // InternalDBML.g:516:2: ( 'JSON' )
                    {
                    // InternalDBML.g:516:2: ( 'JSON' )
                    // InternalDBML.g:517:3: 'JSON'
                    {
                     before(grammarAccess.getTypeAccess().getJSONKeyword_24()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getJSONKeyword_24()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__Table__Group__0"
    // InternalDBML.g:526:1: rule__Table__Group__0 : rule__Table__Group__0__Impl rule__Table__Group__1 ;
    public final void rule__Table__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:530:1: ( rule__Table__Group__0__Impl rule__Table__Group__1 )
            // InternalDBML.g:531:2: rule__Table__Group__0__Impl rule__Table__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Table__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__0"


    // $ANTLR start "rule__Table__Group__0__Impl"
    // InternalDBML.g:538:1: rule__Table__Group__0__Impl : ( 'Table' ) ;
    public final void rule__Table__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:542:1: ( ( 'Table' ) )
            // InternalDBML.g:543:1: ( 'Table' )
            {
            // InternalDBML.g:543:1: ( 'Table' )
            // InternalDBML.g:544:2: 'Table'
            {
             before(grammarAccess.getTableAccess().getTableKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getTableKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__0__Impl"


    // $ANTLR start "rule__Table__Group__1"
    // InternalDBML.g:553:1: rule__Table__Group__1 : rule__Table__Group__1__Impl rule__Table__Group__2 ;
    public final void rule__Table__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:557:1: ( rule__Table__Group__1__Impl rule__Table__Group__2 )
            // InternalDBML.g:558:2: rule__Table__Group__1__Impl rule__Table__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Table__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__1"


    // $ANTLR start "rule__Table__Group__1__Impl"
    // InternalDBML.g:565:1: rule__Table__Group__1__Impl : ( '\"' ) ;
    public final void rule__Table__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:569:1: ( ( '\"' ) )
            // InternalDBML.g:570:1: ( '\"' )
            {
            // InternalDBML.g:570:1: ( '\"' )
            // InternalDBML.g:571:2: '\"'
            {
             before(grammarAccess.getTableAccess().getQuotationMarkKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getQuotationMarkKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__1__Impl"


    // $ANTLR start "rule__Table__Group__2"
    // InternalDBML.g:580:1: rule__Table__Group__2 : rule__Table__Group__2__Impl rule__Table__Group__3 ;
    public final void rule__Table__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:584:1: ( rule__Table__Group__2__Impl rule__Table__Group__3 )
            // InternalDBML.g:585:2: rule__Table__Group__2__Impl rule__Table__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Table__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__2"


    // $ANTLR start "rule__Table__Group__2__Impl"
    // InternalDBML.g:592:1: rule__Table__Group__2__Impl : ( ( rule__Table__NameAssignment_2 ) ) ;
    public final void rule__Table__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:596:1: ( ( ( rule__Table__NameAssignment_2 ) ) )
            // InternalDBML.g:597:1: ( ( rule__Table__NameAssignment_2 ) )
            {
            // InternalDBML.g:597:1: ( ( rule__Table__NameAssignment_2 ) )
            // InternalDBML.g:598:2: ( rule__Table__NameAssignment_2 )
            {
             before(grammarAccess.getTableAccess().getNameAssignment_2()); 
            // InternalDBML.g:599:2: ( rule__Table__NameAssignment_2 )
            // InternalDBML.g:599:3: rule__Table__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Table__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__2__Impl"


    // $ANTLR start "rule__Table__Group__3"
    // InternalDBML.g:607:1: rule__Table__Group__3 : rule__Table__Group__3__Impl rule__Table__Group__4 ;
    public final void rule__Table__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:611:1: ( rule__Table__Group__3__Impl rule__Table__Group__4 )
            // InternalDBML.g:612:2: rule__Table__Group__3__Impl rule__Table__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Table__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__3"


    // $ANTLR start "rule__Table__Group__3__Impl"
    // InternalDBML.g:619:1: rule__Table__Group__3__Impl : ( '\"' ) ;
    public final void rule__Table__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:623:1: ( ( '\"' ) )
            // InternalDBML.g:624:1: ( '\"' )
            {
            // InternalDBML.g:624:1: ( '\"' )
            // InternalDBML.g:625:2: '\"'
            {
             before(grammarAccess.getTableAccess().getQuotationMarkKeyword_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getQuotationMarkKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__3__Impl"


    // $ANTLR start "rule__Table__Group__4"
    // InternalDBML.g:634:1: rule__Table__Group__4 : rule__Table__Group__4__Impl rule__Table__Group__5 ;
    public final void rule__Table__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:638:1: ( rule__Table__Group__4__Impl rule__Table__Group__5 )
            // InternalDBML.g:639:2: rule__Table__Group__4__Impl rule__Table__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Table__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__4"


    // $ANTLR start "rule__Table__Group__4__Impl"
    // InternalDBML.g:646:1: rule__Table__Group__4__Impl : ( '{' ) ;
    public final void rule__Table__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:650:1: ( ( '{' ) )
            // InternalDBML.g:651:1: ( '{' )
            {
            // InternalDBML.g:651:1: ( '{' )
            // InternalDBML.g:652:2: '{'
            {
             before(grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__4__Impl"


    // $ANTLR start "rule__Table__Group__5"
    // InternalDBML.g:661:1: rule__Table__Group__5 : rule__Table__Group__5__Impl rule__Table__Group__6 ;
    public final void rule__Table__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:665:1: ( rule__Table__Group__5__Impl rule__Table__Group__6 )
            // InternalDBML.g:666:2: rule__Table__Group__5__Impl rule__Table__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Table__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__5"


    // $ANTLR start "rule__Table__Group__5__Impl"
    // InternalDBML.g:673:1: rule__Table__Group__5__Impl : ( ( rule__Table__AttributesAssignment_5 )* ) ;
    public final void rule__Table__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:677:1: ( ( ( rule__Table__AttributesAssignment_5 )* ) )
            // InternalDBML.g:678:1: ( ( rule__Table__AttributesAssignment_5 )* )
            {
            // InternalDBML.g:678:1: ( ( rule__Table__AttributesAssignment_5 )* )
            // InternalDBML.g:679:2: ( rule__Table__AttributesAssignment_5 )*
            {
             before(grammarAccess.getTableAccess().getAttributesAssignment_5()); 
            // InternalDBML.g:680:2: ( rule__Table__AttributesAssignment_5 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==29) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDBML.g:680:3: rule__Table__AttributesAssignment_5
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Table__AttributesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getTableAccess().getAttributesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__5__Impl"


    // $ANTLR start "rule__Table__Group__6"
    // InternalDBML.g:688:1: rule__Table__Group__6 : rule__Table__Group__6__Impl rule__Table__Group__7 ;
    public final void rule__Table__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:692:1: ( rule__Table__Group__6__Impl rule__Table__Group__7 )
            // InternalDBML.g:693:2: rule__Table__Group__6__Impl rule__Table__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__Table__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__6"


    // $ANTLR start "rule__Table__Group__6__Impl"
    // InternalDBML.g:700:1: rule__Table__Group__6__Impl : ( ( rule__Table__Group_6__0 )? ) ;
    public final void rule__Table__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:704:1: ( ( ( rule__Table__Group_6__0 )? ) )
            // InternalDBML.g:705:1: ( ( rule__Table__Group_6__0 )? )
            {
            // InternalDBML.g:705:1: ( ( rule__Table__Group_6__0 )? )
            // InternalDBML.g:706:2: ( rule__Table__Group_6__0 )?
            {
             before(grammarAccess.getTableAccess().getGroup_6()); 
            // InternalDBML.g:707:2: ( rule__Table__Group_6__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==32) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDBML.g:707:3: rule__Table__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Table__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTableAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__6__Impl"


    // $ANTLR start "rule__Table__Group__7"
    // InternalDBML.g:715:1: rule__Table__Group__7 : rule__Table__Group__7__Impl ;
    public final void rule__Table__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:719:1: ( rule__Table__Group__7__Impl )
            // InternalDBML.g:720:2: rule__Table__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Table__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__7"


    // $ANTLR start "rule__Table__Group__7__Impl"
    // InternalDBML.g:726:1: rule__Table__Group__7__Impl : ( '}' ) ;
    public final void rule__Table__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:730:1: ( ( '}' ) )
            // InternalDBML.g:731:1: ( '}' )
            {
            // InternalDBML.g:731:1: ( '}' )
            // InternalDBML.g:732:2: '}'
            {
             before(grammarAccess.getTableAccess().getRightCurlyBracketKeyword_7()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__7__Impl"


    // $ANTLR start "rule__Table__Group_6__0"
    // InternalDBML.g:742:1: rule__Table__Group_6__0 : rule__Table__Group_6__0__Impl rule__Table__Group_6__1 ;
    public final void rule__Table__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:746:1: ( rule__Table__Group_6__0__Impl rule__Table__Group_6__1 )
            // InternalDBML.g:747:2: rule__Table__Group_6__0__Impl rule__Table__Group_6__1
            {
            pushFollow(FOLLOW_6);
            rule__Table__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_6__0"


    // $ANTLR start "rule__Table__Group_6__0__Impl"
    // InternalDBML.g:754:1: rule__Table__Group_6__0__Impl : ( 'Indexes' ) ;
    public final void rule__Table__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:758:1: ( ( 'Indexes' ) )
            // InternalDBML.g:759:1: ( 'Indexes' )
            {
            // InternalDBML.g:759:1: ( 'Indexes' )
            // InternalDBML.g:760:2: 'Indexes'
            {
             before(grammarAccess.getTableAccess().getIndexesKeyword_6_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getIndexesKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_6__0__Impl"


    // $ANTLR start "rule__Table__Group_6__1"
    // InternalDBML.g:769:1: rule__Table__Group_6__1 : rule__Table__Group_6__1__Impl rule__Table__Group_6__2 ;
    public final void rule__Table__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:773:1: ( rule__Table__Group_6__1__Impl rule__Table__Group_6__2 )
            // InternalDBML.g:774:2: rule__Table__Group_6__1__Impl rule__Table__Group_6__2
            {
            pushFollow(FOLLOW_9);
            rule__Table__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_6__1"


    // $ANTLR start "rule__Table__Group_6__1__Impl"
    // InternalDBML.g:781:1: rule__Table__Group_6__1__Impl : ( '{' ) ;
    public final void rule__Table__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:785:1: ( ( '{' ) )
            // InternalDBML.g:786:1: ( '{' )
            {
            // InternalDBML.g:786:1: ( '{' )
            // InternalDBML.g:787:2: '{'
            {
             before(grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_6__1__Impl"


    // $ANTLR start "rule__Table__Group_6__2"
    // InternalDBML.g:796:1: rule__Table__Group_6__2 : rule__Table__Group_6__2__Impl rule__Table__Group_6__3 ;
    public final void rule__Table__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:800:1: ( rule__Table__Group_6__2__Impl rule__Table__Group_6__3 )
            // InternalDBML.g:801:2: rule__Table__Group_6__2__Impl rule__Table__Group_6__3
            {
            pushFollow(FOLLOW_10);
            rule__Table__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_6__2"


    // $ANTLR start "rule__Table__Group_6__2__Impl"
    // InternalDBML.g:808:1: rule__Table__Group_6__2__Impl : ( ( ( ruleIndex ) ) ( ( ruleIndex )* ) ) ;
    public final void rule__Table__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:812:1: ( ( ( ( ruleIndex ) ) ( ( ruleIndex )* ) ) )
            // InternalDBML.g:813:1: ( ( ( ruleIndex ) ) ( ( ruleIndex )* ) )
            {
            // InternalDBML.g:813:1: ( ( ( ruleIndex ) ) ( ( ruleIndex )* ) )
            // InternalDBML.g:814:2: ( ( ruleIndex ) ) ( ( ruleIndex )* )
            {
            // InternalDBML.g:814:2: ( ( ruleIndex ) )
            // InternalDBML.g:815:3: ( ruleIndex )
            {
             before(grammarAccess.getTableAccess().getIndexParserRuleCall_6_2()); 
            // InternalDBML.g:816:3: ( ruleIndex )
            // InternalDBML.g:816:4: ruleIndex
            {
            pushFollow(FOLLOW_11);
            ruleIndex();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getIndexParserRuleCall_6_2()); 

            }

            // InternalDBML.g:819:2: ( ( ruleIndex )* )
            // InternalDBML.g:820:3: ( ruleIndex )*
            {
             before(grammarAccess.getTableAccess().getIndexParserRuleCall_6_2()); 
            // InternalDBML.g:821:3: ( ruleIndex )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||LA9_0==36) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDBML.g:821:4: ruleIndex
            	    {
            	    pushFollow(FOLLOW_11);
            	    ruleIndex();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getTableAccess().getIndexParserRuleCall_6_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_6__2__Impl"


    // $ANTLR start "rule__Table__Group_6__3"
    // InternalDBML.g:830:1: rule__Table__Group_6__3 : rule__Table__Group_6__3__Impl ;
    public final void rule__Table__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:834:1: ( rule__Table__Group_6__3__Impl )
            // InternalDBML.g:835:2: rule__Table__Group_6__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Table__Group_6__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_6__3"


    // $ANTLR start "rule__Table__Group_6__3__Impl"
    // InternalDBML.g:841:1: rule__Table__Group_6__3__Impl : ( '}' ) ;
    public final void rule__Table__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:845:1: ( ( '}' ) )
            // InternalDBML.g:846:1: ( '}' )
            {
            // InternalDBML.g:846:1: ( '}' )
            // InternalDBML.g:847:2: '}'
            {
             before(grammarAccess.getTableAccess().getRightCurlyBracketKeyword_6_3()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getRightCurlyBracketKeyword_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_6__3__Impl"


    // $ANTLR start "rule__Index__Group__0"
    // InternalDBML.g:857:1: rule__Index__Group__0 : rule__Index__Group__0__Impl rule__Index__Group__1 ;
    public final void rule__Index__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:861:1: ( rule__Index__Group__0__Impl rule__Index__Group__1 )
            // InternalDBML.g:862:2: rule__Index__Group__0__Impl rule__Index__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Index__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Index__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Index__Group__0"


    // $ANTLR start "rule__Index__Group__0__Impl"
    // InternalDBML.g:869:1: rule__Index__Group__0__Impl : ( ( rule__Index__Alternatives_0 ) ) ;
    public final void rule__Index__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:873:1: ( ( ( rule__Index__Alternatives_0 ) ) )
            // InternalDBML.g:874:1: ( ( rule__Index__Alternatives_0 ) )
            {
            // InternalDBML.g:874:1: ( ( rule__Index__Alternatives_0 ) )
            // InternalDBML.g:875:2: ( rule__Index__Alternatives_0 )
            {
             before(grammarAccess.getIndexAccess().getAlternatives_0()); 
            // InternalDBML.g:876:2: ( rule__Index__Alternatives_0 )
            // InternalDBML.g:876:3: rule__Index__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Index__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getIndexAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Index__Group__0__Impl"


    // $ANTLR start "rule__Index__Group__1"
    // InternalDBML.g:884:1: rule__Index__Group__1 : rule__Index__Group__1__Impl rule__Index__Group__2 ;
    public final void rule__Index__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:888:1: ( rule__Index__Group__1__Impl rule__Index__Group__2 )
            // InternalDBML.g:889:2: rule__Index__Group__1__Impl rule__Index__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Index__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Index__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Index__Group__1"


    // $ANTLR start "rule__Index__Group__1__Impl"
    // InternalDBML.g:896:1: rule__Index__Group__1__Impl : ( '[' ) ;
    public final void rule__Index__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:900:1: ( ( '[' ) )
            // InternalDBML.g:901:1: ( '[' )
            {
            // InternalDBML.g:901:1: ( '[' )
            // InternalDBML.g:902:2: '['
            {
             before(grammarAccess.getIndexAccess().getLeftSquareBracketKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getIndexAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Index__Group__1__Impl"


    // $ANTLR start "rule__Index__Group__2"
    // InternalDBML.g:911:1: rule__Index__Group__2 : rule__Index__Group__2__Impl rule__Index__Group__3 ;
    public final void rule__Index__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:915:1: ( rule__Index__Group__2__Impl rule__Index__Group__3 )
            // InternalDBML.g:916:2: rule__Index__Group__2__Impl rule__Index__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Index__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Index__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Index__Group__2"


    // $ANTLR start "rule__Index__Group__2__Impl"
    // InternalDBML.g:923:1: rule__Index__Group__2__Impl : ( ( 'unique,' )? ) ;
    public final void rule__Index__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:927:1: ( ( ( 'unique,' )? ) )
            // InternalDBML.g:928:1: ( ( 'unique,' )? )
            {
            // InternalDBML.g:928:1: ( ( 'unique,' )? )
            // InternalDBML.g:929:2: ( 'unique,' )?
            {
             before(grammarAccess.getIndexAccess().getUniqueKeyword_2()); 
            // InternalDBML.g:930:2: ( 'unique,' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==34) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDBML.g:930:3: 'unique,'
                    {
                    match(input,34,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getIndexAccess().getUniqueKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Index__Group__2__Impl"


    // $ANTLR start "rule__Index__Group__3"
    // InternalDBML.g:938:1: rule__Index__Group__3 : rule__Index__Group__3__Impl rule__Index__Group__4 ;
    public final void rule__Index__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:942:1: ( rule__Index__Group__3__Impl rule__Index__Group__4 )
            // InternalDBML.g:943:2: rule__Index__Group__3__Impl rule__Index__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Index__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Index__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Index__Group__3"


    // $ANTLR start "rule__Index__Group__3__Impl"
    // InternalDBML.g:950:1: rule__Index__Group__3__Impl : ( ( rule__Index__Alternatives_3 ) ) ;
    public final void rule__Index__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:954:1: ( ( ( rule__Index__Alternatives_3 ) ) )
            // InternalDBML.g:955:1: ( ( rule__Index__Alternatives_3 ) )
            {
            // InternalDBML.g:955:1: ( ( rule__Index__Alternatives_3 ) )
            // InternalDBML.g:956:2: ( rule__Index__Alternatives_3 )
            {
             before(grammarAccess.getIndexAccess().getAlternatives_3()); 
            // InternalDBML.g:957:2: ( rule__Index__Alternatives_3 )
            // InternalDBML.g:957:3: rule__Index__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__Index__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getIndexAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Index__Group__3__Impl"


    // $ANTLR start "rule__Index__Group__4"
    // InternalDBML.g:965:1: rule__Index__Group__4 : rule__Index__Group__4__Impl ;
    public final void rule__Index__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:969:1: ( rule__Index__Group__4__Impl )
            // InternalDBML.g:970:2: rule__Index__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Index__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Index__Group__4"


    // $ANTLR start "rule__Index__Group__4__Impl"
    // InternalDBML.g:976:1: rule__Index__Group__4__Impl : ( ']' ) ;
    public final void rule__Index__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:980:1: ( ( ']' ) )
            // InternalDBML.g:981:1: ( ']' )
            {
            // InternalDBML.g:981:1: ( ']' )
            // InternalDBML.g:982:2: ']'
            {
             before(grammarAccess.getIndexAccess().getRightSquareBracketKeyword_4()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getIndexAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Index__Group__4__Impl"


    // $ANTLR start "rule__Index__Group_0_1__0"
    // InternalDBML.g:992:1: rule__Index__Group_0_1__0 : rule__Index__Group_0_1__0__Impl rule__Index__Group_0_1__1 ;
    public final void rule__Index__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:996:1: ( rule__Index__Group_0_1__0__Impl rule__Index__Group_0_1__1 )
            // InternalDBML.g:997:2: rule__Index__Group_0_1__0__Impl rule__Index__Group_0_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Index__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Index__Group_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Index__Group_0_1__0"


    // $ANTLR start "rule__Index__Group_0_1__0__Impl"
    // InternalDBML.g:1004:1: rule__Index__Group_0_1__0__Impl : ( '(' ) ;
    public final void rule__Index__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:1008:1: ( ( '(' ) )
            // InternalDBML.g:1009:1: ( '(' )
            {
            // InternalDBML.g:1009:1: ( '(' )
            // InternalDBML.g:1010:2: '('
            {
             before(grammarAccess.getIndexAccess().getLeftParenthesisKeyword_0_1_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getIndexAccess().getLeftParenthesisKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Index__Group_0_1__0__Impl"


    // $ANTLR start "rule__Index__Group_0_1__1"
    // InternalDBML.g:1019:1: rule__Index__Group_0_1__1 : rule__Index__Group_0_1__1__Impl rule__Index__Group_0_1__2 ;
    public final void rule__Index__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:1023:1: ( rule__Index__Group_0_1__1__Impl rule__Index__Group_0_1__2 )
            // InternalDBML.g:1024:2: rule__Index__Group_0_1__1__Impl rule__Index__Group_0_1__2
            {
            pushFollow(FOLLOW_15);
            rule__Index__Group_0_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Index__Group_0_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Index__Group_0_1__1"


    // $ANTLR start "rule__Index__Group_0_1__1__Impl"
    // InternalDBML.g:1031:1: rule__Index__Group_0_1__1__Impl : ( RULE_ID ) ;
    public final void rule__Index__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:1035:1: ( ( RULE_ID ) )
            // InternalDBML.g:1036:1: ( RULE_ID )
            {
            // InternalDBML.g:1036:1: ( RULE_ID )
            // InternalDBML.g:1037:2: RULE_ID
            {
             before(grammarAccess.getIndexAccess().getIDTerminalRuleCall_0_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIndexAccess().getIDTerminalRuleCall_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Index__Group_0_1__1__Impl"


    // $ANTLR start "rule__Index__Group_0_1__2"
    // InternalDBML.g:1046:1: rule__Index__Group_0_1__2 : rule__Index__Group_0_1__2__Impl rule__Index__Group_0_1__3 ;
    public final void rule__Index__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:1050:1: ( rule__Index__Group_0_1__2__Impl rule__Index__Group_0_1__3 )
            // InternalDBML.g:1051:2: rule__Index__Group_0_1__2__Impl rule__Index__Group_0_1__3
            {
            pushFollow(FOLLOW_16);
            rule__Index__Group_0_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Index__Group_0_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Index__Group_0_1__2"


    // $ANTLR start "rule__Index__Group_0_1__2__Impl"
    // InternalDBML.g:1058:1: rule__Index__Group_0_1__2__Impl : ( ( ( rule__Index__Group_0_1_2__0 ) ) ( ( rule__Index__Group_0_1_2__0 )* ) ) ;
    public final void rule__Index__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:1062:1: ( ( ( ( rule__Index__Group_0_1_2__0 ) ) ( ( rule__Index__Group_0_1_2__0 )* ) ) )
            // InternalDBML.g:1063:1: ( ( ( rule__Index__Group_0_1_2__0 ) ) ( ( rule__Index__Group_0_1_2__0 )* ) )
            {
            // InternalDBML.g:1063:1: ( ( ( rule__Index__Group_0_1_2__0 ) ) ( ( rule__Index__Group_0_1_2__0 )* ) )
            // InternalDBML.g:1064:2: ( ( rule__Index__Group_0_1_2__0 ) ) ( ( rule__Index__Group_0_1_2__0 )* )
            {
            // InternalDBML.g:1064:2: ( ( rule__Index__Group_0_1_2__0 ) )
            // InternalDBML.g:1065:3: ( rule__Index__Group_0_1_2__0 )
            {
             before(grammarAccess.getIndexAccess().getGroup_0_1_2()); 
            // InternalDBML.g:1066:3: ( rule__Index__Group_0_1_2__0 )
            // InternalDBML.g:1066:4: rule__Index__Group_0_1_2__0
            {
            pushFollow(FOLLOW_17);
            rule__Index__Group_0_1_2__0();

            state._fsp--;


            }

             after(grammarAccess.getIndexAccess().getGroup_0_1_2()); 

            }

            // InternalDBML.g:1069:2: ( ( rule__Index__Group_0_1_2__0 )* )
            // InternalDBML.g:1070:3: ( rule__Index__Group_0_1_2__0 )*
            {
             before(grammarAccess.getIndexAccess().getGroup_0_1_2()); 
            // InternalDBML.g:1071:3: ( rule__Index__Group_0_1_2__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==38) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDBML.g:1071:4: rule__Index__Group_0_1_2__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Index__Group_0_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getIndexAccess().getGroup_0_1_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Index__Group_0_1__2__Impl"


    // $ANTLR start "rule__Index__Group_0_1__3"
    // InternalDBML.g:1080:1: rule__Index__Group_0_1__3 : rule__Index__Group_0_1__3__Impl ;
    public final void rule__Index__Group_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:1084:1: ( rule__Index__Group_0_1__3__Impl )
            // InternalDBML.g:1085:2: rule__Index__Group_0_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Index__Group_0_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Index__Group_0_1__3"


    // $ANTLR start "rule__Index__Group_0_1__3__Impl"
    // InternalDBML.g:1091:1: rule__Index__Group_0_1__3__Impl : ( ')' ) ;
    public final void rule__Index__Group_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:1095:1: ( ( ')' ) )
            // InternalDBML.g:1096:1: ( ')' )
            {
            // InternalDBML.g:1096:1: ( ')' )
            // InternalDBML.g:1097:2: ')'
            {
             before(grammarAccess.getIndexAccess().getRightParenthesisKeyword_0_1_3()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getIndexAccess().getRightParenthesisKeyword_0_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Index__Group_0_1__3__Impl"


    // $ANTLR start "rule__Index__Group_0_1_2__0"
    // InternalDBML.g:1107:1: rule__Index__Group_0_1_2__0 : rule__Index__Group_0_1_2__0__Impl rule__Index__Group_0_1_2__1 ;
    public final void rule__Index__Group_0_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:1111:1: ( rule__Index__Group_0_1_2__0__Impl rule__Index__Group_0_1_2__1 )
            // InternalDBML.g:1112:2: rule__Index__Group_0_1_2__0__Impl rule__Index__Group_0_1_2__1
            {
            pushFollow(FOLLOW_5);
            rule__Index__Group_0_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Index__Group_0_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Index__Group_0_1_2__0"


    // $ANTLR start "rule__Index__Group_0_1_2__0__Impl"
    // InternalDBML.g:1119:1: rule__Index__Group_0_1_2__0__Impl : ( ',' ) ;
    public final void rule__Index__Group_0_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:1123:1: ( ( ',' ) )
            // InternalDBML.g:1124:1: ( ',' )
            {
            // InternalDBML.g:1124:1: ( ',' )
            // InternalDBML.g:1125:2: ','
            {
             before(grammarAccess.getIndexAccess().getCommaKeyword_0_1_2_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getIndexAccess().getCommaKeyword_0_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Index__Group_0_1_2__0__Impl"


    // $ANTLR start "rule__Index__Group_0_1_2__1"
    // InternalDBML.g:1134:1: rule__Index__Group_0_1_2__1 : rule__Index__Group_0_1_2__1__Impl ;
    public final void rule__Index__Group_0_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:1138:1: ( rule__Index__Group_0_1_2__1__Impl )
            // InternalDBML.g:1139:2: rule__Index__Group_0_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Index__Group_0_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Index__Group_0_1_2__1"


    // $ANTLR start "rule__Index__Group_0_1_2__1__Impl"
    // InternalDBML.g:1145:1: rule__Index__Group_0_1_2__1__Impl : ( RULE_ID ) ;
    public final void rule__Index__Group_0_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:1149:1: ( ( RULE_ID ) )
            // InternalDBML.g:1150:1: ( RULE_ID )
            {
            // InternalDBML.g:1150:1: ( RULE_ID )
            // InternalDBML.g:1151:2: RULE_ID
            {
             before(grammarAccess.getIndexAccess().getIDTerminalRuleCall_0_1_2_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIndexAccess().getIDTerminalRuleCall_0_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Index__Group_0_1_2__1__Impl"


    // $ANTLR start "rule__Index__Group_3_1__0"
    // InternalDBML.g:1161:1: rule__Index__Group_3_1__0 : rule__Index__Group_3_1__0__Impl rule__Index__Group_3_1__1 ;
    public final void rule__Index__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:1165:1: ( rule__Index__Group_3_1__0__Impl rule__Index__Group_3_1__1 )
            // InternalDBML.g:1166:2: rule__Index__Group_3_1__0__Impl rule__Index__Group_3_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Index__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Index__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Index__Group_3_1__0"


    // $ANTLR start "rule__Index__Group_3_1__0__Impl"
    // InternalDBML.g:1173:1: rule__Index__Group_3_1__0__Impl : ( 'name:' ) ;
    public final void rule__Index__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:1177:1: ( ( 'name:' ) )
            // InternalDBML.g:1178:1: ( 'name:' )
            {
            // InternalDBML.g:1178:1: ( 'name:' )
            // InternalDBML.g:1179:2: 'name:'
            {
             before(grammarAccess.getIndexAccess().getNameKeyword_3_1_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getIndexAccess().getNameKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Index__Group_3_1__0__Impl"


    // $ANTLR start "rule__Index__Group_3_1__1"
    // InternalDBML.g:1188:1: rule__Index__Group_3_1__1 : rule__Index__Group_3_1__1__Impl rule__Index__Group_3_1__2 ;
    public final void rule__Index__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:1192:1: ( rule__Index__Group_3_1__1__Impl rule__Index__Group_3_1__2 )
            // InternalDBML.g:1193:2: rule__Index__Group_3_1__1__Impl rule__Index__Group_3_1__2
            {
            pushFollow(FOLLOW_5);
            rule__Index__Group_3_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Index__Group_3_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Index__Group_3_1__1"


    // $ANTLR start "rule__Index__Group_3_1__1__Impl"
    // InternalDBML.g:1200:1: rule__Index__Group_3_1__1__Impl : ( '\"' ) ;
    public final void rule__Index__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:1204:1: ( ( '\"' ) )
            // InternalDBML.g:1205:1: ( '\"' )
            {
            // InternalDBML.g:1205:1: ( '\"' )
            // InternalDBML.g:1206:2: '\"'
            {
             before(grammarAccess.getIndexAccess().getQuotationMarkKeyword_3_1_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getIndexAccess().getQuotationMarkKeyword_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Index__Group_3_1__1__Impl"


    // $ANTLR start "rule__Index__Group_3_1__2"
    // InternalDBML.g:1215:1: rule__Index__Group_3_1__2 : rule__Index__Group_3_1__2__Impl rule__Index__Group_3_1__3 ;
    public final void rule__Index__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:1219:1: ( rule__Index__Group_3_1__2__Impl rule__Index__Group_3_1__3 )
            // InternalDBML.g:1220:2: rule__Index__Group_3_1__2__Impl rule__Index__Group_3_1__3
            {
            pushFollow(FOLLOW_4);
            rule__Index__Group_3_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Index__Group_3_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Index__Group_3_1__2"


    // $ANTLR start "rule__Index__Group_3_1__2__Impl"
    // InternalDBML.g:1227:1: rule__Index__Group_3_1__2__Impl : ( RULE_ID ) ;
    public final void rule__Index__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:1231:1: ( ( RULE_ID ) )
            // InternalDBML.g:1232:1: ( RULE_ID )
            {
            // InternalDBML.g:1232:1: ( RULE_ID )
            // InternalDBML.g:1233:2: RULE_ID
            {
             before(grammarAccess.getIndexAccess().getIDTerminalRuleCall_3_1_2()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIndexAccess().getIDTerminalRuleCall_3_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Index__Group_3_1__2__Impl"


    // $ANTLR start "rule__Index__Group_3_1__3"
    // InternalDBML.g:1242:1: rule__Index__Group_3_1__3 : rule__Index__Group_3_1__3__Impl ;
    public final void rule__Index__Group_3_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:1246:1: ( rule__Index__Group_3_1__3__Impl )
            // InternalDBML.g:1247:2: rule__Index__Group_3_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Index__Group_3_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Index__Group_3_1__3"


    // $ANTLR start "rule__Index__Group_3_1__3__Impl"
    // InternalDBML.g:1253:1: rule__Index__Group_3_1__3__Impl : ( '\"' ) ;
    public final void rule__Index__Group_3_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:1257:1: ( ( '\"' ) )
            // InternalDBML.g:1258:1: ( '\"' )
            {
            // InternalDBML.g:1258:1: ( '\"' )
            // InternalDBML.g:1259:2: '\"'
            {
             before(grammarAccess.getIndexAccess().getQuotationMarkKeyword_3_1_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getIndexAccess().getQuotationMarkKeyword_3_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Index__Group_3_1__3__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalDBML.g:1269:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:1273:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalDBML.g:1274:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // InternalDBML.g:1281:1: rule__Attribute__Group__0__Impl : ( '\"' ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:1285:1: ( ( '\"' ) )
            // InternalDBML.g:1286:1: ( '\"' )
            {
            // InternalDBML.g:1286:1: ( '\"' )
            // InternalDBML.g:1287:2: '\"'
            {
             before(grammarAccess.getAttributeAccess().getQuotationMarkKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getQuotationMarkKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // InternalDBML.g:1296:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:1300:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalDBML.g:1301:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // InternalDBML.g:1308:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:1312:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalDBML.g:1313:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalDBML.g:1313:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalDBML.g:1314:2: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // InternalDBML.g:1315:2: ( rule__Attribute__NameAssignment_1 )
            // InternalDBML.g:1315:3: rule__Attribute__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // InternalDBML.g:1323:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:1327:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalDBML.g:1328:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Attribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // InternalDBML.g:1335:1: rule__Attribute__Group__2__Impl : ( '\"' ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:1339:1: ( ( '\"' ) )
            // InternalDBML.g:1340:1: ( '\"' )
            {
            // InternalDBML.g:1340:1: ( '\"' )
            // InternalDBML.g:1341:2: '\"'
            {
             before(grammarAccess.getAttributeAccess().getQuotationMarkKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getQuotationMarkKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Attribute__Group__3"
    // InternalDBML.g:1350:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:1354:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // InternalDBML.g:1355:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Attribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3"


    // $ANTLR start "rule__Attribute__Group__3__Impl"
    // InternalDBML.g:1362:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__TypeAssignment_3 ) ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:1366:1: ( ( ( rule__Attribute__TypeAssignment_3 ) ) )
            // InternalDBML.g:1367:1: ( ( rule__Attribute__TypeAssignment_3 ) )
            {
            // InternalDBML.g:1367:1: ( ( rule__Attribute__TypeAssignment_3 ) )
            // InternalDBML.g:1368:2: ( rule__Attribute__TypeAssignment_3 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_3()); 
            // InternalDBML.g:1369:2: ( rule__Attribute__TypeAssignment_3 )
            // InternalDBML.g:1369:3: rule__Attribute__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3__Impl"


    // $ANTLR start "rule__Attribute__Group__4"
    // InternalDBML.g:1377:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:1381:1: ( rule__Attribute__Group__4__Impl )
            // InternalDBML.g:1382:2: rule__Attribute__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__4"


    // $ANTLR start "rule__Attribute__Group__4__Impl"
    // InternalDBML.g:1388:1: rule__Attribute__Group__4__Impl : ( ( rule__Attribute__Group_4__0 )? ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:1392:1: ( ( ( rule__Attribute__Group_4__0 )? ) )
            // InternalDBML.g:1393:1: ( ( rule__Attribute__Group_4__0 )? )
            {
            // InternalDBML.g:1393:1: ( ( rule__Attribute__Group_4__0 )? )
            // InternalDBML.g:1394:2: ( rule__Attribute__Group_4__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_4()); 
            // InternalDBML.g:1395:2: ( rule__Attribute__Group_4__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==33) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDBML.g:1395:3: rule__Attribute__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__4__Impl"


    // $ANTLR start "rule__Attribute__Group_4__0"
    // InternalDBML.g:1404:1: rule__Attribute__Group_4__0 : rule__Attribute__Group_4__0__Impl rule__Attribute__Group_4__1 ;
    public final void rule__Attribute__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:1408:1: ( rule__Attribute__Group_4__0__Impl rule__Attribute__Group_4__1 )
            // InternalDBML.g:1409:2: rule__Attribute__Group_4__0__Impl rule__Attribute__Group_4__1
            {
            pushFollow(FOLLOW_19);
            rule__Attribute__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_4__0"


    // $ANTLR start "rule__Attribute__Group_4__0__Impl"
    // InternalDBML.g:1416:1: rule__Attribute__Group_4__0__Impl : ( '[' ) ;
    public final void rule__Attribute__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:1420:1: ( ( '[' ) )
            // InternalDBML.g:1421:1: ( '[' )
            {
            // InternalDBML.g:1421:1: ( '[' )
            // InternalDBML.g:1422:2: '['
            {
             before(grammarAccess.getAttributeAccess().getLeftSquareBracketKeyword_4_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getLeftSquareBracketKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_4__0__Impl"


    // $ANTLR start "rule__Attribute__Group_4__1"
    // InternalDBML.g:1431:1: rule__Attribute__Group_4__1 : rule__Attribute__Group_4__1__Impl rule__Attribute__Group_4__2 ;
    public final void rule__Attribute__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:1435:1: ( rule__Attribute__Group_4__1__Impl rule__Attribute__Group_4__2 )
            // InternalDBML.g:1436:2: rule__Attribute__Group_4__1__Impl rule__Attribute__Group_4__2
            {
            pushFollow(FOLLOW_20);
            rule__Attribute__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_4__1"


    // $ANTLR start "rule__Attribute__Group_4__1__Impl"
    // InternalDBML.g:1443:1: rule__Attribute__Group_4__1__Impl : ( ( rule__Attribute__OptionsAssignment_4_1 ) ) ;
    public final void rule__Attribute__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:1447:1: ( ( ( rule__Attribute__OptionsAssignment_4_1 ) ) )
            // InternalDBML.g:1448:1: ( ( rule__Attribute__OptionsAssignment_4_1 ) )
            {
            // InternalDBML.g:1448:1: ( ( rule__Attribute__OptionsAssignment_4_1 ) )
            // InternalDBML.g:1449:2: ( rule__Attribute__OptionsAssignment_4_1 )
            {
             before(grammarAccess.getAttributeAccess().getOptionsAssignment_4_1()); 
            // InternalDBML.g:1450:2: ( rule__Attribute__OptionsAssignment_4_1 )
            // InternalDBML.g:1450:3: rule__Attribute__OptionsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__OptionsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getOptionsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_4__1__Impl"


    // $ANTLR start "rule__Attribute__Group_4__2"
    // InternalDBML.g:1458:1: rule__Attribute__Group_4__2 : rule__Attribute__Group_4__2__Impl rule__Attribute__Group_4__3 ;
    public final void rule__Attribute__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:1462:1: ( rule__Attribute__Group_4__2__Impl rule__Attribute__Group_4__3 )
            // InternalDBML.g:1463:2: rule__Attribute__Group_4__2__Impl rule__Attribute__Group_4__3
            {
            pushFollow(FOLLOW_20);
            rule__Attribute__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_4__2"


    // $ANTLR start "rule__Attribute__Group_4__2__Impl"
    // InternalDBML.g:1470:1: rule__Attribute__Group_4__2__Impl : ( ( rule__Attribute__Group_4_2__0 )* ) ;
    public final void rule__Attribute__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:1474:1: ( ( ( rule__Attribute__Group_4_2__0 )* ) )
            // InternalDBML.g:1475:1: ( ( rule__Attribute__Group_4_2__0 )* )
            {
            // InternalDBML.g:1475:1: ( ( rule__Attribute__Group_4_2__0 )* )
            // InternalDBML.g:1476:2: ( rule__Attribute__Group_4_2__0 )*
            {
             before(grammarAccess.getAttributeAccess().getGroup_4_2()); 
            // InternalDBML.g:1477:2: ( rule__Attribute__Group_4_2__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==38) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDBML.g:1477:3: rule__Attribute__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Attribute__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getAttributeAccess().getGroup_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_4__2__Impl"


    // $ANTLR start "rule__Attribute__Group_4__3"
    // InternalDBML.g:1485:1: rule__Attribute__Group_4__3 : rule__Attribute__Group_4__3__Impl ;
    public final void rule__Attribute__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:1489:1: ( rule__Attribute__Group_4__3__Impl )
            // InternalDBML.g:1490:2: rule__Attribute__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group_4__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_4__3"


    // $ANTLR start "rule__Attribute__Group_4__3__Impl"
    // InternalDBML.g:1496:1: rule__Attribute__Group_4__3__Impl : ( ']' ) ;
    public final void rule__Attribute__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:1500:1: ( ( ']' ) )
            // InternalDBML.g:1501:1: ( ']' )
            {
            // InternalDBML.g:1501:1: ( ']' )
            // InternalDBML.g:1502:2: ']'
            {
             before(grammarAccess.getAttributeAccess().getRightSquareBracketKeyword_4_3()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getRightSquareBracketKeyword_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_4__3__Impl"


    // $ANTLR start "rule__Attribute__Group_4_2__0"
    // InternalDBML.g:1512:1: rule__Attribute__Group_4_2__0 : rule__Attribute__Group_4_2__0__Impl rule__Attribute__Group_4_2__1 ;
    public final void rule__Attribute__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:1516:1: ( rule__Attribute__Group_4_2__0__Impl rule__Attribute__Group_4_2__1 )
            // InternalDBML.g:1517:2: rule__Attribute__Group_4_2__0__Impl rule__Attribute__Group_4_2__1
            {
            pushFollow(FOLLOW_19);
            rule__Attribute__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_4_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_4_2__0"


    // $ANTLR start "rule__Attribute__Group_4_2__0__Impl"
    // InternalDBML.g:1524:1: rule__Attribute__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__Attribute__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:1528:1: ( ( ',' ) )
            // InternalDBML.g:1529:1: ( ',' )
            {
            // InternalDBML.g:1529:1: ( ',' )
            // InternalDBML.g:1530:2: ','
            {
             before(grammarAccess.getAttributeAccess().getCommaKeyword_4_2_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getCommaKeyword_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_4_2__0__Impl"


    // $ANTLR start "rule__Attribute__Group_4_2__1"
    // InternalDBML.g:1539:1: rule__Attribute__Group_4_2__1 : rule__Attribute__Group_4_2__1__Impl ;
    public final void rule__Attribute__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:1543:1: ( rule__Attribute__Group_4_2__1__Impl )
            // InternalDBML.g:1544:2: rule__Attribute__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group_4_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_4_2__1"


    // $ANTLR start "rule__Attribute__Group_4_2__1__Impl"
    // InternalDBML.g:1550:1: rule__Attribute__Group_4_2__1__Impl : ( ( rule__Attribute__OptionsAssignment_4_2_1 ) ) ;
    public final void rule__Attribute__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:1554:1: ( ( ( rule__Attribute__OptionsAssignment_4_2_1 ) ) )
            // InternalDBML.g:1555:1: ( ( rule__Attribute__OptionsAssignment_4_2_1 ) )
            {
            // InternalDBML.g:1555:1: ( ( rule__Attribute__OptionsAssignment_4_2_1 ) )
            // InternalDBML.g:1556:2: ( rule__Attribute__OptionsAssignment_4_2_1 )
            {
             before(grammarAccess.getAttributeAccess().getOptionsAssignment_4_2_1()); 
            // InternalDBML.g:1557:2: ( rule__Attribute__OptionsAssignment_4_2_1 )
            // InternalDBML.g:1557:3: rule__Attribute__OptionsAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__OptionsAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getOptionsAssignment_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_4_2__1__Impl"


    // $ANTLR start "rule__Optional__Group_1__0"
    // InternalDBML.g:1566:1: rule__Optional__Group_1__0 : rule__Optional__Group_1__0__Impl rule__Optional__Group_1__1 ;
    public final void rule__Optional__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:1570:1: ( rule__Optional__Group_1__0__Impl rule__Optional__Group_1__1 )
            // InternalDBML.g:1571:2: rule__Optional__Group_1__0__Impl rule__Optional__Group_1__1
            {
            pushFollow(FOLLOW_21);
            rule__Optional__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Optional__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__Group_1__0"


    // $ANTLR start "rule__Optional__Group_1__0__Impl"
    // InternalDBML.g:1578:1: rule__Optional__Group_1__0__Impl : ( 'not' ) ;
    public final void rule__Optional__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:1582:1: ( ( 'not' ) )
            // InternalDBML.g:1583:1: ( 'not' )
            {
            // InternalDBML.g:1583:1: ( 'not' )
            // InternalDBML.g:1584:2: 'not'
            {
             before(grammarAccess.getOptionalAccess().getNotKeyword_1_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getOptionalAccess().getNotKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__Group_1__0__Impl"


    // $ANTLR start "rule__Optional__Group_1__1"
    // InternalDBML.g:1593:1: rule__Optional__Group_1__1 : rule__Optional__Group_1__1__Impl ;
    public final void rule__Optional__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:1597:1: ( rule__Optional__Group_1__1__Impl )
            // InternalDBML.g:1598:2: rule__Optional__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Optional__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__Group_1__1"


    // $ANTLR start "rule__Optional__Group_1__1__Impl"
    // InternalDBML.g:1604:1: rule__Optional__Group_1__1__Impl : ( 'null' ) ;
    public final void rule__Optional__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:1608:1: ( ( 'null' ) )
            // InternalDBML.g:1609:1: ( 'null' )
            {
            // InternalDBML.g:1609:1: ( 'null' )
            // InternalDBML.g:1610:2: 'null'
            {
             before(grammarAccess.getOptionalAccess().getNullKeyword_1_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getOptionalAccess().getNullKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__Group_1__1__Impl"


    // $ANTLR start "rule__Type__Group_5__0"
    // InternalDBML.g:1620:1: rule__Type__Group_5__0 : rule__Type__Group_5__0__Impl rule__Type__Group_5__1 ;
    public final void rule__Type__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:1624:1: ( rule__Type__Group_5__0__Impl rule__Type__Group_5__1 )
            // InternalDBML.g:1625:2: rule__Type__Group_5__0__Impl rule__Type__Group_5__1
            {
            pushFollow(FOLLOW_22);
            rule__Type__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_5__0"


    // $ANTLR start "rule__Type__Group_5__0__Impl"
    // InternalDBML.g:1632:1: rule__Type__Group_5__0__Impl : ( 'TINYINT' ) ;
    public final void rule__Type__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:1636:1: ( ( 'TINYINT' ) )
            // InternalDBML.g:1637:1: ( 'TINYINT' )
            {
            // InternalDBML.g:1637:1: ( 'TINYINT' )
            // InternalDBML.g:1638:2: 'TINYINT'
            {
             before(grammarAccess.getTypeAccess().getTINYINTKeyword_5_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getTINYINTKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_5__0__Impl"


    // $ANTLR start "rule__Type__Group_5__1"
    // InternalDBML.g:1647:1: rule__Type__Group_5__1 : rule__Type__Group_5__1__Impl ;
    public final void rule__Type__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:1651:1: ( rule__Type__Group_5__1__Impl )
            // InternalDBML.g:1652:2: rule__Type__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_5__1"


    // $ANTLR start "rule__Type__Group_5__1__Impl"
    // InternalDBML.g:1658:1: rule__Type__Group_5__1__Impl : ( ( rule__Type__Group_5_1__0 )? ) ;
    public final void rule__Type__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:1662:1: ( ( ( rule__Type__Group_5_1__0 )? ) )
            // InternalDBML.g:1663:1: ( ( rule__Type__Group_5_1__0 )? )
            {
            // InternalDBML.g:1663:1: ( ( rule__Type__Group_5_1__0 )? )
            // InternalDBML.g:1664:2: ( rule__Type__Group_5_1__0 )?
            {
             before(grammarAccess.getTypeAccess().getGroup_5_1()); 
            // InternalDBML.g:1665:2: ( rule__Type__Group_5_1__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==36) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDBML.g:1665:3: rule__Type__Group_5_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_5_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypeAccess().getGroup_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_5__1__Impl"


    // $ANTLR start "rule__Type__Group_5_1__0"
    // InternalDBML.g:1674:1: rule__Type__Group_5_1__0 : rule__Type__Group_5_1__0__Impl rule__Type__Group_5_1__1 ;
    public final void rule__Type__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:1678:1: ( rule__Type__Group_5_1__0__Impl rule__Type__Group_5_1__1 )
            // InternalDBML.g:1679:2: rule__Type__Group_5_1__0__Impl rule__Type__Group_5_1__1
            {
            pushFollow(FOLLOW_23);
            rule__Type__Group_5_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_5_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_5_1__0"


    // $ANTLR start "rule__Type__Group_5_1__0__Impl"
    // InternalDBML.g:1686:1: rule__Type__Group_5_1__0__Impl : ( '(' ) ;
    public final void rule__Type__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:1690:1: ( ( '(' ) )
            // InternalDBML.g:1691:1: ( '(' )
            {
            // InternalDBML.g:1691:1: ( '(' )
            // InternalDBML.g:1692:2: '('
            {
             before(grammarAccess.getTypeAccess().getLeftParenthesisKeyword_5_1_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getLeftParenthesisKeyword_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_5_1__0__Impl"


    // $ANTLR start "rule__Type__Group_5_1__1"
    // InternalDBML.g:1701:1: rule__Type__Group_5_1__1 : rule__Type__Group_5_1__1__Impl rule__Type__Group_5_1__2 ;
    public final void rule__Type__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:1705:1: ( rule__Type__Group_5_1__1__Impl rule__Type__Group_5_1__2 )
            // InternalDBML.g:1706:2: rule__Type__Group_5_1__1__Impl rule__Type__Group_5_1__2
            {
            pushFollow(FOLLOW_16);
            rule__Type__Group_5_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_5_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_5_1__1"


    // $ANTLR start "rule__Type__Group_5_1__1__Impl"
    // InternalDBML.g:1713:1: rule__Type__Group_5_1__1__Impl : ( RULE_INT ) ;
    public final void rule__Type__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:1717:1: ( ( RULE_INT ) )
            // InternalDBML.g:1718:1: ( RULE_INT )
            {
            // InternalDBML.g:1718:1: ( RULE_INT )
            // InternalDBML.g:1719:2: RULE_INT
            {
             before(grammarAccess.getTypeAccess().getINTTerminalRuleCall_5_1_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getINTTerminalRuleCall_5_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_5_1__1__Impl"


    // $ANTLR start "rule__Type__Group_5_1__2"
    // InternalDBML.g:1728:1: rule__Type__Group_5_1__2 : rule__Type__Group_5_1__2__Impl ;
    public final void rule__Type__Group_5_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:1732:1: ( rule__Type__Group_5_1__2__Impl )
            // InternalDBML.g:1733:2: rule__Type__Group_5_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_5_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_5_1__2"


    // $ANTLR start "rule__Type__Group_5_1__2__Impl"
    // InternalDBML.g:1739:1: rule__Type__Group_5_1__2__Impl : ( ')' ) ;
    public final void rule__Type__Group_5_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:1743:1: ( ( ')' ) )
            // InternalDBML.g:1744:1: ( ')' )
            {
            // InternalDBML.g:1744:1: ( ')' )
            // InternalDBML.g:1745:2: ')'
            {
             before(grammarAccess.getTypeAccess().getRightParenthesisKeyword_5_1_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getRightParenthesisKeyword_5_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_5_1__2__Impl"


    // $ANTLR start "rule__Type__Group_14__0"
    // InternalDBML.g:1755:1: rule__Type__Group_14__0 : rule__Type__Group_14__0__Impl rule__Type__Group_14__1 ;
    public final void rule__Type__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:1759:1: ( rule__Type__Group_14__0__Impl rule__Type__Group_14__1 )
            // InternalDBML.g:1760:2: rule__Type__Group_14__0__Impl rule__Type__Group_14__1
            {
            pushFollow(FOLLOW_22);
            rule__Type__Group_14__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_14__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_14__0"


    // $ANTLR start "rule__Type__Group_14__0__Impl"
    // InternalDBML.g:1767:1: rule__Type__Group_14__0__Impl : ( 'MEDIUMTEXT' ) ;
    public final void rule__Type__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:1771:1: ( ( 'MEDIUMTEXT' ) )
            // InternalDBML.g:1772:1: ( 'MEDIUMTEXT' )
            {
            // InternalDBML.g:1772:1: ( 'MEDIUMTEXT' )
            // InternalDBML.g:1773:2: 'MEDIUMTEXT'
            {
             before(grammarAccess.getTypeAccess().getMEDIUMTEXTKeyword_14_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getMEDIUMTEXTKeyword_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_14__0__Impl"


    // $ANTLR start "rule__Type__Group_14__1"
    // InternalDBML.g:1782:1: rule__Type__Group_14__1 : rule__Type__Group_14__1__Impl ;
    public final void rule__Type__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:1786:1: ( rule__Type__Group_14__1__Impl )
            // InternalDBML.g:1787:2: rule__Type__Group_14__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_14__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_14__1"


    // $ANTLR start "rule__Type__Group_14__1__Impl"
    // InternalDBML.g:1793:1: rule__Type__Group_14__1__Impl : ( ( rule__Type__Group_14_1__0 )? ) ;
    public final void rule__Type__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:1797:1: ( ( ( rule__Type__Group_14_1__0 )? ) )
            // InternalDBML.g:1798:1: ( ( rule__Type__Group_14_1__0 )? )
            {
            // InternalDBML.g:1798:1: ( ( rule__Type__Group_14_1__0 )? )
            // InternalDBML.g:1799:2: ( rule__Type__Group_14_1__0 )?
            {
             before(grammarAccess.getTypeAccess().getGroup_14_1()); 
            // InternalDBML.g:1800:2: ( rule__Type__Group_14_1__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==36) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDBML.g:1800:3: rule__Type__Group_14_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_14_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypeAccess().getGroup_14_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_14__1__Impl"


    // $ANTLR start "rule__Type__Group_14_1__0"
    // InternalDBML.g:1809:1: rule__Type__Group_14_1__0 : rule__Type__Group_14_1__0__Impl rule__Type__Group_14_1__1 ;
    public final void rule__Type__Group_14_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:1813:1: ( rule__Type__Group_14_1__0__Impl rule__Type__Group_14_1__1 )
            // InternalDBML.g:1814:2: rule__Type__Group_14_1__0__Impl rule__Type__Group_14_1__1
            {
            pushFollow(FOLLOW_23);
            rule__Type__Group_14_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_14_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_14_1__0"


    // $ANTLR start "rule__Type__Group_14_1__0__Impl"
    // InternalDBML.g:1821:1: rule__Type__Group_14_1__0__Impl : ( '(' ) ;
    public final void rule__Type__Group_14_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:1825:1: ( ( '(' ) )
            // InternalDBML.g:1826:1: ( '(' )
            {
            // InternalDBML.g:1826:1: ( '(' )
            // InternalDBML.g:1827:2: '('
            {
             before(grammarAccess.getTypeAccess().getLeftParenthesisKeyword_14_1_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getLeftParenthesisKeyword_14_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_14_1__0__Impl"


    // $ANTLR start "rule__Type__Group_14_1__1"
    // InternalDBML.g:1836:1: rule__Type__Group_14_1__1 : rule__Type__Group_14_1__1__Impl rule__Type__Group_14_1__2 ;
    public final void rule__Type__Group_14_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:1840:1: ( rule__Type__Group_14_1__1__Impl rule__Type__Group_14_1__2 )
            // InternalDBML.g:1841:2: rule__Type__Group_14_1__1__Impl rule__Type__Group_14_1__2
            {
            pushFollow(FOLLOW_16);
            rule__Type__Group_14_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_14_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_14_1__1"


    // $ANTLR start "rule__Type__Group_14_1__1__Impl"
    // InternalDBML.g:1848:1: rule__Type__Group_14_1__1__Impl : ( RULE_INT ) ;
    public final void rule__Type__Group_14_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:1852:1: ( ( RULE_INT ) )
            // InternalDBML.g:1853:1: ( RULE_INT )
            {
            // InternalDBML.g:1853:1: ( RULE_INT )
            // InternalDBML.g:1854:2: RULE_INT
            {
             before(grammarAccess.getTypeAccess().getINTTerminalRuleCall_14_1_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getINTTerminalRuleCall_14_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_14_1__1__Impl"


    // $ANTLR start "rule__Type__Group_14_1__2"
    // InternalDBML.g:1863:1: rule__Type__Group_14_1__2 : rule__Type__Group_14_1__2__Impl ;
    public final void rule__Type__Group_14_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:1867:1: ( rule__Type__Group_14_1__2__Impl )
            // InternalDBML.g:1868:2: rule__Type__Group_14_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_14_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_14_1__2"


    // $ANTLR start "rule__Type__Group_14_1__2__Impl"
    // InternalDBML.g:1874:1: rule__Type__Group_14_1__2__Impl : ( ')' ) ;
    public final void rule__Type__Group_14_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:1878:1: ( ( ')' ) )
            // InternalDBML.g:1879:1: ( ')' )
            {
            // InternalDBML.g:1879:1: ( ')' )
            // InternalDBML.g:1880:2: ')'
            {
             before(grammarAccess.getTypeAccess().getRightParenthesisKeyword_14_1_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getRightParenthesisKeyword_14_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_14_1__2__Impl"


    // $ANTLR start "rule__Type__Group_15__0"
    // InternalDBML.g:1890:1: rule__Type__Group_15__0 : rule__Type__Group_15__0__Impl rule__Type__Group_15__1 ;
    public final void rule__Type__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:1894:1: ( rule__Type__Group_15__0__Impl rule__Type__Group_15__1 )
            // InternalDBML.g:1895:2: rule__Type__Group_15__0__Impl rule__Type__Group_15__1
            {
            pushFollow(FOLLOW_23);
            rule__Type__Group_15__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_15__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_15__0"


    // $ANTLR start "rule__Type__Group_15__0__Impl"
    // InternalDBML.g:1902:1: rule__Type__Group_15__0__Impl : ( 'CHAR(' ) ;
    public final void rule__Type__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:1906:1: ( ( 'CHAR(' ) )
            // InternalDBML.g:1907:1: ( 'CHAR(' )
            {
            // InternalDBML.g:1907:1: ( 'CHAR(' )
            // InternalDBML.g:1908:2: 'CHAR('
            {
             before(grammarAccess.getTypeAccess().getCHARKeyword_15_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getCHARKeyword_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_15__0__Impl"


    // $ANTLR start "rule__Type__Group_15__1"
    // InternalDBML.g:1917:1: rule__Type__Group_15__1 : rule__Type__Group_15__1__Impl rule__Type__Group_15__2 ;
    public final void rule__Type__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:1921:1: ( rule__Type__Group_15__1__Impl rule__Type__Group_15__2 )
            // InternalDBML.g:1922:2: rule__Type__Group_15__1__Impl rule__Type__Group_15__2
            {
            pushFollow(FOLLOW_16);
            rule__Type__Group_15__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_15__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_15__1"


    // $ANTLR start "rule__Type__Group_15__1__Impl"
    // InternalDBML.g:1929:1: rule__Type__Group_15__1__Impl : ( RULE_INT ) ;
    public final void rule__Type__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:1933:1: ( ( RULE_INT ) )
            // InternalDBML.g:1934:1: ( RULE_INT )
            {
            // InternalDBML.g:1934:1: ( RULE_INT )
            // InternalDBML.g:1935:2: RULE_INT
            {
             before(grammarAccess.getTypeAccess().getINTTerminalRuleCall_15_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getINTTerminalRuleCall_15_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_15__1__Impl"


    // $ANTLR start "rule__Type__Group_15__2"
    // InternalDBML.g:1944:1: rule__Type__Group_15__2 : rule__Type__Group_15__2__Impl ;
    public final void rule__Type__Group_15__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:1948:1: ( rule__Type__Group_15__2__Impl )
            // InternalDBML.g:1949:2: rule__Type__Group_15__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_15__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_15__2"


    // $ANTLR start "rule__Type__Group_15__2__Impl"
    // InternalDBML.g:1955:1: rule__Type__Group_15__2__Impl : ( ')' ) ;
    public final void rule__Type__Group_15__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:1959:1: ( ( ')' ) )
            // InternalDBML.g:1960:1: ( ')' )
            {
            // InternalDBML.g:1960:1: ( ')' )
            // InternalDBML.g:1961:2: ')'
            {
             before(grammarAccess.getTypeAccess().getRightParenthesisKeyword_15_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getRightParenthesisKeyword_15_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_15__2__Impl"


    // $ANTLR start "rule__Type__Group_16__0"
    // InternalDBML.g:1971:1: rule__Type__Group_16__0 : rule__Type__Group_16__0__Impl rule__Type__Group_16__1 ;
    public final void rule__Type__Group_16__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:1975:1: ( rule__Type__Group_16__0__Impl rule__Type__Group_16__1 )
            // InternalDBML.g:1976:2: rule__Type__Group_16__0__Impl rule__Type__Group_16__1
            {
            pushFollow(FOLLOW_23);
            rule__Type__Group_16__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_16__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_16__0"


    // $ANTLR start "rule__Type__Group_16__0__Impl"
    // InternalDBML.g:1983:1: rule__Type__Group_16__0__Impl : ( 'VARCHAR(' ) ;
    public final void rule__Type__Group_16__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:1987:1: ( ( 'VARCHAR(' ) )
            // InternalDBML.g:1988:1: ( 'VARCHAR(' )
            {
            // InternalDBML.g:1988:1: ( 'VARCHAR(' )
            // InternalDBML.g:1989:2: 'VARCHAR('
            {
             before(grammarAccess.getTypeAccess().getVARCHARKeyword_16_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getVARCHARKeyword_16_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_16__0__Impl"


    // $ANTLR start "rule__Type__Group_16__1"
    // InternalDBML.g:1998:1: rule__Type__Group_16__1 : rule__Type__Group_16__1__Impl rule__Type__Group_16__2 ;
    public final void rule__Type__Group_16__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:2002:1: ( rule__Type__Group_16__1__Impl rule__Type__Group_16__2 )
            // InternalDBML.g:2003:2: rule__Type__Group_16__1__Impl rule__Type__Group_16__2
            {
            pushFollow(FOLLOW_16);
            rule__Type__Group_16__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_16__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_16__1"


    // $ANTLR start "rule__Type__Group_16__1__Impl"
    // InternalDBML.g:2010:1: rule__Type__Group_16__1__Impl : ( RULE_INT ) ;
    public final void rule__Type__Group_16__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:2014:1: ( ( RULE_INT ) )
            // InternalDBML.g:2015:1: ( RULE_INT )
            {
            // InternalDBML.g:2015:1: ( RULE_INT )
            // InternalDBML.g:2016:2: RULE_INT
            {
             before(grammarAccess.getTypeAccess().getINTTerminalRuleCall_16_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getINTTerminalRuleCall_16_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_16__1__Impl"


    // $ANTLR start "rule__Type__Group_16__2"
    // InternalDBML.g:2025:1: rule__Type__Group_16__2 : rule__Type__Group_16__2__Impl ;
    public final void rule__Type__Group_16__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:2029:1: ( rule__Type__Group_16__2__Impl )
            // InternalDBML.g:2030:2: rule__Type__Group_16__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_16__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_16__2"


    // $ANTLR start "rule__Type__Group_16__2__Impl"
    // InternalDBML.g:2036:1: rule__Type__Group_16__2__Impl : ( ')' ) ;
    public final void rule__Type__Group_16__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:2040:1: ( ( ')' ) )
            // InternalDBML.g:2041:1: ( ')' )
            {
            // InternalDBML.g:2041:1: ( ')' )
            // InternalDBML.g:2042:2: ')'
            {
             before(grammarAccess.getTypeAccess().getRightParenthesisKeyword_16_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getRightParenthesisKeyword_16_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_16__2__Impl"


    // $ANTLR start "rule__Type__Group_17__0"
    // InternalDBML.g:2052:1: rule__Type__Group_17__0 : rule__Type__Group_17__0__Impl rule__Type__Group_17__1 ;
    public final void rule__Type__Group_17__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:2056:1: ( rule__Type__Group_17__0__Impl rule__Type__Group_17__1 )
            // InternalDBML.g:2057:2: rule__Type__Group_17__0__Impl rule__Type__Group_17__1
            {
            pushFollow(FOLLOW_23);
            rule__Type__Group_17__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_17__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_17__0"


    // $ANTLR start "rule__Type__Group_17__0__Impl"
    // InternalDBML.g:2064:1: rule__Type__Group_17__0__Impl : ( 'NCHAR(' ) ;
    public final void rule__Type__Group_17__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:2068:1: ( ( 'NCHAR(' ) )
            // InternalDBML.g:2069:1: ( 'NCHAR(' )
            {
            // InternalDBML.g:2069:1: ( 'NCHAR(' )
            // InternalDBML.g:2070:2: 'NCHAR('
            {
             before(grammarAccess.getTypeAccess().getNCHARKeyword_17_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getNCHARKeyword_17_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_17__0__Impl"


    // $ANTLR start "rule__Type__Group_17__1"
    // InternalDBML.g:2079:1: rule__Type__Group_17__1 : rule__Type__Group_17__1__Impl rule__Type__Group_17__2 ;
    public final void rule__Type__Group_17__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:2083:1: ( rule__Type__Group_17__1__Impl rule__Type__Group_17__2 )
            // InternalDBML.g:2084:2: rule__Type__Group_17__1__Impl rule__Type__Group_17__2
            {
            pushFollow(FOLLOW_16);
            rule__Type__Group_17__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_17__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_17__1"


    // $ANTLR start "rule__Type__Group_17__1__Impl"
    // InternalDBML.g:2091:1: rule__Type__Group_17__1__Impl : ( RULE_INT ) ;
    public final void rule__Type__Group_17__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:2095:1: ( ( RULE_INT ) )
            // InternalDBML.g:2096:1: ( RULE_INT )
            {
            // InternalDBML.g:2096:1: ( RULE_INT )
            // InternalDBML.g:2097:2: RULE_INT
            {
             before(grammarAccess.getTypeAccess().getINTTerminalRuleCall_17_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getINTTerminalRuleCall_17_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_17__1__Impl"


    // $ANTLR start "rule__Type__Group_17__2"
    // InternalDBML.g:2106:1: rule__Type__Group_17__2 : rule__Type__Group_17__2__Impl ;
    public final void rule__Type__Group_17__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:2110:1: ( rule__Type__Group_17__2__Impl )
            // InternalDBML.g:2111:2: rule__Type__Group_17__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_17__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_17__2"


    // $ANTLR start "rule__Type__Group_17__2__Impl"
    // InternalDBML.g:2117:1: rule__Type__Group_17__2__Impl : ( ')' ) ;
    public final void rule__Type__Group_17__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:2121:1: ( ( ')' ) )
            // InternalDBML.g:2122:1: ( ')' )
            {
            // InternalDBML.g:2122:1: ( ')' )
            // InternalDBML.g:2123:2: ')'
            {
             before(grammarAccess.getTypeAccess().getRightParenthesisKeyword_17_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getRightParenthesisKeyword_17_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_17__2__Impl"


    // $ANTLR start "rule__Type__Group_18__0"
    // InternalDBML.g:2133:1: rule__Type__Group_18__0 : rule__Type__Group_18__0__Impl rule__Type__Group_18__1 ;
    public final void rule__Type__Group_18__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:2137:1: ( rule__Type__Group_18__0__Impl rule__Type__Group_18__1 )
            // InternalDBML.g:2138:2: rule__Type__Group_18__0__Impl rule__Type__Group_18__1
            {
            pushFollow(FOLLOW_23);
            rule__Type__Group_18__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_18__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_18__0"


    // $ANTLR start "rule__Type__Group_18__0__Impl"
    // InternalDBML.g:2145:1: rule__Type__Group_18__0__Impl : ( 'NVARCHAR(' ) ;
    public final void rule__Type__Group_18__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:2149:1: ( ( 'NVARCHAR(' ) )
            // InternalDBML.g:2150:1: ( 'NVARCHAR(' )
            {
            // InternalDBML.g:2150:1: ( 'NVARCHAR(' )
            // InternalDBML.g:2151:2: 'NVARCHAR('
            {
             before(grammarAccess.getTypeAccess().getNVARCHARKeyword_18_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getNVARCHARKeyword_18_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_18__0__Impl"


    // $ANTLR start "rule__Type__Group_18__1"
    // InternalDBML.g:2160:1: rule__Type__Group_18__1 : rule__Type__Group_18__1__Impl rule__Type__Group_18__2 ;
    public final void rule__Type__Group_18__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:2164:1: ( rule__Type__Group_18__1__Impl rule__Type__Group_18__2 )
            // InternalDBML.g:2165:2: rule__Type__Group_18__1__Impl rule__Type__Group_18__2
            {
            pushFollow(FOLLOW_16);
            rule__Type__Group_18__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_18__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_18__1"


    // $ANTLR start "rule__Type__Group_18__1__Impl"
    // InternalDBML.g:2172:1: rule__Type__Group_18__1__Impl : ( RULE_INT ) ;
    public final void rule__Type__Group_18__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:2176:1: ( ( RULE_INT ) )
            // InternalDBML.g:2177:1: ( RULE_INT )
            {
            // InternalDBML.g:2177:1: ( RULE_INT )
            // InternalDBML.g:2178:2: RULE_INT
            {
             before(grammarAccess.getTypeAccess().getINTTerminalRuleCall_18_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getINTTerminalRuleCall_18_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_18__1__Impl"


    // $ANTLR start "rule__Type__Group_18__2"
    // InternalDBML.g:2187:1: rule__Type__Group_18__2 : rule__Type__Group_18__2__Impl ;
    public final void rule__Type__Group_18__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:2191:1: ( rule__Type__Group_18__2__Impl )
            // InternalDBML.g:2192:2: rule__Type__Group_18__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_18__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_18__2"


    // $ANTLR start "rule__Type__Group_18__2__Impl"
    // InternalDBML.g:2198:1: rule__Type__Group_18__2__Impl : ( ')' ) ;
    public final void rule__Type__Group_18__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:2202:1: ( ( ')' ) )
            // InternalDBML.g:2203:1: ( ')' )
            {
            // InternalDBML.g:2203:1: ( ')' )
            // InternalDBML.g:2204:2: ')'
            {
             before(grammarAccess.getTypeAccess().getRightParenthesisKeyword_18_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getRightParenthesisKeyword_18_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_18__2__Impl"


    // $ANTLR start "rule__Type__Group_19__0"
    // InternalDBML.g:2214:1: rule__Type__Group_19__0 : rule__Type__Group_19__0__Impl rule__Type__Group_19__1 ;
    public final void rule__Type__Group_19__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:2218:1: ( rule__Type__Group_19__0__Impl rule__Type__Group_19__1 )
            // InternalDBML.g:2219:2: rule__Type__Group_19__0__Impl rule__Type__Group_19__1
            {
            pushFollow(FOLLOW_23);
            rule__Type__Group_19__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_19__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_19__0"


    // $ANTLR start "rule__Type__Group_19__0__Impl"
    // InternalDBML.g:2226:1: rule__Type__Group_19__0__Impl : ( 'DECIMAL(' ) ;
    public final void rule__Type__Group_19__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:2230:1: ( ( 'DECIMAL(' ) )
            // InternalDBML.g:2231:1: ( 'DECIMAL(' )
            {
            // InternalDBML.g:2231:1: ( 'DECIMAL(' )
            // InternalDBML.g:2232:2: 'DECIMAL('
            {
             before(grammarAccess.getTypeAccess().getDECIMALKeyword_19_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getDECIMALKeyword_19_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_19__0__Impl"


    // $ANTLR start "rule__Type__Group_19__1"
    // InternalDBML.g:2241:1: rule__Type__Group_19__1 : rule__Type__Group_19__1__Impl rule__Type__Group_19__2 ;
    public final void rule__Type__Group_19__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:2245:1: ( rule__Type__Group_19__1__Impl rule__Type__Group_19__2 )
            // InternalDBML.g:2246:2: rule__Type__Group_19__1__Impl rule__Type__Group_19__2
            {
            pushFollow(FOLLOW_15);
            rule__Type__Group_19__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_19__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_19__1"


    // $ANTLR start "rule__Type__Group_19__1__Impl"
    // InternalDBML.g:2253:1: rule__Type__Group_19__1__Impl : ( RULE_INT ) ;
    public final void rule__Type__Group_19__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:2257:1: ( ( RULE_INT ) )
            // InternalDBML.g:2258:1: ( RULE_INT )
            {
            // InternalDBML.g:2258:1: ( RULE_INT )
            // InternalDBML.g:2259:2: RULE_INT
            {
             before(grammarAccess.getTypeAccess().getINTTerminalRuleCall_19_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getINTTerminalRuleCall_19_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_19__1__Impl"


    // $ANTLR start "rule__Type__Group_19__2"
    // InternalDBML.g:2268:1: rule__Type__Group_19__2 : rule__Type__Group_19__2__Impl rule__Type__Group_19__3 ;
    public final void rule__Type__Group_19__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:2272:1: ( rule__Type__Group_19__2__Impl rule__Type__Group_19__3 )
            // InternalDBML.g:2273:2: rule__Type__Group_19__2__Impl rule__Type__Group_19__3
            {
            pushFollow(FOLLOW_23);
            rule__Type__Group_19__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_19__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_19__2"


    // $ANTLR start "rule__Type__Group_19__2__Impl"
    // InternalDBML.g:2280:1: rule__Type__Group_19__2__Impl : ( ',' ) ;
    public final void rule__Type__Group_19__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:2284:1: ( ( ',' ) )
            // InternalDBML.g:2285:1: ( ',' )
            {
            // InternalDBML.g:2285:1: ( ',' )
            // InternalDBML.g:2286:2: ','
            {
             before(grammarAccess.getTypeAccess().getCommaKeyword_19_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getCommaKeyword_19_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_19__2__Impl"


    // $ANTLR start "rule__Type__Group_19__3"
    // InternalDBML.g:2295:1: rule__Type__Group_19__3 : rule__Type__Group_19__3__Impl rule__Type__Group_19__4 ;
    public final void rule__Type__Group_19__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:2299:1: ( rule__Type__Group_19__3__Impl rule__Type__Group_19__4 )
            // InternalDBML.g:2300:2: rule__Type__Group_19__3__Impl rule__Type__Group_19__4
            {
            pushFollow(FOLLOW_16);
            rule__Type__Group_19__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_19__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_19__3"


    // $ANTLR start "rule__Type__Group_19__3__Impl"
    // InternalDBML.g:2307:1: rule__Type__Group_19__3__Impl : ( RULE_INT ) ;
    public final void rule__Type__Group_19__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:2311:1: ( ( RULE_INT ) )
            // InternalDBML.g:2312:1: ( RULE_INT )
            {
            // InternalDBML.g:2312:1: ( RULE_INT )
            // InternalDBML.g:2313:2: RULE_INT
            {
             before(grammarAccess.getTypeAccess().getINTTerminalRuleCall_19_3()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getINTTerminalRuleCall_19_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_19__3__Impl"


    // $ANTLR start "rule__Type__Group_19__4"
    // InternalDBML.g:2322:1: rule__Type__Group_19__4 : rule__Type__Group_19__4__Impl ;
    public final void rule__Type__Group_19__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:2326:1: ( rule__Type__Group_19__4__Impl )
            // InternalDBML.g:2327:2: rule__Type__Group_19__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_19__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_19__4"


    // $ANTLR start "rule__Type__Group_19__4__Impl"
    // InternalDBML.g:2333:1: rule__Type__Group_19__4__Impl : ( ')' ) ;
    public final void rule__Type__Group_19__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:2337:1: ( ( ')' ) )
            // InternalDBML.g:2338:1: ( ')' )
            {
            // InternalDBML.g:2338:1: ( ')' )
            // InternalDBML.g:2339:2: ')'
            {
             before(grammarAccess.getTypeAccess().getRightParenthesisKeyword_19_4()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getRightParenthesisKeyword_19_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_19__4__Impl"


    // $ANTLR start "rule__Type__Group_20__0"
    // InternalDBML.g:2349:1: rule__Type__Group_20__0 : rule__Type__Group_20__0__Impl rule__Type__Group_20__1 ;
    public final void rule__Type__Group_20__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:2353:1: ( rule__Type__Group_20__0__Impl rule__Type__Group_20__1 )
            // InternalDBML.g:2354:2: rule__Type__Group_20__0__Impl rule__Type__Group_20__1
            {
            pushFollow(FOLLOW_22);
            rule__Type__Group_20__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_20__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_20__0"


    // $ANTLR start "rule__Type__Group_20__0__Impl"
    // InternalDBML.g:2361:1: rule__Type__Group_20__0__Impl : ( 'DOUBLE' ) ;
    public final void rule__Type__Group_20__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:2365:1: ( ( 'DOUBLE' ) )
            // InternalDBML.g:2366:1: ( 'DOUBLE' )
            {
            // InternalDBML.g:2366:1: ( 'DOUBLE' )
            // InternalDBML.g:2367:2: 'DOUBLE'
            {
             before(grammarAccess.getTypeAccess().getDOUBLEKeyword_20_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getDOUBLEKeyword_20_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_20__0__Impl"


    // $ANTLR start "rule__Type__Group_20__1"
    // InternalDBML.g:2376:1: rule__Type__Group_20__1 : rule__Type__Group_20__1__Impl ;
    public final void rule__Type__Group_20__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:2380:1: ( rule__Type__Group_20__1__Impl )
            // InternalDBML.g:2381:2: rule__Type__Group_20__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_20__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_20__1"


    // $ANTLR start "rule__Type__Group_20__1__Impl"
    // InternalDBML.g:2387:1: rule__Type__Group_20__1__Impl : ( ( rule__Type__Group_20_1__0 )? ) ;
    public final void rule__Type__Group_20__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:2391:1: ( ( ( rule__Type__Group_20_1__0 )? ) )
            // InternalDBML.g:2392:1: ( ( rule__Type__Group_20_1__0 )? )
            {
            // InternalDBML.g:2392:1: ( ( rule__Type__Group_20_1__0 )? )
            // InternalDBML.g:2393:2: ( rule__Type__Group_20_1__0 )?
            {
             before(grammarAccess.getTypeAccess().getGroup_20_1()); 
            // InternalDBML.g:2394:2: ( rule__Type__Group_20_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==36) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDBML.g:2394:3: rule__Type__Group_20_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_20_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypeAccess().getGroup_20_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_20__1__Impl"


    // $ANTLR start "rule__Type__Group_20_1__0"
    // InternalDBML.g:2403:1: rule__Type__Group_20_1__0 : rule__Type__Group_20_1__0__Impl rule__Type__Group_20_1__1 ;
    public final void rule__Type__Group_20_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:2407:1: ( rule__Type__Group_20_1__0__Impl rule__Type__Group_20_1__1 )
            // InternalDBML.g:2408:2: rule__Type__Group_20_1__0__Impl rule__Type__Group_20_1__1
            {
            pushFollow(FOLLOW_23);
            rule__Type__Group_20_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_20_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_20_1__0"


    // $ANTLR start "rule__Type__Group_20_1__0__Impl"
    // InternalDBML.g:2415:1: rule__Type__Group_20_1__0__Impl : ( '(' ) ;
    public final void rule__Type__Group_20_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:2419:1: ( ( '(' ) )
            // InternalDBML.g:2420:1: ( '(' )
            {
            // InternalDBML.g:2420:1: ( '(' )
            // InternalDBML.g:2421:2: '('
            {
             before(grammarAccess.getTypeAccess().getLeftParenthesisKeyword_20_1_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getLeftParenthesisKeyword_20_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_20_1__0__Impl"


    // $ANTLR start "rule__Type__Group_20_1__1"
    // InternalDBML.g:2430:1: rule__Type__Group_20_1__1 : rule__Type__Group_20_1__1__Impl rule__Type__Group_20_1__2 ;
    public final void rule__Type__Group_20_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:2434:1: ( rule__Type__Group_20_1__1__Impl rule__Type__Group_20_1__2 )
            // InternalDBML.g:2435:2: rule__Type__Group_20_1__1__Impl rule__Type__Group_20_1__2
            {
            pushFollow(FOLLOW_15);
            rule__Type__Group_20_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_20_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_20_1__1"


    // $ANTLR start "rule__Type__Group_20_1__1__Impl"
    // InternalDBML.g:2442:1: rule__Type__Group_20_1__1__Impl : ( RULE_INT ) ;
    public final void rule__Type__Group_20_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:2446:1: ( ( RULE_INT ) )
            // InternalDBML.g:2447:1: ( RULE_INT )
            {
            // InternalDBML.g:2447:1: ( RULE_INT )
            // InternalDBML.g:2448:2: RULE_INT
            {
             before(grammarAccess.getTypeAccess().getINTTerminalRuleCall_20_1_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getINTTerminalRuleCall_20_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_20_1__1__Impl"


    // $ANTLR start "rule__Type__Group_20_1__2"
    // InternalDBML.g:2457:1: rule__Type__Group_20_1__2 : rule__Type__Group_20_1__2__Impl rule__Type__Group_20_1__3 ;
    public final void rule__Type__Group_20_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:2461:1: ( rule__Type__Group_20_1__2__Impl rule__Type__Group_20_1__3 )
            // InternalDBML.g:2462:2: rule__Type__Group_20_1__2__Impl rule__Type__Group_20_1__3
            {
            pushFollow(FOLLOW_23);
            rule__Type__Group_20_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_20_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_20_1__2"


    // $ANTLR start "rule__Type__Group_20_1__2__Impl"
    // InternalDBML.g:2469:1: rule__Type__Group_20_1__2__Impl : ( ',' ) ;
    public final void rule__Type__Group_20_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:2473:1: ( ( ',' ) )
            // InternalDBML.g:2474:1: ( ',' )
            {
            // InternalDBML.g:2474:1: ( ',' )
            // InternalDBML.g:2475:2: ','
            {
             before(grammarAccess.getTypeAccess().getCommaKeyword_20_1_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getCommaKeyword_20_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_20_1__2__Impl"


    // $ANTLR start "rule__Type__Group_20_1__3"
    // InternalDBML.g:2484:1: rule__Type__Group_20_1__3 : rule__Type__Group_20_1__3__Impl rule__Type__Group_20_1__4 ;
    public final void rule__Type__Group_20_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:2488:1: ( rule__Type__Group_20_1__3__Impl rule__Type__Group_20_1__4 )
            // InternalDBML.g:2489:2: rule__Type__Group_20_1__3__Impl rule__Type__Group_20_1__4
            {
            pushFollow(FOLLOW_16);
            rule__Type__Group_20_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_20_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_20_1__3"


    // $ANTLR start "rule__Type__Group_20_1__3__Impl"
    // InternalDBML.g:2496:1: rule__Type__Group_20_1__3__Impl : ( RULE_INT ) ;
    public final void rule__Type__Group_20_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:2500:1: ( ( RULE_INT ) )
            // InternalDBML.g:2501:1: ( RULE_INT )
            {
            // InternalDBML.g:2501:1: ( RULE_INT )
            // InternalDBML.g:2502:2: RULE_INT
            {
             before(grammarAccess.getTypeAccess().getINTTerminalRuleCall_20_1_3()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getINTTerminalRuleCall_20_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_20_1__3__Impl"


    // $ANTLR start "rule__Type__Group_20_1__4"
    // InternalDBML.g:2511:1: rule__Type__Group_20_1__4 : rule__Type__Group_20_1__4__Impl ;
    public final void rule__Type__Group_20_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:2515:1: ( rule__Type__Group_20_1__4__Impl )
            // InternalDBML.g:2516:2: rule__Type__Group_20_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_20_1__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_20_1__4"


    // $ANTLR start "rule__Type__Group_20_1__4__Impl"
    // InternalDBML.g:2522:1: rule__Type__Group_20_1__4__Impl : ( ')' ) ;
    public final void rule__Type__Group_20_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:2526:1: ( ( ')' ) )
            // InternalDBML.g:2527:1: ( ')' )
            {
            // InternalDBML.g:2527:1: ( ')' )
            // InternalDBML.g:2528:2: ')'
            {
             before(grammarAccess.getTypeAccess().getRightParenthesisKeyword_20_1_4()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getRightParenthesisKeyword_20_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_20_1__4__Impl"


    // $ANTLR start "rule__Type__Group_21__0"
    // InternalDBML.g:2538:1: rule__Type__Group_21__0 : rule__Type__Group_21__0__Impl rule__Type__Group_21__1 ;
    public final void rule__Type__Group_21__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:2542:1: ( rule__Type__Group_21__0__Impl rule__Type__Group_21__1 )
            // InternalDBML.g:2543:2: rule__Type__Group_21__0__Impl rule__Type__Group_21__1
            {
            pushFollow(FOLLOW_23);
            rule__Type__Group_21__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_21__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_21__0"


    // $ANTLR start "rule__Type__Group_21__0__Impl"
    // InternalDBML.g:2550:1: rule__Type__Group_21__0__Impl : ( 'timestamp(' ) ;
    public final void rule__Type__Group_21__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:2554:1: ( ( 'timestamp(' ) )
            // InternalDBML.g:2555:1: ( 'timestamp(' )
            {
            // InternalDBML.g:2555:1: ( 'timestamp(' )
            // InternalDBML.g:2556:2: 'timestamp('
            {
             before(grammarAccess.getTypeAccess().getTimestampKeyword_21_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getTimestampKeyword_21_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_21__0__Impl"


    // $ANTLR start "rule__Type__Group_21__1"
    // InternalDBML.g:2565:1: rule__Type__Group_21__1 : rule__Type__Group_21__1__Impl rule__Type__Group_21__2 ;
    public final void rule__Type__Group_21__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:2569:1: ( rule__Type__Group_21__1__Impl rule__Type__Group_21__2 )
            // InternalDBML.g:2570:2: rule__Type__Group_21__1__Impl rule__Type__Group_21__2
            {
            pushFollow(FOLLOW_16);
            rule__Type__Group_21__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_21__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_21__1"


    // $ANTLR start "rule__Type__Group_21__1__Impl"
    // InternalDBML.g:2577:1: rule__Type__Group_21__1__Impl : ( RULE_INT ) ;
    public final void rule__Type__Group_21__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:2581:1: ( ( RULE_INT ) )
            // InternalDBML.g:2582:1: ( RULE_INT )
            {
            // InternalDBML.g:2582:1: ( RULE_INT )
            // InternalDBML.g:2583:2: RULE_INT
            {
             before(grammarAccess.getTypeAccess().getINTTerminalRuleCall_21_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getINTTerminalRuleCall_21_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_21__1__Impl"


    // $ANTLR start "rule__Type__Group_21__2"
    // InternalDBML.g:2592:1: rule__Type__Group_21__2 : rule__Type__Group_21__2__Impl ;
    public final void rule__Type__Group_21__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:2596:1: ( rule__Type__Group_21__2__Impl )
            // InternalDBML.g:2597:2: rule__Type__Group_21__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_21__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_21__2"


    // $ANTLR start "rule__Type__Group_21__2__Impl"
    // InternalDBML.g:2603:1: rule__Type__Group_21__2__Impl : ( ')' ) ;
    public final void rule__Type__Group_21__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:2607:1: ( ( ')' ) )
            // InternalDBML.g:2608:1: ( ')' )
            {
            // InternalDBML.g:2608:1: ( ')' )
            // InternalDBML.g:2609:2: ')'
            {
             before(grammarAccess.getTypeAccess().getRightParenthesisKeyword_21_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getRightParenthesisKeyword_21_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_21__2__Impl"


    // $ANTLR start "rule__Ref__Group__0"
    // InternalDBML.g:2619:1: rule__Ref__Group__0 : rule__Ref__Group__0__Impl rule__Ref__Group__1 ;
    public final void rule__Ref__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:2623:1: ( rule__Ref__Group__0__Impl rule__Ref__Group__1 )
            // InternalDBML.g:2624:2: rule__Ref__Group__0__Impl rule__Ref__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__Ref__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ref__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref__Group__0"


    // $ANTLR start "rule__Ref__Group__0__Impl"
    // InternalDBML.g:2631:1: rule__Ref__Group__0__Impl : ( 'Ref' ) ;
    public final void rule__Ref__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:2635:1: ( ( 'Ref' ) )
            // InternalDBML.g:2636:1: ( 'Ref' )
            {
            // InternalDBML.g:2636:1: ( 'Ref' )
            // InternalDBML.g:2637:2: 'Ref'
            {
             before(grammarAccess.getRefAccess().getRefKeyword_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getRefAccess().getRefKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref__Group__0__Impl"


    // $ANTLR start "rule__Ref__Group__1"
    // InternalDBML.g:2646:1: rule__Ref__Group__1 : rule__Ref__Group__1__Impl rule__Ref__Group__2 ;
    public final void rule__Ref__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:2650:1: ( rule__Ref__Group__1__Impl rule__Ref__Group__2 )
            // InternalDBML.g:2651:2: rule__Ref__Group__1__Impl rule__Ref__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__Ref__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ref__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref__Group__1"


    // $ANTLR start "rule__Ref__Group__1__Impl"
    // InternalDBML.g:2658:1: rule__Ref__Group__1__Impl : ( ( ':' )? ) ;
    public final void rule__Ref__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:2662:1: ( ( ( ':' )? ) )
            // InternalDBML.g:2663:1: ( ( ':' )? )
            {
            // InternalDBML.g:2663:1: ( ( ':' )? )
            // InternalDBML.g:2664:2: ( ':' )?
            {
             before(grammarAccess.getRefAccess().getColonKeyword_1()); 
            // InternalDBML.g:2665:2: ( ':' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==52) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalDBML.g:2665:3: ':'
                    {
                    match(input,52,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getRefAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref__Group__1__Impl"


    // $ANTLR start "rule__Ref__Group__2"
    // InternalDBML.g:2673:1: rule__Ref__Group__2 : rule__Ref__Group__2__Impl rule__Ref__Group__3 ;
    public final void rule__Ref__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:2677:1: ( rule__Ref__Group__2__Impl rule__Ref__Group__3 )
            // InternalDBML.g:2678:2: rule__Ref__Group__2__Impl rule__Ref__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__Ref__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ref__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref__Group__2"


    // $ANTLR start "rule__Ref__Group__2__Impl"
    // InternalDBML.g:2685:1: rule__Ref__Group__2__Impl : ( ( rule__Ref__Group_2__0 )? ) ;
    public final void rule__Ref__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:2689:1: ( ( ( rule__Ref__Group_2__0 )? ) )
            // InternalDBML.g:2690:1: ( ( rule__Ref__Group_2__0 )? )
            {
            // InternalDBML.g:2690:1: ( ( rule__Ref__Group_2__0 )? )
            // InternalDBML.g:2691:2: ( rule__Ref__Group_2__0 )?
            {
             before(grammarAccess.getRefAccess().getGroup_2()); 
            // InternalDBML.g:2692:2: ( rule__Ref__Group_2__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==29) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==RULE_ID) ) {
                    int LA18_2 = input.LA(3);

                    if ( (LA18_2==54) ) {
                        alt18=1;
                    }
                }
            }
            switch (alt18) {
                case 1 :
                    // InternalDBML.g:2692:3: rule__Ref__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Ref__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRefAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref__Group__2__Impl"


    // $ANTLR start "rule__Ref__Group__3"
    // InternalDBML.g:2700:1: rule__Ref__Group__3 : rule__Ref__Group__3__Impl rule__Ref__Group__4 ;
    public final void rule__Ref__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:2704:1: ( rule__Ref__Group__3__Impl rule__Ref__Group__4 )
            // InternalDBML.g:2705:2: rule__Ref__Group__3__Impl rule__Ref__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__Ref__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ref__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref__Group__3"


    // $ANTLR start "rule__Ref__Group__3__Impl"
    // InternalDBML.g:2712:1: rule__Ref__Group__3__Impl : ( ( rule__Ref__LeftAssignment_3 ) ) ;
    public final void rule__Ref__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:2716:1: ( ( ( rule__Ref__LeftAssignment_3 ) ) )
            // InternalDBML.g:2717:1: ( ( rule__Ref__LeftAssignment_3 ) )
            {
            // InternalDBML.g:2717:1: ( ( rule__Ref__LeftAssignment_3 ) )
            // InternalDBML.g:2718:2: ( rule__Ref__LeftAssignment_3 )
            {
             before(grammarAccess.getRefAccess().getLeftAssignment_3()); 
            // InternalDBML.g:2719:2: ( rule__Ref__LeftAssignment_3 )
            // InternalDBML.g:2719:3: rule__Ref__LeftAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Ref__LeftAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRefAccess().getLeftAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref__Group__3__Impl"


    // $ANTLR start "rule__Ref__Group__4"
    // InternalDBML.g:2727:1: rule__Ref__Group__4 : rule__Ref__Group__4__Impl rule__Ref__Group__5 ;
    public final void rule__Ref__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:2731:1: ( rule__Ref__Group__4__Impl rule__Ref__Group__5 )
            // InternalDBML.g:2732:2: rule__Ref__Group__4__Impl rule__Ref__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__Ref__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ref__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref__Group__4"


    // $ANTLR start "rule__Ref__Group__4__Impl"
    // InternalDBML.g:2739:1: rule__Ref__Group__4__Impl : ( '<' ) ;
    public final void rule__Ref__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:2743:1: ( ( '<' ) )
            // InternalDBML.g:2744:1: ( '<' )
            {
            // InternalDBML.g:2744:1: ( '<' )
            // InternalDBML.g:2745:2: '<'
            {
             before(grammarAccess.getRefAccess().getLessThanSignKeyword_4()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getRefAccess().getLessThanSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref__Group__4__Impl"


    // $ANTLR start "rule__Ref__Group__5"
    // InternalDBML.g:2754:1: rule__Ref__Group__5 : rule__Ref__Group__5__Impl ;
    public final void rule__Ref__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:2758:1: ( rule__Ref__Group__5__Impl )
            // InternalDBML.g:2759:2: rule__Ref__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ref__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref__Group__5"


    // $ANTLR start "rule__Ref__Group__5__Impl"
    // InternalDBML.g:2765:1: rule__Ref__Group__5__Impl : ( ( rule__Ref__RightAssignment_5 ) ) ;
    public final void rule__Ref__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:2769:1: ( ( ( rule__Ref__RightAssignment_5 ) ) )
            // InternalDBML.g:2770:1: ( ( rule__Ref__RightAssignment_5 ) )
            {
            // InternalDBML.g:2770:1: ( ( rule__Ref__RightAssignment_5 ) )
            // InternalDBML.g:2771:2: ( rule__Ref__RightAssignment_5 )
            {
             before(grammarAccess.getRefAccess().getRightAssignment_5()); 
            // InternalDBML.g:2772:2: ( rule__Ref__RightAssignment_5 )
            // InternalDBML.g:2772:3: rule__Ref__RightAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Ref__RightAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRefAccess().getRightAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref__Group__5__Impl"


    // $ANTLR start "rule__Ref__Group_2__0"
    // InternalDBML.g:2781:1: rule__Ref__Group_2__0 : rule__Ref__Group_2__0__Impl rule__Ref__Group_2__1 ;
    public final void rule__Ref__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:2785:1: ( rule__Ref__Group_2__0__Impl rule__Ref__Group_2__1 )
            // InternalDBML.g:2786:2: rule__Ref__Group_2__0__Impl rule__Ref__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__Ref__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ref__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref__Group_2__0"


    // $ANTLR start "rule__Ref__Group_2__0__Impl"
    // InternalDBML.g:2793:1: rule__Ref__Group_2__0__Impl : ( '\"' ) ;
    public final void rule__Ref__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:2797:1: ( ( '\"' ) )
            // InternalDBML.g:2798:1: ( '\"' )
            {
            // InternalDBML.g:2798:1: ( '\"' )
            // InternalDBML.g:2799:2: '\"'
            {
             before(grammarAccess.getRefAccess().getQuotationMarkKeyword_2_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getRefAccess().getQuotationMarkKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref__Group_2__0__Impl"


    // $ANTLR start "rule__Ref__Group_2__1"
    // InternalDBML.g:2808:1: rule__Ref__Group_2__1 : rule__Ref__Group_2__1__Impl rule__Ref__Group_2__2 ;
    public final void rule__Ref__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:2812:1: ( rule__Ref__Group_2__1__Impl rule__Ref__Group_2__2 )
            // InternalDBML.g:2813:2: rule__Ref__Group_2__1__Impl rule__Ref__Group_2__2
            {
            pushFollow(FOLLOW_26);
            rule__Ref__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ref__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref__Group_2__1"


    // $ANTLR start "rule__Ref__Group_2__1__Impl"
    // InternalDBML.g:2820:1: rule__Ref__Group_2__1__Impl : ( RULE_ID ) ;
    public final void rule__Ref__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:2824:1: ( ( RULE_ID ) )
            // InternalDBML.g:2825:1: ( RULE_ID )
            {
            // InternalDBML.g:2825:1: ( RULE_ID )
            // InternalDBML.g:2826:2: RULE_ID
            {
             before(grammarAccess.getRefAccess().getIDTerminalRuleCall_2_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRefAccess().getIDTerminalRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref__Group_2__1__Impl"


    // $ANTLR start "rule__Ref__Group_2__2"
    // InternalDBML.g:2835:1: rule__Ref__Group_2__2 : rule__Ref__Group_2__2__Impl ;
    public final void rule__Ref__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:2839:1: ( rule__Ref__Group_2__2__Impl )
            // InternalDBML.g:2840:2: rule__Ref__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ref__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref__Group_2__2"


    // $ANTLR start "rule__Ref__Group_2__2__Impl"
    // InternalDBML.g:2846:1: rule__Ref__Group_2__2__Impl : ( '\":' ) ;
    public final void rule__Ref__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:2850:1: ( ( '\":' ) )
            // InternalDBML.g:2851:1: ( '\":' )
            {
            // InternalDBML.g:2851:1: ( '\":' )
            // InternalDBML.g:2852:2: '\":'
            {
             before(grammarAccess.getRefAccess().getQuotationMarkColonKeyword_2_2()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getRefAccess().getQuotationMarkColonKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref__Group_2__2__Impl"


    // $ANTLR start "rule__NestedRef__Group__0"
    // InternalDBML.g:2862:1: rule__NestedRef__Group__0 : rule__NestedRef__Group__0__Impl rule__NestedRef__Group__1 ;
    public final void rule__NestedRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:2866:1: ( rule__NestedRef__Group__0__Impl rule__NestedRef__Group__1 )
            // InternalDBML.g:2867:2: rule__NestedRef__Group__0__Impl rule__NestedRef__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__NestedRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NestedRef__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedRef__Group__0"


    // $ANTLR start "rule__NestedRef__Group__0__Impl"
    // InternalDBML.g:2874:1: rule__NestedRef__Group__0__Impl : ( '\"' ) ;
    public final void rule__NestedRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:2878:1: ( ( '\"' ) )
            // InternalDBML.g:2879:1: ( '\"' )
            {
            // InternalDBML.g:2879:1: ( '\"' )
            // InternalDBML.g:2880:2: '\"'
            {
             before(grammarAccess.getNestedRefAccess().getQuotationMarkKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getNestedRefAccess().getQuotationMarkKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedRef__Group__0__Impl"


    // $ANTLR start "rule__NestedRef__Group__1"
    // InternalDBML.g:2889:1: rule__NestedRef__Group__1 : rule__NestedRef__Group__1__Impl rule__NestedRef__Group__2 ;
    public final void rule__NestedRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:2893:1: ( rule__NestedRef__Group__1__Impl rule__NestedRef__Group__2 )
            // InternalDBML.g:2894:2: rule__NestedRef__Group__1__Impl rule__NestedRef__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__NestedRef__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NestedRef__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedRef__Group__1"


    // $ANTLR start "rule__NestedRef__Group__1__Impl"
    // InternalDBML.g:2901:1: rule__NestedRef__Group__1__Impl : ( ( rule__NestedRef__TableAssignment_1 ) ) ;
    public final void rule__NestedRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:2905:1: ( ( ( rule__NestedRef__TableAssignment_1 ) ) )
            // InternalDBML.g:2906:1: ( ( rule__NestedRef__TableAssignment_1 ) )
            {
            // InternalDBML.g:2906:1: ( ( rule__NestedRef__TableAssignment_1 ) )
            // InternalDBML.g:2907:2: ( rule__NestedRef__TableAssignment_1 )
            {
             before(grammarAccess.getNestedRefAccess().getTableAssignment_1()); 
            // InternalDBML.g:2908:2: ( rule__NestedRef__TableAssignment_1 )
            // InternalDBML.g:2908:3: rule__NestedRef__TableAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NestedRef__TableAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNestedRefAccess().getTableAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedRef__Group__1__Impl"


    // $ANTLR start "rule__NestedRef__Group__2"
    // InternalDBML.g:2916:1: rule__NestedRef__Group__2 : rule__NestedRef__Group__2__Impl rule__NestedRef__Group__3 ;
    public final void rule__NestedRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:2920:1: ( rule__NestedRef__Group__2__Impl rule__NestedRef__Group__3 )
            // InternalDBML.g:2921:2: rule__NestedRef__Group__2__Impl rule__NestedRef__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__NestedRef__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NestedRef__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedRef__Group__2"


    // $ANTLR start "rule__NestedRef__Group__2__Impl"
    // InternalDBML.g:2928:1: rule__NestedRef__Group__2__Impl : ( '\"' ) ;
    public final void rule__NestedRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:2932:1: ( ( '\"' ) )
            // InternalDBML.g:2933:1: ( '\"' )
            {
            // InternalDBML.g:2933:1: ( '\"' )
            // InternalDBML.g:2934:2: '\"'
            {
             before(grammarAccess.getNestedRefAccess().getQuotationMarkKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getNestedRefAccess().getQuotationMarkKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedRef__Group__2__Impl"


    // $ANTLR start "rule__NestedRef__Group__3"
    // InternalDBML.g:2943:1: rule__NestedRef__Group__3 : rule__NestedRef__Group__3__Impl rule__NestedRef__Group__4 ;
    public final void rule__NestedRef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:2947:1: ( rule__NestedRef__Group__3__Impl rule__NestedRef__Group__4 )
            // InternalDBML.g:2948:2: rule__NestedRef__Group__3__Impl rule__NestedRef__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__NestedRef__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NestedRef__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedRef__Group__3"


    // $ANTLR start "rule__NestedRef__Group__3__Impl"
    // InternalDBML.g:2955:1: rule__NestedRef__Group__3__Impl : ( '.' ) ;
    public final void rule__NestedRef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:2959:1: ( ( '.' ) )
            // InternalDBML.g:2960:1: ( '.' )
            {
            // InternalDBML.g:2960:1: ( '.' )
            // InternalDBML.g:2961:2: '.'
            {
             before(grammarAccess.getNestedRefAccess().getFullStopKeyword_3()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getNestedRefAccess().getFullStopKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedRef__Group__3__Impl"


    // $ANTLR start "rule__NestedRef__Group__4"
    // InternalDBML.g:2970:1: rule__NestedRef__Group__4 : rule__NestedRef__Group__4__Impl rule__NestedRef__Group__5 ;
    public final void rule__NestedRef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:2974:1: ( rule__NestedRef__Group__4__Impl rule__NestedRef__Group__5 )
            // InternalDBML.g:2975:2: rule__NestedRef__Group__4__Impl rule__NestedRef__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__NestedRef__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NestedRef__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedRef__Group__4"


    // $ANTLR start "rule__NestedRef__Group__4__Impl"
    // InternalDBML.g:2982:1: rule__NestedRef__Group__4__Impl : ( '\"' ) ;
    public final void rule__NestedRef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:2986:1: ( ( '\"' ) )
            // InternalDBML.g:2987:1: ( '\"' )
            {
            // InternalDBML.g:2987:1: ( '\"' )
            // InternalDBML.g:2988:2: '\"'
            {
             before(grammarAccess.getNestedRefAccess().getQuotationMarkKeyword_4()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getNestedRefAccess().getQuotationMarkKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedRef__Group__4__Impl"


    // $ANTLR start "rule__NestedRef__Group__5"
    // InternalDBML.g:2997:1: rule__NestedRef__Group__5 : rule__NestedRef__Group__5__Impl rule__NestedRef__Group__6 ;
    public final void rule__NestedRef__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:3001:1: ( rule__NestedRef__Group__5__Impl rule__NestedRef__Group__6 )
            // InternalDBML.g:3002:2: rule__NestedRef__Group__5__Impl rule__NestedRef__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__NestedRef__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NestedRef__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedRef__Group__5"


    // $ANTLR start "rule__NestedRef__Group__5__Impl"
    // InternalDBML.g:3009:1: rule__NestedRef__Group__5__Impl : ( ( rule__NestedRef__AttrAssignment_5 ) ) ;
    public final void rule__NestedRef__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:3013:1: ( ( ( rule__NestedRef__AttrAssignment_5 ) ) )
            // InternalDBML.g:3014:1: ( ( rule__NestedRef__AttrAssignment_5 ) )
            {
            // InternalDBML.g:3014:1: ( ( rule__NestedRef__AttrAssignment_5 ) )
            // InternalDBML.g:3015:2: ( rule__NestedRef__AttrAssignment_5 )
            {
             before(grammarAccess.getNestedRefAccess().getAttrAssignment_5()); 
            // InternalDBML.g:3016:2: ( rule__NestedRef__AttrAssignment_5 )
            // InternalDBML.g:3016:3: rule__NestedRef__AttrAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__NestedRef__AttrAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getNestedRefAccess().getAttrAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedRef__Group__5__Impl"


    // $ANTLR start "rule__NestedRef__Group__6"
    // InternalDBML.g:3024:1: rule__NestedRef__Group__6 : rule__NestedRef__Group__6__Impl ;
    public final void rule__NestedRef__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:3028:1: ( rule__NestedRef__Group__6__Impl )
            // InternalDBML.g:3029:2: rule__NestedRef__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NestedRef__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedRef__Group__6"


    // $ANTLR start "rule__NestedRef__Group__6__Impl"
    // InternalDBML.g:3035:1: rule__NestedRef__Group__6__Impl : ( '\"' ) ;
    public final void rule__NestedRef__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:3039:1: ( ( '\"' ) )
            // InternalDBML.g:3040:1: ( '\"' )
            {
            // InternalDBML.g:3040:1: ( '\"' )
            // InternalDBML.g:3041:2: '\"'
            {
             before(grammarAccess.getNestedRefAccess().getQuotationMarkKeyword_6()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getNestedRefAccess().getQuotationMarkKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedRef__Group__6__Impl"


    // $ANTLR start "rule__Model__StatementsAssignment"
    // InternalDBML.g:3051:1: rule__Model__StatementsAssignment : ( ruleStatement ) ;
    public final void rule__Model__StatementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:3055:1: ( ( ruleStatement ) )
            // InternalDBML.g:3056:2: ( ruleStatement )
            {
            // InternalDBML.g:3056:2: ( ruleStatement )
            // InternalDBML.g:3057:3: ruleStatement
            {
             before(grammarAccess.getModelAccess().getStatementsStatementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getModelAccess().getStatementsStatementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__StatementsAssignment"


    // $ANTLR start "rule__Table__NameAssignment_2"
    // InternalDBML.g:3066:1: rule__Table__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Table__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:3070:1: ( ( RULE_ID ) )
            // InternalDBML.g:3071:2: ( RULE_ID )
            {
            // InternalDBML.g:3071:2: ( RULE_ID )
            // InternalDBML.g:3072:3: RULE_ID
            {
             before(grammarAccess.getTableAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__NameAssignment_2"


    // $ANTLR start "rule__Table__AttributesAssignment_5"
    // InternalDBML.g:3081:1: rule__Table__AttributesAssignment_5 : ( ruleAttribute ) ;
    public final void rule__Table__AttributesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:3085:1: ( ( ruleAttribute ) )
            // InternalDBML.g:3086:2: ( ruleAttribute )
            {
            // InternalDBML.g:3086:2: ( ruleAttribute )
            // InternalDBML.g:3087:3: ruleAttribute
            {
             before(grammarAccess.getTableAccess().getAttributesAttributeParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getTableAccess().getAttributesAttributeParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__AttributesAssignment_5"


    // $ANTLR start "rule__Attribute__NameAssignment_1"
    // InternalDBML.g:3096:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:3100:1: ( ( RULE_ID ) )
            // InternalDBML.g:3101:2: ( RULE_ID )
            {
            // InternalDBML.g:3101:2: ( RULE_ID )
            // InternalDBML.g:3102:3: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment_1"


    // $ANTLR start "rule__Attribute__TypeAssignment_3"
    // InternalDBML.g:3111:1: rule__Attribute__TypeAssignment_3 : ( ruleType ) ;
    public final void rule__Attribute__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:3115:1: ( ( ruleType ) )
            // InternalDBML.g:3116:2: ( ruleType )
            {
            // InternalDBML.g:3116:2: ( ruleType )
            // InternalDBML.g:3117:3: ruleType
            {
             before(grammarAccess.getAttributeAccess().getTypeTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getTypeTypeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__TypeAssignment_3"


    // $ANTLR start "rule__Attribute__OptionsAssignment_4_1"
    // InternalDBML.g:3126:1: rule__Attribute__OptionsAssignment_4_1 : ( ruleOptional ) ;
    public final void rule__Attribute__OptionsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:3130:1: ( ( ruleOptional ) )
            // InternalDBML.g:3131:2: ( ruleOptional )
            {
            // InternalDBML.g:3131:2: ( ruleOptional )
            // InternalDBML.g:3132:3: ruleOptional
            {
             before(grammarAccess.getAttributeAccess().getOptionsOptionalParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOptional();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getOptionsOptionalParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__OptionsAssignment_4_1"


    // $ANTLR start "rule__Attribute__OptionsAssignment_4_2_1"
    // InternalDBML.g:3141:1: rule__Attribute__OptionsAssignment_4_2_1 : ( ruleOptional ) ;
    public final void rule__Attribute__OptionsAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:3145:1: ( ( ruleOptional ) )
            // InternalDBML.g:3146:2: ( ruleOptional )
            {
            // InternalDBML.g:3146:2: ( ruleOptional )
            // InternalDBML.g:3147:3: ruleOptional
            {
             before(grammarAccess.getAttributeAccess().getOptionsOptionalParserRuleCall_4_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOptional();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getOptionsOptionalParserRuleCall_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__OptionsAssignment_4_2_1"


    // $ANTLR start "rule__Ref__LeftAssignment_3"
    // InternalDBML.g:3156:1: rule__Ref__LeftAssignment_3 : ( ruleNestedRef ) ;
    public final void rule__Ref__LeftAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:3160:1: ( ( ruleNestedRef ) )
            // InternalDBML.g:3161:2: ( ruleNestedRef )
            {
            // InternalDBML.g:3161:2: ( ruleNestedRef )
            // InternalDBML.g:3162:3: ruleNestedRef
            {
             before(grammarAccess.getRefAccess().getLeftNestedRefParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleNestedRef();

            state._fsp--;

             after(grammarAccess.getRefAccess().getLeftNestedRefParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref__LeftAssignment_3"


    // $ANTLR start "rule__Ref__RightAssignment_5"
    // InternalDBML.g:3171:1: rule__Ref__RightAssignment_5 : ( ruleNestedRef ) ;
    public final void rule__Ref__RightAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:3175:1: ( ( ruleNestedRef ) )
            // InternalDBML.g:3176:2: ( ruleNestedRef )
            {
            // InternalDBML.g:3176:2: ( ruleNestedRef )
            // InternalDBML.g:3177:3: ruleNestedRef
            {
             before(grammarAccess.getRefAccess().getRightNestedRefParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleNestedRef();

            state._fsp--;

             after(grammarAccess.getRefAccess().getRightNestedRefParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref__RightAssignment_5"


    // $ANTLR start "rule__NestedRef__TableAssignment_1"
    // InternalDBML.g:3186:1: rule__NestedRef__TableAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__NestedRef__TableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:3190:1: ( ( ( RULE_ID ) ) )
            // InternalDBML.g:3191:2: ( ( RULE_ID ) )
            {
            // InternalDBML.g:3191:2: ( ( RULE_ID ) )
            // InternalDBML.g:3192:3: ( RULE_ID )
            {
             before(grammarAccess.getNestedRefAccess().getTableTableCrossReference_1_0()); 
            // InternalDBML.g:3193:3: ( RULE_ID )
            // InternalDBML.g:3194:4: RULE_ID
            {
             before(grammarAccess.getNestedRefAccess().getTableTableIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNestedRefAccess().getTableTableIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getNestedRefAccess().getTableTableCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedRef__TableAssignment_1"


    // $ANTLR start "rule__NestedRef__AttrAssignment_5"
    // InternalDBML.g:3205:1: rule__NestedRef__AttrAssignment_5 : ( RULE_ID ) ;
    public final void rule__NestedRef__AttrAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDBML.g:3209:1: ( ( RULE_ID ) )
            // InternalDBML.g:3210:2: ( RULE_ID )
            {
            // InternalDBML.g:3210:2: ( RULE_ID )
            // InternalDBML.g:3211:3: RULE_ID
            {
             before(grammarAccess.getNestedRefAccess().getAttrIDTerminalRuleCall_5_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNestedRefAccess().getAttrIDTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedRef__AttrAssignment_5"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0008000010000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000001A0000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000001000000012L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000008400000400L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0007FC000FFFF000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000010000000C00L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000004800000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0010000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0080000000000000L});

}