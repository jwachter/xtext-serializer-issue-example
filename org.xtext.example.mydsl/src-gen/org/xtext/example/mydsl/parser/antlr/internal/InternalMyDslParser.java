package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'root'", "'('", "')'", "'{'", "'}'", "'ref'", "'@'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=6;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Root";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRoot"
    // InternalMyDsl.g:64:1: entryRuleRoot returns [EObject current=null] : iv_ruleRoot= ruleRoot EOF ;
    public final EObject entryRuleRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoot = null;


        try {
            // InternalMyDsl.g:64:45: (iv_ruleRoot= ruleRoot EOF )
            // InternalMyDsl.g:65:2: iv_ruleRoot= ruleRoot EOF
            {
             newCompositeNode(grammarAccess.getRootRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoot=ruleRoot();

            state._fsp--;

             current =iv_ruleRoot; 
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
    // $ANTLR end "entryRuleRoot"


    // $ANTLR start "ruleRoot"
    // InternalMyDsl.g:71:1: ruleRoot returns [EObject current=null] : (otherlv_0= 'root' otherlv_1= '(' ( (lv_ref_2_0= RULE_STRING ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_entries_5_0= ruleAnEntry ) )* otherlv_6= '}' ) ;
    public final EObject ruleRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_ref_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_entries_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( (otherlv_0= 'root' otherlv_1= '(' ( (lv_ref_2_0= RULE_STRING ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_entries_5_0= ruleAnEntry ) )* otherlv_6= '}' ) )
            // InternalMyDsl.g:78:2: (otherlv_0= 'root' otherlv_1= '(' ( (lv_ref_2_0= RULE_STRING ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_entries_5_0= ruleAnEntry ) )* otherlv_6= '}' )
            {
            // InternalMyDsl.g:78:2: (otherlv_0= 'root' otherlv_1= '(' ( (lv_ref_2_0= RULE_STRING ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_entries_5_0= ruleAnEntry ) )* otherlv_6= '}' )
            // InternalMyDsl.g:79:3: otherlv_0= 'root' otherlv_1= '(' ( (lv_ref_2_0= RULE_STRING ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_entries_5_0= ruleAnEntry ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRootAccess().getRootKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getRootAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:87:3: ( (lv_ref_2_0= RULE_STRING ) )
            // InternalMyDsl.g:88:4: (lv_ref_2_0= RULE_STRING )
            {
            // InternalMyDsl.g:88:4: (lv_ref_2_0= RULE_STRING )
            // InternalMyDsl.g:89:5: lv_ref_2_0= RULE_STRING
            {
            lv_ref_2_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            					newLeafNode(lv_ref_2_0, grammarAccess.getRootAccess().getRefSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRootRule());
            					}
            					setWithLastConsumed(
            						current,
            						"ref",
            						lv_ref_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getRootAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getRootAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalMyDsl.g:113:3: ( (lv_entries_5_0= ruleAnEntry ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:114:4: (lv_entries_5_0= ruleAnEntry )
            	    {
            	    // InternalMyDsl.g:114:4: (lv_entries_5_0= ruleAnEntry )
            	    // InternalMyDsl.g:115:5: lv_entries_5_0= ruleAnEntry
            	    {

            	    					newCompositeNode(grammarAccess.getRootAccess().getEntriesAnEntryParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_entries_5_0=ruleAnEntry();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRootRule());
            	    					}
            	    					add(
            	    						current,
            	    						"entries",
            	    						lv_entries_5_0,
            	    						"org.xtext.example.mydsl.MyDsl.AnEntry");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getRootAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleRoot"


    // $ANTLR start "entryRuleAnEntry"
    // InternalMyDsl.g:140:1: entryRuleAnEntry returns [EObject current=null] : iv_ruleAnEntry= ruleAnEntry EOF ;
    public final EObject entryRuleAnEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnEntry = null;


        try {
            // InternalMyDsl.g:140:48: (iv_ruleAnEntry= ruleAnEntry EOF )
            // InternalMyDsl.g:141:2: iv_ruleAnEntry= ruleAnEntry EOF
            {
             newCompositeNode(grammarAccess.getAnEntryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnEntry=ruleAnEntry();

            state._fsp--;

             current =iv_ruleAnEntry; 
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
    // $ANTLR end "entryRuleAnEntry"


    // $ANTLR start "ruleAnEntry"
    // InternalMyDsl.g:147:1: ruleAnEntry returns [EObject current=null] : (otherlv_0= 'ref' ( (lv_key_1_0= RULE_STRING ) ) otherlv_2= '@' ( (lv_value_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleAnEntry() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_key_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:153:2: ( (otherlv_0= 'ref' ( (lv_key_1_0= RULE_STRING ) ) otherlv_2= '@' ( (lv_value_3_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:154:2: (otherlv_0= 'ref' ( (lv_key_1_0= RULE_STRING ) ) otherlv_2= '@' ( (lv_value_3_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:154:2: (otherlv_0= 'ref' ( (lv_key_1_0= RULE_STRING ) ) otherlv_2= '@' ( (lv_value_3_0= RULE_STRING ) ) )
            // InternalMyDsl.g:155:3: otherlv_0= 'ref' ( (lv_key_1_0= RULE_STRING ) ) otherlv_2= '@' ( (lv_value_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAnEntryAccess().getRefKeyword_0());
            		
            // InternalMyDsl.g:159:3: ( (lv_key_1_0= RULE_STRING ) )
            // InternalMyDsl.g:160:4: (lv_key_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:160:4: (lv_key_1_0= RULE_STRING )
            // InternalMyDsl.g:161:5: lv_key_1_0= RULE_STRING
            {
            lv_key_1_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_key_1_0, grammarAccess.getAnEntryAccess().getKeySTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAnEntryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"key",
            						lv_key_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getAnEntryAccess().getCommercialAtKeyword_2());
            		
            // InternalMyDsl.g:181:3: ( (lv_value_3_0= RULE_STRING ) )
            // InternalMyDsl.g:182:4: (lv_value_3_0= RULE_STRING )
            {
            // InternalMyDsl.g:182:4: (lv_value_3_0= RULE_STRING )
            // InternalMyDsl.g:183:5: lv_value_3_0= RULE_STRING
            {
            lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_3_0, grammarAccess.getAnEntryAccess().getValueSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAnEntryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleAnEntry"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});

}