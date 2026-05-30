package org.example.quickgui2.parser.antlr.internal;

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
import org.example.quickgui2.services.QuickGUIGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalQuickGUIParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'loginApp'", "'{'", "'}'", "'window'", "'panel'", "'field'", "'name'", "'type'", "'button'", "'action'", "'text'", "'password'", "'login'", "'cancel'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalQuickGUIParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalQuickGUIParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalQuickGUIParser.tokenNames; }
    public String getGrammarFileName() { return "InternalQuickGUI.g"; }



     	private QuickGUIGrammarAccess grammarAccess;

        public InternalQuickGUIParser(TokenStream input, QuickGUIGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Program";
       	}

       	@Override
       	protected QuickGUIGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProgram"
    // InternalQuickGUI.g:65:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalQuickGUI.g:65:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalQuickGUI.g:66:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalQuickGUI.g:72:1: ruleProgram returns [EObject current=null] : (otherlv_0= 'loginApp' otherlv_1= '{' ( (lv_window_2_0= ruleWindow ) ) otherlv_3= '}' ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_window_2_0 = null;



        	enterRule();

        try {
            // InternalQuickGUI.g:78:2: ( (otherlv_0= 'loginApp' otherlv_1= '{' ( (lv_window_2_0= ruleWindow ) ) otherlv_3= '}' ) )
            // InternalQuickGUI.g:79:2: (otherlv_0= 'loginApp' otherlv_1= '{' ( (lv_window_2_0= ruleWindow ) ) otherlv_3= '}' )
            {
            // InternalQuickGUI.g:79:2: (otherlv_0= 'loginApp' otherlv_1= '{' ( (lv_window_2_0= ruleWindow ) ) otherlv_3= '}' )
            // InternalQuickGUI.g:80:3: otherlv_0= 'loginApp' otherlv_1= '{' ( (lv_window_2_0= ruleWindow ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProgramAccess().getLoginAppKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalQuickGUI.g:88:3: ( (lv_window_2_0= ruleWindow ) )
            // InternalQuickGUI.g:89:4: (lv_window_2_0= ruleWindow )
            {
            // InternalQuickGUI.g:89:4: (lv_window_2_0= ruleWindow )
            // InternalQuickGUI.g:90:5: lv_window_2_0= ruleWindow
            {

            					newCompositeNode(grammarAccess.getProgramAccess().getWindowWindowParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_window_2_0=ruleWindow();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProgramRule());
            					}
            					set(
            						current,
            						"window",
            						lv_window_2_0,
            						"org.example.quickgui2.QuickGUI.Window");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleWindow"
    // InternalQuickGUI.g:115:1: entryRuleWindow returns [EObject current=null] : iv_ruleWindow= ruleWindow EOF ;
    public final EObject entryRuleWindow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWindow = null;


        try {
            // InternalQuickGUI.g:115:47: (iv_ruleWindow= ruleWindow EOF )
            // InternalQuickGUI.g:116:2: iv_ruleWindow= ruleWindow EOF
            {
             newCompositeNode(grammarAccess.getWindowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWindow=ruleWindow();

            state._fsp--;

             current =iv_ruleWindow; 
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
    // $ANTLR end "entryRuleWindow"


    // $ANTLR start "ruleWindow"
    // InternalQuickGUI.g:122:1: ruleWindow returns [EObject current=null] : (otherlv_0= 'window' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_panel_3_0= rulePanel ) ) otherlv_4= '}' ) ;
    public final EObject ruleWindow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_title_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_panel_3_0 = null;



        	enterRule();

        try {
            // InternalQuickGUI.g:128:2: ( (otherlv_0= 'window' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_panel_3_0= rulePanel ) ) otherlv_4= '}' ) )
            // InternalQuickGUI.g:129:2: (otherlv_0= 'window' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_panel_3_0= rulePanel ) ) otherlv_4= '}' )
            {
            // InternalQuickGUI.g:129:2: (otherlv_0= 'window' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_panel_3_0= rulePanel ) ) otherlv_4= '}' )
            // InternalQuickGUI.g:130:3: otherlv_0= 'window' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_panel_3_0= rulePanel ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getWindowAccess().getWindowKeyword_0());
            		
            // InternalQuickGUI.g:134:3: ( (lv_title_1_0= RULE_STRING ) )
            // InternalQuickGUI.g:135:4: (lv_title_1_0= RULE_STRING )
            {
            // InternalQuickGUI.g:135:4: (lv_title_1_0= RULE_STRING )
            // InternalQuickGUI.g:136:5: lv_title_1_0= RULE_STRING
            {
            lv_title_1_0=(Token)match(input,RULE_STRING,FOLLOW_3); 

            					newLeafNode(lv_title_1_0, grammarAccess.getWindowAccess().getTitleSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWindowRule());
            					}
            					setWithLastConsumed(
            						current,
            						"title",
            						lv_title_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getWindowAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQuickGUI.g:156:3: ( (lv_panel_3_0= rulePanel ) )
            // InternalQuickGUI.g:157:4: (lv_panel_3_0= rulePanel )
            {
            // InternalQuickGUI.g:157:4: (lv_panel_3_0= rulePanel )
            // InternalQuickGUI.g:158:5: lv_panel_3_0= rulePanel
            {

            					newCompositeNode(grammarAccess.getWindowAccess().getPanelPanelParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_panel_3_0=rulePanel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWindowRule());
            					}
            					set(
            						current,
            						"panel",
            						lv_panel_3_0,
            						"org.example.quickgui2.QuickGUI.Panel");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getWindowAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleWindow"


    // $ANTLR start "entryRulePanel"
    // InternalQuickGUI.g:183:1: entryRulePanel returns [EObject current=null] : iv_rulePanel= rulePanel EOF ;
    public final EObject entryRulePanel() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePanel = null;


        try {
            // InternalQuickGUI.g:183:46: (iv_rulePanel= rulePanel EOF )
            // InternalQuickGUI.g:184:2: iv_rulePanel= rulePanel EOF
            {
             newCompositeNode(grammarAccess.getPanelRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePanel=rulePanel();

            state._fsp--;

             current =iv_rulePanel; 
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
    // $ANTLR end "entryRulePanel"


    // $ANTLR start "rulePanel"
    // InternalQuickGUI.g:190:1: rulePanel returns [EObject current=null] : (otherlv_0= 'panel' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_components_3_0= ruleComponent ) )* otherlv_4= '}' ) ;
    public final EObject rulePanel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_title_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_components_3_0 = null;



        	enterRule();

        try {
            // InternalQuickGUI.g:196:2: ( (otherlv_0= 'panel' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_components_3_0= ruleComponent ) )* otherlv_4= '}' ) )
            // InternalQuickGUI.g:197:2: (otherlv_0= 'panel' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_components_3_0= ruleComponent ) )* otherlv_4= '}' )
            {
            // InternalQuickGUI.g:197:2: (otherlv_0= 'panel' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_components_3_0= ruleComponent ) )* otherlv_4= '}' )
            // InternalQuickGUI.g:198:3: otherlv_0= 'panel' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_components_3_0= ruleComponent ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getPanelAccess().getPanelKeyword_0());
            		
            // InternalQuickGUI.g:202:3: ( (lv_title_1_0= RULE_STRING ) )
            // InternalQuickGUI.g:203:4: (lv_title_1_0= RULE_STRING )
            {
            // InternalQuickGUI.g:203:4: (lv_title_1_0= RULE_STRING )
            // InternalQuickGUI.g:204:5: lv_title_1_0= RULE_STRING
            {
            lv_title_1_0=(Token)match(input,RULE_STRING,FOLLOW_3); 

            					newLeafNode(lv_title_1_0, grammarAccess.getPanelAccess().getTitleSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPanelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"title",
            						lv_title_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getPanelAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQuickGUI.g:224:3: ( (lv_components_3_0= ruleComponent ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16||LA1_0==19) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalQuickGUI.g:225:4: (lv_components_3_0= ruleComponent )
            	    {
            	    // InternalQuickGUI.g:225:4: (lv_components_3_0= ruleComponent )
            	    // InternalQuickGUI.g:226:5: lv_components_3_0= ruleComponent
            	    {

            	    					newCompositeNode(grammarAccess.getPanelAccess().getComponentsComponentParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_components_3_0=ruleComponent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPanelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"components",
            	    						lv_components_3_0,
            	    						"org.example.quickgui2.QuickGUI.Component");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getPanelAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "rulePanel"


    // $ANTLR start "entryRuleComponent"
    // InternalQuickGUI.g:251:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalQuickGUI.g:251:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalQuickGUI.g:252:2: iv_ruleComponent= ruleComponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponent=ruleComponent();

            state._fsp--;

             current =iv_ruleComponent; 
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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalQuickGUI.g:258:1: ruleComponent returns [EObject current=null] : (this_Field_0= ruleField | this_Button_1= ruleButton ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        EObject this_Field_0 = null;

        EObject this_Button_1 = null;



        	enterRule();

        try {
            // InternalQuickGUI.g:264:2: ( (this_Field_0= ruleField | this_Button_1= ruleButton ) )
            // InternalQuickGUI.g:265:2: (this_Field_0= ruleField | this_Button_1= ruleButton )
            {
            // InternalQuickGUI.g:265:2: (this_Field_0= ruleField | this_Button_1= ruleButton )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            else if ( (LA2_0==19) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalQuickGUI.g:266:3: this_Field_0= ruleField
                    {

                    			newCompositeNode(grammarAccess.getComponentAccess().getFieldParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Field_0=ruleField();

                    state._fsp--;


                    			current = this_Field_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalQuickGUI.g:275:3: this_Button_1= ruleButton
                    {

                    			newCompositeNode(grammarAccess.getComponentAccess().getButtonParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Button_1=ruleButton();

                    state._fsp--;


                    			current = this_Button_1;
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
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleField"
    // InternalQuickGUI.g:287:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalQuickGUI.g:287:46: (iv_ruleField= ruleField EOF )
            // InternalQuickGUI.g:288:2: iv_ruleField= ruleField EOF
            {
             newCompositeNode(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleField=ruleField();

            state._fsp--;

             current =iv_ruleField; 
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
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalQuickGUI.g:294:1: ruleField returns [EObject current=null] : (otherlv_0= 'field' ( (lv_label_1_0= RULE_STRING ) ) otherlv_2= 'name' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'type' ( (lv_type_5_0= ruleFieldType ) ) ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_label_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Enumerator lv_type_5_0 = null;



        	enterRule();

        try {
            // InternalQuickGUI.g:300:2: ( (otherlv_0= 'field' ( (lv_label_1_0= RULE_STRING ) ) otherlv_2= 'name' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'type' ( (lv_type_5_0= ruleFieldType ) ) ) )
            // InternalQuickGUI.g:301:2: (otherlv_0= 'field' ( (lv_label_1_0= RULE_STRING ) ) otherlv_2= 'name' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'type' ( (lv_type_5_0= ruleFieldType ) ) )
            {
            // InternalQuickGUI.g:301:2: (otherlv_0= 'field' ( (lv_label_1_0= RULE_STRING ) ) otherlv_2= 'name' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'type' ( (lv_type_5_0= ruleFieldType ) ) )
            // InternalQuickGUI.g:302:3: otherlv_0= 'field' ( (lv_label_1_0= RULE_STRING ) ) otherlv_2= 'name' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'type' ( (lv_type_5_0= ruleFieldType ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getFieldAccess().getFieldKeyword_0());
            		
            // InternalQuickGUI.g:306:3: ( (lv_label_1_0= RULE_STRING ) )
            // InternalQuickGUI.g:307:4: (lv_label_1_0= RULE_STRING )
            {
            // InternalQuickGUI.g:307:4: (lv_label_1_0= RULE_STRING )
            // InternalQuickGUI.g:308:5: lv_label_1_0= RULE_STRING
            {
            lv_label_1_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_label_1_0, grammarAccess.getFieldAccess().getLabelSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"label",
            						lv_label_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getFieldAccess().getNameKeyword_2());
            		
            // InternalQuickGUI.g:328:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalQuickGUI.g:329:4: (lv_name_3_0= RULE_ID )
            {
            // InternalQuickGUI.g:329:4: (lv_name_3_0= RULE_ID )
            // InternalQuickGUI.g:330:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_3_0, grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getFieldAccess().getTypeKeyword_4());
            		
            // InternalQuickGUI.g:350:3: ( (lv_type_5_0= ruleFieldType ) )
            // InternalQuickGUI.g:351:4: (lv_type_5_0= ruleFieldType )
            {
            // InternalQuickGUI.g:351:4: (lv_type_5_0= ruleFieldType )
            // InternalQuickGUI.g:352:5: lv_type_5_0= ruleFieldType
            {

            					newCompositeNode(grammarAccess.getFieldAccess().getTypeFieldTypeEnumRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_5_0=ruleFieldType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFieldRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_5_0,
            						"org.example.quickgui2.QuickGUI.FieldType");
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
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleButton"
    // InternalQuickGUI.g:373:1: entryRuleButton returns [EObject current=null] : iv_ruleButton= ruleButton EOF ;
    public final EObject entryRuleButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButton = null;


        try {
            // InternalQuickGUI.g:373:47: (iv_ruleButton= ruleButton EOF )
            // InternalQuickGUI.g:374:2: iv_ruleButton= ruleButton EOF
            {
             newCompositeNode(grammarAccess.getButtonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleButton=ruleButton();

            state._fsp--;

             current =iv_ruleButton; 
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
    // $ANTLR end "entryRuleButton"


    // $ANTLR start "ruleButton"
    // InternalQuickGUI.g:380:1: ruleButton returns [EObject current=null] : (otherlv_0= 'button' ( (lv_text_1_0= RULE_STRING ) ) otherlv_2= 'action' ( (lv_action_3_0= ruleButtonAction ) ) ) ;
    public final EObject ruleButton() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_text_1_0=null;
        Token otherlv_2=null;
        Enumerator lv_action_3_0 = null;



        	enterRule();

        try {
            // InternalQuickGUI.g:386:2: ( (otherlv_0= 'button' ( (lv_text_1_0= RULE_STRING ) ) otherlv_2= 'action' ( (lv_action_3_0= ruleButtonAction ) ) ) )
            // InternalQuickGUI.g:387:2: (otherlv_0= 'button' ( (lv_text_1_0= RULE_STRING ) ) otherlv_2= 'action' ( (lv_action_3_0= ruleButtonAction ) ) )
            {
            // InternalQuickGUI.g:387:2: (otherlv_0= 'button' ( (lv_text_1_0= RULE_STRING ) ) otherlv_2= 'action' ( (lv_action_3_0= ruleButtonAction ) ) )
            // InternalQuickGUI.g:388:3: otherlv_0= 'button' ( (lv_text_1_0= RULE_STRING ) ) otherlv_2= 'action' ( (lv_action_3_0= ruleButtonAction ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getButtonAccess().getButtonKeyword_0());
            		
            // InternalQuickGUI.g:392:3: ( (lv_text_1_0= RULE_STRING ) )
            // InternalQuickGUI.g:393:4: (lv_text_1_0= RULE_STRING )
            {
            // InternalQuickGUI.g:393:4: (lv_text_1_0= RULE_STRING )
            // InternalQuickGUI.g:394:5: lv_text_1_0= RULE_STRING
            {
            lv_text_1_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            					newLeafNode(lv_text_1_0, grammarAccess.getButtonAccess().getTextSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getButtonRule());
            					}
            					setWithLastConsumed(
            						current,
            						"text",
            						lv_text_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getButtonAccess().getActionKeyword_2());
            		
            // InternalQuickGUI.g:414:3: ( (lv_action_3_0= ruleButtonAction ) )
            // InternalQuickGUI.g:415:4: (lv_action_3_0= ruleButtonAction )
            {
            // InternalQuickGUI.g:415:4: (lv_action_3_0= ruleButtonAction )
            // InternalQuickGUI.g:416:5: lv_action_3_0= ruleButtonAction
            {

            					newCompositeNode(grammarAccess.getButtonAccess().getActionButtonActionEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_action_3_0=ruleButtonAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getButtonRule());
            					}
            					set(
            						current,
            						"action",
            						lv_action_3_0,
            						"org.example.quickgui2.QuickGUI.ButtonAction");
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
    // $ANTLR end "ruleButton"


    // $ANTLR start "ruleFieldType"
    // InternalQuickGUI.g:437:1: ruleFieldType returns [Enumerator current=null] : ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'password' ) ) ;
    public final Enumerator ruleFieldType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalQuickGUI.g:443:2: ( ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'password' ) ) )
            // InternalQuickGUI.g:444:2: ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'password' ) )
            {
            // InternalQuickGUI.g:444:2: ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'password' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==21) ) {
                alt3=1;
            }
            else if ( (LA3_0==22) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalQuickGUI.g:445:3: (enumLiteral_0= 'text' )
                    {
                    // InternalQuickGUI.g:445:3: (enumLiteral_0= 'text' )
                    // InternalQuickGUI.g:446:4: enumLiteral_0= 'text'
                    {
                    enumLiteral_0=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getFieldTypeAccess().getTextEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getFieldTypeAccess().getTextEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalQuickGUI.g:453:3: (enumLiteral_1= 'password' )
                    {
                    // InternalQuickGUI.g:453:3: (enumLiteral_1= 'password' )
                    // InternalQuickGUI.g:454:4: enumLiteral_1= 'password'
                    {
                    enumLiteral_1=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getFieldTypeAccess().getPasswordEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getFieldTypeAccess().getPasswordEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleFieldType"


    // $ANTLR start "ruleButtonAction"
    // InternalQuickGUI.g:464:1: ruleButtonAction returns [Enumerator current=null] : ( (enumLiteral_0= 'login' ) | (enumLiteral_1= 'cancel' ) ) ;
    public final Enumerator ruleButtonAction() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalQuickGUI.g:470:2: ( ( (enumLiteral_0= 'login' ) | (enumLiteral_1= 'cancel' ) ) )
            // InternalQuickGUI.g:471:2: ( (enumLiteral_0= 'login' ) | (enumLiteral_1= 'cancel' ) )
            {
            // InternalQuickGUI.g:471:2: ( (enumLiteral_0= 'login' ) | (enumLiteral_1= 'cancel' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==23) ) {
                alt4=1;
            }
            else if ( (LA4_0==24) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalQuickGUI.g:472:3: (enumLiteral_0= 'login' )
                    {
                    // InternalQuickGUI.g:472:3: (enumLiteral_0= 'login' )
                    // InternalQuickGUI.g:473:4: enumLiteral_0= 'login'
                    {
                    enumLiteral_0=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getButtonActionAccess().getLoginEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getButtonActionAccess().getLoginEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalQuickGUI.g:480:3: (enumLiteral_1= 'cancel' )
                    {
                    // InternalQuickGUI.g:480:3: (enumLiteral_1= 'cancel' )
                    // InternalQuickGUI.g:481:4: enumLiteral_1= 'cancel'
                    {
                    enumLiteral_1=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getButtonActionAccess().getCancelEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getButtonActionAccess().getCancelEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleButtonAction"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000092000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001800000L});

}