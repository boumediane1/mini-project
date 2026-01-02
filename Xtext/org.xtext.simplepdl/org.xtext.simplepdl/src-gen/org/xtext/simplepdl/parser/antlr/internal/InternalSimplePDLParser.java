package org.xtext.simplepdl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.simplepdl.services.SimplePDLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSimplePDLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Process'", "'{'", "'worksequence'", "','", "'}'", "'guidance'", "'resource'", "'workdefinition'", "'WorkSequence'", "'linkType'", "'predecessor'", "'successor'", "'Guidance'", "'description'", "'Resource'", "'occuranceNo'", "'WorkDefinition'", "'linksToSuccessors'", "'linksToPredecessors'", "'('", "')'", "'parameter'", "'-'", "'Parameter'", "'quantity'", "'startToStart'", "'finishToStart'", "'startToFinish'", "'finishToFinish'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalSimplePDLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSimplePDLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSimplePDLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSimplePDL.g"; }



     	private SimplePDLGrammarAccess grammarAccess;

        public InternalSimplePDLParser(TokenStream input, SimplePDLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Process";
       	}

       	@Override
       	protected SimplePDLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProcess"
    // InternalSimplePDL.g:65:1: entryRuleProcess returns [EObject current=null] : iv_ruleProcess= ruleProcess EOF ;
    public final EObject entryRuleProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcess = null;


        try {
            // InternalSimplePDL.g:65:48: (iv_ruleProcess= ruleProcess EOF )
            // InternalSimplePDL.g:66:2: iv_ruleProcess= ruleProcess EOF
            {
             newCompositeNode(grammarAccess.getProcessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcess=ruleProcess();

            state._fsp--;

             current =iv_ruleProcess; 
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
    // $ANTLR end "entryRuleProcess"


    // $ANTLR start "ruleProcess"
    // InternalSimplePDL.g:72:1: ruleProcess returns [EObject current=null] : (otherlv_0= 'Process' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'worksequence' otherlv_4= '{' ( (lv_worksequence_5_0= ruleWorkSequence ) ) (otherlv_6= ',' ( (lv_worksequence_7_0= ruleWorkSequence ) ) )* otherlv_8= '}' )? (otherlv_9= 'guidance' otherlv_10= '{' ( (lv_guidance_11_0= ruleGuidance ) ) (otherlv_12= ',' ( (lv_guidance_13_0= ruleGuidance ) ) )* otherlv_14= '}' )? (otherlv_15= 'resource' otherlv_16= '{' ( (lv_resource_17_0= ruleResource ) ) (otherlv_18= ',' ( (lv_resource_19_0= ruleResource ) ) )* otherlv_20= '}' )? otherlv_21= 'workdefinition' otherlv_22= '{' ( (lv_workdefinition_23_0= ruleWorkDefinition ) ) (otherlv_24= ',' ( (lv_workdefinition_25_0= ruleWorkDefinition ) ) )* otherlv_26= '}' otherlv_27= '}' ) ;
    public final EObject ruleProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_worksequence_5_0 = null;

        EObject lv_worksequence_7_0 = null;

        EObject lv_guidance_11_0 = null;

        EObject lv_guidance_13_0 = null;

        EObject lv_resource_17_0 = null;

        EObject lv_resource_19_0 = null;

        EObject lv_workdefinition_23_0 = null;

        EObject lv_workdefinition_25_0 = null;



        	enterRule();

        try {
            // InternalSimplePDL.g:78:2: ( (otherlv_0= 'Process' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'worksequence' otherlv_4= '{' ( (lv_worksequence_5_0= ruleWorkSequence ) ) (otherlv_6= ',' ( (lv_worksequence_7_0= ruleWorkSequence ) ) )* otherlv_8= '}' )? (otherlv_9= 'guidance' otherlv_10= '{' ( (lv_guidance_11_0= ruleGuidance ) ) (otherlv_12= ',' ( (lv_guidance_13_0= ruleGuidance ) ) )* otherlv_14= '}' )? (otherlv_15= 'resource' otherlv_16= '{' ( (lv_resource_17_0= ruleResource ) ) (otherlv_18= ',' ( (lv_resource_19_0= ruleResource ) ) )* otherlv_20= '}' )? otherlv_21= 'workdefinition' otherlv_22= '{' ( (lv_workdefinition_23_0= ruleWorkDefinition ) ) (otherlv_24= ',' ( (lv_workdefinition_25_0= ruleWorkDefinition ) ) )* otherlv_26= '}' otherlv_27= '}' ) )
            // InternalSimplePDL.g:79:2: (otherlv_0= 'Process' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'worksequence' otherlv_4= '{' ( (lv_worksequence_5_0= ruleWorkSequence ) ) (otherlv_6= ',' ( (lv_worksequence_7_0= ruleWorkSequence ) ) )* otherlv_8= '}' )? (otherlv_9= 'guidance' otherlv_10= '{' ( (lv_guidance_11_0= ruleGuidance ) ) (otherlv_12= ',' ( (lv_guidance_13_0= ruleGuidance ) ) )* otherlv_14= '}' )? (otherlv_15= 'resource' otherlv_16= '{' ( (lv_resource_17_0= ruleResource ) ) (otherlv_18= ',' ( (lv_resource_19_0= ruleResource ) ) )* otherlv_20= '}' )? otherlv_21= 'workdefinition' otherlv_22= '{' ( (lv_workdefinition_23_0= ruleWorkDefinition ) ) (otherlv_24= ',' ( (lv_workdefinition_25_0= ruleWorkDefinition ) ) )* otherlv_26= '}' otherlv_27= '}' )
            {
            // InternalSimplePDL.g:79:2: (otherlv_0= 'Process' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'worksequence' otherlv_4= '{' ( (lv_worksequence_5_0= ruleWorkSequence ) ) (otherlv_6= ',' ( (lv_worksequence_7_0= ruleWorkSequence ) ) )* otherlv_8= '}' )? (otherlv_9= 'guidance' otherlv_10= '{' ( (lv_guidance_11_0= ruleGuidance ) ) (otherlv_12= ',' ( (lv_guidance_13_0= ruleGuidance ) ) )* otherlv_14= '}' )? (otherlv_15= 'resource' otherlv_16= '{' ( (lv_resource_17_0= ruleResource ) ) (otherlv_18= ',' ( (lv_resource_19_0= ruleResource ) ) )* otherlv_20= '}' )? otherlv_21= 'workdefinition' otherlv_22= '{' ( (lv_workdefinition_23_0= ruleWorkDefinition ) ) (otherlv_24= ',' ( (lv_workdefinition_25_0= ruleWorkDefinition ) ) )* otherlv_26= '}' otherlv_27= '}' )
            // InternalSimplePDL.g:80:3: otherlv_0= 'Process' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'worksequence' otherlv_4= '{' ( (lv_worksequence_5_0= ruleWorkSequence ) ) (otherlv_6= ',' ( (lv_worksequence_7_0= ruleWorkSequence ) ) )* otherlv_8= '}' )? (otherlv_9= 'guidance' otherlv_10= '{' ( (lv_guidance_11_0= ruleGuidance ) ) (otherlv_12= ',' ( (lv_guidance_13_0= ruleGuidance ) ) )* otherlv_14= '}' )? (otherlv_15= 'resource' otherlv_16= '{' ( (lv_resource_17_0= ruleResource ) ) (otherlv_18= ',' ( (lv_resource_19_0= ruleResource ) ) )* otherlv_20= '}' )? otherlv_21= 'workdefinition' otherlv_22= '{' ( (lv_workdefinition_23_0= ruleWorkDefinition ) ) (otherlv_24= ',' ( (lv_workdefinition_25_0= ruleWorkDefinition ) ) )* otherlv_26= '}' otherlv_27= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProcessAccess().getProcessKeyword_0());
            		
            // InternalSimplePDL.g:84:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSimplePDL.g:85:4: (lv_name_1_0= ruleEString )
            {
            // InternalSimplePDL.g:85:4: (lv_name_1_0= ruleEString )
            // InternalSimplePDL.g:86:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getProcessAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProcessRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.simplepdl.SimplePDL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSimplePDL.g:107:3: (otherlv_3= 'worksequence' otherlv_4= '{' ( (lv_worksequence_5_0= ruleWorkSequence ) ) (otherlv_6= ',' ( (lv_worksequence_7_0= ruleWorkSequence ) ) )* otherlv_8= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalSimplePDL.g:108:4: otherlv_3= 'worksequence' otherlv_4= '{' ( (lv_worksequence_5_0= ruleWorkSequence ) ) (otherlv_6= ',' ( (lv_worksequence_7_0= ruleWorkSequence ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getProcessAccess().getWorksequenceKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalSimplePDL.g:116:4: ( (lv_worksequence_5_0= ruleWorkSequence ) )
                    // InternalSimplePDL.g:117:5: (lv_worksequence_5_0= ruleWorkSequence )
                    {
                    // InternalSimplePDL.g:117:5: (lv_worksequence_5_0= ruleWorkSequence )
                    // InternalSimplePDL.g:118:6: lv_worksequence_5_0= ruleWorkSequence
                    {

                    						newCompositeNode(grammarAccess.getProcessAccess().getWorksequenceWorkSequenceParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_worksequence_5_0=ruleWorkSequence();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProcessRule());
                    						}
                    						add(
                    							current,
                    							"worksequence",
                    							lv_worksequence_5_0,
                    							"org.xtext.simplepdl.SimplePDL.WorkSequence");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSimplePDL.g:135:4: (otherlv_6= ',' ( (lv_worksequence_7_0= ruleWorkSequence ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalSimplePDL.g:136:5: otherlv_6= ',' ( (lv_worksequence_7_0= ruleWorkSequence ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getProcessAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalSimplePDL.g:140:5: ( (lv_worksequence_7_0= ruleWorkSequence ) )
                    	    // InternalSimplePDL.g:141:6: (lv_worksequence_7_0= ruleWorkSequence )
                    	    {
                    	    // InternalSimplePDL.g:141:6: (lv_worksequence_7_0= ruleWorkSequence )
                    	    // InternalSimplePDL.g:142:7: lv_worksequence_7_0= ruleWorkSequence
                    	    {

                    	    							newCompositeNode(grammarAccess.getProcessAccess().getWorksequenceWorkSequenceParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_worksequence_7_0=ruleWorkSequence();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getProcessRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"worksequence",
                    	    								lv_worksequence_7_0,
                    	    								"org.xtext.simplepdl.SimplePDL.WorkSequence");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_8, grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalSimplePDL.g:165:3: (otherlv_9= 'guidance' otherlv_10= '{' ( (lv_guidance_11_0= ruleGuidance ) ) (otherlv_12= ',' ( (lv_guidance_13_0= ruleGuidance ) ) )* otherlv_14= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSimplePDL.g:166:4: otherlv_9= 'guidance' otherlv_10= '{' ( (lv_guidance_11_0= ruleGuidance ) ) (otherlv_12= ',' ( (lv_guidance_13_0= ruleGuidance ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getProcessAccess().getGuidanceKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_10, grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalSimplePDL.g:174:4: ( (lv_guidance_11_0= ruleGuidance ) )
                    // InternalSimplePDL.g:175:5: (lv_guidance_11_0= ruleGuidance )
                    {
                    // InternalSimplePDL.g:175:5: (lv_guidance_11_0= ruleGuidance )
                    // InternalSimplePDL.g:176:6: lv_guidance_11_0= ruleGuidance
                    {

                    						newCompositeNode(grammarAccess.getProcessAccess().getGuidanceGuidanceParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_guidance_11_0=ruleGuidance();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProcessRule());
                    						}
                    						add(
                    							current,
                    							"guidance",
                    							lv_guidance_11_0,
                    							"org.xtext.simplepdl.SimplePDL.Guidance");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSimplePDL.g:193:4: (otherlv_12= ',' ( (lv_guidance_13_0= ruleGuidance ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalSimplePDL.g:194:5: otherlv_12= ',' ( (lv_guidance_13_0= ruleGuidance ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getProcessAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalSimplePDL.g:198:5: ( (lv_guidance_13_0= ruleGuidance ) )
                    	    // InternalSimplePDL.g:199:6: (lv_guidance_13_0= ruleGuidance )
                    	    {
                    	    // InternalSimplePDL.g:199:6: (lv_guidance_13_0= ruleGuidance )
                    	    // InternalSimplePDL.g:200:7: lv_guidance_13_0= ruleGuidance
                    	    {

                    	    							newCompositeNode(grammarAccess.getProcessAccess().getGuidanceGuidanceParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_guidance_13_0=ruleGuidance();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getProcessRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"guidance",
                    	    								lv_guidance_13_0,
                    	    								"org.xtext.simplepdl.SimplePDL.Guidance");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_14, grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalSimplePDL.g:223:3: (otherlv_15= 'resource' otherlv_16= '{' ( (lv_resource_17_0= ruleResource ) ) (otherlv_18= ',' ( (lv_resource_19_0= ruleResource ) ) )* otherlv_20= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSimplePDL.g:224:4: otherlv_15= 'resource' otherlv_16= '{' ( (lv_resource_17_0= ruleResource ) ) (otherlv_18= ',' ( (lv_resource_19_0= ruleResource ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_15, grammarAccess.getProcessAccess().getResourceKeyword_5_0());
                    			
                    otherlv_16=(Token)match(input,12,FOLLOW_11); 

                    				newLeafNode(otherlv_16, grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalSimplePDL.g:232:4: ( (lv_resource_17_0= ruleResource ) )
                    // InternalSimplePDL.g:233:5: (lv_resource_17_0= ruleResource )
                    {
                    // InternalSimplePDL.g:233:5: (lv_resource_17_0= ruleResource )
                    // InternalSimplePDL.g:234:6: lv_resource_17_0= ruleResource
                    {

                    						newCompositeNode(grammarAccess.getProcessAccess().getResourceResourceParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_resource_17_0=ruleResource();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProcessRule());
                    						}
                    						add(
                    							current,
                    							"resource",
                    							lv_resource_17_0,
                    							"org.xtext.simplepdl.SimplePDL.Resource");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSimplePDL.g:251:4: (otherlv_18= ',' ( (lv_resource_19_0= ruleResource ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==14) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalSimplePDL.g:252:5: otherlv_18= ',' ( (lv_resource_19_0= ruleResource ) )
                    	    {
                    	    otherlv_18=(Token)match(input,14,FOLLOW_11); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getProcessAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalSimplePDL.g:256:5: ( (lv_resource_19_0= ruleResource ) )
                    	    // InternalSimplePDL.g:257:6: (lv_resource_19_0= ruleResource )
                    	    {
                    	    // InternalSimplePDL.g:257:6: (lv_resource_19_0= ruleResource )
                    	    // InternalSimplePDL.g:258:7: lv_resource_19_0= ruleResource
                    	    {

                    	    							newCompositeNode(grammarAccess.getProcessAccess().getResourceResourceParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_resource_19_0=ruleResource();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getProcessRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"resource",
                    	    								lv_resource_19_0,
                    	    								"org.xtext.simplepdl.SimplePDL.Resource");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,15,FOLLOW_12); 

                    				newLeafNode(otherlv_20, grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_21=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_21, grammarAccess.getProcessAccess().getWorkdefinitionKeyword_6());
            		
            otherlv_22=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_22, grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalSimplePDL.g:289:3: ( (lv_workdefinition_23_0= ruleWorkDefinition ) )
            // InternalSimplePDL.g:290:4: (lv_workdefinition_23_0= ruleWorkDefinition )
            {
            // InternalSimplePDL.g:290:4: (lv_workdefinition_23_0= ruleWorkDefinition )
            // InternalSimplePDL.g:291:5: lv_workdefinition_23_0= ruleWorkDefinition
            {

            					newCompositeNode(grammarAccess.getProcessAccess().getWorkdefinitionWorkDefinitionParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_7);
            lv_workdefinition_23_0=ruleWorkDefinition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProcessRule());
            					}
            					add(
            						current,
            						"workdefinition",
            						lv_workdefinition_23_0,
            						"org.xtext.simplepdl.SimplePDL.WorkDefinition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSimplePDL.g:308:3: (otherlv_24= ',' ( (lv_workdefinition_25_0= ruleWorkDefinition ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==14) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSimplePDL.g:309:4: otherlv_24= ',' ( (lv_workdefinition_25_0= ruleWorkDefinition ) )
            	    {
            	    otherlv_24=(Token)match(input,14,FOLLOW_13); 

            	    				newLeafNode(otherlv_24, grammarAccess.getProcessAccess().getCommaKeyword_9_0());
            	    			
            	    // InternalSimplePDL.g:313:4: ( (lv_workdefinition_25_0= ruleWorkDefinition ) )
            	    // InternalSimplePDL.g:314:5: (lv_workdefinition_25_0= ruleWorkDefinition )
            	    {
            	    // InternalSimplePDL.g:314:5: (lv_workdefinition_25_0= ruleWorkDefinition )
            	    // InternalSimplePDL.g:315:6: lv_workdefinition_25_0= ruleWorkDefinition
            	    {

            	    						newCompositeNode(grammarAccess.getProcessAccess().getWorkdefinitionWorkDefinitionParserRuleCall_9_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_workdefinition_25_0=ruleWorkDefinition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProcessRule());
            	    						}
            	    						add(
            	    							current,
            	    							"workdefinition",
            	    							lv_workdefinition_25_0,
            	    							"org.xtext.simplepdl.SimplePDL.WorkDefinition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_26=(Token)match(input,15,FOLLOW_14); 

            			newLeafNode(otherlv_26, grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_10());
            		
            otherlv_27=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_27, grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruleProcess"


    // $ANTLR start "entryRuleEString"
    // InternalSimplePDL.g:345:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalSimplePDL.g:345:47: (iv_ruleEString= ruleEString EOF )
            // InternalSimplePDL.g:346:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalSimplePDL.g:352:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalSimplePDL.g:358:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalSimplePDL.g:359:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalSimplePDL.g:359:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalSimplePDL.g:360:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSimplePDL.g:368:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleWorkSequence"
    // InternalSimplePDL.g:379:1: entryRuleWorkSequence returns [EObject current=null] : iv_ruleWorkSequence= ruleWorkSequence EOF ;
    public final EObject entryRuleWorkSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkSequence = null;


        try {
            // InternalSimplePDL.g:379:53: (iv_ruleWorkSequence= ruleWorkSequence EOF )
            // InternalSimplePDL.g:380:2: iv_ruleWorkSequence= ruleWorkSequence EOF
            {
             newCompositeNode(grammarAccess.getWorkSequenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorkSequence=ruleWorkSequence();

            state._fsp--;

             current =iv_ruleWorkSequence; 
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
    // $ANTLR end "entryRuleWorkSequence"


    // $ANTLR start "ruleWorkSequence"
    // InternalSimplePDL.g:386:1: ruleWorkSequence returns [EObject current=null] : (otherlv_0= 'WorkSequence' otherlv_1= '{' (otherlv_2= 'linkType' ( (lv_linkType_3_0= ruleWorkSequenceType ) ) )? otherlv_4= 'predecessor' ( ( ruleEString ) ) otherlv_6= 'successor' ( ( ruleEString ) ) otherlv_8= '}' ) ;
    public final EObject ruleWorkSequence() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Enumerator lv_linkType_3_0 = null;



        	enterRule();

        try {
            // InternalSimplePDL.g:392:2: ( (otherlv_0= 'WorkSequence' otherlv_1= '{' (otherlv_2= 'linkType' ( (lv_linkType_3_0= ruleWorkSequenceType ) ) )? otherlv_4= 'predecessor' ( ( ruleEString ) ) otherlv_6= 'successor' ( ( ruleEString ) ) otherlv_8= '}' ) )
            // InternalSimplePDL.g:393:2: (otherlv_0= 'WorkSequence' otherlv_1= '{' (otherlv_2= 'linkType' ( (lv_linkType_3_0= ruleWorkSequenceType ) ) )? otherlv_4= 'predecessor' ( ( ruleEString ) ) otherlv_6= 'successor' ( ( ruleEString ) ) otherlv_8= '}' )
            {
            // InternalSimplePDL.g:393:2: (otherlv_0= 'WorkSequence' otherlv_1= '{' (otherlv_2= 'linkType' ( (lv_linkType_3_0= ruleWorkSequenceType ) ) )? otherlv_4= 'predecessor' ( ( ruleEString ) ) otherlv_6= 'successor' ( ( ruleEString ) ) otherlv_8= '}' )
            // InternalSimplePDL.g:394:3: otherlv_0= 'WorkSequence' otherlv_1= '{' (otherlv_2= 'linkType' ( (lv_linkType_3_0= ruleWorkSequenceType ) ) )? otherlv_4= 'predecessor' ( ( ruleEString ) ) otherlv_6= 'successor' ( ( ruleEString ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getWorkSequenceAccess().getWorkSequenceKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getWorkSequenceAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSimplePDL.g:402:3: (otherlv_2= 'linkType' ( (lv_linkType_3_0= ruleWorkSequenceType ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSimplePDL.g:403:4: otherlv_2= 'linkType' ( (lv_linkType_3_0= ruleWorkSequenceType ) )
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_16); 

                    				newLeafNode(otherlv_2, grammarAccess.getWorkSequenceAccess().getLinkTypeKeyword_2_0());
                    			
                    // InternalSimplePDL.g:407:4: ( (lv_linkType_3_0= ruleWorkSequenceType ) )
                    // InternalSimplePDL.g:408:5: (lv_linkType_3_0= ruleWorkSequenceType )
                    {
                    // InternalSimplePDL.g:408:5: (lv_linkType_3_0= ruleWorkSequenceType )
                    // InternalSimplePDL.g:409:6: lv_linkType_3_0= ruleWorkSequenceType
                    {

                    						newCompositeNode(grammarAccess.getWorkSequenceAccess().getLinkTypeWorkSequenceTypeEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_linkType_3_0=ruleWorkSequenceType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWorkSequenceRule());
                    						}
                    						set(
                    							current,
                    							"linkType",
                    							lv_linkType_3_0,
                    							"org.xtext.simplepdl.SimplePDL.WorkSequenceType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getWorkSequenceAccess().getPredecessorKeyword_3());
            		
            // InternalSimplePDL.g:431:3: ( ( ruleEString ) )
            // InternalSimplePDL.g:432:4: ( ruleEString )
            {
            // InternalSimplePDL.g:432:4: ( ruleEString )
            // InternalSimplePDL.g:433:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWorkSequenceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionCrossReference_4_0());
            				
            pushFollow(FOLLOW_18);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getWorkSequenceAccess().getSuccessorKeyword_5());
            		
            // InternalSimplePDL.g:451:3: ( ( ruleEString ) )
            // InternalSimplePDL.g:452:4: ( ruleEString )
            {
            // InternalSimplePDL.g:452:4: ( ruleEString )
            // InternalSimplePDL.g:453:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWorkSequenceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionCrossReference_6_0());
            				
            pushFollow(FOLLOW_14);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getWorkSequenceAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleWorkSequence"


    // $ANTLR start "entryRuleGuidance"
    // InternalSimplePDL.g:475:1: entryRuleGuidance returns [EObject current=null] : iv_ruleGuidance= ruleGuidance EOF ;
    public final EObject entryRuleGuidance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuidance = null;


        try {
            // InternalSimplePDL.g:475:49: (iv_ruleGuidance= ruleGuidance EOF )
            // InternalSimplePDL.g:476:2: iv_ruleGuidance= ruleGuidance EOF
            {
             newCompositeNode(grammarAccess.getGuidanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGuidance=ruleGuidance();

            state._fsp--;

             current =iv_ruleGuidance; 
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
    // $ANTLR end "entryRuleGuidance"


    // $ANTLR start "ruleGuidance"
    // InternalSimplePDL.g:482:1: ruleGuidance returns [EObject current=null] : ( () otherlv_1= 'Guidance' otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleGuidance() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_description_4_0 = null;



        	enterRule();

        try {
            // InternalSimplePDL.g:488:2: ( ( () otherlv_1= 'Guidance' otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalSimplePDL.g:489:2: ( () otherlv_1= 'Guidance' otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalSimplePDL.g:489:2: ( () otherlv_1= 'Guidance' otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // InternalSimplePDL.g:490:3: () otherlv_1= 'Guidance' otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalSimplePDL.g:490:3: ()
            // InternalSimplePDL.g:491:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGuidanceAccess().getGuidanceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getGuidanceAccess().getGuidanceKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getGuidanceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSimplePDL.g:505:3: (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSimplePDL.g:506:4: otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getGuidanceAccess().getDescriptionKeyword_3_0());
                    			
                    // InternalSimplePDL.g:510:4: ( (lv_description_4_0= ruleEString ) )
                    // InternalSimplePDL.g:511:5: (lv_description_4_0= ruleEString )
                    {
                    // InternalSimplePDL.g:511:5: (lv_description_4_0= ruleEString )
                    // InternalSimplePDL.g:512:6: lv_description_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getGuidanceAccess().getDescriptionEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_description_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGuidanceRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_4_0,
                    							"org.xtext.simplepdl.SimplePDL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getGuidanceAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleGuidance"


    // $ANTLR start "entryRuleResource"
    // InternalSimplePDL.g:538:1: entryRuleResource returns [EObject current=null] : iv_ruleResource= ruleResource EOF ;
    public final EObject entryRuleResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResource = null;


        try {
            // InternalSimplePDL.g:538:49: (iv_ruleResource= ruleResource EOF )
            // InternalSimplePDL.g:539:2: iv_ruleResource= ruleResource EOF
            {
             newCompositeNode(grammarAccess.getResourceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResource=ruleResource();

            state._fsp--;

             current =iv_ruleResource; 
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
    // $ANTLR end "entryRuleResource"


    // $ANTLR start "ruleResource"
    // InternalSimplePDL.g:545:1: ruleResource returns [EObject current=null] : (otherlv_0= 'Resource' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'occuranceNo' ( (lv_occuranceNo_4_0= ruleEInt ) ) otherlv_5= '}' ) ;
    public final EObject ruleResource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_occuranceNo_4_0 = null;



        	enterRule();

        try {
            // InternalSimplePDL.g:551:2: ( (otherlv_0= 'Resource' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'occuranceNo' ( (lv_occuranceNo_4_0= ruleEInt ) ) otherlv_5= '}' ) )
            // InternalSimplePDL.g:552:2: (otherlv_0= 'Resource' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'occuranceNo' ( (lv_occuranceNo_4_0= ruleEInt ) ) otherlv_5= '}' )
            {
            // InternalSimplePDL.g:552:2: (otherlv_0= 'Resource' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'occuranceNo' ( (lv_occuranceNo_4_0= ruleEInt ) ) otherlv_5= '}' )
            // InternalSimplePDL.g:553:3: otherlv_0= 'Resource' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'occuranceNo' ( (lv_occuranceNo_4_0= ruleEInt ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getResourceAccess().getResourceKeyword_0());
            		
            // InternalSimplePDL.g:557:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSimplePDL.g:558:4: (lv_name_1_0= ruleEString )
            {
            // InternalSimplePDL.g:558:4: (lv_name_1_0= ruleEString )
            // InternalSimplePDL.g:559:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getResourceAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getResourceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.simplepdl.SimplePDL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getResourceAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,26,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getResourceAccess().getOccuranceNoKeyword_3());
            		
            // InternalSimplePDL.g:584:3: ( (lv_occuranceNo_4_0= ruleEInt ) )
            // InternalSimplePDL.g:585:4: (lv_occuranceNo_4_0= ruleEInt )
            {
            // InternalSimplePDL.g:585:4: (lv_occuranceNo_4_0= ruleEInt )
            // InternalSimplePDL.g:586:5: lv_occuranceNo_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getResourceAccess().getOccuranceNoEIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_14);
            lv_occuranceNo_4_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getResourceRule());
            					}
            					set(
            						current,
            						"occuranceNo",
            						lv_occuranceNo_4_0,
            						"org.xtext.simplepdl.SimplePDL.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getResourceAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleResource"


    // $ANTLR start "entryRuleWorkDefinition"
    // InternalSimplePDL.g:611:1: entryRuleWorkDefinition returns [EObject current=null] : iv_ruleWorkDefinition= ruleWorkDefinition EOF ;
    public final EObject entryRuleWorkDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkDefinition = null;


        try {
            // InternalSimplePDL.g:611:55: (iv_ruleWorkDefinition= ruleWorkDefinition EOF )
            // InternalSimplePDL.g:612:2: iv_ruleWorkDefinition= ruleWorkDefinition EOF
            {
             newCompositeNode(grammarAccess.getWorkDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorkDefinition=ruleWorkDefinition();

            state._fsp--;

             current =iv_ruleWorkDefinition; 
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
    // $ANTLR end "entryRuleWorkDefinition"


    // $ANTLR start "ruleWorkDefinition"
    // InternalSimplePDL.g:618:1: ruleWorkDefinition returns [EObject current=null] : ( () otherlv_1= 'WorkDefinition' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'linksToSuccessors' ( ( ruleEString ) ) )? (otherlv_6= 'linksToPredecessors' ( ( ruleEString ) ) )? (otherlv_8= 'guidance' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? (otherlv_14= 'parameter' otherlv_15= '{' ( (lv_parameter_16_0= ruleParameter ) ) (otherlv_17= ',' ( (lv_parameter_18_0= ruleParameter ) ) )* otherlv_19= '}' )? otherlv_20= '}' ) ;
    public final EObject ruleWorkDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_parameter_16_0 = null;

        EObject lv_parameter_18_0 = null;



        	enterRule();

        try {
            // InternalSimplePDL.g:624:2: ( ( () otherlv_1= 'WorkDefinition' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'linksToSuccessors' ( ( ruleEString ) ) )? (otherlv_6= 'linksToPredecessors' ( ( ruleEString ) ) )? (otherlv_8= 'guidance' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? (otherlv_14= 'parameter' otherlv_15= '{' ( (lv_parameter_16_0= ruleParameter ) ) (otherlv_17= ',' ( (lv_parameter_18_0= ruleParameter ) ) )* otherlv_19= '}' )? otherlv_20= '}' ) )
            // InternalSimplePDL.g:625:2: ( () otherlv_1= 'WorkDefinition' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'linksToSuccessors' ( ( ruleEString ) ) )? (otherlv_6= 'linksToPredecessors' ( ( ruleEString ) ) )? (otherlv_8= 'guidance' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? (otherlv_14= 'parameter' otherlv_15= '{' ( (lv_parameter_16_0= ruleParameter ) ) (otherlv_17= ',' ( (lv_parameter_18_0= ruleParameter ) ) )* otherlv_19= '}' )? otherlv_20= '}' )
            {
            // InternalSimplePDL.g:625:2: ( () otherlv_1= 'WorkDefinition' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'linksToSuccessors' ( ( ruleEString ) ) )? (otherlv_6= 'linksToPredecessors' ( ( ruleEString ) ) )? (otherlv_8= 'guidance' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? (otherlv_14= 'parameter' otherlv_15= '{' ( (lv_parameter_16_0= ruleParameter ) ) (otherlv_17= ',' ( (lv_parameter_18_0= ruleParameter ) ) )* otherlv_19= '}' )? otherlv_20= '}' )
            // InternalSimplePDL.g:626:3: () otherlv_1= 'WorkDefinition' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'linksToSuccessors' ( ( ruleEString ) ) )? (otherlv_6= 'linksToPredecessors' ( ( ruleEString ) ) )? (otherlv_8= 'guidance' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? (otherlv_14= 'parameter' otherlv_15= '{' ( (lv_parameter_16_0= ruleParameter ) ) (otherlv_17= ',' ( (lv_parameter_18_0= ruleParameter ) ) )* otherlv_19= '}' )? otherlv_20= '}'
            {
            // InternalSimplePDL.g:626:3: ()
            // InternalSimplePDL.g:627:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWorkDefinitionAccess().getWorkDefinitionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getWorkDefinitionAccess().getWorkDefinitionKeyword_1());
            		
            // InternalSimplePDL.g:637:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSimplePDL.g:638:4: (lv_name_2_0= ruleEString )
            {
            // InternalSimplePDL.g:638:4: (lv_name_2_0= ruleEString )
            // InternalSimplePDL.g:639:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getWorkDefinitionAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWorkDefinitionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.simplepdl.SimplePDL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getWorkDefinitionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSimplePDL.g:660:3: (otherlv_4= 'linksToSuccessors' ( ( ruleEString ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==28) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSimplePDL.g:661:4: otherlv_4= 'linksToSuccessors' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getWorkDefinitionAccess().getLinksToSuccessorsKeyword_4_0());
                    			
                    // InternalSimplePDL.g:665:4: ( ( ruleEString ) )
                    // InternalSimplePDL.g:666:5: ( ruleEString )
                    {
                    // InternalSimplePDL.g:666:5: ( ruleEString )
                    // InternalSimplePDL.g:667:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWorkDefinitionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getWorkDefinitionAccess().getLinksToSuccessorsWorkSequenceCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSimplePDL.g:682:3: (otherlv_6= 'linksToPredecessors' ( ( ruleEString ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==29) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSimplePDL.g:683:4: otherlv_6= 'linksToPredecessors' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getWorkDefinitionAccess().getLinksToPredecessorsKeyword_5_0());
                    			
                    // InternalSimplePDL.g:687:4: ( ( ruleEString ) )
                    // InternalSimplePDL.g:688:5: ( ruleEString )
                    {
                    // InternalSimplePDL.g:688:5: ( ruleEString )
                    // InternalSimplePDL.g:689:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWorkDefinitionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getWorkDefinitionAccess().getLinksToPredecessorsWorkSequenceCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_24);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSimplePDL.g:704:3: (otherlv_8= 'guidance' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==16) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSimplePDL.g:705:4: otherlv_8= 'guidance' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')'
                    {
                    otherlv_8=(Token)match(input,16,FOLLOW_25); 

                    				newLeafNode(otherlv_8, grammarAccess.getWorkDefinitionAccess().getGuidanceKeyword_6_0());
                    			
                    otherlv_9=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getWorkDefinitionAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalSimplePDL.g:713:4: ( ( ruleEString ) )
                    // InternalSimplePDL.g:714:5: ( ruleEString )
                    {
                    // InternalSimplePDL.g:714:5: ( ruleEString )
                    // InternalSimplePDL.g:715:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWorkDefinitionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getWorkDefinitionAccess().getGuidanceGuidanceCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_26);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSimplePDL.g:729:4: (otherlv_11= ',' ( ( ruleEString ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==14) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalSimplePDL.g:730:5: otherlv_11= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_11=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getWorkDefinitionAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalSimplePDL.g:734:5: ( ( ruleEString ) )
                    	    // InternalSimplePDL.g:735:6: ( ruleEString )
                    	    {
                    	    // InternalSimplePDL.g:735:6: ( ruleEString )
                    	    // InternalSimplePDL.g:736:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getWorkDefinitionRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getWorkDefinitionAccess().getGuidanceGuidanceCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_26);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,31,FOLLOW_27); 

                    				newLeafNode(otherlv_13, grammarAccess.getWorkDefinitionAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalSimplePDL.g:756:3: (otherlv_14= 'parameter' otherlv_15= '{' ( (lv_parameter_16_0= ruleParameter ) ) (otherlv_17= ',' ( (lv_parameter_18_0= ruleParameter ) ) )* otherlv_19= '}' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==32) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSimplePDL.g:757:4: otherlv_14= 'parameter' otherlv_15= '{' ( (lv_parameter_16_0= ruleParameter ) ) (otherlv_17= ',' ( (lv_parameter_18_0= ruleParameter ) ) )* otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,32,FOLLOW_4); 

                    				newLeafNode(otherlv_14, grammarAccess.getWorkDefinitionAccess().getParameterKeyword_7_0());
                    			
                    otherlv_15=(Token)match(input,12,FOLLOW_28); 

                    				newLeafNode(otherlv_15, grammarAccess.getWorkDefinitionAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalSimplePDL.g:765:4: ( (lv_parameter_16_0= ruleParameter ) )
                    // InternalSimplePDL.g:766:5: (lv_parameter_16_0= ruleParameter )
                    {
                    // InternalSimplePDL.g:766:5: (lv_parameter_16_0= ruleParameter )
                    // InternalSimplePDL.g:767:6: lv_parameter_16_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getWorkDefinitionAccess().getParameterParameterParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_parameter_16_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWorkDefinitionRule());
                    						}
                    						add(
                    							current,
                    							"parameter",
                    							lv_parameter_16_0,
                    							"org.xtext.simplepdl.SimplePDL.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSimplePDL.g:784:4: (otherlv_17= ',' ( (lv_parameter_18_0= ruleParameter ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==14) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalSimplePDL.g:785:5: otherlv_17= ',' ( (lv_parameter_18_0= ruleParameter ) )
                    	    {
                    	    otherlv_17=(Token)match(input,14,FOLLOW_28); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getWorkDefinitionAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalSimplePDL.g:789:5: ( (lv_parameter_18_0= ruleParameter ) )
                    	    // InternalSimplePDL.g:790:6: (lv_parameter_18_0= ruleParameter )
                    	    {
                    	    // InternalSimplePDL.g:790:6: (lv_parameter_18_0= ruleParameter )
                    	    // InternalSimplePDL.g:791:7: lv_parameter_18_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getWorkDefinitionAccess().getParameterParameterParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_parameter_18_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getWorkDefinitionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameter",
                    	    								lv_parameter_18_0,
                    	    								"org.xtext.simplepdl.SimplePDL.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,15,FOLLOW_14); 

                    				newLeafNode(otherlv_19, grammarAccess.getWorkDefinitionAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_20=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_20, grammarAccess.getWorkDefinitionAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleWorkDefinition"


    // $ANTLR start "entryRuleEInt"
    // InternalSimplePDL.g:822:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalSimplePDL.g:822:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalSimplePDL.g:823:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalSimplePDL.g:829:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalSimplePDL.g:835:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalSimplePDL.g:836:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalSimplePDL.g:836:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalSimplePDL.g:837:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalSimplePDL.g:837:3: (kw= '-' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==33) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSimplePDL.g:838:4: kw= '-'
                    {
                    kw=(Token)match(input,33,FOLLOW_29); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleParameter"
    // InternalSimplePDL.g:855:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalSimplePDL.g:855:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalSimplePDL.g:856:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalSimplePDL.g:862:1: ruleParameter returns [EObject current=null] : (otherlv_0= 'Parameter' otherlv_1= '{' otherlv_2= 'quantity' ( (lv_quantity_3_0= ruleEInt ) ) otherlv_4= 'resource' ( ( ruleEString ) ) otherlv_6= '}' ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_quantity_3_0 = null;



        	enterRule();

        try {
            // InternalSimplePDL.g:868:2: ( (otherlv_0= 'Parameter' otherlv_1= '{' otherlv_2= 'quantity' ( (lv_quantity_3_0= ruleEInt ) ) otherlv_4= 'resource' ( ( ruleEString ) ) otherlv_6= '}' ) )
            // InternalSimplePDL.g:869:2: (otherlv_0= 'Parameter' otherlv_1= '{' otherlv_2= 'quantity' ( (lv_quantity_3_0= ruleEInt ) ) otherlv_4= 'resource' ( ( ruleEString ) ) otherlv_6= '}' )
            {
            // InternalSimplePDL.g:869:2: (otherlv_0= 'Parameter' otherlv_1= '{' otherlv_2= 'quantity' ( (lv_quantity_3_0= ruleEInt ) ) otherlv_4= 'resource' ( ( ruleEString ) ) otherlv_6= '}' )
            // InternalSimplePDL.g:870:3: otherlv_0= 'Parameter' otherlv_1= '{' otherlv_2= 'quantity' ( (lv_quantity_3_0= ruleEInt ) ) otherlv_4= 'resource' ( ( ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getParameterKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,35,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getQuantityKeyword_2());
            		
            // InternalSimplePDL.g:882:3: ( (lv_quantity_3_0= ruleEInt ) )
            // InternalSimplePDL.g:883:4: (lv_quantity_3_0= ruleEInt )
            {
            // InternalSimplePDL.g:883:4: (lv_quantity_3_0= ruleEInt )
            // InternalSimplePDL.g:884:5: lv_quantity_3_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getQuantityEIntParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_31);
            lv_quantity_3_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"quantity",
            						lv_quantity_3_0,
            						"org.xtext.simplepdl.SimplePDL.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getParameterAccess().getResourceKeyword_4());
            		
            // InternalSimplePDL.g:905:3: ( ( ruleEString ) )
            // InternalSimplePDL.g:906:4: ( ruleEString )
            {
            // InternalSimplePDL.g:906:4: ( ruleEString )
            // InternalSimplePDL.g:907:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            				

            					newCompositeNode(grammarAccess.getParameterAccess().getResourceResourceCrossReference_5_0());
            				
            pushFollow(FOLLOW_14);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "ruleWorkSequenceType"
    // InternalSimplePDL.g:929:1: ruleWorkSequenceType returns [Enumerator current=null] : ( (enumLiteral_0= 'startToStart' ) | (enumLiteral_1= 'finishToStart' ) | (enumLiteral_2= 'startToFinish' ) | (enumLiteral_3= 'finishToFinish' ) ) ;
    public final Enumerator ruleWorkSequenceType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalSimplePDL.g:935:2: ( ( (enumLiteral_0= 'startToStart' ) | (enumLiteral_1= 'finishToStart' ) | (enumLiteral_2= 'startToFinish' ) | (enumLiteral_3= 'finishToFinish' ) ) )
            // InternalSimplePDL.g:936:2: ( (enumLiteral_0= 'startToStart' ) | (enumLiteral_1= 'finishToStart' ) | (enumLiteral_2= 'startToFinish' ) | (enumLiteral_3= 'finishToFinish' ) )
            {
            // InternalSimplePDL.g:936:2: ( (enumLiteral_0= 'startToStart' ) | (enumLiteral_1= 'finishToStart' ) | (enumLiteral_2= 'startToFinish' ) | (enumLiteral_3= 'finishToFinish' ) )
            int alt18=4;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt18=1;
                }
                break;
            case 37:
                {
                alt18=2;
                }
                break;
            case 38:
                {
                alt18=3;
                }
                break;
            case 39:
                {
                alt18=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalSimplePDL.g:937:3: (enumLiteral_0= 'startToStart' )
                    {
                    // InternalSimplePDL.g:937:3: (enumLiteral_0= 'startToStart' )
                    // InternalSimplePDL.g:938:4: enumLiteral_0= 'startToStart'
                    {
                    enumLiteral_0=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getWorkSequenceTypeAccess().getStartToStartEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getWorkSequenceTypeAccess().getStartToStartEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSimplePDL.g:945:3: (enumLiteral_1= 'finishToStart' )
                    {
                    // InternalSimplePDL.g:945:3: (enumLiteral_1= 'finishToStart' )
                    // InternalSimplePDL.g:946:4: enumLiteral_1= 'finishToStart'
                    {
                    enumLiteral_1=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getWorkSequenceTypeAccess().getFinishToStartEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getWorkSequenceTypeAccess().getFinishToStartEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSimplePDL.g:953:3: (enumLiteral_2= 'startToFinish' )
                    {
                    // InternalSimplePDL.g:953:3: (enumLiteral_2= 'startToFinish' )
                    // InternalSimplePDL.g:954:4: enumLiteral_2= 'startToFinish'
                    {
                    enumLiteral_2=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getWorkSequenceTypeAccess().getStartToFinishEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getWorkSequenceTypeAccess().getStartToFinishEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSimplePDL.g:961:3: (enumLiteral_3= 'finishToFinish' )
                    {
                    // InternalSimplePDL.g:961:3: (enumLiteral_3= 'finishToFinish' )
                    // InternalSimplePDL.g:962:4: enumLiteral_3= 'finishToFinish'
                    {
                    enumLiteral_3=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getWorkSequenceTypeAccess().getFinishToFinishEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getWorkSequenceTypeAccess().getFinishToFinishEnumLiteralDeclaration_3());
                    			

                    }


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
    // $ANTLR end "ruleWorkSequenceType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000072000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000F000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000200000040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000130018000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000120018000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100018000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080004000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100008000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000020000L});

}