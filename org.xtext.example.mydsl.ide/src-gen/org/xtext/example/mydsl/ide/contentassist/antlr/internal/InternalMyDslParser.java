package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

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
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleRoot"
    // InternalMyDsl.g:53:1: entryRuleRoot : ruleRoot EOF ;
    public final void entryRuleRoot() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleRoot EOF )
            // InternalMyDsl.g:55:1: ruleRoot EOF
            {
             before(grammarAccess.getRootRule()); 
            pushFollow(FOLLOW_1);
            ruleRoot();

            state._fsp--;

             after(grammarAccess.getRootRule()); 
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
    // $ANTLR end "entryRuleRoot"


    // $ANTLR start "ruleRoot"
    // InternalMyDsl.g:62:1: ruleRoot : ( ( rule__Root__Group__0 ) ) ;
    public final void ruleRoot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Root__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__Root__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Root__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__Root__Group__0 )
            {
             before(grammarAccess.getRootAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__Root__Group__0 )
            // InternalMyDsl.g:69:4: rule__Root__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Root__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRootAccess().getGroup()); 

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
    // $ANTLR end "ruleRoot"


    // $ANTLR start "entryRuleAnEntry"
    // InternalMyDsl.g:78:1: entryRuleAnEntry : ruleAnEntry EOF ;
    public final void entryRuleAnEntry() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleAnEntry EOF )
            // InternalMyDsl.g:80:1: ruleAnEntry EOF
            {
             before(grammarAccess.getAnEntryRule()); 
            pushFollow(FOLLOW_1);
            ruleAnEntry();

            state._fsp--;

             after(grammarAccess.getAnEntryRule()); 
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
    // $ANTLR end "entryRuleAnEntry"


    // $ANTLR start "ruleAnEntry"
    // InternalMyDsl.g:87:1: ruleAnEntry : ( ( rule__AnEntry__Group__0 ) ) ;
    public final void ruleAnEntry() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__AnEntry__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__AnEntry__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__AnEntry__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__AnEntry__Group__0 )
            {
             before(grammarAccess.getAnEntryAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__AnEntry__Group__0 )
            // InternalMyDsl.g:94:4: rule__AnEntry__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AnEntry__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAnEntryAccess().getGroup()); 

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
    // $ANTLR end "ruleAnEntry"


    // $ANTLR start "rule__Root__Group__0"
    // InternalMyDsl.g:102:1: rule__Root__Group__0 : rule__Root__Group__0__Impl rule__Root__Group__1 ;
    public final void rule__Root__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:106:1: ( rule__Root__Group__0__Impl rule__Root__Group__1 )
            // InternalMyDsl.g:107:2: rule__Root__Group__0__Impl rule__Root__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Root__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Root__Group__1();

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
    // $ANTLR end "rule__Root__Group__0"


    // $ANTLR start "rule__Root__Group__0__Impl"
    // InternalMyDsl.g:114:1: rule__Root__Group__0__Impl : ( 'root' ) ;
    public final void rule__Root__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:118:1: ( ( 'root' ) )
            // InternalMyDsl.g:119:1: ( 'root' )
            {
            // InternalMyDsl.g:119:1: ( 'root' )
            // InternalMyDsl.g:120:2: 'root'
            {
             before(grammarAccess.getRootAccess().getRootKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getRootAccess().getRootKeyword_0()); 

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
    // $ANTLR end "rule__Root__Group__0__Impl"


    // $ANTLR start "rule__Root__Group__1"
    // InternalMyDsl.g:129:1: rule__Root__Group__1 : rule__Root__Group__1__Impl rule__Root__Group__2 ;
    public final void rule__Root__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:133:1: ( rule__Root__Group__1__Impl rule__Root__Group__2 )
            // InternalMyDsl.g:134:2: rule__Root__Group__1__Impl rule__Root__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Root__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Root__Group__2();

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
    // $ANTLR end "rule__Root__Group__1"


    // $ANTLR start "rule__Root__Group__1__Impl"
    // InternalMyDsl.g:141:1: rule__Root__Group__1__Impl : ( '(' ) ;
    public final void rule__Root__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:145:1: ( ( '(' ) )
            // InternalMyDsl.g:146:1: ( '(' )
            {
            // InternalMyDsl.g:146:1: ( '(' )
            // InternalMyDsl.g:147:2: '('
            {
             before(grammarAccess.getRootAccess().getLeftParenthesisKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRootAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__Root__Group__1__Impl"


    // $ANTLR start "rule__Root__Group__2"
    // InternalMyDsl.g:156:1: rule__Root__Group__2 : rule__Root__Group__2__Impl rule__Root__Group__3 ;
    public final void rule__Root__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:160:1: ( rule__Root__Group__2__Impl rule__Root__Group__3 )
            // InternalMyDsl.g:161:2: rule__Root__Group__2__Impl rule__Root__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Root__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Root__Group__3();

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
    // $ANTLR end "rule__Root__Group__2"


    // $ANTLR start "rule__Root__Group__2__Impl"
    // InternalMyDsl.g:168:1: rule__Root__Group__2__Impl : ( ( rule__Root__RefAssignment_2 ) ) ;
    public final void rule__Root__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:172:1: ( ( ( rule__Root__RefAssignment_2 ) ) )
            // InternalMyDsl.g:173:1: ( ( rule__Root__RefAssignment_2 ) )
            {
            // InternalMyDsl.g:173:1: ( ( rule__Root__RefAssignment_2 ) )
            // InternalMyDsl.g:174:2: ( rule__Root__RefAssignment_2 )
            {
             before(grammarAccess.getRootAccess().getRefAssignment_2()); 
            // InternalMyDsl.g:175:2: ( rule__Root__RefAssignment_2 )
            // InternalMyDsl.g:175:3: rule__Root__RefAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Root__RefAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRootAccess().getRefAssignment_2()); 

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
    // $ANTLR end "rule__Root__Group__2__Impl"


    // $ANTLR start "rule__Root__Group__3"
    // InternalMyDsl.g:183:1: rule__Root__Group__3 : rule__Root__Group__3__Impl rule__Root__Group__4 ;
    public final void rule__Root__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:187:1: ( rule__Root__Group__3__Impl rule__Root__Group__4 )
            // InternalMyDsl.g:188:2: rule__Root__Group__3__Impl rule__Root__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Root__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Root__Group__4();

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
    // $ANTLR end "rule__Root__Group__3"


    // $ANTLR start "rule__Root__Group__3__Impl"
    // InternalMyDsl.g:195:1: rule__Root__Group__3__Impl : ( ')' ) ;
    public final void rule__Root__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:199:1: ( ( ')' ) )
            // InternalMyDsl.g:200:1: ( ')' )
            {
            // InternalMyDsl.g:200:1: ( ')' )
            // InternalMyDsl.g:201:2: ')'
            {
             before(grammarAccess.getRootAccess().getRightParenthesisKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRootAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__Root__Group__3__Impl"


    // $ANTLR start "rule__Root__Group__4"
    // InternalMyDsl.g:210:1: rule__Root__Group__4 : rule__Root__Group__4__Impl rule__Root__Group__5 ;
    public final void rule__Root__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:214:1: ( rule__Root__Group__4__Impl rule__Root__Group__5 )
            // InternalMyDsl.g:215:2: rule__Root__Group__4__Impl rule__Root__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Root__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Root__Group__5();

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
    // $ANTLR end "rule__Root__Group__4"


    // $ANTLR start "rule__Root__Group__4__Impl"
    // InternalMyDsl.g:222:1: rule__Root__Group__4__Impl : ( '{' ) ;
    public final void rule__Root__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:226:1: ( ( '{' ) )
            // InternalMyDsl.g:227:1: ( '{' )
            {
            // InternalMyDsl.g:227:1: ( '{' )
            // InternalMyDsl.g:228:2: '{'
            {
             before(grammarAccess.getRootAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRootAccess().getLeftCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Root__Group__4__Impl"


    // $ANTLR start "rule__Root__Group__5"
    // InternalMyDsl.g:237:1: rule__Root__Group__5 : rule__Root__Group__5__Impl rule__Root__Group__6 ;
    public final void rule__Root__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:1: ( rule__Root__Group__5__Impl rule__Root__Group__6 )
            // InternalMyDsl.g:242:2: rule__Root__Group__5__Impl rule__Root__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Root__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Root__Group__6();

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
    // $ANTLR end "rule__Root__Group__5"


    // $ANTLR start "rule__Root__Group__5__Impl"
    // InternalMyDsl.g:249:1: rule__Root__Group__5__Impl : ( ( rule__Root__EntriesAssignment_5 )* ) ;
    public final void rule__Root__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:253:1: ( ( ( rule__Root__EntriesAssignment_5 )* ) )
            // InternalMyDsl.g:254:1: ( ( rule__Root__EntriesAssignment_5 )* )
            {
            // InternalMyDsl.g:254:1: ( ( rule__Root__EntriesAssignment_5 )* )
            // InternalMyDsl.g:255:2: ( rule__Root__EntriesAssignment_5 )*
            {
             before(grammarAccess.getRootAccess().getEntriesAssignment_5()); 
            // InternalMyDsl.g:256:2: ( rule__Root__EntriesAssignment_5 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:256:3: rule__Root__EntriesAssignment_5
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Root__EntriesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getRootAccess().getEntriesAssignment_5()); 

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
    // $ANTLR end "rule__Root__Group__5__Impl"


    // $ANTLR start "rule__Root__Group__6"
    // InternalMyDsl.g:264:1: rule__Root__Group__6 : rule__Root__Group__6__Impl ;
    public final void rule__Root__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:268:1: ( rule__Root__Group__6__Impl )
            // InternalMyDsl.g:269:2: rule__Root__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Root__Group__6__Impl();

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
    // $ANTLR end "rule__Root__Group__6"


    // $ANTLR start "rule__Root__Group__6__Impl"
    // InternalMyDsl.g:275:1: rule__Root__Group__6__Impl : ( '}' ) ;
    public final void rule__Root__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:279:1: ( ( '}' ) )
            // InternalMyDsl.g:280:1: ( '}' )
            {
            // InternalMyDsl.g:280:1: ( '}' )
            // InternalMyDsl.g:281:2: '}'
            {
             before(grammarAccess.getRootAccess().getRightCurlyBracketKeyword_6()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getRootAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Root__Group__6__Impl"


    // $ANTLR start "rule__AnEntry__Group__0"
    // InternalMyDsl.g:291:1: rule__AnEntry__Group__0 : rule__AnEntry__Group__0__Impl rule__AnEntry__Group__1 ;
    public final void rule__AnEntry__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:295:1: ( rule__AnEntry__Group__0__Impl rule__AnEntry__Group__1 )
            // InternalMyDsl.g:296:2: rule__AnEntry__Group__0__Impl rule__AnEntry__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__AnEntry__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AnEntry__Group__1();

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
    // $ANTLR end "rule__AnEntry__Group__0"


    // $ANTLR start "rule__AnEntry__Group__0__Impl"
    // InternalMyDsl.g:303:1: rule__AnEntry__Group__0__Impl : ( 'ref' ) ;
    public final void rule__AnEntry__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:307:1: ( ( 'ref' ) )
            // InternalMyDsl.g:308:1: ( 'ref' )
            {
            // InternalMyDsl.g:308:1: ( 'ref' )
            // InternalMyDsl.g:309:2: 'ref'
            {
             before(grammarAccess.getAnEntryAccess().getRefKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getAnEntryAccess().getRefKeyword_0()); 

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
    // $ANTLR end "rule__AnEntry__Group__0__Impl"


    // $ANTLR start "rule__AnEntry__Group__1"
    // InternalMyDsl.g:318:1: rule__AnEntry__Group__1 : rule__AnEntry__Group__1__Impl rule__AnEntry__Group__2 ;
    public final void rule__AnEntry__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:322:1: ( rule__AnEntry__Group__1__Impl rule__AnEntry__Group__2 )
            // InternalMyDsl.g:323:2: rule__AnEntry__Group__1__Impl rule__AnEntry__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__AnEntry__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AnEntry__Group__2();

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
    // $ANTLR end "rule__AnEntry__Group__1"


    // $ANTLR start "rule__AnEntry__Group__1__Impl"
    // InternalMyDsl.g:330:1: rule__AnEntry__Group__1__Impl : ( ( rule__AnEntry__KeyAssignment_1 ) ) ;
    public final void rule__AnEntry__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:334:1: ( ( ( rule__AnEntry__KeyAssignment_1 ) ) )
            // InternalMyDsl.g:335:1: ( ( rule__AnEntry__KeyAssignment_1 ) )
            {
            // InternalMyDsl.g:335:1: ( ( rule__AnEntry__KeyAssignment_1 ) )
            // InternalMyDsl.g:336:2: ( rule__AnEntry__KeyAssignment_1 )
            {
             before(grammarAccess.getAnEntryAccess().getKeyAssignment_1()); 
            // InternalMyDsl.g:337:2: ( rule__AnEntry__KeyAssignment_1 )
            // InternalMyDsl.g:337:3: rule__AnEntry__KeyAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AnEntry__KeyAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAnEntryAccess().getKeyAssignment_1()); 

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
    // $ANTLR end "rule__AnEntry__Group__1__Impl"


    // $ANTLR start "rule__AnEntry__Group__2"
    // InternalMyDsl.g:345:1: rule__AnEntry__Group__2 : rule__AnEntry__Group__2__Impl rule__AnEntry__Group__3 ;
    public final void rule__AnEntry__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:349:1: ( rule__AnEntry__Group__2__Impl rule__AnEntry__Group__3 )
            // InternalMyDsl.g:350:2: rule__AnEntry__Group__2__Impl rule__AnEntry__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__AnEntry__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AnEntry__Group__3();

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
    // $ANTLR end "rule__AnEntry__Group__2"


    // $ANTLR start "rule__AnEntry__Group__2__Impl"
    // InternalMyDsl.g:357:1: rule__AnEntry__Group__2__Impl : ( '@' ) ;
    public final void rule__AnEntry__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:361:1: ( ( '@' ) )
            // InternalMyDsl.g:362:1: ( '@' )
            {
            // InternalMyDsl.g:362:1: ( '@' )
            // InternalMyDsl.g:363:2: '@'
            {
             before(grammarAccess.getAnEntryAccess().getCommercialAtKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getAnEntryAccess().getCommercialAtKeyword_2()); 

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
    // $ANTLR end "rule__AnEntry__Group__2__Impl"


    // $ANTLR start "rule__AnEntry__Group__3"
    // InternalMyDsl.g:372:1: rule__AnEntry__Group__3 : rule__AnEntry__Group__3__Impl ;
    public final void rule__AnEntry__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:376:1: ( rule__AnEntry__Group__3__Impl )
            // InternalMyDsl.g:377:2: rule__AnEntry__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AnEntry__Group__3__Impl();

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
    // $ANTLR end "rule__AnEntry__Group__3"


    // $ANTLR start "rule__AnEntry__Group__3__Impl"
    // InternalMyDsl.g:383:1: rule__AnEntry__Group__3__Impl : ( ( rule__AnEntry__ValueAssignment_3 ) ) ;
    public final void rule__AnEntry__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:387:1: ( ( ( rule__AnEntry__ValueAssignment_3 ) ) )
            // InternalMyDsl.g:388:1: ( ( rule__AnEntry__ValueAssignment_3 ) )
            {
            // InternalMyDsl.g:388:1: ( ( rule__AnEntry__ValueAssignment_3 ) )
            // InternalMyDsl.g:389:2: ( rule__AnEntry__ValueAssignment_3 )
            {
             before(grammarAccess.getAnEntryAccess().getValueAssignment_3()); 
            // InternalMyDsl.g:390:2: ( rule__AnEntry__ValueAssignment_3 )
            // InternalMyDsl.g:390:3: rule__AnEntry__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__AnEntry__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAnEntryAccess().getValueAssignment_3()); 

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
    // $ANTLR end "rule__AnEntry__Group__3__Impl"


    // $ANTLR start "rule__Root__RefAssignment_2"
    // InternalMyDsl.g:399:1: rule__Root__RefAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Root__RefAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:403:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:404:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:404:2: ( RULE_STRING )
            // InternalMyDsl.g:405:3: RULE_STRING
            {
             before(grammarAccess.getRootAccess().getRefSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRootAccess().getRefSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Root__RefAssignment_2"


    // $ANTLR start "rule__Root__EntriesAssignment_5"
    // InternalMyDsl.g:414:1: rule__Root__EntriesAssignment_5 : ( ruleAnEntry ) ;
    public final void rule__Root__EntriesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:418:1: ( ( ruleAnEntry ) )
            // InternalMyDsl.g:419:2: ( ruleAnEntry )
            {
            // InternalMyDsl.g:419:2: ( ruleAnEntry )
            // InternalMyDsl.g:420:3: ruleAnEntry
            {
             before(grammarAccess.getRootAccess().getEntriesAnEntryParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleAnEntry();

            state._fsp--;

             after(grammarAccess.getRootAccess().getEntriesAnEntryParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Root__EntriesAssignment_5"


    // $ANTLR start "rule__AnEntry__KeyAssignment_1"
    // InternalMyDsl.g:429:1: rule__AnEntry__KeyAssignment_1 : ( RULE_STRING ) ;
    public final void rule__AnEntry__KeyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:433:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:434:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:434:2: ( RULE_STRING )
            // InternalMyDsl.g:435:3: RULE_STRING
            {
             before(grammarAccess.getAnEntryAccess().getKeySTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAnEntryAccess().getKeySTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__AnEntry__KeyAssignment_1"


    // $ANTLR start "rule__AnEntry__ValueAssignment_3"
    // InternalMyDsl.g:444:1: rule__AnEntry__ValueAssignment_3 : ( RULE_STRING ) ;
    public final void rule__AnEntry__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:448:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:449:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:449:2: ( RULE_STRING )
            // InternalMyDsl.g:450:3: RULE_STRING
            {
             before(grammarAccess.getAnEntryAccess().getValueSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAnEntryAccess().getValueSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__AnEntry__ValueAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});

}