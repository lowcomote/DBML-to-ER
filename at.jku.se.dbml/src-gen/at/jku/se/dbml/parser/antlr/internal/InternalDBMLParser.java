package at.jku.se.dbml.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import at.jku.se.dbml.services.DBMLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDBMLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Table'", "'\"'", "'{'", "'Indexes'", "'}'", "'('", "','", "')'", "'['", "'unique,'", "'pk'", "'name:'", "']'", "'not'", "'null'", "'increment'", "'BOOLEAN'", "'BIT'", "'INT'", "'INTEGER'", "'FLOAT'", "'TINYINT'", "'BIGINT'", "'SMALLINT'", "'BYTE'", "'TIMESTAMP'", "'DATE'", "'DATETIME'", "'TEXT'", "'LONGTEXT'", "'MEDIUMTEXT'", "'CHAR('", "'VARCHAR('", "'NCHAR('", "'NVARCHAR('", "'DECIMAL('", "'DOUBLE'", "'timestamp('", "'jsonb'", "'json'", "'JSON'", "'Ref'", "':'", "'\":'", "'<'", "'.'"
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

        public InternalDBMLParser(TokenStream input, DBMLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected DBMLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalDBML.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalDBML.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalDBML.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalDBML.g:71:1: ruleModel returns [EObject current=null] : ( (lv_statements_0_0= ruleStatement ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_0_0 = null;



        	enterRule();

        try {
            // InternalDBML.g:77:2: ( ( (lv_statements_0_0= ruleStatement ) )* )
            // InternalDBML.g:78:2: ( (lv_statements_0_0= ruleStatement ) )*
            {
            // InternalDBML.g:78:2: ( (lv_statements_0_0= ruleStatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==10||LA1_0==51) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDBML.g:79:3: (lv_statements_0_0= ruleStatement )
            	    {
            	    // InternalDBML.g:79:3: (lv_statements_0_0= ruleStatement )
            	    // InternalDBML.g:80:4: lv_statements_0_0= ruleStatement
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getStatementsStatementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_statements_0_0=ruleStatement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"statements",
            	    					lv_statements_0_0,
            	    					"at.jku.se.dbml.DBML.Statement");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleStatement"
    // InternalDBML.g:100:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalDBML.g:100:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalDBML.g:101:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalDBML.g:107:1: ruleStatement returns [EObject current=null] : (this_Table_0= ruleTable | this_Ref_1= ruleRef ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_Table_0 = null;

        EObject this_Ref_1 = null;



        	enterRule();

        try {
            // InternalDBML.g:113:2: ( (this_Table_0= ruleTable | this_Ref_1= ruleRef ) )
            // InternalDBML.g:114:2: (this_Table_0= ruleTable | this_Ref_1= ruleRef )
            {
            // InternalDBML.g:114:2: (this_Table_0= ruleTable | this_Ref_1= ruleRef )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==10) ) {
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
                    // InternalDBML.g:115:3: this_Table_0= ruleTable
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getTableParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Table_0=ruleTable();

                    state._fsp--;


                    			current = this_Table_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDBML.g:124:3: this_Ref_1= ruleRef
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getRefParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Ref_1=ruleRef();

                    state._fsp--;


                    			current = this_Ref_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleTable"
    // InternalDBML.g:136:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // InternalDBML.g:136:46: (iv_ruleTable= ruleTable EOF )
            // InternalDBML.g:137:2: iv_ruleTable= ruleTable EOF
            {
             newCompositeNode(grammarAccess.getTableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTable=ruleTable();

            state._fsp--;

             current =iv_ruleTable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTable"


    // $ANTLR start "ruleTable"
    // InternalDBML.g:143:1: ruleTable returns [EObject current=null] : (otherlv_0= 'Table' otherlv_1= '\"' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '\"' otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* (otherlv_6= 'Indexes' otherlv_7= '{' ( ruleIndex )+ otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_attributes_5_0 = null;



        	enterRule();

        try {
            // InternalDBML.g:149:2: ( (otherlv_0= 'Table' otherlv_1= '\"' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '\"' otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* (otherlv_6= 'Indexes' otherlv_7= '{' ( ruleIndex )+ otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalDBML.g:150:2: (otherlv_0= 'Table' otherlv_1= '\"' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '\"' otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* (otherlv_6= 'Indexes' otherlv_7= '{' ( ruleIndex )+ otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalDBML.g:150:2: (otherlv_0= 'Table' otherlv_1= '\"' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '\"' otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* (otherlv_6= 'Indexes' otherlv_7= '{' ( ruleIndex )+ otherlv_9= '}' )? otherlv_10= '}' )
            // InternalDBML.g:151:3: otherlv_0= 'Table' otherlv_1= '\"' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '\"' otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* (otherlv_6= 'Indexes' otherlv_7= '{' ( ruleIndex )+ otherlv_9= '}' )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,10,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTableAccess().getTableKeyword_0());
            		
            otherlv_1=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getTableAccess().getQuotationMarkKeyword_1());
            		
            // InternalDBML.g:159:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDBML.g:160:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDBML.g:160:4: (lv_name_2_0= RULE_ID )
            // InternalDBML.g:161:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_2_0, grammarAccess.getTableAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"at.jku.se.dbml.DBML.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,11,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getTableAccess().getQuotationMarkKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalDBML.g:185:3: ( (lv_attributes_5_0= ruleAttribute ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==11) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDBML.g:186:4: (lv_attributes_5_0= ruleAttribute )
            	    {
            	    // InternalDBML.g:186:4: (lv_attributes_5_0= ruleAttribute )
            	    // InternalDBML.g:187:5: lv_attributes_5_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getTableAccess().getAttributesAttributeParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_attributes_5_0=ruleAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTableRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_5_0,
            	    						"at.jku.se.dbml.DBML.Attribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalDBML.g:204:3: (otherlv_6= 'Indexes' otherlv_7= '{' ( ruleIndex )+ otherlv_9= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalDBML.g:205:4: otherlv_6= 'Indexes' otherlv_7= '{' ( ruleIndex )+ otherlv_9= '}'
                    {
                    otherlv_6=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_6, grammarAccess.getTableAccess().getIndexesKeyword_6_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_8); 

                    				newLeafNode(otherlv_7, grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalDBML.g:213:4: ( ruleIndex )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==RULE_ID||LA4_0==15) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalDBML.g:214:5: ruleIndex
                    	    {

                    	    					newCompositeNode(grammarAccess.getTableAccess().getIndexParserRuleCall_6_2());
                    	    				
                    	    pushFollow(FOLLOW_9);
                    	    ruleIndex();

                    	    state._fsp--;


                    	    					afterParserOrEnumRuleCall();
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt4 >= 1 ) break loop4;
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);

                    otherlv_9=(Token)match(input,14,FOLLOW_10); 

                    				newLeafNode(otherlv_9, grammarAccess.getTableAccess().getRightCurlyBracketKeyword_6_3());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getTableAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTable"


    // $ANTLR start "entryRuleIndex"
    // InternalDBML.g:235:1: entryRuleIndex returns [String current=null] : iv_ruleIndex= ruleIndex EOF ;
    public final String entryRuleIndex() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIndex = null;


        try {
            // InternalDBML.g:235:45: (iv_ruleIndex= ruleIndex EOF )
            // InternalDBML.g:236:2: iv_ruleIndex= ruleIndex EOF
            {
             newCompositeNode(grammarAccess.getIndexRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIndex=ruleIndex();

            state._fsp--;

             current =iv_ruleIndex.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIndex"


    // $ANTLR start "ruleIndex"
    // InternalDBML.g:242:1: ruleIndex returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID | (kw= '(' this_ID_2= RULE_ID (kw= ',' this_ID_4= RULE_ID )+ kw= ')' ) ) kw= '[' (kw= 'unique,' )? (kw= 'pk' | (kw= 'name:' kw= '\"' this_ID_11= RULE_ID kw= '\"' ) ) kw= ']' ) ;
    public final AntlrDatatypeRuleToken ruleIndex() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        Token this_ID_4=null;
        Token this_ID_11=null;


        	enterRule();

        try {
            // InternalDBML.g:248:2: ( ( (this_ID_0= RULE_ID | (kw= '(' this_ID_2= RULE_ID (kw= ',' this_ID_4= RULE_ID )+ kw= ')' ) ) kw= '[' (kw= 'unique,' )? (kw= 'pk' | (kw= 'name:' kw= '\"' this_ID_11= RULE_ID kw= '\"' ) ) kw= ']' ) )
            // InternalDBML.g:249:2: ( (this_ID_0= RULE_ID | (kw= '(' this_ID_2= RULE_ID (kw= ',' this_ID_4= RULE_ID )+ kw= ')' ) ) kw= '[' (kw= 'unique,' )? (kw= 'pk' | (kw= 'name:' kw= '\"' this_ID_11= RULE_ID kw= '\"' ) ) kw= ']' )
            {
            // InternalDBML.g:249:2: ( (this_ID_0= RULE_ID | (kw= '(' this_ID_2= RULE_ID (kw= ',' this_ID_4= RULE_ID )+ kw= ')' ) ) kw= '[' (kw= 'unique,' )? (kw= 'pk' | (kw= 'name:' kw= '\"' this_ID_11= RULE_ID kw= '\"' ) ) kw= ']' )
            // InternalDBML.g:250:3: (this_ID_0= RULE_ID | (kw= '(' this_ID_2= RULE_ID (kw= ',' this_ID_4= RULE_ID )+ kw= ')' ) ) kw= '[' (kw= 'unique,' )? (kw= 'pk' | (kw= 'name:' kw= '\"' this_ID_11= RULE_ID kw= '\"' ) ) kw= ']'
            {
            // InternalDBML.g:250:3: (this_ID_0= RULE_ID | (kw= '(' this_ID_2= RULE_ID (kw= ',' this_ID_4= RULE_ID )+ kw= ')' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            else if ( (LA7_0==15) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalDBML.g:251:4: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_11); 

                    				current.merge(this_ID_0);
                    			

                    				newLeafNode(this_ID_0, grammarAccess.getIndexAccess().getIDTerminalRuleCall_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalDBML.g:259:4: (kw= '(' this_ID_2= RULE_ID (kw= ',' this_ID_4= RULE_ID )+ kw= ')' )
                    {
                    // InternalDBML.g:259:4: (kw= '(' this_ID_2= RULE_ID (kw= ',' this_ID_4= RULE_ID )+ kw= ')' )
                    // InternalDBML.g:260:5: kw= '(' this_ID_2= RULE_ID (kw= ',' this_ID_4= RULE_ID )+ kw= ')'
                    {
                    kw=(Token)match(input,15,FOLLOW_5); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getIndexAccess().getLeftParenthesisKeyword_0_1_0());
                    				
                    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_12); 

                    					current.merge(this_ID_2);
                    				

                    					newLeafNode(this_ID_2, grammarAccess.getIndexAccess().getIDTerminalRuleCall_0_1_1());
                    				
                    // InternalDBML.g:272:5: (kw= ',' this_ID_4= RULE_ID )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==16) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalDBML.g:273:6: kw= ',' this_ID_4= RULE_ID
                    	    {
                    	    kw=(Token)match(input,16,FOLLOW_5); 

                    	    						current.merge(kw);
                    	    						newLeafNode(kw, grammarAccess.getIndexAccess().getCommaKeyword_0_1_2_0());
                    	    					
                    	    this_ID_4=(Token)match(input,RULE_ID,FOLLOW_13); 

                    	    						current.merge(this_ID_4);
                    	    					

                    	    						newLeafNode(this_ID_4, grammarAccess.getIndexAccess().getIDTerminalRuleCall_0_1_2_1());
                    	    					

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);

                    kw=(Token)match(input,17,FOLLOW_11); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getIndexAccess().getRightParenthesisKeyword_0_1_3());
                    				

                    }


                    }
                    break;

            }

            kw=(Token)match(input,18,FOLLOW_14); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getIndexAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalDBML.g:298:3: (kw= 'unique,' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDBML.g:299:4: kw= 'unique,'
                    {
                    kw=(Token)match(input,19,FOLLOW_15); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getIndexAccess().getUniqueKeyword_2());
                    			

                    }
                    break;

            }

            // InternalDBML.g:305:3: (kw= 'pk' | (kw= 'name:' kw= '\"' this_ID_11= RULE_ID kw= '\"' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            else if ( (LA9_0==21) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalDBML.g:306:4: kw= 'pk'
                    {
                    kw=(Token)match(input,20,FOLLOW_16); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getIndexAccess().getPkKeyword_3_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalDBML.g:312:4: (kw= 'name:' kw= '\"' this_ID_11= RULE_ID kw= '\"' )
                    {
                    // InternalDBML.g:312:4: (kw= 'name:' kw= '\"' this_ID_11= RULE_ID kw= '\"' )
                    // InternalDBML.g:313:5: kw= 'name:' kw= '\"' this_ID_11= RULE_ID kw= '\"'
                    {
                    kw=(Token)match(input,21,FOLLOW_4); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getIndexAccess().getNameKeyword_3_1_0());
                    				
                    kw=(Token)match(input,11,FOLLOW_5); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getIndexAccess().getQuotationMarkKeyword_3_1_1());
                    				
                    this_ID_11=(Token)match(input,RULE_ID,FOLLOW_4); 

                    					current.merge(this_ID_11);
                    				

                    					newLeafNode(this_ID_11, grammarAccess.getIndexAccess().getIDTerminalRuleCall_3_1_2());
                    				
                    kw=(Token)match(input,11,FOLLOW_16); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getIndexAccess().getQuotationMarkKeyword_3_1_3());
                    				

                    }


                    }
                    break;

            }

            kw=(Token)match(input,22,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getIndexAccess().getRightSquareBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIndex"


    // $ANTLR start "entryRuleAttribute"
    // InternalDBML.g:346:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalDBML.g:346:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalDBML.g:347:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalDBML.g:353:1: ruleAttribute returns [EObject current=null] : (otherlv_0= '\"' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '\"' ( (lv_type_3_0= ruleType ) ) (otherlv_4= '[' ( (lv_options_5_0= ruleOptional ) ) (otherlv_6= ',' ( (lv_options_7_0= ruleOptional ) ) )* otherlv_8= ']' )? ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_type_3_0 = null;

        AntlrDatatypeRuleToken lv_options_5_0 = null;

        AntlrDatatypeRuleToken lv_options_7_0 = null;



        	enterRule();

        try {
            // InternalDBML.g:359:2: ( (otherlv_0= '\"' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '\"' ( (lv_type_3_0= ruleType ) ) (otherlv_4= '[' ( (lv_options_5_0= ruleOptional ) ) (otherlv_6= ',' ( (lv_options_7_0= ruleOptional ) ) )* otherlv_8= ']' )? ) )
            // InternalDBML.g:360:2: (otherlv_0= '\"' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '\"' ( (lv_type_3_0= ruleType ) ) (otherlv_4= '[' ( (lv_options_5_0= ruleOptional ) ) (otherlv_6= ',' ( (lv_options_7_0= ruleOptional ) ) )* otherlv_8= ']' )? )
            {
            // InternalDBML.g:360:2: (otherlv_0= '\"' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '\"' ( (lv_type_3_0= ruleType ) ) (otherlv_4= '[' ( (lv_options_5_0= ruleOptional ) ) (otherlv_6= ',' ( (lv_options_7_0= ruleOptional ) ) )* otherlv_8= ']' )? )
            // InternalDBML.g:361:3: otherlv_0= '\"' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '\"' ( (lv_type_3_0= ruleType ) ) (otherlv_4= '[' ( (lv_options_5_0= ruleOptional ) ) (otherlv_6= ',' ( (lv_options_7_0= ruleOptional ) ) )* otherlv_8= ']' )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getQuotationMarkKeyword_0());
            		
            // InternalDBML.g:365:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDBML.g:366:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDBML.g:366:4: (lv_name_1_0= RULE_ID )
            // InternalDBML.g:367:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"at.jku.se.dbml.DBML.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,11,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getQuotationMarkKeyword_2());
            		
            // InternalDBML.g:387:3: ( (lv_type_3_0= ruleType ) )
            // InternalDBML.g:388:4: (lv_type_3_0= ruleType )
            {
            // InternalDBML.g:388:4: (lv_type_3_0= ruleType )
            // InternalDBML.g:389:5: lv_type_3_0= ruleType
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getTypeTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_18);
            lv_type_3_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"at.jku.se.dbml.DBML.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDBML.g:406:3: (otherlv_4= '[' ( (lv_options_5_0= ruleOptional ) ) (otherlv_6= ',' ( (lv_options_7_0= ruleOptional ) ) )* otherlv_8= ']' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==18) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDBML.g:407:4: otherlv_4= '[' ( (lv_options_5_0= ruleOptional ) ) (otherlv_6= ',' ( (lv_options_7_0= ruleOptional ) ) )* otherlv_8= ']'
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_19); 

                    				newLeafNode(otherlv_4, grammarAccess.getAttributeAccess().getLeftSquareBracketKeyword_4_0());
                    			
                    // InternalDBML.g:411:4: ( (lv_options_5_0= ruleOptional ) )
                    // InternalDBML.g:412:5: (lv_options_5_0= ruleOptional )
                    {
                    // InternalDBML.g:412:5: (lv_options_5_0= ruleOptional )
                    // InternalDBML.g:413:6: lv_options_5_0= ruleOptional
                    {

                    						newCompositeNode(grammarAccess.getAttributeAccess().getOptionsOptionalParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_options_5_0=ruleOptional();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeRule());
                    						}
                    						add(
                    							current,
                    							"options",
                    							lv_options_5_0,
                    							"at.jku.se.dbml.DBML.Optional");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDBML.g:430:4: (otherlv_6= ',' ( (lv_options_7_0= ruleOptional ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==16) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalDBML.g:431:5: otherlv_6= ',' ( (lv_options_7_0= ruleOptional ) )
                    	    {
                    	    otherlv_6=(Token)match(input,16,FOLLOW_19); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getAttributeAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalDBML.g:435:5: ( (lv_options_7_0= ruleOptional ) )
                    	    // InternalDBML.g:436:6: (lv_options_7_0= ruleOptional )
                    	    {
                    	    // InternalDBML.g:436:6: (lv_options_7_0= ruleOptional )
                    	    // InternalDBML.g:437:7: lv_options_7_0= ruleOptional
                    	    {

                    	    							newCompositeNode(grammarAccess.getAttributeAccess().getOptionsOptionalParserRuleCall_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    lv_options_7_0=ruleOptional();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAttributeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"options",
                    	    								lv_options_7_0,
                    	    								"at.jku.se.dbml.DBML.Optional");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getAttributeAccess().getRightSquareBracketKeyword_4_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleOptional"
    // InternalDBML.g:464:1: entryRuleOptional returns [String current=null] : iv_ruleOptional= ruleOptional EOF ;
    public final String entryRuleOptional() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOptional = null;


        try {
            // InternalDBML.g:464:48: (iv_ruleOptional= ruleOptional EOF )
            // InternalDBML.g:465:2: iv_ruleOptional= ruleOptional EOF
            {
             newCompositeNode(grammarAccess.getOptionalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOptional=ruleOptional();

            state._fsp--;

             current =iv_ruleOptional.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOptional"


    // $ANTLR start "ruleOptional"
    // InternalDBML.g:471:1: ruleOptional returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'pk' | (kw= 'not' kw= 'null' ) | kw= 'increment' ) ;
    public final AntlrDatatypeRuleToken ruleOptional() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDBML.g:477:2: ( (kw= 'pk' | (kw= 'not' kw= 'null' ) | kw= 'increment' ) )
            // InternalDBML.g:478:2: (kw= 'pk' | (kw= 'not' kw= 'null' ) | kw= 'increment' )
            {
            // InternalDBML.g:478:2: (kw= 'pk' | (kw= 'not' kw= 'null' ) | kw= 'increment' )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt12=1;
                }
                break;
            case 23:
                {
                alt12=2;
                }
                break;
            case 25:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalDBML.g:479:3: kw= 'pk'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOptionalAccess().getPkKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDBML.g:485:3: (kw= 'not' kw= 'null' )
                    {
                    // InternalDBML.g:485:3: (kw= 'not' kw= 'null' )
                    // InternalDBML.g:486:4: kw= 'not' kw= 'null'
                    {
                    kw=(Token)match(input,23,FOLLOW_21); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getOptionalAccess().getNotKeyword_1_0());
                    			
                    kw=(Token)match(input,24,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getOptionalAccess().getNullKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDBML.g:498:3: kw= 'increment'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOptionalAccess().getIncrementKeyword_2());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOptional"


    // $ANTLR start "entryRuleType"
    // InternalDBML.g:507:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // InternalDBML.g:507:44: (iv_ruleType= ruleType EOF )
            // InternalDBML.g:508:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalDBML.g:514:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'BOOLEAN' | kw= 'BIT' | kw= 'INT' | kw= 'INTEGER' | kw= 'FLOAT' | (kw= 'TINYINT' (kw= '(' this_INT_7= RULE_INT kw= ')' )? ) | kw= 'BIGINT' | kw= 'SMALLINT' | kw= 'BYTE' | kw= 'TIMESTAMP' | kw= 'DATE' | kw= 'DATETIME' | kw= 'TEXT' | kw= 'LONGTEXT' | (kw= 'MEDIUMTEXT' (kw= '(' this_INT_19= RULE_INT kw= ')' )? ) | (kw= 'CHAR(' this_INT_22= RULE_INT kw= ')' ) | (kw= 'VARCHAR(' this_INT_25= RULE_INT kw= ')' ) | (kw= 'NCHAR(' this_INT_28= RULE_INT kw= ')' ) | (kw= 'NVARCHAR(' this_INT_31= RULE_INT kw= ')' ) | (kw= 'DECIMAL(' this_INT_34= RULE_INT kw= ',' this_INT_36= RULE_INT kw= ')' ) | (kw= 'DOUBLE' (kw= '(' this_INT_40= RULE_INT kw= ',' this_INT_42= RULE_INT kw= ')' )? ) | (kw= 'timestamp(' this_INT_45= RULE_INT kw= ')' ) | kw= 'jsonb' | kw= 'json' | kw= 'JSON' ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_7=null;
        Token this_INT_19=null;
        Token this_INT_22=null;
        Token this_INT_25=null;
        Token this_INT_28=null;
        Token this_INT_31=null;
        Token this_INT_34=null;
        Token this_INT_36=null;
        Token this_INT_40=null;
        Token this_INT_42=null;
        Token this_INT_45=null;


        	enterRule();

        try {
            // InternalDBML.g:520:2: ( (kw= 'BOOLEAN' | kw= 'BIT' | kw= 'INT' | kw= 'INTEGER' | kw= 'FLOAT' | (kw= 'TINYINT' (kw= '(' this_INT_7= RULE_INT kw= ')' )? ) | kw= 'BIGINT' | kw= 'SMALLINT' | kw= 'BYTE' | kw= 'TIMESTAMP' | kw= 'DATE' | kw= 'DATETIME' | kw= 'TEXT' | kw= 'LONGTEXT' | (kw= 'MEDIUMTEXT' (kw= '(' this_INT_19= RULE_INT kw= ')' )? ) | (kw= 'CHAR(' this_INT_22= RULE_INT kw= ')' ) | (kw= 'VARCHAR(' this_INT_25= RULE_INT kw= ')' ) | (kw= 'NCHAR(' this_INT_28= RULE_INT kw= ')' ) | (kw= 'NVARCHAR(' this_INT_31= RULE_INT kw= ')' ) | (kw= 'DECIMAL(' this_INT_34= RULE_INT kw= ',' this_INT_36= RULE_INT kw= ')' ) | (kw= 'DOUBLE' (kw= '(' this_INT_40= RULE_INT kw= ',' this_INT_42= RULE_INT kw= ')' )? ) | (kw= 'timestamp(' this_INT_45= RULE_INT kw= ')' ) | kw= 'jsonb' | kw= 'json' | kw= 'JSON' ) )
            // InternalDBML.g:521:2: (kw= 'BOOLEAN' | kw= 'BIT' | kw= 'INT' | kw= 'INTEGER' | kw= 'FLOAT' | (kw= 'TINYINT' (kw= '(' this_INT_7= RULE_INT kw= ')' )? ) | kw= 'BIGINT' | kw= 'SMALLINT' | kw= 'BYTE' | kw= 'TIMESTAMP' | kw= 'DATE' | kw= 'DATETIME' | kw= 'TEXT' | kw= 'LONGTEXT' | (kw= 'MEDIUMTEXT' (kw= '(' this_INT_19= RULE_INT kw= ')' )? ) | (kw= 'CHAR(' this_INT_22= RULE_INT kw= ')' ) | (kw= 'VARCHAR(' this_INT_25= RULE_INT kw= ')' ) | (kw= 'NCHAR(' this_INT_28= RULE_INT kw= ')' ) | (kw= 'NVARCHAR(' this_INT_31= RULE_INT kw= ')' ) | (kw= 'DECIMAL(' this_INT_34= RULE_INT kw= ',' this_INT_36= RULE_INT kw= ')' ) | (kw= 'DOUBLE' (kw= '(' this_INT_40= RULE_INT kw= ',' this_INT_42= RULE_INT kw= ')' )? ) | (kw= 'timestamp(' this_INT_45= RULE_INT kw= ')' ) | kw= 'jsonb' | kw= 'json' | kw= 'JSON' )
            {
            // InternalDBML.g:521:2: (kw= 'BOOLEAN' | kw= 'BIT' | kw= 'INT' | kw= 'INTEGER' | kw= 'FLOAT' | (kw= 'TINYINT' (kw= '(' this_INT_7= RULE_INT kw= ')' )? ) | kw= 'BIGINT' | kw= 'SMALLINT' | kw= 'BYTE' | kw= 'TIMESTAMP' | kw= 'DATE' | kw= 'DATETIME' | kw= 'TEXT' | kw= 'LONGTEXT' | (kw= 'MEDIUMTEXT' (kw= '(' this_INT_19= RULE_INT kw= ')' )? ) | (kw= 'CHAR(' this_INT_22= RULE_INT kw= ')' ) | (kw= 'VARCHAR(' this_INT_25= RULE_INT kw= ')' ) | (kw= 'NCHAR(' this_INT_28= RULE_INT kw= ')' ) | (kw= 'NVARCHAR(' this_INT_31= RULE_INT kw= ')' ) | (kw= 'DECIMAL(' this_INT_34= RULE_INT kw= ',' this_INT_36= RULE_INT kw= ')' ) | (kw= 'DOUBLE' (kw= '(' this_INT_40= RULE_INT kw= ',' this_INT_42= RULE_INT kw= ')' )? ) | (kw= 'timestamp(' this_INT_45= RULE_INT kw= ')' ) | kw= 'jsonb' | kw= 'json' | kw= 'JSON' )
            int alt16=25;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt16=1;
                }
                break;
            case 27:
                {
                alt16=2;
                }
                break;
            case 28:
                {
                alt16=3;
                }
                break;
            case 29:
                {
                alt16=4;
                }
                break;
            case 30:
                {
                alt16=5;
                }
                break;
            case 31:
                {
                alt16=6;
                }
                break;
            case 32:
                {
                alt16=7;
                }
                break;
            case 33:
                {
                alt16=8;
                }
                break;
            case 34:
                {
                alt16=9;
                }
                break;
            case 35:
                {
                alt16=10;
                }
                break;
            case 36:
                {
                alt16=11;
                }
                break;
            case 37:
                {
                alt16=12;
                }
                break;
            case 38:
                {
                alt16=13;
                }
                break;
            case 39:
                {
                alt16=14;
                }
                break;
            case 40:
                {
                alt16=15;
                }
                break;
            case 41:
                {
                alt16=16;
                }
                break;
            case 42:
                {
                alt16=17;
                }
                break;
            case 43:
                {
                alt16=18;
                }
                break;
            case 44:
                {
                alt16=19;
                }
                break;
            case 45:
                {
                alt16=20;
                }
                break;
            case 46:
                {
                alt16=21;
                }
                break;
            case 47:
                {
                alt16=22;
                }
                break;
            case 48:
                {
                alt16=23;
                }
                break;
            case 49:
                {
                alt16=24;
                }
                break;
            case 50:
                {
                alt16=25;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalDBML.g:522:3: kw= 'BOOLEAN'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getBOOLEANKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDBML.g:528:3: kw= 'BIT'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getBITKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalDBML.g:534:3: kw= 'INT'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getINTKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalDBML.g:540:3: kw= 'INTEGER'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getINTEGERKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalDBML.g:546:3: kw= 'FLOAT'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getFLOATKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalDBML.g:552:3: (kw= 'TINYINT' (kw= '(' this_INT_7= RULE_INT kw= ')' )? )
                    {
                    // InternalDBML.g:552:3: (kw= 'TINYINT' (kw= '(' this_INT_7= RULE_INT kw= ')' )? )
                    // InternalDBML.g:553:4: kw= 'TINYINT' (kw= '(' this_INT_7= RULE_INT kw= ')' )?
                    {
                    kw=(Token)match(input,31,FOLLOW_22); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getTypeAccess().getTINYINTKeyword_5_0());
                    			
                    // InternalDBML.g:558:4: (kw= '(' this_INT_7= RULE_INT kw= ')' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==15) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalDBML.g:559:5: kw= '(' this_INT_7= RULE_INT kw= ')'
                            {
                            kw=(Token)match(input,15,FOLLOW_23); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getTypeAccess().getLeftParenthesisKeyword_5_1_0());
                            				
                            this_INT_7=(Token)match(input,RULE_INT,FOLLOW_24); 

                            					current.merge(this_INT_7);
                            				

                            					newLeafNode(this_INT_7, grammarAccess.getTypeAccess().getINTTerminalRuleCall_5_1_1());
                            				
                            kw=(Token)match(input,17,FOLLOW_2); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getTypeAccess().getRightParenthesisKeyword_5_1_2());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalDBML.g:579:3: kw= 'BIGINT'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getBIGINTKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalDBML.g:585:3: kw= 'SMALLINT'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getSMALLINTKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalDBML.g:591:3: kw= 'BYTE'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getBYTEKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalDBML.g:597:3: kw= 'TIMESTAMP'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getTIMESTAMPKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalDBML.g:603:3: kw= 'DATE'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getDATEKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalDBML.g:609:3: kw= 'DATETIME'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getDATETIMEKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalDBML.g:615:3: kw= 'TEXT'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getTEXTKeyword_12());
                    		

                    }
                    break;
                case 14 :
                    // InternalDBML.g:621:3: kw= 'LONGTEXT'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getLONGTEXTKeyword_13());
                    		

                    }
                    break;
                case 15 :
                    // InternalDBML.g:627:3: (kw= 'MEDIUMTEXT' (kw= '(' this_INT_19= RULE_INT kw= ')' )? )
                    {
                    // InternalDBML.g:627:3: (kw= 'MEDIUMTEXT' (kw= '(' this_INT_19= RULE_INT kw= ')' )? )
                    // InternalDBML.g:628:4: kw= 'MEDIUMTEXT' (kw= '(' this_INT_19= RULE_INT kw= ')' )?
                    {
                    kw=(Token)match(input,40,FOLLOW_22); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getTypeAccess().getMEDIUMTEXTKeyword_14_0());
                    			
                    // InternalDBML.g:633:4: (kw= '(' this_INT_19= RULE_INT kw= ')' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==15) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalDBML.g:634:5: kw= '(' this_INT_19= RULE_INT kw= ')'
                            {
                            kw=(Token)match(input,15,FOLLOW_23); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getTypeAccess().getLeftParenthesisKeyword_14_1_0());
                            				
                            this_INT_19=(Token)match(input,RULE_INT,FOLLOW_24); 

                            					current.merge(this_INT_19);
                            				

                            					newLeafNode(this_INT_19, grammarAccess.getTypeAccess().getINTTerminalRuleCall_14_1_1());
                            				
                            kw=(Token)match(input,17,FOLLOW_2); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getTypeAccess().getRightParenthesisKeyword_14_1_2());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 16 :
                    // InternalDBML.g:654:3: (kw= 'CHAR(' this_INT_22= RULE_INT kw= ')' )
                    {
                    // InternalDBML.g:654:3: (kw= 'CHAR(' this_INT_22= RULE_INT kw= ')' )
                    // InternalDBML.g:655:4: kw= 'CHAR(' this_INT_22= RULE_INT kw= ')'
                    {
                    kw=(Token)match(input,41,FOLLOW_23); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getTypeAccess().getCHARKeyword_15_0());
                    			
                    this_INT_22=(Token)match(input,RULE_INT,FOLLOW_24); 

                    				current.merge(this_INT_22);
                    			

                    				newLeafNode(this_INT_22, grammarAccess.getTypeAccess().getINTTerminalRuleCall_15_1());
                    			
                    kw=(Token)match(input,17,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getTypeAccess().getRightParenthesisKeyword_15_2());
                    			

                    }


                    }
                    break;
                case 17 :
                    // InternalDBML.g:674:3: (kw= 'VARCHAR(' this_INT_25= RULE_INT kw= ')' )
                    {
                    // InternalDBML.g:674:3: (kw= 'VARCHAR(' this_INT_25= RULE_INT kw= ')' )
                    // InternalDBML.g:675:4: kw= 'VARCHAR(' this_INT_25= RULE_INT kw= ')'
                    {
                    kw=(Token)match(input,42,FOLLOW_23); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getTypeAccess().getVARCHARKeyword_16_0());
                    			
                    this_INT_25=(Token)match(input,RULE_INT,FOLLOW_24); 

                    				current.merge(this_INT_25);
                    			

                    				newLeafNode(this_INT_25, grammarAccess.getTypeAccess().getINTTerminalRuleCall_16_1());
                    			
                    kw=(Token)match(input,17,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getTypeAccess().getRightParenthesisKeyword_16_2());
                    			

                    }


                    }
                    break;
                case 18 :
                    // InternalDBML.g:694:3: (kw= 'NCHAR(' this_INT_28= RULE_INT kw= ')' )
                    {
                    // InternalDBML.g:694:3: (kw= 'NCHAR(' this_INT_28= RULE_INT kw= ')' )
                    // InternalDBML.g:695:4: kw= 'NCHAR(' this_INT_28= RULE_INT kw= ')'
                    {
                    kw=(Token)match(input,43,FOLLOW_23); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getTypeAccess().getNCHARKeyword_17_0());
                    			
                    this_INT_28=(Token)match(input,RULE_INT,FOLLOW_24); 

                    				current.merge(this_INT_28);
                    			

                    				newLeafNode(this_INT_28, grammarAccess.getTypeAccess().getINTTerminalRuleCall_17_1());
                    			
                    kw=(Token)match(input,17,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getTypeAccess().getRightParenthesisKeyword_17_2());
                    			

                    }


                    }
                    break;
                case 19 :
                    // InternalDBML.g:714:3: (kw= 'NVARCHAR(' this_INT_31= RULE_INT kw= ')' )
                    {
                    // InternalDBML.g:714:3: (kw= 'NVARCHAR(' this_INT_31= RULE_INT kw= ')' )
                    // InternalDBML.g:715:4: kw= 'NVARCHAR(' this_INT_31= RULE_INT kw= ')'
                    {
                    kw=(Token)match(input,44,FOLLOW_23); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getTypeAccess().getNVARCHARKeyword_18_0());
                    			
                    this_INT_31=(Token)match(input,RULE_INT,FOLLOW_24); 

                    				current.merge(this_INT_31);
                    			

                    				newLeafNode(this_INT_31, grammarAccess.getTypeAccess().getINTTerminalRuleCall_18_1());
                    			
                    kw=(Token)match(input,17,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getTypeAccess().getRightParenthesisKeyword_18_2());
                    			

                    }


                    }
                    break;
                case 20 :
                    // InternalDBML.g:734:3: (kw= 'DECIMAL(' this_INT_34= RULE_INT kw= ',' this_INT_36= RULE_INT kw= ')' )
                    {
                    // InternalDBML.g:734:3: (kw= 'DECIMAL(' this_INT_34= RULE_INT kw= ',' this_INT_36= RULE_INT kw= ')' )
                    // InternalDBML.g:735:4: kw= 'DECIMAL(' this_INT_34= RULE_INT kw= ',' this_INT_36= RULE_INT kw= ')'
                    {
                    kw=(Token)match(input,45,FOLLOW_23); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getTypeAccess().getDECIMALKeyword_19_0());
                    			
                    this_INT_34=(Token)match(input,RULE_INT,FOLLOW_12); 

                    				current.merge(this_INT_34);
                    			

                    				newLeafNode(this_INT_34, grammarAccess.getTypeAccess().getINTTerminalRuleCall_19_1());
                    			
                    kw=(Token)match(input,16,FOLLOW_23); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getTypeAccess().getCommaKeyword_19_2());
                    			
                    this_INT_36=(Token)match(input,RULE_INT,FOLLOW_24); 

                    				current.merge(this_INT_36);
                    			

                    				newLeafNode(this_INT_36, grammarAccess.getTypeAccess().getINTTerminalRuleCall_19_3());
                    			
                    kw=(Token)match(input,17,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getTypeAccess().getRightParenthesisKeyword_19_4());
                    			

                    }


                    }
                    break;
                case 21 :
                    // InternalDBML.g:766:3: (kw= 'DOUBLE' (kw= '(' this_INT_40= RULE_INT kw= ',' this_INT_42= RULE_INT kw= ')' )? )
                    {
                    // InternalDBML.g:766:3: (kw= 'DOUBLE' (kw= '(' this_INT_40= RULE_INT kw= ',' this_INT_42= RULE_INT kw= ')' )? )
                    // InternalDBML.g:767:4: kw= 'DOUBLE' (kw= '(' this_INT_40= RULE_INT kw= ',' this_INT_42= RULE_INT kw= ')' )?
                    {
                    kw=(Token)match(input,46,FOLLOW_22); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getTypeAccess().getDOUBLEKeyword_20_0());
                    			
                    // InternalDBML.g:772:4: (kw= '(' this_INT_40= RULE_INT kw= ',' this_INT_42= RULE_INT kw= ')' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==15) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalDBML.g:773:5: kw= '(' this_INT_40= RULE_INT kw= ',' this_INT_42= RULE_INT kw= ')'
                            {
                            kw=(Token)match(input,15,FOLLOW_23); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getTypeAccess().getLeftParenthesisKeyword_20_1_0());
                            				
                            this_INT_40=(Token)match(input,RULE_INT,FOLLOW_12); 

                            					current.merge(this_INT_40);
                            				

                            					newLeafNode(this_INT_40, grammarAccess.getTypeAccess().getINTTerminalRuleCall_20_1_1());
                            				
                            kw=(Token)match(input,16,FOLLOW_23); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getTypeAccess().getCommaKeyword_20_1_2());
                            				
                            this_INT_42=(Token)match(input,RULE_INT,FOLLOW_24); 

                            					current.merge(this_INT_42);
                            				

                            					newLeafNode(this_INT_42, grammarAccess.getTypeAccess().getINTTerminalRuleCall_20_1_3());
                            				
                            kw=(Token)match(input,17,FOLLOW_2); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getTypeAccess().getRightParenthesisKeyword_20_1_4());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 22 :
                    // InternalDBML.g:805:3: (kw= 'timestamp(' this_INT_45= RULE_INT kw= ')' )
                    {
                    // InternalDBML.g:805:3: (kw= 'timestamp(' this_INT_45= RULE_INT kw= ')' )
                    // InternalDBML.g:806:4: kw= 'timestamp(' this_INT_45= RULE_INT kw= ')'
                    {
                    kw=(Token)match(input,47,FOLLOW_23); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getTypeAccess().getTimestampKeyword_21_0());
                    			
                    this_INT_45=(Token)match(input,RULE_INT,FOLLOW_24); 

                    				current.merge(this_INT_45);
                    			

                    				newLeafNode(this_INT_45, grammarAccess.getTypeAccess().getINTTerminalRuleCall_21_1());
                    			
                    kw=(Token)match(input,17,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getTypeAccess().getRightParenthesisKeyword_21_2());
                    			

                    }


                    }
                    break;
                case 23 :
                    // InternalDBML.g:825:3: kw= 'jsonb'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getJsonbKeyword_22());
                    		

                    }
                    break;
                case 24 :
                    // InternalDBML.g:831:3: kw= 'json'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getJsonKeyword_23());
                    		

                    }
                    break;
                case 25 :
                    // InternalDBML.g:837:3: kw= 'JSON'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getJSONKeyword_24());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleRef"
    // InternalDBML.g:846:1: entryRuleRef returns [EObject current=null] : iv_ruleRef= ruleRef EOF ;
    public final EObject entryRuleRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRef = null;


        try {
            // InternalDBML.g:846:44: (iv_ruleRef= ruleRef EOF )
            // InternalDBML.g:847:2: iv_ruleRef= ruleRef EOF
            {
             newCompositeNode(grammarAccess.getRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRef=ruleRef();

            state._fsp--;

             current =iv_ruleRef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRef"


    // $ANTLR start "ruleRef"
    // InternalDBML.g:853:1: ruleRef returns [EObject current=null] : (otherlv_0= 'Ref' (otherlv_1= ':' )? (otherlv_2= '\"' this_ID_3= RULE_ID otherlv_4= '\":' )? ( (lv_left_5_0= ruleNestedRef ) ) otherlv_6= '<' ( (lv_right_7_0= ruleNestedRef ) ) ) ;
    public final EObject ruleRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token this_ID_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_left_5_0 = null;

        EObject lv_right_7_0 = null;



        	enterRule();

        try {
            // InternalDBML.g:859:2: ( (otherlv_0= 'Ref' (otherlv_1= ':' )? (otherlv_2= '\"' this_ID_3= RULE_ID otherlv_4= '\":' )? ( (lv_left_5_0= ruleNestedRef ) ) otherlv_6= '<' ( (lv_right_7_0= ruleNestedRef ) ) ) )
            // InternalDBML.g:860:2: (otherlv_0= 'Ref' (otherlv_1= ':' )? (otherlv_2= '\"' this_ID_3= RULE_ID otherlv_4= '\":' )? ( (lv_left_5_0= ruleNestedRef ) ) otherlv_6= '<' ( (lv_right_7_0= ruleNestedRef ) ) )
            {
            // InternalDBML.g:860:2: (otherlv_0= 'Ref' (otherlv_1= ':' )? (otherlv_2= '\"' this_ID_3= RULE_ID otherlv_4= '\":' )? ( (lv_left_5_0= ruleNestedRef ) ) otherlv_6= '<' ( (lv_right_7_0= ruleNestedRef ) ) )
            // InternalDBML.g:861:3: otherlv_0= 'Ref' (otherlv_1= ':' )? (otherlv_2= '\"' this_ID_3= RULE_ID otherlv_4= '\":' )? ( (lv_left_5_0= ruleNestedRef ) ) otherlv_6= '<' ( (lv_right_7_0= ruleNestedRef ) )
            {
            otherlv_0=(Token)match(input,51,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getRefAccess().getRefKeyword_0());
            		
            // InternalDBML.g:865:3: (otherlv_1= ':' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==52) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalDBML.g:866:4: otherlv_1= ':'
                    {
                    otherlv_1=(Token)match(input,52,FOLLOW_25); 

                    				newLeafNode(otherlv_1, grammarAccess.getRefAccess().getColonKeyword_1());
                    			

                    }
                    break;

            }

            // InternalDBML.g:871:3: (otherlv_2= '\"' this_ID_3= RULE_ID otherlv_4= '\":' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==11) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==RULE_ID) ) {
                    int LA18_2 = input.LA(3);

                    if ( (LA18_2==53) ) {
                        alt18=1;
                    }
                }
            }
            switch (alt18) {
                case 1 :
                    // InternalDBML.g:872:4: otherlv_2= '\"' this_ID_3= RULE_ID otherlv_4= '\":'
                    {
                    otherlv_2=(Token)match(input,11,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getRefAccess().getQuotationMarkKeyword_2_0());
                    			
                    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_26); 

                    				newLeafNode(this_ID_3, grammarAccess.getRefAccess().getIDTerminalRuleCall_2_1());
                    			
                    otherlv_4=(Token)match(input,53,FOLLOW_25); 

                    				newLeafNode(otherlv_4, grammarAccess.getRefAccess().getQuotationMarkColonKeyword_2_2());
                    			

                    }
                    break;

            }

            // InternalDBML.g:885:3: ( (lv_left_5_0= ruleNestedRef ) )
            // InternalDBML.g:886:4: (lv_left_5_0= ruleNestedRef )
            {
            // InternalDBML.g:886:4: (lv_left_5_0= ruleNestedRef )
            // InternalDBML.g:887:5: lv_left_5_0= ruleNestedRef
            {

            					newCompositeNode(grammarAccess.getRefAccess().getLeftNestedRefParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_27);
            lv_left_5_0=ruleNestedRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRefRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_5_0,
            						"at.jku.se.dbml.DBML.NestedRef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,54,FOLLOW_25); 

            			newLeafNode(otherlv_6, grammarAccess.getRefAccess().getLessThanSignKeyword_4());
            		
            // InternalDBML.g:908:3: ( (lv_right_7_0= ruleNestedRef ) )
            // InternalDBML.g:909:4: (lv_right_7_0= ruleNestedRef )
            {
            // InternalDBML.g:909:4: (lv_right_7_0= ruleNestedRef )
            // InternalDBML.g:910:5: lv_right_7_0= ruleNestedRef
            {

            					newCompositeNode(grammarAccess.getRefAccess().getRightNestedRefParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_right_7_0=ruleNestedRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRefRule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_7_0,
            						"at.jku.se.dbml.DBML.NestedRef");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRef"


    // $ANTLR start "entryRuleNestedRef"
    // InternalDBML.g:931:1: entryRuleNestedRef returns [EObject current=null] : iv_ruleNestedRef= ruleNestedRef EOF ;
    public final EObject entryRuleNestedRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedRef = null;


        try {
            // InternalDBML.g:931:50: (iv_ruleNestedRef= ruleNestedRef EOF )
            // InternalDBML.g:932:2: iv_ruleNestedRef= ruleNestedRef EOF
            {
             newCompositeNode(grammarAccess.getNestedRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNestedRef=ruleNestedRef();

            state._fsp--;

             current =iv_ruleNestedRef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNestedRef"


    // $ANTLR start "ruleNestedRef"
    // InternalDBML.g:938:1: ruleNestedRef returns [EObject current=null] : (otherlv_0= '\"' ( (otherlv_1= RULE_ID ) ) otherlv_2= '\"' otherlv_3= '.' otherlv_4= '\"' ( (lv_attr_5_0= RULE_ID ) ) otherlv_6= '\"' ) ;
    public final EObject ruleNestedRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_attr_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalDBML.g:944:2: ( (otherlv_0= '\"' ( (otherlv_1= RULE_ID ) ) otherlv_2= '\"' otherlv_3= '.' otherlv_4= '\"' ( (lv_attr_5_0= RULE_ID ) ) otherlv_6= '\"' ) )
            // InternalDBML.g:945:2: (otherlv_0= '\"' ( (otherlv_1= RULE_ID ) ) otherlv_2= '\"' otherlv_3= '.' otherlv_4= '\"' ( (lv_attr_5_0= RULE_ID ) ) otherlv_6= '\"' )
            {
            // InternalDBML.g:945:2: (otherlv_0= '\"' ( (otherlv_1= RULE_ID ) ) otherlv_2= '\"' otherlv_3= '.' otherlv_4= '\"' ( (lv_attr_5_0= RULE_ID ) ) otherlv_6= '\"' )
            // InternalDBML.g:946:3: otherlv_0= '\"' ( (otherlv_1= RULE_ID ) ) otherlv_2= '\"' otherlv_3= '.' otherlv_4= '\"' ( (lv_attr_5_0= RULE_ID ) ) otherlv_6= '\"'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getNestedRefAccess().getQuotationMarkKeyword_0());
            		
            // InternalDBML.g:950:3: ( (otherlv_1= RULE_ID ) )
            // InternalDBML.g:951:4: (otherlv_1= RULE_ID )
            {
            // InternalDBML.g:951:4: (otherlv_1= RULE_ID )
            // InternalDBML.g:952:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNestedRefRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(otherlv_1, grammarAccess.getNestedRefAccess().getTableTableCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,11,FOLLOW_28); 

            			newLeafNode(otherlv_2, grammarAccess.getNestedRefAccess().getQuotationMarkKeyword_2());
            		
            otherlv_3=(Token)match(input,55,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getNestedRefAccess().getFullStopKeyword_3());
            		
            otherlv_4=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getNestedRefAccess().getQuotationMarkKeyword_4());
            		
            // InternalDBML.g:975:3: ( (lv_attr_5_0= RULE_ID ) )
            // InternalDBML.g:976:4: (lv_attr_5_0= RULE_ID )
            {
            // InternalDBML.g:976:4: (lv_attr_5_0= RULE_ID )
            // InternalDBML.g:977:5: lv_attr_5_0= RULE_ID
            {
            lv_attr_5_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_attr_5_0, grammarAccess.getNestedRefAccess().getAttrIDTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNestedRefRule());
            					}
            					setWithLastConsumed(
            						current,
            						"attr",
            						lv_attr_5_0,
            						"at.jku.se.dbml.DBML.ID");
            				

            }


            }

            otherlv_6=(Token)match(input,11,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getNestedRefAccess().getQuotationMarkKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNestedRef"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0008000000000402L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000006800L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000000C010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000380000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0007FFFFFC000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002900000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0010000000000800L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0080000000000000L});

}