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


    // $ANTLR start "entryRuleReferedType"
    // InternalMyDsl.g:103:1: entryRuleReferedType : ruleReferedType EOF ;
    public final void entryRuleReferedType() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleReferedType EOF )
            // InternalMyDsl.g:105:1: ruleReferedType EOF
            {
             before(grammarAccess.getReferedTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleReferedType();

            state._fsp--;

             after(grammarAccess.getReferedTypeRule()); 
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
    // $ANTLR end "entryRuleReferedType"


    // $ANTLR start "ruleReferedType"
    // InternalMyDsl.g:112:1: ruleReferedType : ( ( rule__ReferedType__RefAssignment ) ) ;
    public final void ruleReferedType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__ReferedType__RefAssignment ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__ReferedType__RefAssignment ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__ReferedType__RefAssignment ) )
            // InternalMyDsl.g:118:3: ( rule__ReferedType__RefAssignment )
            {
             before(grammarAccess.getReferedTypeAccess().getRefAssignment()); 
            // InternalMyDsl.g:119:3: ( rule__ReferedType__RefAssignment )
            // InternalMyDsl.g:119:4: rule__ReferedType__RefAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ReferedType__RefAssignment();

            state._fsp--;


            }

             after(grammarAccess.getReferedTypeAccess().getRefAssignment()); 

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
    // $ANTLR end "ruleReferedType"


    // $ANTLR start "rule__Root__Group__0"
    // InternalMyDsl.g:127:1: rule__Root__Group__0 : rule__Root__Group__0__Impl rule__Root__Group__1 ;
    public final void rule__Root__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:131:1: ( rule__Root__Group__0__Impl rule__Root__Group__1 )
            // InternalMyDsl.g:132:2: rule__Root__Group__0__Impl rule__Root__Group__1
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
    // InternalMyDsl.g:139:1: rule__Root__Group__0__Impl : ( 'root' ) ;
    public final void rule__Root__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:143:1: ( ( 'root' ) )
            // InternalMyDsl.g:144:1: ( 'root' )
            {
            // InternalMyDsl.g:144:1: ( 'root' )
            // InternalMyDsl.g:145:2: 'root'
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
    // InternalMyDsl.g:154:1: rule__Root__Group__1 : rule__Root__Group__1__Impl rule__Root__Group__2 ;
    public final void rule__Root__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:158:1: ( rule__Root__Group__1__Impl rule__Root__Group__2 )
            // InternalMyDsl.g:159:2: rule__Root__Group__1__Impl rule__Root__Group__2
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
    // InternalMyDsl.g:166:1: rule__Root__Group__1__Impl : ( '(' ) ;
    public final void rule__Root__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:170:1: ( ( '(' ) )
            // InternalMyDsl.g:171:1: ( '(' )
            {
            // InternalMyDsl.g:171:1: ( '(' )
            // InternalMyDsl.g:172:2: '('
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
    // InternalMyDsl.g:181:1: rule__Root__Group__2 : rule__Root__Group__2__Impl rule__Root__Group__3 ;
    public final void rule__Root__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:185:1: ( rule__Root__Group__2__Impl rule__Root__Group__3 )
            // InternalMyDsl.g:186:2: rule__Root__Group__2__Impl rule__Root__Group__3
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
    // InternalMyDsl.g:193:1: rule__Root__Group__2__Impl : ( ( rule__Root__RefAssignment_2 ) ) ;
    public final void rule__Root__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:197:1: ( ( ( rule__Root__RefAssignment_2 ) ) )
            // InternalMyDsl.g:198:1: ( ( rule__Root__RefAssignment_2 ) )
            {
            // InternalMyDsl.g:198:1: ( ( rule__Root__RefAssignment_2 ) )
            // InternalMyDsl.g:199:2: ( rule__Root__RefAssignment_2 )
            {
             before(grammarAccess.getRootAccess().getRefAssignment_2()); 
            // InternalMyDsl.g:200:2: ( rule__Root__RefAssignment_2 )
            // InternalMyDsl.g:200:3: rule__Root__RefAssignment_2
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
    // InternalMyDsl.g:208:1: rule__Root__Group__3 : rule__Root__Group__3__Impl rule__Root__Group__4 ;
    public final void rule__Root__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:212:1: ( rule__Root__Group__3__Impl rule__Root__Group__4 )
            // InternalMyDsl.g:213:2: rule__Root__Group__3__Impl rule__Root__Group__4
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
    // InternalMyDsl.g:220:1: rule__Root__Group__3__Impl : ( ')' ) ;
    public final void rule__Root__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:224:1: ( ( ')' ) )
            // InternalMyDsl.g:225:1: ( ')' )
            {
            // InternalMyDsl.g:225:1: ( ')' )
            // InternalMyDsl.g:226:2: ')'
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
    // InternalMyDsl.g:235:1: rule__Root__Group__4 : rule__Root__Group__4__Impl rule__Root__Group__5 ;
    public final void rule__Root__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:239:1: ( rule__Root__Group__4__Impl rule__Root__Group__5 )
            // InternalMyDsl.g:240:2: rule__Root__Group__4__Impl rule__Root__Group__5
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
    // InternalMyDsl.g:247:1: rule__Root__Group__4__Impl : ( '{' ) ;
    public final void rule__Root__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:251:1: ( ( '{' ) )
            // InternalMyDsl.g:252:1: ( '{' )
            {
            // InternalMyDsl.g:252:1: ( '{' )
            // InternalMyDsl.g:253:2: '{'
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
    // InternalMyDsl.g:262:1: rule__Root__Group__5 : rule__Root__Group__5__Impl rule__Root__Group__6 ;
    public final void rule__Root__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:1: ( rule__Root__Group__5__Impl rule__Root__Group__6 )
            // InternalMyDsl.g:267:2: rule__Root__Group__5__Impl rule__Root__Group__6
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
    // InternalMyDsl.g:274:1: rule__Root__Group__5__Impl : ( ( rule__Root__EntriesAssignment_5 )* ) ;
    public final void rule__Root__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:278:1: ( ( ( rule__Root__EntriesAssignment_5 )* ) )
            // InternalMyDsl.g:279:1: ( ( rule__Root__EntriesAssignment_5 )* )
            {
            // InternalMyDsl.g:279:1: ( ( rule__Root__EntriesAssignment_5 )* )
            // InternalMyDsl.g:280:2: ( rule__Root__EntriesAssignment_5 )*
            {
             before(grammarAccess.getRootAccess().getEntriesAssignment_5()); 
            // InternalMyDsl.g:281:2: ( rule__Root__EntriesAssignment_5 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:281:3: rule__Root__EntriesAssignment_5
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
    // InternalMyDsl.g:289:1: rule__Root__Group__6 : rule__Root__Group__6__Impl ;
    public final void rule__Root__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:293:1: ( rule__Root__Group__6__Impl )
            // InternalMyDsl.g:294:2: rule__Root__Group__6__Impl
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
    // InternalMyDsl.g:300:1: rule__Root__Group__6__Impl : ( '}' ) ;
    public final void rule__Root__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:304:1: ( ( '}' ) )
            // InternalMyDsl.g:305:1: ( '}' )
            {
            // InternalMyDsl.g:305:1: ( '}' )
            // InternalMyDsl.g:306:2: '}'
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
    // InternalMyDsl.g:316:1: rule__AnEntry__Group__0 : rule__AnEntry__Group__0__Impl rule__AnEntry__Group__1 ;
    public final void rule__AnEntry__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:320:1: ( rule__AnEntry__Group__0__Impl rule__AnEntry__Group__1 )
            // InternalMyDsl.g:321:2: rule__AnEntry__Group__0__Impl rule__AnEntry__Group__1
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
    // InternalMyDsl.g:328:1: rule__AnEntry__Group__0__Impl : ( 'ref' ) ;
    public final void rule__AnEntry__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:332:1: ( ( 'ref' ) )
            // InternalMyDsl.g:333:1: ( 'ref' )
            {
            // InternalMyDsl.g:333:1: ( 'ref' )
            // InternalMyDsl.g:334:2: 'ref'
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
    // InternalMyDsl.g:343:1: rule__AnEntry__Group__1 : rule__AnEntry__Group__1__Impl rule__AnEntry__Group__2 ;
    public final void rule__AnEntry__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:347:1: ( rule__AnEntry__Group__1__Impl rule__AnEntry__Group__2 )
            // InternalMyDsl.g:348:2: rule__AnEntry__Group__1__Impl rule__AnEntry__Group__2
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
    // InternalMyDsl.g:355:1: rule__AnEntry__Group__1__Impl : ( ( rule__AnEntry__KeyAssignment_1 ) ) ;
    public final void rule__AnEntry__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:359:1: ( ( ( rule__AnEntry__KeyAssignment_1 ) ) )
            // InternalMyDsl.g:360:1: ( ( rule__AnEntry__KeyAssignment_1 ) )
            {
            // InternalMyDsl.g:360:1: ( ( rule__AnEntry__KeyAssignment_1 ) )
            // InternalMyDsl.g:361:2: ( rule__AnEntry__KeyAssignment_1 )
            {
             before(grammarAccess.getAnEntryAccess().getKeyAssignment_1()); 
            // InternalMyDsl.g:362:2: ( rule__AnEntry__KeyAssignment_1 )
            // InternalMyDsl.g:362:3: rule__AnEntry__KeyAssignment_1
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
    // InternalMyDsl.g:370:1: rule__AnEntry__Group__2 : rule__AnEntry__Group__2__Impl rule__AnEntry__Group__3 ;
    public final void rule__AnEntry__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:374:1: ( rule__AnEntry__Group__2__Impl rule__AnEntry__Group__3 )
            // InternalMyDsl.g:375:2: rule__AnEntry__Group__2__Impl rule__AnEntry__Group__3
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
    // InternalMyDsl.g:382:1: rule__AnEntry__Group__2__Impl : ( '@' ) ;
    public final void rule__AnEntry__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:386:1: ( ( '@' ) )
            // InternalMyDsl.g:387:1: ( '@' )
            {
            // InternalMyDsl.g:387:1: ( '@' )
            // InternalMyDsl.g:388:2: '@'
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
    // InternalMyDsl.g:397:1: rule__AnEntry__Group__3 : rule__AnEntry__Group__3__Impl ;
    public final void rule__AnEntry__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:401:1: ( rule__AnEntry__Group__3__Impl )
            // InternalMyDsl.g:402:2: rule__AnEntry__Group__3__Impl
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
    // InternalMyDsl.g:408:1: rule__AnEntry__Group__3__Impl : ( ( rule__AnEntry__ValueAssignment_3 ) ) ;
    public final void rule__AnEntry__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:412:1: ( ( ( rule__AnEntry__ValueAssignment_3 ) ) )
            // InternalMyDsl.g:413:1: ( ( rule__AnEntry__ValueAssignment_3 ) )
            {
            // InternalMyDsl.g:413:1: ( ( rule__AnEntry__ValueAssignment_3 ) )
            // InternalMyDsl.g:414:2: ( rule__AnEntry__ValueAssignment_3 )
            {
             before(grammarAccess.getAnEntryAccess().getValueAssignment_3()); 
            // InternalMyDsl.g:415:2: ( rule__AnEntry__ValueAssignment_3 )
            // InternalMyDsl.g:415:3: rule__AnEntry__ValueAssignment_3
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
    // InternalMyDsl.g:424:1: rule__Root__RefAssignment_2 : ( ruleReferedType ) ;
    public final void rule__Root__RefAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:428:1: ( ( ruleReferedType ) )
            // InternalMyDsl.g:429:2: ( ruleReferedType )
            {
            // InternalMyDsl.g:429:2: ( ruleReferedType )
            // InternalMyDsl.g:430:3: ruleReferedType
            {
             before(grammarAccess.getRootAccess().getRefReferedTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleReferedType();

            state._fsp--;

             after(grammarAccess.getRootAccess().getRefReferedTypeParserRuleCall_2_0()); 

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
    // InternalMyDsl.g:439:1: rule__Root__EntriesAssignment_5 : ( ruleAnEntry ) ;
    public final void rule__Root__EntriesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:443:1: ( ( ruleAnEntry ) )
            // InternalMyDsl.g:444:2: ( ruleAnEntry )
            {
            // InternalMyDsl.g:444:2: ( ruleAnEntry )
            // InternalMyDsl.g:445:3: ruleAnEntry
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
    // InternalMyDsl.g:454:1: rule__AnEntry__KeyAssignment_1 : ( ruleReferedType ) ;
    public final void rule__AnEntry__KeyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:458:1: ( ( ruleReferedType ) )
            // InternalMyDsl.g:459:2: ( ruleReferedType )
            {
            // InternalMyDsl.g:459:2: ( ruleReferedType )
            // InternalMyDsl.g:460:3: ruleReferedType
            {
             before(grammarAccess.getAnEntryAccess().getKeyReferedTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleReferedType();

            state._fsp--;

             after(grammarAccess.getAnEntryAccess().getKeyReferedTypeParserRuleCall_1_0()); 

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
    // InternalMyDsl.g:469:1: rule__AnEntry__ValueAssignment_3 : ( ruleReferedType ) ;
    public final void rule__AnEntry__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:473:1: ( ( ruleReferedType ) )
            // InternalMyDsl.g:474:2: ( ruleReferedType )
            {
            // InternalMyDsl.g:474:2: ( ruleReferedType )
            // InternalMyDsl.g:475:3: ruleReferedType
            {
             before(grammarAccess.getAnEntryAccess().getValueReferedTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleReferedType();

            state._fsp--;

             after(grammarAccess.getAnEntryAccess().getValueReferedTypeParserRuleCall_3_0()); 

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


    // $ANTLR start "rule__ReferedType__RefAssignment"
    // InternalMyDsl.g:484:1: rule__ReferedType__RefAssignment : ( RULE_STRING ) ;
    public final void rule__ReferedType__RefAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:488:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:489:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:489:2: ( RULE_STRING )
            // InternalMyDsl.g:490:3: RULE_STRING
            {
             before(grammarAccess.getReferedTypeAccess().getRefSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getReferedTypeAccess().getRefSTRINGTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__ReferedType__RefAssignment"

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