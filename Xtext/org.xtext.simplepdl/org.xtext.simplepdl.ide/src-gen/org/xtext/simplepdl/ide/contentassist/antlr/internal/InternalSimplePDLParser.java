package org.xtext.simplepdl.ide.contentassist.antlr.internal;

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
import org.xtext.simplepdl.services.SimplePDLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSimplePDLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'startToStart'", "'finishToStart'", "'startToFinish'", "'finishToFinish'", "'Process'", "'{'", "'workdefinition'", "'}'", "'worksequence'", "','", "'guidance'", "'resource'", "'WorkSequence'", "'predecessor'", "'successor'", "'linkType'", "'Guidance'", "'description'", "'Resource'", "'occuranceNo'", "'WorkDefinition'", "'linksToSuccessors'", "'linksToPredecessors'", "'('", "')'", "'parameter'", "'-'", "'Parameter'", "'quantity'"
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

    	public void setGrammarAccess(SimplePDLGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleProcess"
    // InternalSimplePDL.g:53:1: entryRuleProcess : ruleProcess EOF ;
    public final void entryRuleProcess() throws RecognitionException {
        try {
            // InternalSimplePDL.g:54:1: ( ruleProcess EOF )
            // InternalSimplePDL.g:55:1: ruleProcess EOF
            {
             before(grammarAccess.getProcessRule()); 
            pushFollow(FOLLOW_1);
            ruleProcess();

            state._fsp--;

             after(grammarAccess.getProcessRule()); 
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
    // $ANTLR end "entryRuleProcess"


    // $ANTLR start "ruleProcess"
    // InternalSimplePDL.g:62:1: ruleProcess : ( ( rule__Process__Group__0 ) ) ;
    public final void ruleProcess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:66:2: ( ( ( rule__Process__Group__0 ) ) )
            // InternalSimplePDL.g:67:2: ( ( rule__Process__Group__0 ) )
            {
            // InternalSimplePDL.g:67:2: ( ( rule__Process__Group__0 ) )
            // InternalSimplePDL.g:68:3: ( rule__Process__Group__0 )
            {
             before(grammarAccess.getProcessAccess().getGroup()); 
            // InternalSimplePDL.g:69:3: ( rule__Process__Group__0 )
            // InternalSimplePDL.g:69:4: rule__Process__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getGroup()); 

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
    // $ANTLR end "ruleProcess"


    // $ANTLR start "entryRuleEString"
    // InternalSimplePDL.g:78:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalSimplePDL.g:79:1: ( ruleEString EOF )
            // InternalSimplePDL.g:80:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalSimplePDL.g:87:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:91:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalSimplePDL.g:92:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalSimplePDL.g:92:2: ( ( rule__EString__Alternatives ) )
            // InternalSimplePDL.g:93:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalSimplePDL.g:94:3: ( rule__EString__Alternatives )
            // InternalSimplePDL.g:94:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleWorkSequence"
    // InternalSimplePDL.g:103:1: entryRuleWorkSequence : ruleWorkSequence EOF ;
    public final void entryRuleWorkSequence() throws RecognitionException {
        try {
            // InternalSimplePDL.g:104:1: ( ruleWorkSequence EOF )
            // InternalSimplePDL.g:105:1: ruleWorkSequence EOF
            {
             before(grammarAccess.getWorkSequenceRule()); 
            pushFollow(FOLLOW_1);
            ruleWorkSequence();

            state._fsp--;

             after(grammarAccess.getWorkSequenceRule()); 
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
    // $ANTLR end "entryRuleWorkSequence"


    // $ANTLR start "ruleWorkSequence"
    // InternalSimplePDL.g:112:1: ruleWorkSequence : ( ( rule__WorkSequence__Group__0 ) ) ;
    public final void ruleWorkSequence() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:116:2: ( ( ( rule__WorkSequence__Group__0 ) ) )
            // InternalSimplePDL.g:117:2: ( ( rule__WorkSequence__Group__0 ) )
            {
            // InternalSimplePDL.g:117:2: ( ( rule__WorkSequence__Group__0 ) )
            // InternalSimplePDL.g:118:3: ( rule__WorkSequence__Group__0 )
            {
             before(grammarAccess.getWorkSequenceAccess().getGroup()); 
            // InternalSimplePDL.g:119:3: ( rule__WorkSequence__Group__0 )
            // InternalSimplePDL.g:119:4: rule__WorkSequence__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getGroup()); 

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
    // $ANTLR end "ruleWorkSequence"


    // $ANTLR start "entryRuleGuidance"
    // InternalSimplePDL.g:128:1: entryRuleGuidance : ruleGuidance EOF ;
    public final void entryRuleGuidance() throws RecognitionException {
        try {
            // InternalSimplePDL.g:129:1: ( ruleGuidance EOF )
            // InternalSimplePDL.g:130:1: ruleGuidance EOF
            {
             before(grammarAccess.getGuidanceRule()); 
            pushFollow(FOLLOW_1);
            ruleGuidance();

            state._fsp--;

             after(grammarAccess.getGuidanceRule()); 
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
    // $ANTLR end "entryRuleGuidance"


    // $ANTLR start "ruleGuidance"
    // InternalSimplePDL.g:137:1: ruleGuidance : ( ( rule__Guidance__Group__0 ) ) ;
    public final void ruleGuidance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:141:2: ( ( ( rule__Guidance__Group__0 ) ) )
            // InternalSimplePDL.g:142:2: ( ( rule__Guidance__Group__0 ) )
            {
            // InternalSimplePDL.g:142:2: ( ( rule__Guidance__Group__0 ) )
            // InternalSimplePDL.g:143:3: ( rule__Guidance__Group__0 )
            {
             before(grammarAccess.getGuidanceAccess().getGroup()); 
            // InternalSimplePDL.g:144:3: ( rule__Guidance__Group__0 )
            // InternalSimplePDL.g:144:4: rule__Guidance__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Guidance__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGuidanceAccess().getGroup()); 

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
    // $ANTLR end "ruleGuidance"


    // $ANTLR start "entryRuleResource"
    // InternalSimplePDL.g:153:1: entryRuleResource : ruleResource EOF ;
    public final void entryRuleResource() throws RecognitionException {
        try {
            // InternalSimplePDL.g:154:1: ( ruleResource EOF )
            // InternalSimplePDL.g:155:1: ruleResource EOF
            {
             before(grammarAccess.getResourceRule()); 
            pushFollow(FOLLOW_1);
            ruleResource();

            state._fsp--;

             after(grammarAccess.getResourceRule()); 
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
    // $ANTLR end "entryRuleResource"


    // $ANTLR start "ruleResource"
    // InternalSimplePDL.g:162:1: ruleResource : ( ( rule__Resource__Group__0 ) ) ;
    public final void ruleResource() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:166:2: ( ( ( rule__Resource__Group__0 ) ) )
            // InternalSimplePDL.g:167:2: ( ( rule__Resource__Group__0 ) )
            {
            // InternalSimplePDL.g:167:2: ( ( rule__Resource__Group__0 ) )
            // InternalSimplePDL.g:168:3: ( rule__Resource__Group__0 )
            {
             before(grammarAccess.getResourceAccess().getGroup()); 
            // InternalSimplePDL.g:169:3: ( rule__Resource__Group__0 )
            // InternalSimplePDL.g:169:4: rule__Resource__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Resource__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getGroup()); 

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
    // $ANTLR end "ruleResource"


    // $ANTLR start "entryRuleWorkDefinition"
    // InternalSimplePDL.g:178:1: entryRuleWorkDefinition : ruleWorkDefinition EOF ;
    public final void entryRuleWorkDefinition() throws RecognitionException {
        try {
            // InternalSimplePDL.g:179:1: ( ruleWorkDefinition EOF )
            // InternalSimplePDL.g:180:1: ruleWorkDefinition EOF
            {
             before(grammarAccess.getWorkDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleWorkDefinition();

            state._fsp--;

             after(grammarAccess.getWorkDefinitionRule()); 
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
    // $ANTLR end "entryRuleWorkDefinition"


    // $ANTLR start "ruleWorkDefinition"
    // InternalSimplePDL.g:187:1: ruleWorkDefinition : ( ( rule__WorkDefinition__Group__0 ) ) ;
    public final void ruleWorkDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:191:2: ( ( ( rule__WorkDefinition__Group__0 ) ) )
            // InternalSimplePDL.g:192:2: ( ( rule__WorkDefinition__Group__0 ) )
            {
            // InternalSimplePDL.g:192:2: ( ( rule__WorkDefinition__Group__0 ) )
            // InternalSimplePDL.g:193:3: ( rule__WorkDefinition__Group__0 )
            {
             before(grammarAccess.getWorkDefinitionAccess().getGroup()); 
            // InternalSimplePDL.g:194:3: ( rule__WorkDefinition__Group__0 )
            // InternalSimplePDL.g:194:4: rule__WorkDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWorkDefinitionAccess().getGroup()); 

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
    // $ANTLR end "ruleWorkDefinition"


    // $ANTLR start "entryRuleEInt"
    // InternalSimplePDL.g:203:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalSimplePDL.g:204:1: ( ruleEInt EOF )
            // InternalSimplePDL.g:205:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalSimplePDL.g:212:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:216:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalSimplePDL.g:217:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalSimplePDL.g:217:2: ( ( rule__EInt__Group__0 ) )
            // InternalSimplePDL.g:218:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalSimplePDL.g:219:3: ( rule__EInt__Group__0 )
            // InternalSimplePDL.g:219:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleParameter"
    // InternalSimplePDL.g:228:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalSimplePDL.g:229:1: ( ruleParameter EOF )
            // InternalSimplePDL.g:230:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalSimplePDL.g:237:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:241:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalSimplePDL.g:242:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalSimplePDL.g:242:2: ( ( rule__Parameter__Group__0 ) )
            // InternalSimplePDL.g:243:3: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalSimplePDL.g:244:3: ( rule__Parameter__Group__0 )
            // InternalSimplePDL.g:244:4: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup()); 

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "ruleWorkSequenceType"
    // InternalSimplePDL.g:253:1: ruleWorkSequenceType : ( ( rule__WorkSequenceType__Alternatives ) ) ;
    public final void ruleWorkSequenceType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:257:1: ( ( ( rule__WorkSequenceType__Alternatives ) ) )
            // InternalSimplePDL.g:258:2: ( ( rule__WorkSequenceType__Alternatives ) )
            {
            // InternalSimplePDL.g:258:2: ( ( rule__WorkSequenceType__Alternatives ) )
            // InternalSimplePDL.g:259:3: ( rule__WorkSequenceType__Alternatives )
            {
             before(grammarAccess.getWorkSequenceTypeAccess().getAlternatives()); 
            // InternalSimplePDL.g:260:3: ( rule__WorkSequenceType__Alternatives )
            // InternalSimplePDL.g:260:4: rule__WorkSequenceType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequenceType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleWorkSequenceType"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalSimplePDL.g:268:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:272:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalSimplePDL.g:273:2: ( RULE_STRING )
                    {
                    // InternalSimplePDL.g:273:2: ( RULE_STRING )
                    // InternalSimplePDL.g:274:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSimplePDL.g:279:2: ( RULE_ID )
                    {
                    // InternalSimplePDL.g:279:2: ( RULE_ID )
                    // InternalSimplePDL.g:280:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__WorkSequenceType__Alternatives"
    // InternalSimplePDL.g:289:1: rule__WorkSequenceType__Alternatives : ( ( ( 'startToStart' ) ) | ( ( 'finishToStart' ) ) | ( ( 'startToFinish' ) ) | ( ( 'finishToFinish' ) ) );
    public final void rule__WorkSequenceType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:293:1: ( ( ( 'startToStart' ) ) | ( ( 'finishToStart' ) ) | ( ( 'startToFinish' ) ) | ( ( 'finishToFinish' ) ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalSimplePDL.g:294:2: ( ( 'startToStart' ) )
                    {
                    // InternalSimplePDL.g:294:2: ( ( 'startToStart' ) )
                    // InternalSimplePDL.g:295:3: ( 'startToStart' )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getStartToStartEnumLiteralDeclaration_0()); 
                    // InternalSimplePDL.g:296:3: ( 'startToStart' )
                    // InternalSimplePDL.g:296:4: 'startToStart'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getWorkSequenceTypeAccess().getStartToStartEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSimplePDL.g:300:2: ( ( 'finishToStart' ) )
                    {
                    // InternalSimplePDL.g:300:2: ( ( 'finishToStart' ) )
                    // InternalSimplePDL.g:301:3: ( 'finishToStart' )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getFinishToStartEnumLiteralDeclaration_1()); 
                    // InternalSimplePDL.g:302:3: ( 'finishToStart' )
                    // InternalSimplePDL.g:302:4: 'finishToStart'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getWorkSequenceTypeAccess().getFinishToStartEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSimplePDL.g:306:2: ( ( 'startToFinish' ) )
                    {
                    // InternalSimplePDL.g:306:2: ( ( 'startToFinish' ) )
                    // InternalSimplePDL.g:307:3: ( 'startToFinish' )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getStartToFinishEnumLiteralDeclaration_2()); 
                    // InternalSimplePDL.g:308:3: ( 'startToFinish' )
                    // InternalSimplePDL.g:308:4: 'startToFinish'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getWorkSequenceTypeAccess().getStartToFinishEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSimplePDL.g:312:2: ( ( 'finishToFinish' ) )
                    {
                    // InternalSimplePDL.g:312:2: ( ( 'finishToFinish' ) )
                    // InternalSimplePDL.g:313:3: ( 'finishToFinish' )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getFinishToFinishEnumLiteralDeclaration_3()); 
                    // InternalSimplePDL.g:314:3: ( 'finishToFinish' )
                    // InternalSimplePDL.g:314:4: 'finishToFinish'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getWorkSequenceTypeAccess().getFinishToFinishEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__WorkSequenceType__Alternatives"


    // $ANTLR start "rule__Process__Group__0"
    // InternalSimplePDL.g:322:1: rule__Process__Group__0 : rule__Process__Group__0__Impl rule__Process__Group__1 ;
    public final void rule__Process__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:326:1: ( rule__Process__Group__0__Impl rule__Process__Group__1 )
            // InternalSimplePDL.g:327:2: rule__Process__Group__0__Impl rule__Process__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Process__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__1();

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
    // $ANTLR end "rule__Process__Group__0"


    // $ANTLR start "rule__Process__Group__0__Impl"
    // InternalSimplePDL.g:334:1: rule__Process__Group__0__Impl : ( 'Process' ) ;
    public final void rule__Process__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:338:1: ( ( 'Process' ) )
            // InternalSimplePDL.g:339:1: ( 'Process' )
            {
            // InternalSimplePDL.g:339:1: ( 'Process' )
            // InternalSimplePDL.g:340:2: 'Process'
            {
             before(grammarAccess.getProcessAccess().getProcessKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getProcessKeyword_0()); 

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
    // $ANTLR end "rule__Process__Group__0__Impl"


    // $ANTLR start "rule__Process__Group__1"
    // InternalSimplePDL.g:349:1: rule__Process__Group__1 : rule__Process__Group__1__Impl rule__Process__Group__2 ;
    public final void rule__Process__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:353:1: ( rule__Process__Group__1__Impl rule__Process__Group__2 )
            // InternalSimplePDL.g:354:2: rule__Process__Group__1__Impl rule__Process__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Process__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__2();

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
    // $ANTLR end "rule__Process__Group__1"


    // $ANTLR start "rule__Process__Group__1__Impl"
    // InternalSimplePDL.g:361:1: rule__Process__Group__1__Impl : ( ( rule__Process__NameAssignment_1 ) ) ;
    public final void rule__Process__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:365:1: ( ( ( rule__Process__NameAssignment_1 ) ) )
            // InternalSimplePDL.g:366:1: ( ( rule__Process__NameAssignment_1 ) )
            {
            // InternalSimplePDL.g:366:1: ( ( rule__Process__NameAssignment_1 ) )
            // InternalSimplePDL.g:367:2: ( rule__Process__NameAssignment_1 )
            {
             before(grammarAccess.getProcessAccess().getNameAssignment_1()); 
            // InternalSimplePDL.g:368:2: ( rule__Process__NameAssignment_1 )
            // InternalSimplePDL.g:368:3: rule__Process__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Process__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Process__Group__1__Impl"


    // $ANTLR start "rule__Process__Group__2"
    // InternalSimplePDL.g:376:1: rule__Process__Group__2 : rule__Process__Group__2__Impl rule__Process__Group__3 ;
    public final void rule__Process__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:380:1: ( rule__Process__Group__2__Impl rule__Process__Group__3 )
            // InternalSimplePDL.g:381:2: rule__Process__Group__2__Impl rule__Process__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Process__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__3();

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
    // $ANTLR end "rule__Process__Group__2"


    // $ANTLR start "rule__Process__Group__2__Impl"
    // InternalSimplePDL.g:388:1: rule__Process__Group__2__Impl : ( '{' ) ;
    public final void rule__Process__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:392:1: ( ( '{' ) )
            // InternalSimplePDL.g:393:1: ( '{' )
            {
            // InternalSimplePDL.g:393:1: ( '{' )
            // InternalSimplePDL.g:394:2: '{'
            {
             before(grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Process__Group__2__Impl"


    // $ANTLR start "rule__Process__Group__3"
    // InternalSimplePDL.g:403:1: rule__Process__Group__3 : rule__Process__Group__3__Impl rule__Process__Group__4 ;
    public final void rule__Process__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:407:1: ( rule__Process__Group__3__Impl rule__Process__Group__4 )
            // InternalSimplePDL.g:408:2: rule__Process__Group__3__Impl rule__Process__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Process__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__4();

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
    // $ANTLR end "rule__Process__Group__3"


    // $ANTLR start "rule__Process__Group__3__Impl"
    // InternalSimplePDL.g:415:1: rule__Process__Group__3__Impl : ( ( rule__Process__Group_3__0 )? ) ;
    public final void rule__Process__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:419:1: ( ( ( rule__Process__Group_3__0 )? ) )
            // InternalSimplePDL.g:420:1: ( ( rule__Process__Group_3__0 )? )
            {
            // InternalSimplePDL.g:420:1: ( ( rule__Process__Group_3__0 )? )
            // InternalSimplePDL.g:421:2: ( rule__Process__Group_3__0 )?
            {
             before(grammarAccess.getProcessAccess().getGroup_3()); 
            // InternalSimplePDL.g:422:2: ( rule__Process__Group_3__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==19) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalSimplePDL.g:422:3: rule__Process__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Process__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProcessAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Process__Group__3__Impl"


    // $ANTLR start "rule__Process__Group__4"
    // InternalSimplePDL.g:430:1: rule__Process__Group__4 : rule__Process__Group__4__Impl rule__Process__Group__5 ;
    public final void rule__Process__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:434:1: ( rule__Process__Group__4__Impl rule__Process__Group__5 )
            // InternalSimplePDL.g:435:2: rule__Process__Group__4__Impl rule__Process__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__Process__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__5();

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
    // $ANTLR end "rule__Process__Group__4"


    // $ANTLR start "rule__Process__Group__4__Impl"
    // InternalSimplePDL.g:442:1: rule__Process__Group__4__Impl : ( ( rule__Process__Group_4__0 )? ) ;
    public final void rule__Process__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:446:1: ( ( ( rule__Process__Group_4__0 )? ) )
            // InternalSimplePDL.g:447:1: ( ( rule__Process__Group_4__0 )? )
            {
            // InternalSimplePDL.g:447:1: ( ( rule__Process__Group_4__0 )? )
            // InternalSimplePDL.g:448:2: ( rule__Process__Group_4__0 )?
            {
             before(grammarAccess.getProcessAccess().getGroup_4()); 
            // InternalSimplePDL.g:449:2: ( rule__Process__Group_4__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==21) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSimplePDL.g:449:3: rule__Process__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Process__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProcessAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Process__Group__4__Impl"


    // $ANTLR start "rule__Process__Group__5"
    // InternalSimplePDL.g:457:1: rule__Process__Group__5 : rule__Process__Group__5__Impl rule__Process__Group__6 ;
    public final void rule__Process__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:461:1: ( rule__Process__Group__5__Impl rule__Process__Group__6 )
            // InternalSimplePDL.g:462:2: rule__Process__Group__5__Impl rule__Process__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__Process__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__6();

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
    // $ANTLR end "rule__Process__Group__5"


    // $ANTLR start "rule__Process__Group__5__Impl"
    // InternalSimplePDL.g:469:1: rule__Process__Group__5__Impl : ( ( rule__Process__Group_5__0 )? ) ;
    public final void rule__Process__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:473:1: ( ( ( rule__Process__Group_5__0 )? ) )
            // InternalSimplePDL.g:474:1: ( ( rule__Process__Group_5__0 )? )
            {
            // InternalSimplePDL.g:474:1: ( ( rule__Process__Group_5__0 )? )
            // InternalSimplePDL.g:475:2: ( rule__Process__Group_5__0 )?
            {
             before(grammarAccess.getProcessAccess().getGroup_5()); 
            // InternalSimplePDL.g:476:2: ( rule__Process__Group_5__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==22) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSimplePDL.g:476:3: rule__Process__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Process__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProcessAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Process__Group__5__Impl"


    // $ANTLR start "rule__Process__Group__6"
    // InternalSimplePDL.g:484:1: rule__Process__Group__6 : rule__Process__Group__6__Impl rule__Process__Group__7 ;
    public final void rule__Process__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:488:1: ( rule__Process__Group__6__Impl rule__Process__Group__7 )
            // InternalSimplePDL.g:489:2: rule__Process__Group__6__Impl rule__Process__Group__7
            {
            pushFollow(FOLLOW_4);
            rule__Process__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__7();

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
    // $ANTLR end "rule__Process__Group__6"


    // $ANTLR start "rule__Process__Group__6__Impl"
    // InternalSimplePDL.g:496:1: rule__Process__Group__6__Impl : ( 'workdefinition' ) ;
    public final void rule__Process__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:500:1: ( ( 'workdefinition' ) )
            // InternalSimplePDL.g:501:1: ( 'workdefinition' )
            {
            // InternalSimplePDL.g:501:1: ( 'workdefinition' )
            // InternalSimplePDL.g:502:2: 'workdefinition'
            {
             before(grammarAccess.getProcessAccess().getWorkdefinitionKeyword_6()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getWorkdefinitionKeyword_6()); 

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
    // $ANTLR end "rule__Process__Group__6__Impl"


    // $ANTLR start "rule__Process__Group__7"
    // InternalSimplePDL.g:511:1: rule__Process__Group__7 : rule__Process__Group__7__Impl rule__Process__Group__8 ;
    public final void rule__Process__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:515:1: ( rule__Process__Group__7__Impl rule__Process__Group__8 )
            // InternalSimplePDL.g:516:2: rule__Process__Group__7__Impl rule__Process__Group__8
            {
            pushFollow(FOLLOW_6);
            rule__Process__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__8();

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
    // $ANTLR end "rule__Process__Group__7"


    // $ANTLR start "rule__Process__Group__7__Impl"
    // InternalSimplePDL.g:523:1: rule__Process__Group__7__Impl : ( '{' ) ;
    public final void rule__Process__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:527:1: ( ( '{' ) )
            // InternalSimplePDL.g:528:1: ( '{' )
            {
            // InternalSimplePDL.g:528:1: ( '{' )
            // InternalSimplePDL.g:529:2: '{'
            {
             before(grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__Process__Group__7__Impl"


    // $ANTLR start "rule__Process__Group__8"
    // InternalSimplePDL.g:538:1: rule__Process__Group__8 : rule__Process__Group__8__Impl rule__Process__Group__9 ;
    public final void rule__Process__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:542:1: ( rule__Process__Group__8__Impl rule__Process__Group__9 )
            // InternalSimplePDL.g:543:2: rule__Process__Group__8__Impl rule__Process__Group__9
            {
            pushFollow(FOLLOW_7);
            rule__Process__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__9();

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
    // $ANTLR end "rule__Process__Group__8"


    // $ANTLR start "rule__Process__Group__8__Impl"
    // InternalSimplePDL.g:550:1: rule__Process__Group__8__Impl : ( ( rule__Process__WorkdefinitionAssignment_8 ) ) ;
    public final void rule__Process__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:554:1: ( ( ( rule__Process__WorkdefinitionAssignment_8 ) ) )
            // InternalSimplePDL.g:555:1: ( ( rule__Process__WorkdefinitionAssignment_8 ) )
            {
            // InternalSimplePDL.g:555:1: ( ( rule__Process__WorkdefinitionAssignment_8 ) )
            // InternalSimplePDL.g:556:2: ( rule__Process__WorkdefinitionAssignment_8 )
            {
             before(grammarAccess.getProcessAccess().getWorkdefinitionAssignment_8()); 
            // InternalSimplePDL.g:557:2: ( rule__Process__WorkdefinitionAssignment_8 )
            // InternalSimplePDL.g:557:3: rule__Process__WorkdefinitionAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Process__WorkdefinitionAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getWorkdefinitionAssignment_8()); 

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
    // $ANTLR end "rule__Process__Group__8__Impl"


    // $ANTLR start "rule__Process__Group__9"
    // InternalSimplePDL.g:565:1: rule__Process__Group__9 : rule__Process__Group__9__Impl rule__Process__Group__10 ;
    public final void rule__Process__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:569:1: ( rule__Process__Group__9__Impl rule__Process__Group__10 )
            // InternalSimplePDL.g:570:2: rule__Process__Group__9__Impl rule__Process__Group__10
            {
            pushFollow(FOLLOW_7);
            rule__Process__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__10();

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
    // $ANTLR end "rule__Process__Group__9"


    // $ANTLR start "rule__Process__Group__9__Impl"
    // InternalSimplePDL.g:577:1: rule__Process__Group__9__Impl : ( ( rule__Process__Group_9__0 )* ) ;
    public final void rule__Process__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:581:1: ( ( ( rule__Process__Group_9__0 )* ) )
            // InternalSimplePDL.g:582:1: ( ( rule__Process__Group_9__0 )* )
            {
            // InternalSimplePDL.g:582:1: ( ( rule__Process__Group_9__0 )* )
            // InternalSimplePDL.g:583:2: ( rule__Process__Group_9__0 )*
            {
             before(grammarAccess.getProcessAccess().getGroup_9()); 
            // InternalSimplePDL.g:584:2: ( rule__Process__Group_9__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==20) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSimplePDL.g:584:3: rule__Process__Group_9__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Process__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getProcessAccess().getGroup_9()); 

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
    // $ANTLR end "rule__Process__Group__9__Impl"


    // $ANTLR start "rule__Process__Group__10"
    // InternalSimplePDL.g:592:1: rule__Process__Group__10 : rule__Process__Group__10__Impl rule__Process__Group__11 ;
    public final void rule__Process__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:596:1: ( rule__Process__Group__10__Impl rule__Process__Group__11 )
            // InternalSimplePDL.g:597:2: rule__Process__Group__10__Impl rule__Process__Group__11
            {
            pushFollow(FOLLOW_9);
            rule__Process__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__11();

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
    // $ANTLR end "rule__Process__Group__10"


    // $ANTLR start "rule__Process__Group__10__Impl"
    // InternalSimplePDL.g:604:1: rule__Process__Group__10__Impl : ( '}' ) ;
    public final void rule__Process__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:608:1: ( ( '}' ) )
            // InternalSimplePDL.g:609:1: ( '}' )
            {
            // InternalSimplePDL.g:609:1: ( '}' )
            // InternalSimplePDL.g:610:2: '}'
            {
             before(grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_10()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_10()); 

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
    // $ANTLR end "rule__Process__Group__10__Impl"


    // $ANTLR start "rule__Process__Group__11"
    // InternalSimplePDL.g:619:1: rule__Process__Group__11 : rule__Process__Group__11__Impl ;
    public final void rule__Process__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:623:1: ( rule__Process__Group__11__Impl )
            // InternalSimplePDL.g:624:2: rule__Process__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group__11__Impl();

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
    // $ANTLR end "rule__Process__Group__11"


    // $ANTLR start "rule__Process__Group__11__Impl"
    // InternalSimplePDL.g:630:1: rule__Process__Group__11__Impl : ( '}' ) ;
    public final void rule__Process__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:634:1: ( ( '}' ) )
            // InternalSimplePDL.g:635:1: ( '}' )
            {
            // InternalSimplePDL.g:635:1: ( '}' )
            // InternalSimplePDL.g:636:2: '}'
            {
             before(grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_11()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_11()); 

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
    // $ANTLR end "rule__Process__Group__11__Impl"


    // $ANTLR start "rule__Process__Group_3__0"
    // InternalSimplePDL.g:646:1: rule__Process__Group_3__0 : rule__Process__Group_3__0__Impl rule__Process__Group_3__1 ;
    public final void rule__Process__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:650:1: ( rule__Process__Group_3__0__Impl rule__Process__Group_3__1 )
            // InternalSimplePDL.g:651:2: rule__Process__Group_3__0__Impl rule__Process__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Process__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_3__1();

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
    // $ANTLR end "rule__Process__Group_3__0"


    // $ANTLR start "rule__Process__Group_3__0__Impl"
    // InternalSimplePDL.g:658:1: rule__Process__Group_3__0__Impl : ( 'worksequence' ) ;
    public final void rule__Process__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:662:1: ( ( 'worksequence' ) )
            // InternalSimplePDL.g:663:1: ( 'worksequence' )
            {
            // InternalSimplePDL.g:663:1: ( 'worksequence' )
            // InternalSimplePDL.g:664:2: 'worksequence'
            {
             before(grammarAccess.getProcessAccess().getWorksequenceKeyword_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getWorksequenceKeyword_3_0()); 

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
    // $ANTLR end "rule__Process__Group_3__0__Impl"


    // $ANTLR start "rule__Process__Group_3__1"
    // InternalSimplePDL.g:673:1: rule__Process__Group_3__1 : rule__Process__Group_3__1__Impl rule__Process__Group_3__2 ;
    public final void rule__Process__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:677:1: ( rule__Process__Group_3__1__Impl rule__Process__Group_3__2 )
            // InternalSimplePDL.g:678:2: rule__Process__Group_3__1__Impl rule__Process__Group_3__2
            {
            pushFollow(FOLLOW_10);
            rule__Process__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_3__2();

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
    // $ANTLR end "rule__Process__Group_3__1"


    // $ANTLR start "rule__Process__Group_3__1__Impl"
    // InternalSimplePDL.g:685:1: rule__Process__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Process__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:689:1: ( ( '{' ) )
            // InternalSimplePDL.g:690:1: ( '{' )
            {
            // InternalSimplePDL.g:690:1: ( '{' )
            // InternalSimplePDL.g:691:2: '{'
            {
             before(grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_3_1()); 

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
    // $ANTLR end "rule__Process__Group_3__1__Impl"


    // $ANTLR start "rule__Process__Group_3__2"
    // InternalSimplePDL.g:700:1: rule__Process__Group_3__2 : rule__Process__Group_3__2__Impl rule__Process__Group_3__3 ;
    public final void rule__Process__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:704:1: ( rule__Process__Group_3__2__Impl rule__Process__Group_3__3 )
            // InternalSimplePDL.g:705:2: rule__Process__Group_3__2__Impl rule__Process__Group_3__3
            {
            pushFollow(FOLLOW_7);
            rule__Process__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_3__3();

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
    // $ANTLR end "rule__Process__Group_3__2"


    // $ANTLR start "rule__Process__Group_3__2__Impl"
    // InternalSimplePDL.g:712:1: rule__Process__Group_3__2__Impl : ( ( rule__Process__WorksequenceAssignment_3_2 ) ) ;
    public final void rule__Process__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:716:1: ( ( ( rule__Process__WorksequenceAssignment_3_2 ) ) )
            // InternalSimplePDL.g:717:1: ( ( rule__Process__WorksequenceAssignment_3_2 ) )
            {
            // InternalSimplePDL.g:717:1: ( ( rule__Process__WorksequenceAssignment_3_2 ) )
            // InternalSimplePDL.g:718:2: ( rule__Process__WorksequenceAssignment_3_2 )
            {
             before(grammarAccess.getProcessAccess().getWorksequenceAssignment_3_2()); 
            // InternalSimplePDL.g:719:2: ( rule__Process__WorksequenceAssignment_3_2 )
            // InternalSimplePDL.g:719:3: rule__Process__WorksequenceAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Process__WorksequenceAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getWorksequenceAssignment_3_2()); 

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
    // $ANTLR end "rule__Process__Group_3__2__Impl"


    // $ANTLR start "rule__Process__Group_3__3"
    // InternalSimplePDL.g:727:1: rule__Process__Group_3__3 : rule__Process__Group_3__3__Impl rule__Process__Group_3__4 ;
    public final void rule__Process__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:731:1: ( rule__Process__Group_3__3__Impl rule__Process__Group_3__4 )
            // InternalSimplePDL.g:732:2: rule__Process__Group_3__3__Impl rule__Process__Group_3__4
            {
            pushFollow(FOLLOW_7);
            rule__Process__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_3__4();

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
    // $ANTLR end "rule__Process__Group_3__3"


    // $ANTLR start "rule__Process__Group_3__3__Impl"
    // InternalSimplePDL.g:739:1: rule__Process__Group_3__3__Impl : ( ( rule__Process__Group_3_3__0 )* ) ;
    public final void rule__Process__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:743:1: ( ( ( rule__Process__Group_3_3__0 )* ) )
            // InternalSimplePDL.g:744:1: ( ( rule__Process__Group_3_3__0 )* )
            {
            // InternalSimplePDL.g:744:1: ( ( rule__Process__Group_3_3__0 )* )
            // InternalSimplePDL.g:745:2: ( rule__Process__Group_3_3__0 )*
            {
             before(grammarAccess.getProcessAccess().getGroup_3_3()); 
            // InternalSimplePDL.g:746:2: ( rule__Process__Group_3_3__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==20) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSimplePDL.g:746:3: rule__Process__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Process__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getProcessAccess().getGroup_3_3()); 

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
    // $ANTLR end "rule__Process__Group_3__3__Impl"


    // $ANTLR start "rule__Process__Group_3__4"
    // InternalSimplePDL.g:754:1: rule__Process__Group_3__4 : rule__Process__Group_3__4__Impl ;
    public final void rule__Process__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:758:1: ( rule__Process__Group_3__4__Impl )
            // InternalSimplePDL.g:759:2: rule__Process__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group_3__4__Impl();

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
    // $ANTLR end "rule__Process__Group_3__4"


    // $ANTLR start "rule__Process__Group_3__4__Impl"
    // InternalSimplePDL.g:765:1: rule__Process__Group_3__4__Impl : ( '}' ) ;
    public final void rule__Process__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:769:1: ( ( '}' ) )
            // InternalSimplePDL.g:770:1: ( '}' )
            {
            // InternalSimplePDL.g:770:1: ( '}' )
            // InternalSimplePDL.g:771:2: '}'
            {
             before(grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_3_4()); 

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
    // $ANTLR end "rule__Process__Group_3__4__Impl"


    // $ANTLR start "rule__Process__Group_3_3__0"
    // InternalSimplePDL.g:781:1: rule__Process__Group_3_3__0 : rule__Process__Group_3_3__0__Impl rule__Process__Group_3_3__1 ;
    public final void rule__Process__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:785:1: ( rule__Process__Group_3_3__0__Impl rule__Process__Group_3_3__1 )
            // InternalSimplePDL.g:786:2: rule__Process__Group_3_3__0__Impl rule__Process__Group_3_3__1
            {
            pushFollow(FOLLOW_10);
            rule__Process__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_3_3__1();

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
    // $ANTLR end "rule__Process__Group_3_3__0"


    // $ANTLR start "rule__Process__Group_3_3__0__Impl"
    // InternalSimplePDL.g:793:1: rule__Process__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__Process__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:797:1: ( ( ',' ) )
            // InternalSimplePDL.g:798:1: ( ',' )
            {
            // InternalSimplePDL.g:798:1: ( ',' )
            // InternalSimplePDL.g:799:2: ','
            {
             before(grammarAccess.getProcessAccess().getCommaKeyword_3_3_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getCommaKeyword_3_3_0()); 

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
    // $ANTLR end "rule__Process__Group_3_3__0__Impl"


    // $ANTLR start "rule__Process__Group_3_3__1"
    // InternalSimplePDL.g:808:1: rule__Process__Group_3_3__1 : rule__Process__Group_3_3__1__Impl ;
    public final void rule__Process__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:812:1: ( rule__Process__Group_3_3__1__Impl )
            // InternalSimplePDL.g:813:2: rule__Process__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group_3_3__1__Impl();

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
    // $ANTLR end "rule__Process__Group_3_3__1"


    // $ANTLR start "rule__Process__Group_3_3__1__Impl"
    // InternalSimplePDL.g:819:1: rule__Process__Group_3_3__1__Impl : ( ( rule__Process__WorksequenceAssignment_3_3_1 ) ) ;
    public final void rule__Process__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:823:1: ( ( ( rule__Process__WorksequenceAssignment_3_3_1 ) ) )
            // InternalSimplePDL.g:824:1: ( ( rule__Process__WorksequenceAssignment_3_3_1 ) )
            {
            // InternalSimplePDL.g:824:1: ( ( rule__Process__WorksequenceAssignment_3_3_1 ) )
            // InternalSimplePDL.g:825:2: ( rule__Process__WorksequenceAssignment_3_3_1 )
            {
             before(grammarAccess.getProcessAccess().getWorksequenceAssignment_3_3_1()); 
            // InternalSimplePDL.g:826:2: ( rule__Process__WorksequenceAssignment_3_3_1 )
            // InternalSimplePDL.g:826:3: rule__Process__WorksequenceAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Process__WorksequenceAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getWorksequenceAssignment_3_3_1()); 

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
    // $ANTLR end "rule__Process__Group_3_3__1__Impl"


    // $ANTLR start "rule__Process__Group_4__0"
    // InternalSimplePDL.g:835:1: rule__Process__Group_4__0 : rule__Process__Group_4__0__Impl rule__Process__Group_4__1 ;
    public final void rule__Process__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:839:1: ( rule__Process__Group_4__0__Impl rule__Process__Group_4__1 )
            // InternalSimplePDL.g:840:2: rule__Process__Group_4__0__Impl rule__Process__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Process__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_4__1();

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
    // $ANTLR end "rule__Process__Group_4__0"


    // $ANTLR start "rule__Process__Group_4__0__Impl"
    // InternalSimplePDL.g:847:1: rule__Process__Group_4__0__Impl : ( 'guidance' ) ;
    public final void rule__Process__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:851:1: ( ( 'guidance' ) )
            // InternalSimplePDL.g:852:1: ( 'guidance' )
            {
            // InternalSimplePDL.g:852:1: ( 'guidance' )
            // InternalSimplePDL.g:853:2: 'guidance'
            {
             before(grammarAccess.getProcessAccess().getGuidanceKeyword_4_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getGuidanceKeyword_4_0()); 

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
    // $ANTLR end "rule__Process__Group_4__0__Impl"


    // $ANTLR start "rule__Process__Group_4__1"
    // InternalSimplePDL.g:862:1: rule__Process__Group_4__1 : rule__Process__Group_4__1__Impl rule__Process__Group_4__2 ;
    public final void rule__Process__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:866:1: ( rule__Process__Group_4__1__Impl rule__Process__Group_4__2 )
            // InternalSimplePDL.g:867:2: rule__Process__Group_4__1__Impl rule__Process__Group_4__2
            {
            pushFollow(FOLLOW_11);
            rule__Process__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_4__2();

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
    // $ANTLR end "rule__Process__Group_4__1"


    // $ANTLR start "rule__Process__Group_4__1__Impl"
    // InternalSimplePDL.g:874:1: rule__Process__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Process__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:878:1: ( ( '{' ) )
            // InternalSimplePDL.g:879:1: ( '{' )
            {
            // InternalSimplePDL.g:879:1: ( '{' )
            // InternalSimplePDL.g:880:2: '{'
            {
             before(grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_4_1()); 

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
    // $ANTLR end "rule__Process__Group_4__1__Impl"


    // $ANTLR start "rule__Process__Group_4__2"
    // InternalSimplePDL.g:889:1: rule__Process__Group_4__2 : rule__Process__Group_4__2__Impl rule__Process__Group_4__3 ;
    public final void rule__Process__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:893:1: ( rule__Process__Group_4__2__Impl rule__Process__Group_4__3 )
            // InternalSimplePDL.g:894:2: rule__Process__Group_4__2__Impl rule__Process__Group_4__3
            {
            pushFollow(FOLLOW_7);
            rule__Process__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_4__3();

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
    // $ANTLR end "rule__Process__Group_4__2"


    // $ANTLR start "rule__Process__Group_4__2__Impl"
    // InternalSimplePDL.g:901:1: rule__Process__Group_4__2__Impl : ( ( rule__Process__GuidanceAssignment_4_2 ) ) ;
    public final void rule__Process__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:905:1: ( ( ( rule__Process__GuidanceAssignment_4_2 ) ) )
            // InternalSimplePDL.g:906:1: ( ( rule__Process__GuidanceAssignment_4_2 ) )
            {
            // InternalSimplePDL.g:906:1: ( ( rule__Process__GuidanceAssignment_4_2 ) )
            // InternalSimplePDL.g:907:2: ( rule__Process__GuidanceAssignment_4_2 )
            {
             before(grammarAccess.getProcessAccess().getGuidanceAssignment_4_2()); 
            // InternalSimplePDL.g:908:2: ( rule__Process__GuidanceAssignment_4_2 )
            // InternalSimplePDL.g:908:3: rule__Process__GuidanceAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Process__GuidanceAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getGuidanceAssignment_4_2()); 

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
    // $ANTLR end "rule__Process__Group_4__2__Impl"


    // $ANTLR start "rule__Process__Group_4__3"
    // InternalSimplePDL.g:916:1: rule__Process__Group_4__3 : rule__Process__Group_4__3__Impl rule__Process__Group_4__4 ;
    public final void rule__Process__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:920:1: ( rule__Process__Group_4__3__Impl rule__Process__Group_4__4 )
            // InternalSimplePDL.g:921:2: rule__Process__Group_4__3__Impl rule__Process__Group_4__4
            {
            pushFollow(FOLLOW_7);
            rule__Process__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_4__4();

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
    // $ANTLR end "rule__Process__Group_4__3"


    // $ANTLR start "rule__Process__Group_4__3__Impl"
    // InternalSimplePDL.g:928:1: rule__Process__Group_4__3__Impl : ( ( rule__Process__Group_4_3__0 )* ) ;
    public final void rule__Process__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:932:1: ( ( ( rule__Process__Group_4_3__0 )* ) )
            // InternalSimplePDL.g:933:1: ( ( rule__Process__Group_4_3__0 )* )
            {
            // InternalSimplePDL.g:933:1: ( ( rule__Process__Group_4_3__0 )* )
            // InternalSimplePDL.g:934:2: ( rule__Process__Group_4_3__0 )*
            {
             before(grammarAccess.getProcessAccess().getGroup_4_3()); 
            // InternalSimplePDL.g:935:2: ( rule__Process__Group_4_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==20) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSimplePDL.g:935:3: rule__Process__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Process__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getProcessAccess().getGroup_4_3()); 

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
    // $ANTLR end "rule__Process__Group_4__3__Impl"


    // $ANTLR start "rule__Process__Group_4__4"
    // InternalSimplePDL.g:943:1: rule__Process__Group_4__4 : rule__Process__Group_4__4__Impl ;
    public final void rule__Process__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:947:1: ( rule__Process__Group_4__4__Impl )
            // InternalSimplePDL.g:948:2: rule__Process__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group_4__4__Impl();

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
    // $ANTLR end "rule__Process__Group_4__4"


    // $ANTLR start "rule__Process__Group_4__4__Impl"
    // InternalSimplePDL.g:954:1: rule__Process__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Process__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:958:1: ( ( '}' ) )
            // InternalSimplePDL.g:959:1: ( '}' )
            {
            // InternalSimplePDL.g:959:1: ( '}' )
            // InternalSimplePDL.g:960:2: '}'
            {
             before(grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_4_4()); 

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
    // $ANTLR end "rule__Process__Group_4__4__Impl"


    // $ANTLR start "rule__Process__Group_4_3__0"
    // InternalSimplePDL.g:970:1: rule__Process__Group_4_3__0 : rule__Process__Group_4_3__0__Impl rule__Process__Group_4_3__1 ;
    public final void rule__Process__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:974:1: ( rule__Process__Group_4_3__0__Impl rule__Process__Group_4_3__1 )
            // InternalSimplePDL.g:975:2: rule__Process__Group_4_3__0__Impl rule__Process__Group_4_3__1
            {
            pushFollow(FOLLOW_11);
            rule__Process__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_4_3__1();

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
    // $ANTLR end "rule__Process__Group_4_3__0"


    // $ANTLR start "rule__Process__Group_4_3__0__Impl"
    // InternalSimplePDL.g:982:1: rule__Process__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Process__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:986:1: ( ( ',' ) )
            // InternalSimplePDL.g:987:1: ( ',' )
            {
            // InternalSimplePDL.g:987:1: ( ',' )
            // InternalSimplePDL.g:988:2: ','
            {
             before(grammarAccess.getProcessAccess().getCommaKeyword_4_3_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getCommaKeyword_4_3_0()); 

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
    // $ANTLR end "rule__Process__Group_4_3__0__Impl"


    // $ANTLR start "rule__Process__Group_4_3__1"
    // InternalSimplePDL.g:997:1: rule__Process__Group_4_3__1 : rule__Process__Group_4_3__1__Impl ;
    public final void rule__Process__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1001:1: ( rule__Process__Group_4_3__1__Impl )
            // InternalSimplePDL.g:1002:2: rule__Process__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__Process__Group_4_3__1"


    // $ANTLR start "rule__Process__Group_4_3__1__Impl"
    // InternalSimplePDL.g:1008:1: rule__Process__Group_4_3__1__Impl : ( ( rule__Process__GuidanceAssignment_4_3_1 ) ) ;
    public final void rule__Process__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1012:1: ( ( ( rule__Process__GuidanceAssignment_4_3_1 ) ) )
            // InternalSimplePDL.g:1013:1: ( ( rule__Process__GuidanceAssignment_4_3_1 ) )
            {
            // InternalSimplePDL.g:1013:1: ( ( rule__Process__GuidanceAssignment_4_3_1 ) )
            // InternalSimplePDL.g:1014:2: ( rule__Process__GuidanceAssignment_4_3_1 )
            {
             before(grammarAccess.getProcessAccess().getGuidanceAssignment_4_3_1()); 
            // InternalSimplePDL.g:1015:2: ( rule__Process__GuidanceAssignment_4_3_1 )
            // InternalSimplePDL.g:1015:3: rule__Process__GuidanceAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Process__GuidanceAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getGuidanceAssignment_4_3_1()); 

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
    // $ANTLR end "rule__Process__Group_4_3__1__Impl"


    // $ANTLR start "rule__Process__Group_5__0"
    // InternalSimplePDL.g:1024:1: rule__Process__Group_5__0 : rule__Process__Group_5__0__Impl rule__Process__Group_5__1 ;
    public final void rule__Process__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1028:1: ( rule__Process__Group_5__0__Impl rule__Process__Group_5__1 )
            // InternalSimplePDL.g:1029:2: rule__Process__Group_5__0__Impl rule__Process__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__Process__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_5__1();

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
    // $ANTLR end "rule__Process__Group_5__0"


    // $ANTLR start "rule__Process__Group_5__0__Impl"
    // InternalSimplePDL.g:1036:1: rule__Process__Group_5__0__Impl : ( 'resource' ) ;
    public final void rule__Process__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1040:1: ( ( 'resource' ) )
            // InternalSimplePDL.g:1041:1: ( 'resource' )
            {
            // InternalSimplePDL.g:1041:1: ( 'resource' )
            // InternalSimplePDL.g:1042:2: 'resource'
            {
             before(grammarAccess.getProcessAccess().getResourceKeyword_5_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getResourceKeyword_5_0()); 

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
    // $ANTLR end "rule__Process__Group_5__0__Impl"


    // $ANTLR start "rule__Process__Group_5__1"
    // InternalSimplePDL.g:1051:1: rule__Process__Group_5__1 : rule__Process__Group_5__1__Impl rule__Process__Group_5__2 ;
    public final void rule__Process__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1055:1: ( rule__Process__Group_5__1__Impl rule__Process__Group_5__2 )
            // InternalSimplePDL.g:1056:2: rule__Process__Group_5__1__Impl rule__Process__Group_5__2
            {
            pushFollow(FOLLOW_12);
            rule__Process__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_5__2();

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
    // $ANTLR end "rule__Process__Group_5__1"


    // $ANTLR start "rule__Process__Group_5__1__Impl"
    // InternalSimplePDL.g:1063:1: rule__Process__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Process__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1067:1: ( ( '{' ) )
            // InternalSimplePDL.g:1068:1: ( '{' )
            {
            // InternalSimplePDL.g:1068:1: ( '{' )
            // InternalSimplePDL.g:1069:2: '{'
            {
             before(grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_5_1()); 

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
    // $ANTLR end "rule__Process__Group_5__1__Impl"


    // $ANTLR start "rule__Process__Group_5__2"
    // InternalSimplePDL.g:1078:1: rule__Process__Group_5__2 : rule__Process__Group_5__2__Impl rule__Process__Group_5__3 ;
    public final void rule__Process__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1082:1: ( rule__Process__Group_5__2__Impl rule__Process__Group_5__3 )
            // InternalSimplePDL.g:1083:2: rule__Process__Group_5__2__Impl rule__Process__Group_5__3
            {
            pushFollow(FOLLOW_7);
            rule__Process__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_5__3();

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
    // $ANTLR end "rule__Process__Group_5__2"


    // $ANTLR start "rule__Process__Group_5__2__Impl"
    // InternalSimplePDL.g:1090:1: rule__Process__Group_5__2__Impl : ( ( rule__Process__ResourceAssignment_5_2 ) ) ;
    public final void rule__Process__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1094:1: ( ( ( rule__Process__ResourceAssignment_5_2 ) ) )
            // InternalSimplePDL.g:1095:1: ( ( rule__Process__ResourceAssignment_5_2 ) )
            {
            // InternalSimplePDL.g:1095:1: ( ( rule__Process__ResourceAssignment_5_2 ) )
            // InternalSimplePDL.g:1096:2: ( rule__Process__ResourceAssignment_5_2 )
            {
             before(grammarAccess.getProcessAccess().getResourceAssignment_5_2()); 
            // InternalSimplePDL.g:1097:2: ( rule__Process__ResourceAssignment_5_2 )
            // InternalSimplePDL.g:1097:3: rule__Process__ResourceAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Process__ResourceAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getResourceAssignment_5_2()); 

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
    // $ANTLR end "rule__Process__Group_5__2__Impl"


    // $ANTLR start "rule__Process__Group_5__3"
    // InternalSimplePDL.g:1105:1: rule__Process__Group_5__3 : rule__Process__Group_5__3__Impl rule__Process__Group_5__4 ;
    public final void rule__Process__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1109:1: ( rule__Process__Group_5__3__Impl rule__Process__Group_5__4 )
            // InternalSimplePDL.g:1110:2: rule__Process__Group_5__3__Impl rule__Process__Group_5__4
            {
            pushFollow(FOLLOW_7);
            rule__Process__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_5__4();

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
    // $ANTLR end "rule__Process__Group_5__3"


    // $ANTLR start "rule__Process__Group_5__3__Impl"
    // InternalSimplePDL.g:1117:1: rule__Process__Group_5__3__Impl : ( ( rule__Process__Group_5_3__0 )* ) ;
    public final void rule__Process__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1121:1: ( ( ( rule__Process__Group_5_3__0 )* ) )
            // InternalSimplePDL.g:1122:1: ( ( rule__Process__Group_5_3__0 )* )
            {
            // InternalSimplePDL.g:1122:1: ( ( rule__Process__Group_5_3__0 )* )
            // InternalSimplePDL.g:1123:2: ( rule__Process__Group_5_3__0 )*
            {
             before(grammarAccess.getProcessAccess().getGroup_5_3()); 
            // InternalSimplePDL.g:1124:2: ( rule__Process__Group_5_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==20) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSimplePDL.g:1124:3: rule__Process__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Process__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getProcessAccess().getGroup_5_3()); 

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
    // $ANTLR end "rule__Process__Group_5__3__Impl"


    // $ANTLR start "rule__Process__Group_5__4"
    // InternalSimplePDL.g:1132:1: rule__Process__Group_5__4 : rule__Process__Group_5__4__Impl ;
    public final void rule__Process__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1136:1: ( rule__Process__Group_5__4__Impl )
            // InternalSimplePDL.g:1137:2: rule__Process__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group_5__4__Impl();

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
    // $ANTLR end "rule__Process__Group_5__4"


    // $ANTLR start "rule__Process__Group_5__4__Impl"
    // InternalSimplePDL.g:1143:1: rule__Process__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Process__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1147:1: ( ( '}' ) )
            // InternalSimplePDL.g:1148:1: ( '}' )
            {
            // InternalSimplePDL.g:1148:1: ( '}' )
            // InternalSimplePDL.g:1149:2: '}'
            {
             before(grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_5_4()); 

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
    // $ANTLR end "rule__Process__Group_5__4__Impl"


    // $ANTLR start "rule__Process__Group_5_3__0"
    // InternalSimplePDL.g:1159:1: rule__Process__Group_5_3__0 : rule__Process__Group_5_3__0__Impl rule__Process__Group_5_3__1 ;
    public final void rule__Process__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1163:1: ( rule__Process__Group_5_3__0__Impl rule__Process__Group_5_3__1 )
            // InternalSimplePDL.g:1164:2: rule__Process__Group_5_3__0__Impl rule__Process__Group_5_3__1
            {
            pushFollow(FOLLOW_12);
            rule__Process__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_5_3__1();

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
    // $ANTLR end "rule__Process__Group_5_3__0"


    // $ANTLR start "rule__Process__Group_5_3__0__Impl"
    // InternalSimplePDL.g:1171:1: rule__Process__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Process__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1175:1: ( ( ',' ) )
            // InternalSimplePDL.g:1176:1: ( ',' )
            {
            // InternalSimplePDL.g:1176:1: ( ',' )
            // InternalSimplePDL.g:1177:2: ','
            {
             before(grammarAccess.getProcessAccess().getCommaKeyword_5_3_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getCommaKeyword_5_3_0()); 

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
    // $ANTLR end "rule__Process__Group_5_3__0__Impl"


    // $ANTLR start "rule__Process__Group_5_3__1"
    // InternalSimplePDL.g:1186:1: rule__Process__Group_5_3__1 : rule__Process__Group_5_3__1__Impl ;
    public final void rule__Process__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1190:1: ( rule__Process__Group_5_3__1__Impl )
            // InternalSimplePDL.g:1191:2: rule__Process__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group_5_3__1__Impl();

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
    // $ANTLR end "rule__Process__Group_5_3__1"


    // $ANTLR start "rule__Process__Group_5_3__1__Impl"
    // InternalSimplePDL.g:1197:1: rule__Process__Group_5_3__1__Impl : ( ( rule__Process__ResourceAssignment_5_3_1 ) ) ;
    public final void rule__Process__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1201:1: ( ( ( rule__Process__ResourceAssignment_5_3_1 ) ) )
            // InternalSimplePDL.g:1202:1: ( ( rule__Process__ResourceAssignment_5_3_1 ) )
            {
            // InternalSimplePDL.g:1202:1: ( ( rule__Process__ResourceAssignment_5_3_1 ) )
            // InternalSimplePDL.g:1203:2: ( rule__Process__ResourceAssignment_5_3_1 )
            {
             before(grammarAccess.getProcessAccess().getResourceAssignment_5_3_1()); 
            // InternalSimplePDL.g:1204:2: ( rule__Process__ResourceAssignment_5_3_1 )
            // InternalSimplePDL.g:1204:3: rule__Process__ResourceAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Process__ResourceAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getResourceAssignment_5_3_1()); 

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
    // $ANTLR end "rule__Process__Group_5_3__1__Impl"


    // $ANTLR start "rule__Process__Group_9__0"
    // InternalSimplePDL.g:1213:1: rule__Process__Group_9__0 : rule__Process__Group_9__0__Impl rule__Process__Group_9__1 ;
    public final void rule__Process__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1217:1: ( rule__Process__Group_9__0__Impl rule__Process__Group_9__1 )
            // InternalSimplePDL.g:1218:2: rule__Process__Group_9__0__Impl rule__Process__Group_9__1
            {
            pushFollow(FOLLOW_6);
            rule__Process__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_9__1();

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
    // $ANTLR end "rule__Process__Group_9__0"


    // $ANTLR start "rule__Process__Group_9__0__Impl"
    // InternalSimplePDL.g:1225:1: rule__Process__Group_9__0__Impl : ( ',' ) ;
    public final void rule__Process__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1229:1: ( ( ',' ) )
            // InternalSimplePDL.g:1230:1: ( ',' )
            {
            // InternalSimplePDL.g:1230:1: ( ',' )
            // InternalSimplePDL.g:1231:2: ','
            {
             before(grammarAccess.getProcessAccess().getCommaKeyword_9_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getCommaKeyword_9_0()); 

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
    // $ANTLR end "rule__Process__Group_9__0__Impl"


    // $ANTLR start "rule__Process__Group_9__1"
    // InternalSimplePDL.g:1240:1: rule__Process__Group_9__1 : rule__Process__Group_9__1__Impl ;
    public final void rule__Process__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1244:1: ( rule__Process__Group_9__1__Impl )
            // InternalSimplePDL.g:1245:2: rule__Process__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group_9__1__Impl();

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
    // $ANTLR end "rule__Process__Group_9__1"


    // $ANTLR start "rule__Process__Group_9__1__Impl"
    // InternalSimplePDL.g:1251:1: rule__Process__Group_9__1__Impl : ( ( rule__Process__WorkdefinitionAssignment_9_1 ) ) ;
    public final void rule__Process__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1255:1: ( ( ( rule__Process__WorkdefinitionAssignment_9_1 ) ) )
            // InternalSimplePDL.g:1256:1: ( ( rule__Process__WorkdefinitionAssignment_9_1 ) )
            {
            // InternalSimplePDL.g:1256:1: ( ( rule__Process__WorkdefinitionAssignment_9_1 ) )
            // InternalSimplePDL.g:1257:2: ( rule__Process__WorkdefinitionAssignment_9_1 )
            {
             before(grammarAccess.getProcessAccess().getWorkdefinitionAssignment_9_1()); 
            // InternalSimplePDL.g:1258:2: ( rule__Process__WorkdefinitionAssignment_9_1 )
            // InternalSimplePDL.g:1258:3: rule__Process__WorkdefinitionAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__Process__WorkdefinitionAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getWorkdefinitionAssignment_9_1()); 

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
    // $ANTLR end "rule__Process__Group_9__1__Impl"


    // $ANTLR start "rule__WorkSequence__Group__0"
    // InternalSimplePDL.g:1267:1: rule__WorkSequence__Group__0 : rule__WorkSequence__Group__0__Impl rule__WorkSequence__Group__1 ;
    public final void rule__WorkSequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1271:1: ( rule__WorkSequence__Group__0__Impl rule__WorkSequence__Group__1 )
            // InternalSimplePDL.g:1272:2: rule__WorkSequence__Group__0__Impl rule__WorkSequence__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__WorkSequence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__1();

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
    // $ANTLR end "rule__WorkSequence__Group__0"


    // $ANTLR start "rule__WorkSequence__Group__0__Impl"
    // InternalSimplePDL.g:1279:1: rule__WorkSequence__Group__0__Impl : ( 'WorkSequence' ) ;
    public final void rule__WorkSequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1283:1: ( ( 'WorkSequence' ) )
            // InternalSimplePDL.g:1284:1: ( 'WorkSequence' )
            {
            // InternalSimplePDL.g:1284:1: ( 'WorkSequence' )
            // InternalSimplePDL.g:1285:2: 'WorkSequence'
            {
             before(grammarAccess.getWorkSequenceAccess().getWorkSequenceKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getWorkSequenceKeyword_0()); 

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
    // $ANTLR end "rule__WorkSequence__Group__0__Impl"


    // $ANTLR start "rule__WorkSequence__Group__1"
    // InternalSimplePDL.g:1294:1: rule__WorkSequence__Group__1 : rule__WorkSequence__Group__1__Impl rule__WorkSequence__Group__2 ;
    public final void rule__WorkSequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1298:1: ( rule__WorkSequence__Group__1__Impl rule__WorkSequence__Group__2 )
            // InternalSimplePDL.g:1299:2: rule__WorkSequence__Group__1__Impl rule__WorkSequence__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__WorkSequence__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__2();

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
    // $ANTLR end "rule__WorkSequence__Group__1"


    // $ANTLR start "rule__WorkSequence__Group__1__Impl"
    // InternalSimplePDL.g:1306:1: rule__WorkSequence__Group__1__Impl : ( '{' ) ;
    public final void rule__WorkSequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1310:1: ( ( '{' ) )
            // InternalSimplePDL.g:1311:1: ( '{' )
            {
            // InternalSimplePDL.g:1311:1: ( '{' )
            // InternalSimplePDL.g:1312:2: '{'
            {
             before(grammarAccess.getWorkSequenceAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__WorkSequence__Group__1__Impl"


    // $ANTLR start "rule__WorkSequence__Group__2"
    // InternalSimplePDL.g:1321:1: rule__WorkSequence__Group__2 : rule__WorkSequence__Group__2__Impl rule__WorkSequence__Group__3 ;
    public final void rule__WorkSequence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1325:1: ( rule__WorkSequence__Group__2__Impl rule__WorkSequence__Group__3 )
            // InternalSimplePDL.g:1326:2: rule__WorkSequence__Group__2__Impl rule__WorkSequence__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__WorkSequence__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__3();

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
    // $ANTLR end "rule__WorkSequence__Group__2"


    // $ANTLR start "rule__WorkSequence__Group__2__Impl"
    // InternalSimplePDL.g:1333:1: rule__WorkSequence__Group__2__Impl : ( ( rule__WorkSequence__Group_2__0 )? ) ;
    public final void rule__WorkSequence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1337:1: ( ( ( rule__WorkSequence__Group_2__0 )? ) )
            // InternalSimplePDL.g:1338:1: ( ( rule__WorkSequence__Group_2__0 )? )
            {
            // InternalSimplePDL.g:1338:1: ( ( rule__WorkSequence__Group_2__0 )? )
            // InternalSimplePDL.g:1339:2: ( rule__WorkSequence__Group_2__0 )?
            {
             before(grammarAccess.getWorkSequenceAccess().getGroup_2()); 
            // InternalSimplePDL.g:1340:2: ( rule__WorkSequence__Group_2__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSimplePDL.g:1340:3: rule__WorkSequence__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__WorkSequence__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWorkSequenceAccess().getGroup_2()); 

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
    // $ANTLR end "rule__WorkSequence__Group__2__Impl"


    // $ANTLR start "rule__WorkSequence__Group__3"
    // InternalSimplePDL.g:1348:1: rule__WorkSequence__Group__3 : rule__WorkSequence__Group__3__Impl rule__WorkSequence__Group__4 ;
    public final void rule__WorkSequence__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1352:1: ( rule__WorkSequence__Group__3__Impl rule__WorkSequence__Group__4 )
            // InternalSimplePDL.g:1353:2: rule__WorkSequence__Group__3__Impl rule__WorkSequence__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__WorkSequence__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__4();

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
    // $ANTLR end "rule__WorkSequence__Group__3"


    // $ANTLR start "rule__WorkSequence__Group__3__Impl"
    // InternalSimplePDL.g:1360:1: rule__WorkSequence__Group__3__Impl : ( 'predecessor' ) ;
    public final void rule__WorkSequence__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1364:1: ( ( 'predecessor' ) )
            // InternalSimplePDL.g:1365:1: ( 'predecessor' )
            {
            // InternalSimplePDL.g:1365:1: ( 'predecessor' )
            // InternalSimplePDL.g:1366:2: 'predecessor'
            {
             before(grammarAccess.getWorkSequenceAccess().getPredecessorKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getPredecessorKeyword_3()); 

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
    // $ANTLR end "rule__WorkSequence__Group__3__Impl"


    // $ANTLR start "rule__WorkSequence__Group__4"
    // InternalSimplePDL.g:1375:1: rule__WorkSequence__Group__4 : rule__WorkSequence__Group__4__Impl rule__WorkSequence__Group__5 ;
    public final void rule__WorkSequence__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1379:1: ( rule__WorkSequence__Group__4__Impl rule__WorkSequence__Group__5 )
            // InternalSimplePDL.g:1380:2: rule__WorkSequence__Group__4__Impl rule__WorkSequence__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__WorkSequence__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__5();

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
    // $ANTLR end "rule__WorkSequence__Group__4"


    // $ANTLR start "rule__WorkSequence__Group__4__Impl"
    // InternalSimplePDL.g:1387:1: rule__WorkSequence__Group__4__Impl : ( ( rule__WorkSequence__PredecessorAssignment_4 ) ) ;
    public final void rule__WorkSequence__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1391:1: ( ( ( rule__WorkSequence__PredecessorAssignment_4 ) ) )
            // InternalSimplePDL.g:1392:1: ( ( rule__WorkSequence__PredecessorAssignment_4 ) )
            {
            // InternalSimplePDL.g:1392:1: ( ( rule__WorkSequence__PredecessorAssignment_4 ) )
            // InternalSimplePDL.g:1393:2: ( rule__WorkSequence__PredecessorAssignment_4 )
            {
             before(grammarAccess.getWorkSequenceAccess().getPredecessorAssignment_4()); 
            // InternalSimplePDL.g:1394:2: ( rule__WorkSequence__PredecessorAssignment_4 )
            // InternalSimplePDL.g:1394:3: rule__WorkSequence__PredecessorAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__PredecessorAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getPredecessorAssignment_4()); 

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
    // $ANTLR end "rule__WorkSequence__Group__4__Impl"


    // $ANTLR start "rule__WorkSequence__Group__5"
    // InternalSimplePDL.g:1402:1: rule__WorkSequence__Group__5 : rule__WorkSequence__Group__5__Impl rule__WorkSequence__Group__6 ;
    public final void rule__WorkSequence__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1406:1: ( rule__WorkSequence__Group__5__Impl rule__WorkSequence__Group__6 )
            // InternalSimplePDL.g:1407:2: rule__WorkSequence__Group__5__Impl rule__WorkSequence__Group__6
            {
            pushFollow(FOLLOW_3);
            rule__WorkSequence__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__6();

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
    // $ANTLR end "rule__WorkSequence__Group__5"


    // $ANTLR start "rule__WorkSequence__Group__5__Impl"
    // InternalSimplePDL.g:1414:1: rule__WorkSequence__Group__5__Impl : ( 'successor' ) ;
    public final void rule__WorkSequence__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1418:1: ( ( 'successor' ) )
            // InternalSimplePDL.g:1419:1: ( 'successor' )
            {
            // InternalSimplePDL.g:1419:1: ( 'successor' )
            // InternalSimplePDL.g:1420:2: 'successor'
            {
             before(grammarAccess.getWorkSequenceAccess().getSuccessorKeyword_5()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getSuccessorKeyword_5()); 

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
    // $ANTLR end "rule__WorkSequence__Group__5__Impl"


    // $ANTLR start "rule__WorkSequence__Group__6"
    // InternalSimplePDL.g:1429:1: rule__WorkSequence__Group__6 : rule__WorkSequence__Group__6__Impl rule__WorkSequence__Group__7 ;
    public final void rule__WorkSequence__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1433:1: ( rule__WorkSequence__Group__6__Impl rule__WorkSequence__Group__7 )
            // InternalSimplePDL.g:1434:2: rule__WorkSequence__Group__6__Impl rule__WorkSequence__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__WorkSequence__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__7();

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
    // $ANTLR end "rule__WorkSequence__Group__6"


    // $ANTLR start "rule__WorkSequence__Group__6__Impl"
    // InternalSimplePDL.g:1441:1: rule__WorkSequence__Group__6__Impl : ( ( rule__WorkSequence__SuccessorAssignment_6 ) ) ;
    public final void rule__WorkSequence__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1445:1: ( ( ( rule__WorkSequence__SuccessorAssignment_6 ) ) )
            // InternalSimplePDL.g:1446:1: ( ( rule__WorkSequence__SuccessorAssignment_6 ) )
            {
            // InternalSimplePDL.g:1446:1: ( ( rule__WorkSequence__SuccessorAssignment_6 ) )
            // InternalSimplePDL.g:1447:2: ( rule__WorkSequence__SuccessorAssignment_6 )
            {
             before(grammarAccess.getWorkSequenceAccess().getSuccessorAssignment_6()); 
            // InternalSimplePDL.g:1448:2: ( rule__WorkSequence__SuccessorAssignment_6 )
            // InternalSimplePDL.g:1448:3: rule__WorkSequence__SuccessorAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__SuccessorAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getSuccessorAssignment_6()); 

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
    // $ANTLR end "rule__WorkSequence__Group__6__Impl"


    // $ANTLR start "rule__WorkSequence__Group__7"
    // InternalSimplePDL.g:1456:1: rule__WorkSequence__Group__7 : rule__WorkSequence__Group__7__Impl ;
    public final void rule__WorkSequence__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1460:1: ( rule__WorkSequence__Group__7__Impl )
            // InternalSimplePDL.g:1461:2: rule__WorkSequence__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__7__Impl();

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
    // $ANTLR end "rule__WorkSequence__Group__7"


    // $ANTLR start "rule__WorkSequence__Group__7__Impl"
    // InternalSimplePDL.g:1467:1: rule__WorkSequence__Group__7__Impl : ( '}' ) ;
    public final void rule__WorkSequence__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1471:1: ( ( '}' ) )
            // InternalSimplePDL.g:1472:1: ( '}' )
            {
            // InternalSimplePDL.g:1472:1: ( '}' )
            // InternalSimplePDL.g:1473:2: '}'
            {
             before(grammarAccess.getWorkSequenceAccess().getRightCurlyBracketKeyword_7()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__WorkSequence__Group__7__Impl"


    // $ANTLR start "rule__WorkSequence__Group_2__0"
    // InternalSimplePDL.g:1483:1: rule__WorkSequence__Group_2__0 : rule__WorkSequence__Group_2__0__Impl rule__WorkSequence__Group_2__1 ;
    public final void rule__WorkSequence__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1487:1: ( rule__WorkSequence__Group_2__0__Impl rule__WorkSequence__Group_2__1 )
            // InternalSimplePDL.g:1488:2: rule__WorkSequence__Group_2__0__Impl rule__WorkSequence__Group_2__1
            {
            pushFollow(FOLLOW_15);
            rule__WorkSequence__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group_2__1();

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
    // $ANTLR end "rule__WorkSequence__Group_2__0"


    // $ANTLR start "rule__WorkSequence__Group_2__0__Impl"
    // InternalSimplePDL.g:1495:1: rule__WorkSequence__Group_2__0__Impl : ( 'linkType' ) ;
    public final void rule__WorkSequence__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1499:1: ( ( 'linkType' ) )
            // InternalSimplePDL.g:1500:1: ( 'linkType' )
            {
            // InternalSimplePDL.g:1500:1: ( 'linkType' )
            // InternalSimplePDL.g:1501:2: 'linkType'
            {
             before(grammarAccess.getWorkSequenceAccess().getLinkTypeKeyword_2_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getLinkTypeKeyword_2_0()); 

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
    // $ANTLR end "rule__WorkSequence__Group_2__0__Impl"


    // $ANTLR start "rule__WorkSequence__Group_2__1"
    // InternalSimplePDL.g:1510:1: rule__WorkSequence__Group_2__1 : rule__WorkSequence__Group_2__1__Impl ;
    public final void rule__WorkSequence__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1514:1: ( rule__WorkSequence__Group_2__1__Impl )
            // InternalSimplePDL.g:1515:2: rule__WorkSequence__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group_2__1__Impl();

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
    // $ANTLR end "rule__WorkSequence__Group_2__1"


    // $ANTLR start "rule__WorkSequence__Group_2__1__Impl"
    // InternalSimplePDL.g:1521:1: rule__WorkSequence__Group_2__1__Impl : ( ( rule__WorkSequence__LinkTypeAssignment_2_1 ) ) ;
    public final void rule__WorkSequence__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1525:1: ( ( ( rule__WorkSequence__LinkTypeAssignment_2_1 ) ) )
            // InternalSimplePDL.g:1526:1: ( ( rule__WorkSequence__LinkTypeAssignment_2_1 ) )
            {
            // InternalSimplePDL.g:1526:1: ( ( rule__WorkSequence__LinkTypeAssignment_2_1 ) )
            // InternalSimplePDL.g:1527:2: ( rule__WorkSequence__LinkTypeAssignment_2_1 )
            {
             before(grammarAccess.getWorkSequenceAccess().getLinkTypeAssignment_2_1()); 
            // InternalSimplePDL.g:1528:2: ( rule__WorkSequence__LinkTypeAssignment_2_1 )
            // InternalSimplePDL.g:1528:3: rule__WorkSequence__LinkTypeAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__LinkTypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getLinkTypeAssignment_2_1()); 

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
    // $ANTLR end "rule__WorkSequence__Group_2__1__Impl"


    // $ANTLR start "rule__Guidance__Group__0"
    // InternalSimplePDL.g:1537:1: rule__Guidance__Group__0 : rule__Guidance__Group__0__Impl rule__Guidance__Group__1 ;
    public final void rule__Guidance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1541:1: ( rule__Guidance__Group__0__Impl rule__Guidance__Group__1 )
            // InternalSimplePDL.g:1542:2: rule__Guidance__Group__0__Impl rule__Guidance__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Guidance__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guidance__Group__1();

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
    // $ANTLR end "rule__Guidance__Group__0"


    // $ANTLR start "rule__Guidance__Group__0__Impl"
    // InternalSimplePDL.g:1549:1: rule__Guidance__Group__0__Impl : ( () ) ;
    public final void rule__Guidance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1553:1: ( ( () ) )
            // InternalSimplePDL.g:1554:1: ( () )
            {
            // InternalSimplePDL.g:1554:1: ( () )
            // InternalSimplePDL.g:1555:2: ()
            {
             before(grammarAccess.getGuidanceAccess().getGuidanceAction_0()); 
            // InternalSimplePDL.g:1556:2: ()
            // InternalSimplePDL.g:1556:3: 
            {
            }

             after(grammarAccess.getGuidanceAccess().getGuidanceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__0__Impl"


    // $ANTLR start "rule__Guidance__Group__1"
    // InternalSimplePDL.g:1564:1: rule__Guidance__Group__1 : rule__Guidance__Group__1__Impl rule__Guidance__Group__2 ;
    public final void rule__Guidance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1568:1: ( rule__Guidance__Group__1__Impl rule__Guidance__Group__2 )
            // InternalSimplePDL.g:1569:2: rule__Guidance__Group__1__Impl rule__Guidance__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Guidance__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guidance__Group__2();

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
    // $ANTLR end "rule__Guidance__Group__1"


    // $ANTLR start "rule__Guidance__Group__1__Impl"
    // InternalSimplePDL.g:1576:1: rule__Guidance__Group__1__Impl : ( 'Guidance' ) ;
    public final void rule__Guidance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1580:1: ( ( 'Guidance' ) )
            // InternalSimplePDL.g:1581:1: ( 'Guidance' )
            {
            // InternalSimplePDL.g:1581:1: ( 'Guidance' )
            // InternalSimplePDL.g:1582:2: 'Guidance'
            {
             before(grammarAccess.getGuidanceAccess().getGuidanceKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getGuidanceAccess().getGuidanceKeyword_1()); 

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
    // $ANTLR end "rule__Guidance__Group__1__Impl"


    // $ANTLR start "rule__Guidance__Group__2"
    // InternalSimplePDL.g:1591:1: rule__Guidance__Group__2 : rule__Guidance__Group__2__Impl rule__Guidance__Group__3 ;
    public final void rule__Guidance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1595:1: ( rule__Guidance__Group__2__Impl rule__Guidance__Group__3 )
            // InternalSimplePDL.g:1596:2: rule__Guidance__Group__2__Impl rule__Guidance__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Guidance__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guidance__Group__3();

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
    // $ANTLR end "rule__Guidance__Group__2"


    // $ANTLR start "rule__Guidance__Group__2__Impl"
    // InternalSimplePDL.g:1603:1: rule__Guidance__Group__2__Impl : ( '{' ) ;
    public final void rule__Guidance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1607:1: ( ( '{' ) )
            // InternalSimplePDL.g:1608:1: ( '{' )
            {
            // InternalSimplePDL.g:1608:1: ( '{' )
            // InternalSimplePDL.g:1609:2: '{'
            {
             before(grammarAccess.getGuidanceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getGuidanceAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Guidance__Group__2__Impl"


    // $ANTLR start "rule__Guidance__Group__3"
    // InternalSimplePDL.g:1618:1: rule__Guidance__Group__3 : rule__Guidance__Group__3__Impl rule__Guidance__Group__4 ;
    public final void rule__Guidance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1622:1: ( rule__Guidance__Group__3__Impl rule__Guidance__Group__4 )
            // InternalSimplePDL.g:1623:2: rule__Guidance__Group__3__Impl rule__Guidance__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Guidance__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guidance__Group__4();

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
    // $ANTLR end "rule__Guidance__Group__3"


    // $ANTLR start "rule__Guidance__Group__3__Impl"
    // InternalSimplePDL.g:1630:1: rule__Guidance__Group__3__Impl : ( ( rule__Guidance__Group_3__0 )? ) ;
    public final void rule__Guidance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1634:1: ( ( ( rule__Guidance__Group_3__0 )? ) )
            // InternalSimplePDL.g:1635:1: ( ( rule__Guidance__Group_3__0 )? )
            {
            // InternalSimplePDL.g:1635:1: ( ( rule__Guidance__Group_3__0 )? )
            // InternalSimplePDL.g:1636:2: ( rule__Guidance__Group_3__0 )?
            {
             before(grammarAccess.getGuidanceAccess().getGroup_3()); 
            // InternalSimplePDL.g:1637:2: ( rule__Guidance__Group_3__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==28) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSimplePDL.g:1637:3: rule__Guidance__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Guidance__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGuidanceAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Guidance__Group__3__Impl"


    // $ANTLR start "rule__Guidance__Group__4"
    // InternalSimplePDL.g:1645:1: rule__Guidance__Group__4 : rule__Guidance__Group__4__Impl ;
    public final void rule__Guidance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1649:1: ( rule__Guidance__Group__4__Impl )
            // InternalSimplePDL.g:1650:2: rule__Guidance__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Guidance__Group__4__Impl();

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
    // $ANTLR end "rule__Guidance__Group__4"


    // $ANTLR start "rule__Guidance__Group__4__Impl"
    // InternalSimplePDL.g:1656:1: rule__Guidance__Group__4__Impl : ( '}' ) ;
    public final void rule__Guidance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1660:1: ( ( '}' ) )
            // InternalSimplePDL.g:1661:1: ( '}' )
            {
            // InternalSimplePDL.g:1661:1: ( '}' )
            // InternalSimplePDL.g:1662:2: '}'
            {
             before(grammarAccess.getGuidanceAccess().getRightCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getGuidanceAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Guidance__Group__4__Impl"


    // $ANTLR start "rule__Guidance__Group_3__0"
    // InternalSimplePDL.g:1672:1: rule__Guidance__Group_3__0 : rule__Guidance__Group_3__0__Impl rule__Guidance__Group_3__1 ;
    public final void rule__Guidance__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1676:1: ( rule__Guidance__Group_3__0__Impl rule__Guidance__Group_3__1 )
            // InternalSimplePDL.g:1677:2: rule__Guidance__Group_3__0__Impl rule__Guidance__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Guidance__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guidance__Group_3__1();

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
    // $ANTLR end "rule__Guidance__Group_3__0"


    // $ANTLR start "rule__Guidance__Group_3__0__Impl"
    // InternalSimplePDL.g:1684:1: rule__Guidance__Group_3__0__Impl : ( 'description' ) ;
    public final void rule__Guidance__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1688:1: ( ( 'description' ) )
            // InternalSimplePDL.g:1689:1: ( 'description' )
            {
            // InternalSimplePDL.g:1689:1: ( 'description' )
            // InternalSimplePDL.g:1690:2: 'description'
            {
             before(grammarAccess.getGuidanceAccess().getDescriptionKeyword_3_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getGuidanceAccess().getDescriptionKeyword_3_0()); 

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
    // $ANTLR end "rule__Guidance__Group_3__0__Impl"


    // $ANTLR start "rule__Guidance__Group_3__1"
    // InternalSimplePDL.g:1699:1: rule__Guidance__Group_3__1 : rule__Guidance__Group_3__1__Impl ;
    public final void rule__Guidance__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1703:1: ( rule__Guidance__Group_3__1__Impl )
            // InternalSimplePDL.g:1704:2: rule__Guidance__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Guidance__Group_3__1__Impl();

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
    // $ANTLR end "rule__Guidance__Group_3__1"


    // $ANTLR start "rule__Guidance__Group_3__1__Impl"
    // InternalSimplePDL.g:1710:1: rule__Guidance__Group_3__1__Impl : ( ( rule__Guidance__DescriptionAssignment_3_1 ) ) ;
    public final void rule__Guidance__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1714:1: ( ( ( rule__Guidance__DescriptionAssignment_3_1 ) ) )
            // InternalSimplePDL.g:1715:1: ( ( rule__Guidance__DescriptionAssignment_3_1 ) )
            {
            // InternalSimplePDL.g:1715:1: ( ( rule__Guidance__DescriptionAssignment_3_1 ) )
            // InternalSimplePDL.g:1716:2: ( rule__Guidance__DescriptionAssignment_3_1 )
            {
             before(grammarAccess.getGuidanceAccess().getDescriptionAssignment_3_1()); 
            // InternalSimplePDL.g:1717:2: ( rule__Guidance__DescriptionAssignment_3_1 )
            // InternalSimplePDL.g:1717:3: rule__Guidance__DescriptionAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Guidance__DescriptionAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getGuidanceAccess().getDescriptionAssignment_3_1()); 

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
    // $ANTLR end "rule__Guidance__Group_3__1__Impl"


    // $ANTLR start "rule__Resource__Group__0"
    // InternalSimplePDL.g:1726:1: rule__Resource__Group__0 : rule__Resource__Group__0__Impl rule__Resource__Group__1 ;
    public final void rule__Resource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1730:1: ( rule__Resource__Group__0__Impl rule__Resource__Group__1 )
            // InternalSimplePDL.g:1731:2: rule__Resource__Group__0__Impl rule__Resource__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Resource__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group__1();

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
    // $ANTLR end "rule__Resource__Group__0"


    // $ANTLR start "rule__Resource__Group__0__Impl"
    // InternalSimplePDL.g:1738:1: rule__Resource__Group__0__Impl : ( 'Resource' ) ;
    public final void rule__Resource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1742:1: ( ( 'Resource' ) )
            // InternalSimplePDL.g:1743:1: ( 'Resource' )
            {
            // InternalSimplePDL.g:1743:1: ( 'Resource' )
            // InternalSimplePDL.g:1744:2: 'Resource'
            {
             before(grammarAccess.getResourceAccess().getResourceKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getResourceAccess().getResourceKeyword_0()); 

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
    // $ANTLR end "rule__Resource__Group__0__Impl"


    // $ANTLR start "rule__Resource__Group__1"
    // InternalSimplePDL.g:1753:1: rule__Resource__Group__1 : rule__Resource__Group__1__Impl rule__Resource__Group__2 ;
    public final void rule__Resource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1757:1: ( rule__Resource__Group__1__Impl rule__Resource__Group__2 )
            // InternalSimplePDL.g:1758:2: rule__Resource__Group__1__Impl rule__Resource__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Resource__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group__2();

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
    // $ANTLR end "rule__Resource__Group__1"


    // $ANTLR start "rule__Resource__Group__1__Impl"
    // InternalSimplePDL.g:1765:1: rule__Resource__Group__1__Impl : ( ( rule__Resource__NameAssignment_1 ) ) ;
    public final void rule__Resource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1769:1: ( ( ( rule__Resource__NameAssignment_1 ) ) )
            // InternalSimplePDL.g:1770:1: ( ( rule__Resource__NameAssignment_1 ) )
            {
            // InternalSimplePDL.g:1770:1: ( ( rule__Resource__NameAssignment_1 ) )
            // InternalSimplePDL.g:1771:2: ( rule__Resource__NameAssignment_1 )
            {
             before(grammarAccess.getResourceAccess().getNameAssignment_1()); 
            // InternalSimplePDL.g:1772:2: ( rule__Resource__NameAssignment_1 )
            // InternalSimplePDL.g:1772:3: rule__Resource__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Resource__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Resource__Group__1__Impl"


    // $ANTLR start "rule__Resource__Group__2"
    // InternalSimplePDL.g:1780:1: rule__Resource__Group__2 : rule__Resource__Group__2__Impl rule__Resource__Group__3 ;
    public final void rule__Resource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1784:1: ( rule__Resource__Group__2__Impl rule__Resource__Group__3 )
            // InternalSimplePDL.g:1785:2: rule__Resource__Group__2__Impl rule__Resource__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Resource__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group__3();

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
    // $ANTLR end "rule__Resource__Group__2"


    // $ANTLR start "rule__Resource__Group__2__Impl"
    // InternalSimplePDL.g:1792:1: rule__Resource__Group__2__Impl : ( '{' ) ;
    public final void rule__Resource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1796:1: ( ( '{' ) )
            // InternalSimplePDL.g:1797:1: ( '{' )
            {
            // InternalSimplePDL.g:1797:1: ( '{' )
            // InternalSimplePDL.g:1798:2: '{'
            {
             before(grammarAccess.getResourceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getResourceAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Resource__Group__2__Impl"


    // $ANTLR start "rule__Resource__Group__3"
    // InternalSimplePDL.g:1807:1: rule__Resource__Group__3 : rule__Resource__Group__3__Impl rule__Resource__Group__4 ;
    public final void rule__Resource__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1811:1: ( rule__Resource__Group__3__Impl rule__Resource__Group__4 )
            // InternalSimplePDL.g:1812:2: rule__Resource__Group__3__Impl rule__Resource__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__Resource__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group__4();

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
    // $ANTLR end "rule__Resource__Group__3"


    // $ANTLR start "rule__Resource__Group__3__Impl"
    // InternalSimplePDL.g:1819:1: rule__Resource__Group__3__Impl : ( 'occuranceNo' ) ;
    public final void rule__Resource__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1823:1: ( ( 'occuranceNo' ) )
            // InternalSimplePDL.g:1824:1: ( 'occuranceNo' )
            {
            // InternalSimplePDL.g:1824:1: ( 'occuranceNo' )
            // InternalSimplePDL.g:1825:2: 'occuranceNo'
            {
             before(grammarAccess.getResourceAccess().getOccuranceNoKeyword_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getResourceAccess().getOccuranceNoKeyword_3()); 

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
    // $ANTLR end "rule__Resource__Group__3__Impl"


    // $ANTLR start "rule__Resource__Group__4"
    // InternalSimplePDL.g:1834:1: rule__Resource__Group__4 : rule__Resource__Group__4__Impl rule__Resource__Group__5 ;
    public final void rule__Resource__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1838:1: ( rule__Resource__Group__4__Impl rule__Resource__Group__5 )
            // InternalSimplePDL.g:1839:2: rule__Resource__Group__4__Impl rule__Resource__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__Resource__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group__5();

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
    // $ANTLR end "rule__Resource__Group__4"


    // $ANTLR start "rule__Resource__Group__4__Impl"
    // InternalSimplePDL.g:1846:1: rule__Resource__Group__4__Impl : ( ( rule__Resource__OccuranceNoAssignment_4 ) ) ;
    public final void rule__Resource__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1850:1: ( ( ( rule__Resource__OccuranceNoAssignment_4 ) ) )
            // InternalSimplePDL.g:1851:1: ( ( rule__Resource__OccuranceNoAssignment_4 ) )
            {
            // InternalSimplePDL.g:1851:1: ( ( rule__Resource__OccuranceNoAssignment_4 ) )
            // InternalSimplePDL.g:1852:2: ( rule__Resource__OccuranceNoAssignment_4 )
            {
             before(grammarAccess.getResourceAccess().getOccuranceNoAssignment_4()); 
            // InternalSimplePDL.g:1853:2: ( rule__Resource__OccuranceNoAssignment_4 )
            // InternalSimplePDL.g:1853:3: rule__Resource__OccuranceNoAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Resource__OccuranceNoAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getOccuranceNoAssignment_4()); 

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
    // $ANTLR end "rule__Resource__Group__4__Impl"


    // $ANTLR start "rule__Resource__Group__5"
    // InternalSimplePDL.g:1861:1: rule__Resource__Group__5 : rule__Resource__Group__5__Impl ;
    public final void rule__Resource__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1865:1: ( rule__Resource__Group__5__Impl )
            // InternalSimplePDL.g:1866:2: rule__Resource__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Resource__Group__5__Impl();

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
    // $ANTLR end "rule__Resource__Group__5"


    // $ANTLR start "rule__Resource__Group__5__Impl"
    // InternalSimplePDL.g:1872:1: rule__Resource__Group__5__Impl : ( '}' ) ;
    public final void rule__Resource__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1876:1: ( ( '}' ) )
            // InternalSimplePDL.g:1877:1: ( '}' )
            {
            // InternalSimplePDL.g:1877:1: ( '}' )
            // InternalSimplePDL.g:1878:2: '}'
            {
             before(grammarAccess.getResourceAccess().getRightCurlyBracketKeyword_5()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getResourceAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Resource__Group__5__Impl"


    // $ANTLR start "rule__WorkDefinition__Group__0"
    // InternalSimplePDL.g:1888:1: rule__WorkDefinition__Group__0 : rule__WorkDefinition__Group__0__Impl rule__WorkDefinition__Group__1 ;
    public final void rule__WorkDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1892:1: ( rule__WorkDefinition__Group__0__Impl rule__WorkDefinition__Group__1 )
            // InternalSimplePDL.g:1893:2: rule__WorkDefinition__Group__0__Impl rule__WorkDefinition__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__WorkDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__1();

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
    // $ANTLR end "rule__WorkDefinition__Group__0"


    // $ANTLR start "rule__WorkDefinition__Group__0__Impl"
    // InternalSimplePDL.g:1900:1: rule__WorkDefinition__Group__0__Impl : ( () ) ;
    public final void rule__WorkDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1904:1: ( ( () ) )
            // InternalSimplePDL.g:1905:1: ( () )
            {
            // InternalSimplePDL.g:1905:1: ( () )
            // InternalSimplePDL.g:1906:2: ()
            {
             before(grammarAccess.getWorkDefinitionAccess().getWorkDefinitionAction_0()); 
            // InternalSimplePDL.g:1907:2: ()
            // InternalSimplePDL.g:1907:3: 
            {
            }

             after(grammarAccess.getWorkDefinitionAccess().getWorkDefinitionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__0__Impl"


    // $ANTLR start "rule__WorkDefinition__Group__1"
    // InternalSimplePDL.g:1915:1: rule__WorkDefinition__Group__1 : rule__WorkDefinition__Group__1__Impl rule__WorkDefinition__Group__2 ;
    public final void rule__WorkDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1919:1: ( rule__WorkDefinition__Group__1__Impl rule__WorkDefinition__Group__2 )
            // InternalSimplePDL.g:1920:2: rule__WorkDefinition__Group__1__Impl rule__WorkDefinition__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__WorkDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__2();

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
    // $ANTLR end "rule__WorkDefinition__Group__1"


    // $ANTLR start "rule__WorkDefinition__Group__1__Impl"
    // InternalSimplePDL.g:1927:1: rule__WorkDefinition__Group__1__Impl : ( 'WorkDefinition' ) ;
    public final void rule__WorkDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1931:1: ( ( 'WorkDefinition' ) )
            // InternalSimplePDL.g:1932:1: ( 'WorkDefinition' )
            {
            // InternalSimplePDL.g:1932:1: ( 'WorkDefinition' )
            // InternalSimplePDL.g:1933:2: 'WorkDefinition'
            {
             before(grammarAccess.getWorkDefinitionAccess().getWorkDefinitionKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getWorkDefinitionKeyword_1()); 

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
    // $ANTLR end "rule__WorkDefinition__Group__1__Impl"


    // $ANTLR start "rule__WorkDefinition__Group__2"
    // InternalSimplePDL.g:1942:1: rule__WorkDefinition__Group__2 : rule__WorkDefinition__Group__2__Impl rule__WorkDefinition__Group__3 ;
    public final void rule__WorkDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1946:1: ( rule__WorkDefinition__Group__2__Impl rule__WorkDefinition__Group__3 )
            // InternalSimplePDL.g:1947:2: rule__WorkDefinition__Group__2__Impl rule__WorkDefinition__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__WorkDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__3();

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
    // $ANTLR end "rule__WorkDefinition__Group__2"


    // $ANTLR start "rule__WorkDefinition__Group__2__Impl"
    // InternalSimplePDL.g:1954:1: rule__WorkDefinition__Group__2__Impl : ( ( rule__WorkDefinition__NameAssignment_2 ) ) ;
    public final void rule__WorkDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1958:1: ( ( ( rule__WorkDefinition__NameAssignment_2 ) ) )
            // InternalSimplePDL.g:1959:1: ( ( rule__WorkDefinition__NameAssignment_2 ) )
            {
            // InternalSimplePDL.g:1959:1: ( ( rule__WorkDefinition__NameAssignment_2 ) )
            // InternalSimplePDL.g:1960:2: ( rule__WorkDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getWorkDefinitionAccess().getNameAssignment_2()); 
            // InternalSimplePDL.g:1961:2: ( rule__WorkDefinition__NameAssignment_2 )
            // InternalSimplePDL.g:1961:3: rule__WorkDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getWorkDefinitionAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__WorkDefinition__Group__2__Impl"


    // $ANTLR start "rule__WorkDefinition__Group__3"
    // InternalSimplePDL.g:1969:1: rule__WorkDefinition__Group__3 : rule__WorkDefinition__Group__3__Impl rule__WorkDefinition__Group__4 ;
    public final void rule__WorkDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1973:1: ( rule__WorkDefinition__Group__3__Impl rule__WorkDefinition__Group__4 )
            // InternalSimplePDL.g:1974:2: rule__WorkDefinition__Group__3__Impl rule__WorkDefinition__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__WorkDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__4();

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
    // $ANTLR end "rule__WorkDefinition__Group__3"


    // $ANTLR start "rule__WorkDefinition__Group__3__Impl"
    // InternalSimplePDL.g:1981:1: rule__WorkDefinition__Group__3__Impl : ( '{' ) ;
    public final void rule__WorkDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1985:1: ( ( '{' ) )
            // InternalSimplePDL.g:1986:1: ( '{' )
            {
            // InternalSimplePDL.g:1986:1: ( '{' )
            // InternalSimplePDL.g:1987:2: '{'
            {
             before(grammarAccess.getWorkDefinitionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__WorkDefinition__Group__3__Impl"


    // $ANTLR start "rule__WorkDefinition__Group__4"
    // InternalSimplePDL.g:1996:1: rule__WorkDefinition__Group__4 : rule__WorkDefinition__Group__4__Impl rule__WorkDefinition__Group__5 ;
    public final void rule__WorkDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:2000:1: ( rule__WorkDefinition__Group__4__Impl rule__WorkDefinition__Group__5 )
            // InternalSimplePDL.g:2001:2: rule__WorkDefinition__Group__4__Impl rule__WorkDefinition__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__WorkDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__5();

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
    // $ANTLR end "rule__WorkDefinition__Group__4"


    // $ANTLR start "rule__WorkDefinition__Group__4__Impl"
    // InternalSimplePDL.g:2008:1: rule__WorkDefinition__Group__4__Impl : ( ( rule__WorkDefinition__Group_4__0 )? ) ;
    public final void rule__WorkDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:2012:1: ( ( ( rule__WorkDefinition__Group_4__0 )? ) )
            // InternalSimplePDL.g:2013:1: ( ( rule__WorkDefinition__Group_4__0 )? )
            {
            // InternalSimplePDL.g:2013:1: ( ( rule__WorkDefinition__Group_4__0 )? )
            // InternalSimplePDL.g:2014:2: ( rule__WorkDefinition__Group_4__0 )?
            {
             before(grammarAccess.getWorkDefinitionAccess().getGroup_4()); 
            // InternalSimplePDL.g:2015:2: ( rule__WorkDefinition__Group_4__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==32) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSimplePDL.g:2015:3: rule__WorkDefinition__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__WorkDefinition__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWorkDefinitionAccess().getGroup_4()); 

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
    // $ANTLR end "rule__WorkDefinition__Group__4__Impl"


    // $ANTLR start "rule__WorkDefinition__Group__5"
    // InternalSimplePDL.g:2023:1: rule__WorkDefinition__Group__5 : rule__WorkDefinition__Group__5__Impl rule__WorkDefinition__Group__6 ;
    public final void rule__WorkDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:2027:1: ( rule__WorkDefinition__Group__5__Impl rule__WorkDefinition__Group__6 )
            // InternalSimplePDL.g:2028:2: rule__WorkDefinition__Group__5__Impl rule__WorkDefinition__Group__6
            {
            pushFollow(FOLLOW_19);
            rule__WorkDefinition__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__6();

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
    // $ANTLR end "rule__WorkDefinition__Group__5"


    // $ANTLR start "rule__WorkDefinition__Group__5__Impl"
    // InternalSimplePDL.g:2035:1: rule__WorkDefinition__Group__5__Impl : ( ( rule__WorkDefinition__Group_5__0 )? ) ;
    public final void rule__WorkDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:2039:1: ( ( ( rule__WorkDefinition__Group_5__0 )? ) )
            // InternalSimplePDL.g:2040:1: ( ( rule__WorkDefinition__Group_5__0 )? )
            {
            // InternalSimplePDL.g:2040:1: ( ( rule__WorkDefinition__Group_5__0 )? )
            // InternalSimplePDL.g:2041:2: ( rule__WorkDefinition__Group_5__0 )?
            {
             before(grammarAccess.getWorkDefinitionAccess().getGroup_5()); 
            // InternalSimplePDL.g:2042:2: ( rule__WorkDefinition__Group_5__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==33) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSimplePDL.g:2042:3: rule__WorkDefinition__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__WorkDefinition__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWorkDefinitionAccess().getGroup_5()); 

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
    // $ANTLR end "rule__WorkDefinition__Group__5__Impl"


    // $ANTLR start "rule__WorkDefinition__Group__6"
    // InternalSimplePDL.g:2050:1: rule__WorkDefinition__Group__6 : rule__WorkDefinition__Group__6__Impl rule__WorkDefinition__Group__7 ;
    public final void rule__WorkDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:2054:1: ( rule__WorkDefinition__Group__6__Impl rule__WorkDefinition__Group__7 )
            // InternalSimplePDL.g:2055:2: rule__WorkDefinition__Group__6__Impl rule__WorkDefinition__Group__7
            {
            pushFollow(FOLLOW_19);
            rule__WorkDefinition__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__7();

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
    // $ANTLR end "rule__WorkDefinition__Group__6"


    // $ANTLR start "rule__WorkDefinition__Group__6__Impl"
    // InternalSimplePDL.g:2062:1: rule__WorkDefinition__Group__6__Impl : ( ( rule__WorkDefinition__Group_6__0 )? ) ;
    public final void rule__WorkDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:2066:1: ( ( ( rule__WorkDefinition__Group_6__0 )? ) )
            // InternalSimplePDL.g:2067:1: ( ( rule__WorkDefinition__Group_6__0 )? )
            {
            // InternalSimplePDL.g:2067:1: ( ( rule__WorkDefinition__Group_6__0 )? )
            // InternalSimplePDL.g:2068:2: ( rule__WorkDefinition__Group_6__0 )?
            {
             before(grammarAccess.getWorkDefinitionAccess().getGroup_6()); 
            // InternalSimplePDL.g:2069:2: ( rule__WorkDefinition__Group_6__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==21) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSimplePDL.g:2069:3: rule__WorkDefinition__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__WorkDefinition__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWorkDefinitionAccess().getGroup_6()); 

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
    // $ANTLR end "rule__WorkDefinition__Group__6__Impl"


    // $ANTLR start "rule__WorkDefinition__Group__7"
    // InternalSimplePDL.g:2077:1: rule__WorkDefinition__Group__7 : rule__WorkDefinition__Group__7__Impl rule__WorkDefinition__Group__8 ;
    public final void rule__WorkDefinition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:2081:1: ( rule__WorkDefinition__Group__7__Impl rule__WorkDefinition__Group__8 )
            // InternalSimplePDL.g:2082:2: rule__WorkDefinition__Group__7__Impl rule__WorkDefinition__Group__8
            {
            pushFollow(FOLLOW_19);
            rule__WorkDefinition__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__8();

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
    // $ANTLR end "rule__WorkDefinition__Group__7"


    // $ANTLR start "rule__WorkDefinition__Group__7__Impl"
    // InternalSimplePDL.g:2089:1: rule__WorkDefinition__Group__7__Impl : ( ( rule__WorkDefinition__Group_7__0 )? ) ;
    public final void rule__WorkDefinition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:2093:1: ( ( ( rule__WorkDefinition__Group_7__0 )? ) )
            // InternalSimplePDL.g:2094:1: ( ( rule__WorkDefinition__Group_7__0 )? )
            {
            // InternalSimplePDL.g:2094:1: ( ( rule__WorkDefinition__Group_7__0 )? )
            // InternalSimplePDL.g:2095:2: ( rule__WorkDefinition__Group_7__0 )?
            {
             before(grammarAccess.getWorkDefinitionAccess().getGroup_7()); 
            // InternalSimplePDL.g:2096:2: ( rule__WorkDefinition__Group_7__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==36) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSimplePDL.g:2096:3: rule__WorkDefinition__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__WorkDefinition__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWorkDefinitionAccess().getGroup_7()); 

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
    // $ANTLR end "rule__WorkDefinition__Group__7__Impl"


    // $ANTLR start "rule__WorkDefinition__Group__8"
    // InternalSimplePDL.g:2104:1: rule__WorkDefinition__Group__8 : rule__WorkDefinition__Group__8__Impl ;
    public final void rule__WorkDefinition__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:2108:1: ( rule__WorkDefinition__Group__8__Impl )
            // InternalSimplePDL.g:2109:2: rule__WorkDefinition__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__8__Impl();

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
    // $ANTLR end "rule__WorkDefinition__Group__8"


    // $ANTLR start "rule__WorkDefinition__Group__8__Impl"
    // InternalSimplePDL.g:2115:1: rule__WorkDefinition__Group__8__Impl : ( '}' ) ;
    public final void rule__WorkDefinition__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:2119:1: ( ( '}' ) )
            // InternalSimplePDL.g:2120:1: ( '}' )
            {
            // InternalSimplePDL.g:2120:1: ( '}' )
            // InternalSimplePDL.g:2121:2: '}'
            {
             before(grammarAccess.getWorkDefinitionAccess().getRightCurlyBracketKeyword_8()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__WorkDefinition__Group__8__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_4__0"
    // InternalSimplePDL.g:2131:1: rule__WorkDefinition__Group_4__0 : rule__WorkDefinition__Group_4__0__Impl rule__WorkDefinition__Group_4__1 ;
    public final void rule__WorkDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:2135:1: ( rule__WorkDefinition__Group_4__0__Impl rule__WorkDefinition__Group_4__1 )
            // InternalSimplePDL.g:2136:2: rule__WorkDefinition__Group_4__0__Impl rule__WorkDefinition__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__WorkDefinition__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_4__1();

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
    // $ANTLR end "rule__WorkDefinition__Group_4__0"


    // $ANTLR start "rule__WorkDefinition__Group_4__0__Impl"
    // InternalSimplePDL.g:2143:1: rule__WorkDefinition__Group_4__0__Impl : ( 'linksToSuccessors' ) ;
    public final void rule__WorkDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:2147:1: ( ( 'linksToSuccessors' ) )
            // InternalSimplePDL.g:2148:1: ( 'linksToSuccessors' )
            {
            // InternalSimplePDL.g:2148:1: ( 'linksToSuccessors' )
            // InternalSimplePDL.g:2149:2: 'linksToSuccessors'
            {
             before(grammarAccess.getWorkDefinitionAccess().getLinksToSuccessorsKeyword_4_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getLinksToSuccessorsKeyword_4_0()); 

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
    // $ANTLR end "rule__WorkDefinition__Group_4__0__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_4__1"
    // InternalSimplePDL.g:2158:1: rule__WorkDefinition__Group_4__1 : rule__WorkDefinition__Group_4__1__Impl ;
    public final void rule__WorkDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:2162:1: ( rule__WorkDefinition__Group_4__1__Impl )
            // InternalSimplePDL.g:2163:2: rule__WorkDefinition__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_4__1__Impl();

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
    // $ANTLR end "rule__WorkDefinition__Group_4__1"


    // $ANTLR start "rule__WorkDefinition__Group_4__1__Impl"
    // InternalSimplePDL.g:2169:1: rule__WorkDefinition__Group_4__1__Impl : ( ( rule__WorkDefinition__LinksToSuccessorsAssignment_4_1 ) ) ;
    public final void rule__WorkDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:2173:1: ( ( ( rule__WorkDefinition__LinksToSuccessorsAssignment_4_1 ) ) )
            // InternalSimplePDL.g:2174:1: ( ( rule__WorkDefinition__LinksToSuccessorsAssignment_4_1 ) )
            {
            // InternalSimplePDL.g:2174:1: ( ( rule__WorkDefinition__LinksToSuccessorsAssignment_4_1 ) )
            // InternalSimplePDL.g:2175:2: ( rule__WorkDefinition__LinksToSuccessorsAssignment_4_1 )
            {
             before(grammarAccess.getWorkDefinitionAccess().getLinksToSuccessorsAssignment_4_1()); 
            // InternalSimplePDL.g:2176:2: ( rule__WorkDefinition__LinksToSuccessorsAssignment_4_1 )
            // InternalSimplePDL.g:2176:3: rule__WorkDefinition__LinksToSuccessorsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__LinksToSuccessorsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getWorkDefinitionAccess().getLinksToSuccessorsAssignment_4_1()); 

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
    // $ANTLR end "rule__WorkDefinition__Group_4__1__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_5__0"
    // InternalSimplePDL.g:2185:1: rule__WorkDefinition__Group_5__0 : rule__WorkDefinition__Group_5__0__Impl rule__WorkDefinition__Group_5__1 ;
    public final void rule__WorkDefinition__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:2189:1: ( rule__WorkDefinition__Group_5__0__Impl rule__WorkDefinition__Group_5__1 )
            // InternalSimplePDL.g:2190:2: rule__WorkDefinition__Group_5__0__Impl rule__WorkDefinition__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__WorkDefinition__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_5__1();

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
    // $ANTLR end "rule__WorkDefinition__Group_5__0"


    // $ANTLR start "rule__WorkDefinition__Group_5__0__Impl"
    // InternalSimplePDL.g:2197:1: rule__WorkDefinition__Group_5__0__Impl : ( 'linksToPredecessors' ) ;
    public final void rule__WorkDefinition__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:2201:1: ( ( 'linksToPredecessors' ) )
            // InternalSimplePDL.g:2202:1: ( 'linksToPredecessors' )
            {
            // InternalSimplePDL.g:2202:1: ( 'linksToPredecessors' )
            // InternalSimplePDL.g:2203:2: 'linksToPredecessors'
            {
             before(grammarAccess.getWorkDefinitionAccess().getLinksToPredecessorsKeyword_5_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getLinksToPredecessorsKeyword_5_0()); 

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
    // $ANTLR end "rule__WorkDefinition__Group_5__0__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_5__1"
    // InternalSimplePDL.g:2212:1: rule__WorkDefinition__Group_5__1 : rule__WorkDefinition__Group_5__1__Impl ;
    public final void rule__WorkDefinition__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:2216:1: ( rule__WorkDefinition__Group_5__1__Impl )
            // InternalSimplePDL.g:2217:2: rule__WorkDefinition__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_5__1__Impl();

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
    // $ANTLR end "rule__WorkDefinition__Group_5__1"


    // $ANTLR start "rule__WorkDefinition__Group_5__1__Impl"
    // InternalSimplePDL.g:2223:1: rule__WorkDefinition__Group_5__1__Impl : ( ( rule__WorkDefinition__LinksToPredecessorsAssignment_5_1 ) ) ;
    public final void rule__WorkDefinition__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:2227:1: ( ( ( rule__WorkDefinition__LinksToPredecessorsAssignment_5_1 ) ) )
            // InternalSimplePDL.g:2228:1: ( ( rule__WorkDefinition__LinksToPredecessorsAssignment_5_1 ) )
            {
            // InternalSimplePDL.g:2228:1: ( ( rule__WorkDefinition__LinksToPredecessorsAssignment_5_1 ) )
            // InternalSimplePDL.g:2229:2: ( rule__WorkDefinition__LinksToPredecessorsAssignment_5_1 )
            {
             before(grammarAccess.getWorkDefinitionAccess().getLinksToPredecessorsAssignment_5_1()); 
            // InternalSimplePDL.g:2230:2: ( rule__WorkDefinition__LinksToPredecessorsAssignment_5_1 )
            // InternalSimplePDL.g:2230:3: rule__WorkDefinition__LinksToPredecessorsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__LinksToPredecessorsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getWorkDefinitionAccess().getLinksToPredecessorsAssignment_5_1()); 

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
    // $ANTLR end "rule__WorkDefinition__Group_5__1__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_6__0"
    // InternalSimplePDL.g:2239:1: rule__WorkDefinition__Group_6__0 : rule__WorkDefinition__Group_6__0__Impl rule__WorkDefinition__Group_6__1 ;
    public final void rule__WorkDefinition__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:2243:1: ( rule__WorkDefinition__Group_6__0__Impl rule__WorkDefinition__Group_6__1 )
            // InternalSimplePDL.g:2244:2: rule__WorkDefinition__Group_6__0__Impl rule__WorkDefinition__Group_6__1
            {
            pushFollow(FOLLOW_20);
            rule__WorkDefinition__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_6__1();

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
    // $ANTLR end "rule__WorkDefinition__Group_6__0"


    // $ANTLR start "rule__WorkDefinition__Group_6__0__Impl"
    // InternalSimplePDL.g:2251:1: rule__WorkDefinition__Group_6__0__Impl : ( 'guidance' ) ;
    public final void rule__WorkDefinition__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:2255:1: ( ( 'guidance' ) )
            // InternalSimplePDL.g:2256:1: ( 'guidance' )
            {
            // InternalSimplePDL.g:2256:1: ( 'guidance' )
            // InternalSimplePDL.g:2257:2: 'guidance'
            {
             before(grammarAccess.getWorkDefinitionAccess().getGuidanceKeyword_6_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getGuidanceKeyword_6_0()); 

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
    // $ANTLR end "rule__WorkDefinition__Group_6__0__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_6__1"
    // InternalSimplePDL.g:2266:1: rule__WorkDefinition__Group_6__1 : rule__WorkDefinition__Group_6__1__Impl rule__WorkDefinition__Group_6__2 ;
    public final void rule__WorkDefinition__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:2270:1: ( rule__WorkDefinition__Group_6__1__Impl rule__WorkDefinition__Group_6__2 )
            // InternalSimplePDL.g:2271:2: rule__WorkDefinition__Group_6__1__Impl rule__WorkDefinition__Group_6__2
            {
            pushFollow(FOLLOW_3);
            rule__WorkDefinition__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_6__2();

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
    // $ANTLR end "rule__WorkDefinition__Group_6__1"


    // $ANTLR start "rule__WorkDefinition__Group_6__1__Impl"
    // InternalSimplePDL.g:2278:1: rule__WorkDefinition__Group_6__1__Impl : ( '(' ) ;
    public final void rule__WorkDefinition__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:2282:1: ( ( '(' ) )
            // InternalSimplePDL.g:2283:1: ( '(' )
            {
            // InternalSimplePDL.g:2283:1: ( '(' )
            // InternalSimplePDL.g:2284:2: '('
            {
             before(grammarAccess.getWorkDefinitionAccess().getLeftParenthesisKeyword_6_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getLeftParenthesisKeyword_6_1()); 

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
    // $ANTLR end "rule__WorkDefinition__Group_6__1__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_6__2"
    // InternalSimplePDL.g:2293:1: rule__WorkDefinition__Group_6__2 : rule__WorkDefinition__Group_6__2__Impl rule__WorkDefinition__Group_6__3 ;
    public final void rule__WorkDefinition__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:2297:1: ( rule__WorkDefinition__Group_6__2__Impl rule__WorkDefinition__Group_6__3 )
            // InternalSimplePDL.g:2298:2: rule__WorkDefinition__Group_6__2__Impl rule__WorkDefinition__Group_6__3
            {
            pushFollow(FOLLOW_21);
            rule__WorkDefinition__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_6__3();

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
    // $ANTLR end "rule__WorkDefinition__Group_6__2"


    // $ANTLR start "rule__WorkDefinition__Group_6__2__Impl"
    // InternalSimplePDL.g:2305:1: rule__WorkDefinition__Group_6__2__Impl : ( ( rule__WorkDefinition__GuidanceAssignment_6_2 ) ) ;
    public final void rule__WorkDefinition__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:2309:1: ( ( ( rule__WorkDefinition__GuidanceAssignment_6_2 ) ) )
            // InternalSimplePDL.g:2310:1: ( ( rule__WorkDefinition__GuidanceAssignment_6_2 ) )
            {
            // InternalSimplePDL.g:2310:1: ( ( rule__WorkDefinition__GuidanceAssignment_6_2 ) )
            // InternalSimplePDL.g:2311:2: ( rule__WorkDefinition__GuidanceAssignment_6_2 )
            {
             before(grammarAccess.getWorkDefinitionAccess().getGuidanceAssignment_6_2()); 
            // InternalSimplePDL.g:2312:2: ( rule__WorkDefinition__GuidanceAssignment_6_2 )
            // InternalSimplePDL.g:2312:3: rule__WorkDefinition__GuidanceAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__GuidanceAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getWorkDefinitionAccess().getGuidanceAssignment_6_2()); 

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
    // $ANTLR end "rule__WorkDefinition__Group_6__2__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_6__3"
    // InternalSimplePDL.g:2320:1: rule__WorkDefinition__Group_6__3 : rule__WorkDefinition__Group_6__3__Impl rule__WorkDefinition__Group_6__4 ;
    public final void rule__WorkDefinition__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:2324:1: ( rule__WorkDefinition__Group_6__3__Impl rule__WorkDefinition__Group_6__4 )
            // InternalSimplePDL.g:2325:2: rule__WorkDefinition__Group_6__3__Impl rule__WorkDefinition__Group_6__4
            {
            pushFollow(FOLLOW_21);
            rule__WorkDefinition__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_6__4();

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
    // $ANTLR end "rule__WorkDefinition__Group_6__3"


    // $ANTLR start "rule__WorkDefinition__Group_6__3__Impl"
    // InternalSimplePDL.g:2332:1: rule__WorkDefinition__Group_6__3__Impl : ( ( rule__WorkDefinition__Group_6_3__0 )* ) ;
    public final void rule__WorkDefinition__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:2336:1: ( ( ( rule__WorkDefinition__Group_6_3__0 )* ) )
            // InternalSimplePDL.g:2337:1: ( ( rule__WorkDefinition__Group_6_3__0 )* )
            {
            // InternalSimplePDL.g:2337:1: ( ( rule__WorkDefinition__Group_6_3__0 )* )
            // InternalSimplePDL.g:2338:2: ( rule__WorkDefinition__Group_6_3__0 )*
            {
             before(grammarAccess.getWorkDefinitionAccess().getGroup_6_3()); 
            // InternalSimplePDL.g:2339:2: ( rule__WorkDefinition__Group_6_3__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==20) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalSimplePDL.g:2339:3: rule__WorkDefinition__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__WorkDefinition__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getWorkDefinitionAccess().getGroup_6_3()); 

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
    // $ANTLR end "rule__WorkDefinition__Group_6__3__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_6__4"
    // InternalSimplePDL.g:2347:1: rule__WorkDefinition__Group_6__4 : rule__WorkDefinition__Group_6__4__Impl ;
    public final void rule__WorkDefinition__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:2351:1: ( rule__WorkDefinition__Group_6__4__Impl )
            // InternalSimplePDL.g:2352:2: rule__WorkDefinition__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_6__4__Impl();

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
    // $ANTLR end "rule__WorkDefinition__Group_6__4"


    // $ANTLR start "rule__WorkDefinition__Group_6__4__Impl"
    // InternalSimplePDL.g:2358:1: rule__WorkDefinition__Group_6__4__Impl : ( ')' ) ;
    public final void rule__WorkDefinition__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:2362:1: ( ( ')' ) )
            // InternalSimplePDL.g:2363:1: ( ')' )
            {
            // InternalSimplePDL.g:2363:1: ( ')' )
            // InternalSimplePDL.g:2364:2: ')'
            {
             before(grammarAccess.getWorkDefinitionAccess().getRightParenthesisKeyword_6_4()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getRightParenthesisKeyword_6_4()); 

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
    // $ANTLR end "rule__WorkDefinition__Group_6__4__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_6_3__0"
    // InternalSimplePDL.g:2374:1: rule__WorkDefinition__Group_6_3__0 : rule__WorkDefinition__Group_6_3__0__Impl rule__WorkDefinition__Group_6_3__1 ;
    public final void rule__WorkDefinition__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:2378:1: ( rule__WorkDefinition__Group_6_3__0__Impl rule__WorkDefinition__Group_6_3__1 )
            // InternalSimplePDL.g:2379:2: rule__WorkDefinition__Group_6_3__0__Impl rule__WorkDefinition__Group_6_3__1
            {
            pushFollow(FOLLOW_3);
            rule__WorkDefinition__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_6_3__1();

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
    // $ANTLR end "rule__WorkDefinition__Group_6_3__0"


    // $ANTLR start "rule__WorkDefinition__Group_6_3__0__Impl"
    // InternalSimplePDL.g:2386:1: rule__WorkDefinition__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__WorkDefinition__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:2390:1: ( ( ',' ) )
            // InternalSimplePDL.g:2391:1: ( ',' )
            {
            // InternalSimplePDL.g:2391:1: ( ',' )
            // InternalSimplePDL.g:2392:2: ','
            {
             before(grammarAccess.getWorkDefinitionAccess().getCommaKeyword_6_3_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getCommaKeyword_6_3_0()); 

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
    // $ANTLR end "rule__WorkDefinition__Group_6_3__0__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_6_3__1"
    // InternalSimplePDL.g:2401:1: rule__WorkDefinition__Group_6_3__1 : rule__WorkDefinition__Group_6_3__1__Impl ;
    public final void rule__WorkDefinition__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:2405:1: ( rule__WorkDefinition__Group_6_3__1__Impl )
            // InternalSimplePDL.g:2406:2: rule__WorkDefinition__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_6_3__1__Impl();

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
    // $ANTLR end "rule__WorkDefinition__Group_6_3__1"


    // $ANTLR start "rule__WorkDefinition__Group_6_3__1__Impl"
    // InternalSimplePDL.g:2412:1: rule__WorkDefinition__Group_6_3__1__Impl : ( ( rule__WorkDefinition__GuidanceAssignment_6_3_1 ) ) ;
    public final void rule__WorkDefinition__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:2416:1: ( ( ( rule__WorkDefinition__GuidanceAssignment_6_3_1 ) ) )
            // InternalSimplePDL.g:2417:1: ( ( rule__WorkDefinition__GuidanceAssignment_6_3_1 ) )
            {
            // InternalSimplePDL.g:2417:1: ( ( rule__WorkDefinition__GuidanceAssignment_6_3_1 ) )
            // InternalSimplePDL.g:2418:2: ( rule__WorkDefinition__GuidanceAssignment_6_3_1 )
            {
             before(grammarAccess.getWorkDefinitionAccess().getGuidanceAssignment_6_3_1()); 
            // InternalSimplePDL.g:2419:2: ( rule__WorkDefinition__GuidanceAssignment_6_3_1 )
            // InternalSimplePDL.g:2419:3: rule__WorkDefinition__GuidanceAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__GuidanceAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getWorkDefinitionAccess().getGuidanceAssignment_6_3_1()); 

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
    // $ANTLR end "rule__WorkDefinition__Group_6_3__1__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_7__0"
    // InternalSimplePDL.g:2428:1: rule__WorkDefinition__Group_7__0 : rule__WorkDefinition__Group_7__0__Impl rule__WorkDefinition__Group_7__1 ;
    public final void rule__WorkDefinition__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:2432:1: ( rule__WorkDefinition__Group_7__0__Impl rule__WorkDefinition__Group_7__1 )
            // InternalSimplePDL.g:2433:2: rule__WorkDefinition__Group_7__0__Impl rule__WorkDefinition__Group_7__1
            {
            pushFollow(FOLLOW_4);
            rule__WorkDefinition__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_7__1();

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
    // $ANTLR end "rule__WorkDefinition__Group_7__0"


    // $ANTLR start "rule__WorkDefinition__Group_7__0__Impl"
    // InternalSimplePDL.g:2440:1: rule__WorkDefinition__Group_7__0__Impl : ( 'parameter' ) ;
    public final void rule__WorkDefinition__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:2444:1: ( ( 'parameter' ) )
            // InternalSimplePDL.g:2445:1: ( 'parameter' )
            {
            // InternalSimplePDL.g:2445:1: ( 'parameter' )
            // InternalSimplePDL.g:2446:2: 'parameter'
            {
             before(grammarAccess.getWorkDefinitionAccess().getParameterKeyword_7_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getParameterKeyword_7_0()); 

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
    // $ANTLR end "rule__WorkDefinition__Group_7__0__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_7__1"
    // InternalSimplePDL.g:2455:1: rule__WorkDefinition__Group_7__1 : rule__WorkDefinition__Group_7__1__Impl rule__WorkDefinition__Group_7__2 ;
    public final void rule__WorkDefinition__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:2459:1: ( rule__WorkDefinition__Group_7__1__Impl rule__WorkDefinition__Group_7__2 )
            // InternalSimplePDL.g:2460:2: rule__WorkDefinition__Group_7__1__Impl rule__WorkDefinition__Group_7__2
            {
            pushFollow(FOLLOW_22);
            rule__WorkDefinition__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_7__2();

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
    // $ANTLR end "rule__WorkDefinition__Group_7__1"


    // $ANTLR start "rule__WorkDefinition__Group_7__1__Impl"
    // InternalSimplePDL.g:2467:1: rule__WorkDefinition__Group_7__1__Impl : ( '{' ) ;
    public final void rule__WorkDefinition__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:2471:1: ( ( '{' ) )
            // InternalSimplePDL.g:2472:1: ( '{' )
            {
            // InternalSimplePDL.g:2472:1: ( '{' )
            // InternalSimplePDL.g:2473:2: '{'
            {
             before(grammarAccess.getWorkDefinitionAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getLeftCurlyBracketKeyword_7_1()); 

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
    // $ANTLR end "rule__WorkDefinition__Group_7__1__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_7__2"
    // InternalSimplePDL.g:2482:1: rule__WorkDefinition__Group_7__2 : rule__WorkDefinition__Group_7__2__Impl rule__WorkDefinition__Group_7__3 ;
    public final void rule__WorkDefinition__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:2486:1: ( rule__WorkDefinition__Group_7__2__Impl rule__WorkDefinition__Group_7__3 )
            // InternalSimplePDL.g:2487:2: rule__WorkDefinition__Group_7__2__Impl rule__WorkDefinition__Group_7__3
            {
            pushFollow(FOLLOW_7);
            rule__WorkDefinition__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_7__3();

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
    // $ANTLR end "rule__WorkDefinition__Group_7__2"


    // $ANTLR start "rule__WorkDefinition__Group_7__2__Impl"
    // InternalSimplePDL.g:2494:1: rule__WorkDefinition__Group_7__2__Impl : ( ( rule__WorkDefinition__ParameterAssignment_7_2 ) ) ;
    public final void rule__WorkDefinition__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:2498:1: ( ( ( rule__WorkDefinition__ParameterAssignment_7_2 ) ) )
            // InternalSimplePDL.g:2499:1: ( ( rule__WorkDefinition__ParameterAssignment_7_2 ) )
            {
            // InternalSimplePDL.g:2499:1: ( ( rule__WorkDefinition__ParameterAssignment_7_2 ) )
            // InternalSimplePDL.g:2500:2: ( rule__WorkDefinition__ParameterAssignment_7_2 )
            {
             before(grammarAccess.getWorkDefinitionAccess().getParameterAssignment_7_2()); 
            // InternalSimplePDL.g:2501:2: ( rule__WorkDefinition__ParameterAssignment_7_2 )
            // InternalSimplePDL.g:2501:3: rule__WorkDefinition__ParameterAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__ParameterAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getWorkDefinitionAccess().getParameterAssignment_7_2()); 

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
    // $ANTLR end "rule__WorkDefinition__Group_7__2__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_7__3"
    // InternalSimplePDL.g:2509:1: rule__WorkDefinition__Group_7__3 : rule__WorkDefinition__Group_7__3__Impl rule__WorkDefinition__Group_7__4 ;
    public final void rule__WorkDefinition__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:2513:1: ( rule__WorkDefinition__Group_7__3__Impl rule__WorkDefinition__Group_7__4 )
            // InternalSimplePDL.g:2514:2: rule__WorkDefinition__Group_7__3__Impl rule__WorkDefinition__Group_7__4
            {
            pushFollow(FOLLOW_7);
            rule__WorkDefinition__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_7__4();

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
    // $ANTLR end "rule__WorkDefinition__Group_7__3"


    // $ANTLR start "rule__WorkDefinition__Group_7__3__Impl"
    // InternalSimplePDL.g:2521:1: rule__WorkDefinition__Group_7__3__Impl : ( ( rule__WorkDefinition__Group_7_3__0 )* ) ;
    public final void rule__WorkDefinition__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:2525:1: ( ( ( rule__WorkDefinition__Group_7_3__0 )* ) )
            // InternalSimplePDL.g:2526:1: ( ( rule__WorkDefinition__Group_7_3__0 )* )
            {
            // InternalSimplePDL.g:2526:1: ( ( rule__WorkDefinition__Group_7_3__0 )* )
            // InternalSimplePDL.g:2527:2: ( rule__WorkDefinition__Group_7_3__0 )*
            {
             before(grammarAccess.getWorkDefinitionAccess().getGroup_7_3()); 
            // InternalSimplePDL.g:2528:2: ( rule__WorkDefinition__Group_7_3__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==20) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalSimplePDL.g:2528:3: rule__WorkDefinition__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__WorkDefinition__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getWorkDefinitionAccess().getGroup_7_3()); 

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
    // $ANTLR end "rule__WorkDefinition__Group_7__3__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_7__4"
    // InternalSimplePDL.g:2536:1: rule__WorkDefinition__Group_7__4 : rule__WorkDefinition__Group_7__4__Impl ;
    public final void rule__WorkDefinition__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:2540:1: ( rule__WorkDefinition__Group_7__4__Impl )
            // InternalSimplePDL.g:2541:2: rule__WorkDefinition__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_7__4__Impl();

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
    // $ANTLR end "rule__WorkDefinition__Group_7__4"


    // $ANTLR start "rule__WorkDefinition__Group_7__4__Impl"
    // InternalSimplePDL.g:2547:1: rule__WorkDefinition__Group_7__4__Impl : ( '}' ) ;
    public final void rule__WorkDefinition__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:2551:1: ( ( '}' ) )
            // InternalSimplePDL.g:2552:1: ( '}' )
            {
            // InternalSimplePDL.g:2552:1: ( '}' )
            // InternalSimplePDL.g:2553:2: '}'
            {
             before(grammarAccess.getWorkDefinitionAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getRightCurlyBracketKeyword_7_4()); 

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
    // $ANTLR end "rule__WorkDefinition__Group_7__4__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_7_3__0"
    // InternalSimplePDL.g:2563:1: rule__WorkDefinition__Group_7_3__0 : rule__WorkDefinition__Group_7_3__0__Impl rule__WorkDefinition__Group_7_3__1 ;
    public final void rule__WorkDefinition__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:2567:1: ( rule__WorkDefinition__Group_7_3__0__Impl rule__WorkDefinition__Group_7_3__1 )
            // InternalSimplePDL.g:2568:2: rule__WorkDefinition__Group_7_3__0__Impl rule__WorkDefinition__Group_7_3__1
            {
            pushFollow(FOLLOW_22);
            rule__WorkDefinition__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_7_3__1();

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
    // $ANTLR end "rule__WorkDefinition__Group_7_3__0"


    // $ANTLR start "rule__WorkDefinition__Group_7_3__0__Impl"
    // InternalSimplePDL.g:2575:1: rule__WorkDefinition__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__WorkDefinition__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:2579:1: ( ( ',' ) )
            // InternalSimplePDL.g:2580:1: ( ',' )
            {
            // InternalSimplePDL.g:2580:1: ( ',' )
            // InternalSimplePDL.g:2581:2: ','
            {
             before(grammarAccess.getWorkDefinitionAccess().getCommaKeyword_7_3_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getCommaKeyword_7_3_0()); 

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
    // $ANTLR end "rule__WorkDefinition__Group_7_3__0__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_7_3__1"
    // InternalSimplePDL.g:2590:1: rule__WorkDefinition__Group_7_3__1 : rule__WorkDefinition__Group_7_3__1__Impl ;
    public final void rule__WorkDefinition__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:2594:1: ( rule__WorkDefinition__Group_7_3__1__Impl )
            // InternalSimplePDL.g:2595:2: rule__WorkDefinition__Group_7_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_7_3__1__Impl();

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
    // $ANTLR end "rule__WorkDefinition__Group_7_3__1"


    // $ANTLR start "rule__WorkDefinition__Group_7_3__1__Impl"
    // InternalSimplePDL.g:2601:1: rule__WorkDefinition__Group_7_3__1__Impl : ( ( rule__WorkDefinition__ParameterAssignment_7_3_1 ) ) ;
    public final void rule__WorkDefinition__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:2605:1: ( ( ( rule__WorkDefinition__ParameterAssignment_7_3_1 ) ) )
            // InternalSimplePDL.g:2606:1: ( ( rule__WorkDefinition__ParameterAssignment_7_3_1 ) )
            {
            // InternalSimplePDL.g:2606:1: ( ( rule__WorkDefinition__ParameterAssignment_7_3_1 ) )
            // InternalSimplePDL.g:2607:2: ( rule__WorkDefinition__ParameterAssignment_7_3_1 )
            {
             before(grammarAccess.getWorkDefinitionAccess().getParameterAssignment_7_3_1()); 
            // InternalSimplePDL.g:2608:2: ( rule__WorkDefinition__ParameterAssignment_7_3_1 )
            // InternalSimplePDL.g:2608:3: rule__WorkDefinition__ParameterAssignment_7_3_1
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__ParameterAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getWorkDefinitionAccess().getParameterAssignment_7_3_1()); 

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
    // $ANTLR end "rule__WorkDefinition__Group_7_3__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalSimplePDL.g:2617:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:2621:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalSimplePDL.g:2622:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

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
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalSimplePDL.g:2629:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:2633:1: ( ( ( '-' )? ) )
            // InternalSimplePDL.g:2634:1: ( ( '-' )? )
            {
            // InternalSimplePDL.g:2634:1: ( ( '-' )? )
            // InternalSimplePDL.g:2635:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalSimplePDL.g:2636:2: ( '-' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==37) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSimplePDL.g:2636:3: '-'
                    {
                    match(input,37,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalSimplePDL.g:2644:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:2648:1: ( rule__EInt__Group__1__Impl )
            // InternalSimplePDL.g:2649:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

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
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalSimplePDL.g:2655:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:2659:1: ( ( RULE_INT ) )
            // InternalSimplePDL.g:2660:1: ( RULE_INT )
            {
            // InternalSimplePDL.g:2660:1: ( RULE_INT )
            // InternalSimplePDL.g:2661:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalSimplePDL.g:2671:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:2675:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalSimplePDL.g:2676:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__1();

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
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // InternalSimplePDL.g:2683:1: rule__Parameter__Group__0__Impl : ( 'Parameter' ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:2687:1: ( ( 'Parameter' ) )
            // InternalSimplePDL.g:2688:1: ( 'Parameter' )
            {
            // InternalSimplePDL.g:2688:1: ( 'Parameter' )
            // InternalSimplePDL.g:2689:2: 'Parameter'
            {
             before(grammarAccess.getParameterAccess().getParameterKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getParameterKeyword_0()); 

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
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // InternalSimplePDL.g:2698:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:2702:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalSimplePDL.g:2703:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__Parameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__2();

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
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // InternalSimplePDL.g:2710:1: rule__Parameter__Group__1__Impl : ( '{' ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:2714:1: ( ( '{' ) )
            // InternalSimplePDL.g:2715:1: ( '{' )
            {
            // InternalSimplePDL.g:2715:1: ( '{' )
            // InternalSimplePDL.g:2716:2: '{'
            {
             before(grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__Parameter__Group__2"
    // InternalSimplePDL.g:2725:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl rule__Parameter__Group__3 ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:2729:1: ( rule__Parameter__Group__2__Impl rule__Parameter__Group__3 )
            // InternalSimplePDL.g:2730:2: rule__Parameter__Group__2__Impl rule__Parameter__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Parameter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__3();

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
    // $ANTLR end "rule__Parameter__Group__2"


    // $ANTLR start "rule__Parameter__Group__2__Impl"
    // InternalSimplePDL.g:2737:1: rule__Parameter__Group__2__Impl : ( 'quantity' ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:2741:1: ( ( 'quantity' ) )
            // InternalSimplePDL.g:2742:1: ( 'quantity' )
            {
            // InternalSimplePDL.g:2742:1: ( 'quantity' )
            // InternalSimplePDL.g:2743:2: 'quantity'
            {
             before(grammarAccess.getParameterAccess().getQuantityKeyword_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getQuantityKeyword_2()); 

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
    // $ANTLR end "rule__Parameter__Group__2__Impl"


    // $ANTLR start "rule__Parameter__Group__3"
    // InternalSimplePDL.g:2752:1: rule__Parameter__Group__3 : rule__Parameter__Group__3__Impl rule__Parameter__Group__4 ;
    public final void rule__Parameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:2756:1: ( rule__Parameter__Group__3__Impl rule__Parameter__Group__4 )
            // InternalSimplePDL.g:2757:2: rule__Parameter__Group__3__Impl rule__Parameter__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__Parameter__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__4();

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
    // $ANTLR end "rule__Parameter__Group__3"


    // $ANTLR start "rule__Parameter__Group__3__Impl"
    // InternalSimplePDL.g:2764:1: rule__Parameter__Group__3__Impl : ( ( rule__Parameter__QuantityAssignment_3 ) ) ;
    public final void rule__Parameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:2768:1: ( ( ( rule__Parameter__QuantityAssignment_3 ) ) )
            // InternalSimplePDL.g:2769:1: ( ( rule__Parameter__QuantityAssignment_3 ) )
            {
            // InternalSimplePDL.g:2769:1: ( ( rule__Parameter__QuantityAssignment_3 ) )
            // InternalSimplePDL.g:2770:2: ( rule__Parameter__QuantityAssignment_3 )
            {
             before(grammarAccess.getParameterAccess().getQuantityAssignment_3()); 
            // InternalSimplePDL.g:2771:2: ( rule__Parameter__QuantityAssignment_3 )
            // InternalSimplePDL.g:2771:3: rule__Parameter__QuantityAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__QuantityAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getQuantityAssignment_3()); 

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
    // $ANTLR end "rule__Parameter__Group__3__Impl"


    // $ANTLR start "rule__Parameter__Group__4"
    // InternalSimplePDL.g:2779:1: rule__Parameter__Group__4 : rule__Parameter__Group__4__Impl rule__Parameter__Group__5 ;
    public final void rule__Parameter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:2783:1: ( rule__Parameter__Group__4__Impl rule__Parameter__Group__5 )
            // InternalSimplePDL.g:2784:2: rule__Parameter__Group__4__Impl rule__Parameter__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__Parameter__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__5();

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
    // $ANTLR end "rule__Parameter__Group__4"


    // $ANTLR start "rule__Parameter__Group__4__Impl"
    // InternalSimplePDL.g:2791:1: rule__Parameter__Group__4__Impl : ( 'resource' ) ;
    public final void rule__Parameter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:2795:1: ( ( 'resource' ) )
            // InternalSimplePDL.g:2796:1: ( 'resource' )
            {
            // InternalSimplePDL.g:2796:1: ( 'resource' )
            // InternalSimplePDL.g:2797:2: 'resource'
            {
             before(grammarAccess.getParameterAccess().getResourceKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getResourceKeyword_4()); 

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
    // $ANTLR end "rule__Parameter__Group__4__Impl"


    // $ANTLR start "rule__Parameter__Group__5"
    // InternalSimplePDL.g:2806:1: rule__Parameter__Group__5 : rule__Parameter__Group__5__Impl rule__Parameter__Group__6 ;
    public final void rule__Parameter__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:2810:1: ( rule__Parameter__Group__5__Impl rule__Parameter__Group__6 )
            // InternalSimplePDL.g:2811:2: rule__Parameter__Group__5__Impl rule__Parameter__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__Parameter__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__6();

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
    // $ANTLR end "rule__Parameter__Group__5"


    // $ANTLR start "rule__Parameter__Group__5__Impl"
    // InternalSimplePDL.g:2818:1: rule__Parameter__Group__5__Impl : ( ( rule__Parameter__ResourceAssignment_5 ) ) ;
    public final void rule__Parameter__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:2822:1: ( ( ( rule__Parameter__ResourceAssignment_5 ) ) )
            // InternalSimplePDL.g:2823:1: ( ( rule__Parameter__ResourceAssignment_5 ) )
            {
            // InternalSimplePDL.g:2823:1: ( ( rule__Parameter__ResourceAssignment_5 ) )
            // InternalSimplePDL.g:2824:2: ( rule__Parameter__ResourceAssignment_5 )
            {
             before(grammarAccess.getParameterAccess().getResourceAssignment_5()); 
            // InternalSimplePDL.g:2825:2: ( rule__Parameter__ResourceAssignment_5 )
            // InternalSimplePDL.g:2825:3: rule__Parameter__ResourceAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__ResourceAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getResourceAssignment_5()); 

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
    // $ANTLR end "rule__Parameter__Group__5__Impl"


    // $ANTLR start "rule__Parameter__Group__6"
    // InternalSimplePDL.g:2833:1: rule__Parameter__Group__6 : rule__Parameter__Group__6__Impl ;
    public final void rule__Parameter__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:2837:1: ( rule__Parameter__Group__6__Impl )
            // InternalSimplePDL.g:2838:2: rule__Parameter__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__6__Impl();

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
    // $ANTLR end "rule__Parameter__Group__6"


    // $ANTLR start "rule__Parameter__Group__6__Impl"
    // InternalSimplePDL.g:2844:1: rule__Parameter__Group__6__Impl : ( '}' ) ;
    public final void rule__Parameter__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:2848:1: ( ( '}' ) )
            // InternalSimplePDL.g:2849:1: ( '}' )
            {
            // InternalSimplePDL.g:2849:1: ( '}' )
            // InternalSimplePDL.g:2850:2: '}'
            {
             before(grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Parameter__Group__6__Impl"


    // $ANTLR start "rule__Process__NameAssignment_1"
    // InternalSimplePDL.g:2860:1: rule__Process__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Process__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:2864:1: ( ( ruleEString ) )
            // InternalSimplePDL.g:2865:2: ( ruleEString )
            {
            // InternalSimplePDL.g:2865:2: ( ruleEString )
            // InternalSimplePDL.g:2866:3: ruleEString
            {
             before(grammarAccess.getProcessAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Process__NameAssignment_1"


    // $ANTLR start "rule__Process__WorksequenceAssignment_3_2"
    // InternalSimplePDL.g:2875:1: rule__Process__WorksequenceAssignment_3_2 : ( ruleWorkSequence ) ;
    public final void rule__Process__WorksequenceAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:2879:1: ( ( ruleWorkSequence ) )
            // InternalSimplePDL.g:2880:2: ( ruleWorkSequence )
            {
            // InternalSimplePDL.g:2880:2: ( ruleWorkSequence )
            // InternalSimplePDL.g:2881:3: ruleWorkSequence
            {
             before(grammarAccess.getProcessAccess().getWorksequenceWorkSequenceParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleWorkSequence();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getWorksequenceWorkSequenceParserRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__Process__WorksequenceAssignment_3_2"


    // $ANTLR start "rule__Process__WorksequenceAssignment_3_3_1"
    // InternalSimplePDL.g:2890:1: rule__Process__WorksequenceAssignment_3_3_1 : ( ruleWorkSequence ) ;
    public final void rule__Process__WorksequenceAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:2894:1: ( ( ruleWorkSequence ) )
            // InternalSimplePDL.g:2895:2: ( ruleWorkSequence )
            {
            // InternalSimplePDL.g:2895:2: ( ruleWorkSequence )
            // InternalSimplePDL.g:2896:3: ruleWorkSequence
            {
             before(grammarAccess.getProcessAccess().getWorksequenceWorkSequenceParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWorkSequence();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getWorksequenceWorkSequenceParserRuleCall_3_3_1_0()); 

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
    // $ANTLR end "rule__Process__WorksequenceAssignment_3_3_1"


    // $ANTLR start "rule__Process__GuidanceAssignment_4_2"
    // InternalSimplePDL.g:2905:1: rule__Process__GuidanceAssignment_4_2 : ( ruleGuidance ) ;
    public final void rule__Process__GuidanceAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:2909:1: ( ( ruleGuidance ) )
            // InternalSimplePDL.g:2910:2: ( ruleGuidance )
            {
            // InternalSimplePDL.g:2910:2: ( ruleGuidance )
            // InternalSimplePDL.g:2911:3: ruleGuidance
            {
             before(grammarAccess.getProcessAccess().getGuidanceGuidanceParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleGuidance();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getGuidanceGuidanceParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__Process__GuidanceAssignment_4_2"


    // $ANTLR start "rule__Process__GuidanceAssignment_4_3_1"
    // InternalSimplePDL.g:2920:1: rule__Process__GuidanceAssignment_4_3_1 : ( ruleGuidance ) ;
    public final void rule__Process__GuidanceAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:2924:1: ( ( ruleGuidance ) )
            // InternalSimplePDL.g:2925:2: ( ruleGuidance )
            {
            // InternalSimplePDL.g:2925:2: ( ruleGuidance )
            // InternalSimplePDL.g:2926:3: ruleGuidance
            {
             before(grammarAccess.getProcessAccess().getGuidanceGuidanceParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGuidance();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getGuidanceGuidanceParserRuleCall_4_3_1_0()); 

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
    // $ANTLR end "rule__Process__GuidanceAssignment_4_3_1"


    // $ANTLR start "rule__Process__ResourceAssignment_5_2"
    // InternalSimplePDL.g:2935:1: rule__Process__ResourceAssignment_5_2 : ( ruleResource ) ;
    public final void rule__Process__ResourceAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:2939:1: ( ( ruleResource ) )
            // InternalSimplePDL.g:2940:2: ( ruleResource )
            {
            // InternalSimplePDL.g:2940:2: ( ruleResource )
            // InternalSimplePDL.g:2941:3: ruleResource
            {
             before(grammarAccess.getProcessAccess().getResourceResourceParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleResource();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getResourceResourceParserRuleCall_5_2_0()); 

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
    // $ANTLR end "rule__Process__ResourceAssignment_5_2"


    // $ANTLR start "rule__Process__ResourceAssignment_5_3_1"
    // InternalSimplePDL.g:2950:1: rule__Process__ResourceAssignment_5_3_1 : ( ruleResource ) ;
    public final void rule__Process__ResourceAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:2954:1: ( ( ruleResource ) )
            // InternalSimplePDL.g:2955:2: ( ruleResource )
            {
            // InternalSimplePDL.g:2955:2: ( ruleResource )
            // InternalSimplePDL.g:2956:3: ruleResource
            {
             before(grammarAccess.getProcessAccess().getResourceResourceParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleResource();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getResourceResourceParserRuleCall_5_3_1_0()); 

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
    // $ANTLR end "rule__Process__ResourceAssignment_5_3_1"


    // $ANTLR start "rule__Process__WorkdefinitionAssignment_8"
    // InternalSimplePDL.g:2965:1: rule__Process__WorkdefinitionAssignment_8 : ( ruleWorkDefinition ) ;
    public final void rule__Process__WorkdefinitionAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:2969:1: ( ( ruleWorkDefinition ) )
            // InternalSimplePDL.g:2970:2: ( ruleWorkDefinition )
            {
            // InternalSimplePDL.g:2970:2: ( ruleWorkDefinition )
            // InternalSimplePDL.g:2971:3: ruleWorkDefinition
            {
             before(grammarAccess.getProcessAccess().getWorkdefinitionWorkDefinitionParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleWorkDefinition();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getWorkdefinitionWorkDefinitionParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__Process__WorkdefinitionAssignment_8"


    // $ANTLR start "rule__Process__WorkdefinitionAssignment_9_1"
    // InternalSimplePDL.g:2980:1: rule__Process__WorkdefinitionAssignment_9_1 : ( ruleWorkDefinition ) ;
    public final void rule__Process__WorkdefinitionAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:2984:1: ( ( ruleWorkDefinition ) )
            // InternalSimplePDL.g:2985:2: ( ruleWorkDefinition )
            {
            // InternalSimplePDL.g:2985:2: ( ruleWorkDefinition )
            // InternalSimplePDL.g:2986:3: ruleWorkDefinition
            {
             before(grammarAccess.getProcessAccess().getWorkdefinitionWorkDefinitionParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWorkDefinition();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getWorkdefinitionWorkDefinitionParserRuleCall_9_1_0()); 

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
    // $ANTLR end "rule__Process__WorkdefinitionAssignment_9_1"


    // $ANTLR start "rule__WorkSequence__LinkTypeAssignment_2_1"
    // InternalSimplePDL.g:2995:1: rule__WorkSequence__LinkTypeAssignment_2_1 : ( ruleWorkSequenceType ) ;
    public final void rule__WorkSequence__LinkTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:2999:1: ( ( ruleWorkSequenceType ) )
            // InternalSimplePDL.g:3000:2: ( ruleWorkSequenceType )
            {
            // InternalSimplePDL.g:3000:2: ( ruleWorkSequenceType )
            // InternalSimplePDL.g:3001:3: ruleWorkSequenceType
            {
             before(grammarAccess.getWorkSequenceAccess().getLinkTypeWorkSequenceTypeEnumRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWorkSequenceType();

            state._fsp--;

             after(grammarAccess.getWorkSequenceAccess().getLinkTypeWorkSequenceTypeEnumRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__WorkSequence__LinkTypeAssignment_2_1"


    // $ANTLR start "rule__WorkSequence__PredecessorAssignment_4"
    // InternalSimplePDL.g:3010:1: rule__WorkSequence__PredecessorAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__WorkSequence__PredecessorAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:3014:1: ( ( ( ruleEString ) ) )
            // InternalSimplePDL.g:3015:2: ( ( ruleEString ) )
            {
            // InternalSimplePDL.g:3015:2: ( ( ruleEString ) )
            // InternalSimplePDL.g:3016:3: ( ruleEString )
            {
             before(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionCrossReference_4_0()); 
            // InternalSimplePDL.g:3017:3: ( ruleEString )
            // InternalSimplePDL.g:3018:4: ruleEString
            {
             before(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionCrossReference_4_0()); 

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
    // $ANTLR end "rule__WorkSequence__PredecessorAssignment_4"


    // $ANTLR start "rule__WorkSequence__SuccessorAssignment_6"
    // InternalSimplePDL.g:3029:1: rule__WorkSequence__SuccessorAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__WorkSequence__SuccessorAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:3033:1: ( ( ( ruleEString ) ) )
            // InternalSimplePDL.g:3034:2: ( ( ruleEString ) )
            {
            // InternalSimplePDL.g:3034:2: ( ( ruleEString ) )
            // InternalSimplePDL.g:3035:3: ( ruleEString )
            {
             before(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionCrossReference_6_0()); 
            // InternalSimplePDL.g:3036:3: ( ruleEString )
            // InternalSimplePDL.g:3037:4: ruleEString
            {
             before(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionEStringParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionEStringParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionCrossReference_6_0()); 

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
    // $ANTLR end "rule__WorkSequence__SuccessorAssignment_6"


    // $ANTLR start "rule__Guidance__DescriptionAssignment_3_1"
    // InternalSimplePDL.g:3048:1: rule__Guidance__DescriptionAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Guidance__DescriptionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:3052:1: ( ( ruleEString ) )
            // InternalSimplePDL.g:3053:2: ( ruleEString )
            {
            // InternalSimplePDL.g:3053:2: ( ruleEString )
            // InternalSimplePDL.g:3054:3: ruleEString
            {
             before(grammarAccess.getGuidanceAccess().getDescriptionEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGuidanceAccess().getDescriptionEStringParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Guidance__DescriptionAssignment_3_1"


    // $ANTLR start "rule__Resource__NameAssignment_1"
    // InternalSimplePDL.g:3063:1: rule__Resource__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Resource__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:3067:1: ( ( ruleEString ) )
            // InternalSimplePDL.g:3068:2: ( ruleEString )
            {
            // InternalSimplePDL.g:3068:2: ( ruleEString )
            // InternalSimplePDL.g:3069:3: ruleEString
            {
             before(grammarAccess.getResourceAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getResourceAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Resource__NameAssignment_1"


    // $ANTLR start "rule__Resource__OccuranceNoAssignment_4"
    // InternalSimplePDL.g:3078:1: rule__Resource__OccuranceNoAssignment_4 : ( ruleEInt ) ;
    public final void rule__Resource__OccuranceNoAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:3082:1: ( ( ruleEInt ) )
            // InternalSimplePDL.g:3083:2: ( ruleEInt )
            {
            // InternalSimplePDL.g:3083:2: ( ruleEInt )
            // InternalSimplePDL.g:3084:3: ruleEInt
            {
             before(grammarAccess.getResourceAccess().getOccuranceNoEIntParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getResourceAccess().getOccuranceNoEIntParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Resource__OccuranceNoAssignment_4"


    // $ANTLR start "rule__WorkDefinition__NameAssignment_2"
    // InternalSimplePDL.g:3093:1: rule__WorkDefinition__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__WorkDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:3097:1: ( ( ruleEString ) )
            // InternalSimplePDL.g:3098:2: ( ruleEString )
            {
            // InternalSimplePDL.g:3098:2: ( ruleEString )
            // InternalSimplePDL.g:3099:3: ruleEString
            {
             before(grammarAccess.getWorkDefinitionAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWorkDefinitionAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__WorkDefinition__NameAssignment_2"


    // $ANTLR start "rule__WorkDefinition__LinksToSuccessorsAssignment_4_1"
    // InternalSimplePDL.g:3108:1: rule__WorkDefinition__LinksToSuccessorsAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__WorkDefinition__LinksToSuccessorsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:3112:1: ( ( ( ruleEString ) ) )
            // InternalSimplePDL.g:3113:2: ( ( ruleEString ) )
            {
            // InternalSimplePDL.g:3113:2: ( ( ruleEString ) )
            // InternalSimplePDL.g:3114:3: ( ruleEString )
            {
             before(grammarAccess.getWorkDefinitionAccess().getLinksToSuccessorsWorkSequenceCrossReference_4_1_0()); 
            // InternalSimplePDL.g:3115:3: ( ruleEString )
            // InternalSimplePDL.g:3116:4: ruleEString
            {
             before(grammarAccess.getWorkDefinitionAccess().getLinksToSuccessorsWorkSequenceEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWorkDefinitionAccess().getLinksToSuccessorsWorkSequenceEStringParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getWorkDefinitionAccess().getLinksToSuccessorsWorkSequenceCrossReference_4_1_0()); 

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
    // $ANTLR end "rule__WorkDefinition__LinksToSuccessorsAssignment_4_1"


    // $ANTLR start "rule__WorkDefinition__LinksToPredecessorsAssignment_5_1"
    // InternalSimplePDL.g:3127:1: rule__WorkDefinition__LinksToPredecessorsAssignment_5_1 : ( ( ruleEString ) ) ;
    public final void rule__WorkDefinition__LinksToPredecessorsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:3131:1: ( ( ( ruleEString ) ) )
            // InternalSimplePDL.g:3132:2: ( ( ruleEString ) )
            {
            // InternalSimplePDL.g:3132:2: ( ( ruleEString ) )
            // InternalSimplePDL.g:3133:3: ( ruleEString )
            {
             before(grammarAccess.getWorkDefinitionAccess().getLinksToPredecessorsWorkSequenceCrossReference_5_1_0()); 
            // InternalSimplePDL.g:3134:3: ( ruleEString )
            // InternalSimplePDL.g:3135:4: ruleEString
            {
             before(grammarAccess.getWorkDefinitionAccess().getLinksToPredecessorsWorkSequenceEStringParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWorkDefinitionAccess().getLinksToPredecessorsWorkSequenceEStringParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getWorkDefinitionAccess().getLinksToPredecessorsWorkSequenceCrossReference_5_1_0()); 

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
    // $ANTLR end "rule__WorkDefinition__LinksToPredecessorsAssignment_5_1"


    // $ANTLR start "rule__WorkDefinition__GuidanceAssignment_6_2"
    // InternalSimplePDL.g:3146:1: rule__WorkDefinition__GuidanceAssignment_6_2 : ( ( ruleEString ) ) ;
    public final void rule__WorkDefinition__GuidanceAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:3150:1: ( ( ( ruleEString ) ) )
            // InternalSimplePDL.g:3151:2: ( ( ruleEString ) )
            {
            // InternalSimplePDL.g:3151:2: ( ( ruleEString ) )
            // InternalSimplePDL.g:3152:3: ( ruleEString )
            {
             before(grammarAccess.getWorkDefinitionAccess().getGuidanceGuidanceCrossReference_6_2_0()); 
            // InternalSimplePDL.g:3153:3: ( ruleEString )
            // InternalSimplePDL.g:3154:4: ruleEString
            {
             before(grammarAccess.getWorkDefinitionAccess().getGuidanceGuidanceEStringParserRuleCall_6_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWorkDefinitionAccess().getGuidanceGuidanceEStringParserRuleCall_6_2_0_1()); 

            }

             after(grammarAccess.getWorkDefinitionAccess().getGuidanceGuidanceCrossReference_6_2_0()); 

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
    // $ANTLR end "rule__WorkDefinition__GuidanceAssignment_6_2"


    // $ANTLR start "rule__WorkDefinition__GuidanceAssignment_6_3_1"
    // InternalSimplePDL.g:3165:1: rule__WorkDefinition__GuidanceAssignment_6_3_1 : ( ( ruleEString ) ) ;
    public final void rule__WorkDefinition__GuidanceAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:3169:1: ( ( ( ruleEString ) ) )
            // InternalSimplePDL.g:3170:2: ( ( ruleEString ) )
            {
            // InternalSimplePDL.g:3170:2: ( ( ruleEString ) )
            // InternalSimplePDL.g:3171:3: ( ruleEString )
            {
             before(grammarAccess.getWorkDefinitionAccess().getGuidanceGuidanceCrossReference_6_3_1_0()); 
            // InternalSimplePDL.g:3172:3: ( ruleEString )
            // InternalSimplePDL.g:3173:4: ruleEString
            {
             before(grammarAccess.getWorkDefinitionAccess().getGuidanceGuidanceEStringParserRuleCall_6_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWorkDefinitionAccess().getGuidanceGuidanceEStringParserRuleCall_6_3_1_0_1()); 

            }

             after(grammarAccess.getWorkDefinitionAccess().getGuidanceGuidanceCrossReference_6_3_1_0()); 

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
    // $ANTLR end "rule__WorkDefinition__GuidanceAssignment_6_3_1"


    // $ANTLR start "rule__WorkDefinition__ParameterAssignment_7_2"
    // InternalSimplePDL.g:3184:1: rule__WorkDefinition__ParameterAssignment_7_2 : ( ruleParameter ) ;
    public final void rule__WorkDefinition__ParameterAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:3188:1: ( ( ruleParameter ) )
            // InternalSimplePDL.g:3189:2: ( ruleParameter )
            {
            // InternalSimplePDL.g:3189:2: ( ruleParameter )
            // InternalSimplePDL.g:3190:3: ruleParameter
            {
             before(grammarAccess.getWorkDefinitionAccess().getParameterParameterParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getWorkDefinitionAccess().getParameterParameterParserRuleCall_7_2_0()); 

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
    // $ANTLR end "rule__WorkDefinition__ParameterAssignment_7_2"


    // $ANTLR start "rule__WorkDefinition__ParameterAssignment_7_3_1"
    // InternalSimplePDL.g:3199:1: rule__WorkDefinition__ParameterAssignment_7_3_1 : ( ruleParameter ) ;
    public final void rule__WorkDefinition__ParameterAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:3203:1: ( ( ruleParameter ) )
            // InternalSimplePDL.g:3204:2: ( ruleParameter )
            {
            // InternalSimplePDL.g:3204:2: ( ruleParameter )
            // InternalSimplePDL.g:3205:3: ruleParameter
            {
             before(grammarAccess.getWorkDefinitionAccess().getParameterParameterParserRuleCall_7_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getWorkDefinitionAccess().getParameterParameterParserRuleCall_7_3_1_0()); 

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
    // $ANTLR end "rule__WorkDefinition__ParameterAssignment_7_3_1"


    // $ANTLR start "rule__Parameter__QuantityAssignment_3"
    // InternalSimplePDL.g:3214:1: rule__Parameter__QuantityAssignment_3 : ( ruleEInt ) ;
    public final void rule__Parameter__QuantityAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:3218:1: ( ( ruleEInt ) )
            // InternalSimplePDL.g:3219:2: ( ruleEInt )
            {
            // InternalSimplePDL.g:3219:2: ( ruleEInt )
            // InternalSimplePDL.g:3220:3: ruleEInt
            {
             before(grammarAccess.getParameterAccess().getQuantityEIntParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getQuantityEIntParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Parameter__QuantityAssignment_3"


    // $ANTLR start "rule__Parameter__ResourceAssignment_5"
    // InternalSimplePDL.g:3229:1: rule__Parameter__ResourceAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__Parameter__ResourceAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:3233:1: ( ( ( ruleEString ) ) )
            // InternalSimplePDL.g:3234:2: ( ( ruleEString ) )
            {
            // InternalSimplePDL.g:3234:2: ( ( ruleEString ) )
            // InternalSimplePDL.g:3235:3: ( ruleEString )
            {
             before(grammarAccess.getParameterAccess().getResourceResourceCrossReference_5_0()); 
            // InternalSimplePDL.g:3236:3: ( ruleEString )
            // InternalSimplePDL.g:3237:4: ruleEString
            {
             before(grammarAccess.getParameterAccess().getResourceResourceEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getResourceResourceEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getParameterAccess().getResourceResourceCrossReference_5_0()); 

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
    // $ANTLR end "rule__Parameter__ResourceAssignment_5"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000006A0000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000005000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010040000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000002000000040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000001300240000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000800100000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000400000L});

}