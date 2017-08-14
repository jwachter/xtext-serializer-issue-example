/*
 * generated by Xtext 2.12.0
 */
grammar InternalMyDsl;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleRoot
entryRuleRoot returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRootRule()); }
	iv_ruleRoot=ruleRoot
	{ $current=$iv_ruleRoot.current; }
	EOF;

// Rule Root
ruleRoot returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='root'
		{
			newLeafNode(otherlv_0, grammarAccess.getRootAccess().getRootKeyword_0());
		}
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getRootAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRootAccess().getRefReferedTypeParserRuleCall_2_0());
				}
				lv_ref_2_0=ruleReferedType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRootRule());
					}
					set(
						$current,
						"ref",
						lv_ref_2_0,
						"org.xtext.example.mydsl.MyDsl.ReferedType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3=')'
		{
			newLeafNode(otherlv_3, grammarAccess.getRootAccess().getRightParenthesisKeyword_3());
		}
		otherlv_4='{'
		{
			newLeafNode(otherlv_4, grammarAccess.getRootAccess().getLeftCurlyBracketKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRootAccess().getEntriesAnEntryParserRuleCall_5_0());
				}
				lv_entries_5_0=ruleAnEntry
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRootRule());
					}
					add(
						$current,
						"entries",
						lv_entries_5_0,
						"org.xtext.example.mydsl.MyDsl.AnEntry");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getRootAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleAnEntry
entryRuleAnEntry returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAnEntryRule()); }
	iv_ruleAnEntry=ruleAnEntry
	{ $current=$iv_ruleAnEntry.current; }
	EOF;

// Rule AnEntry
ruleAnEntry returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='ref'
		{
			newLeafNode(otherlv_0, grammarAccess.getAnEntryAccess().getRefKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAnEntryRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getAnEntryAccess().getKeyReferedTypeCrossReference_1_0());
				}
			)
		)
		otherlv_2='@'
		{
			newLeafNode(otherlv_2, grammarAccess.getAnEntryAccess().getCommercialAtKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAnEntryRule());
					}
				}
				otherlv_3=RULE_ID
				{
					newLeafNode(otherlv_3, grammarAccess.getAnEntryAccess().getValueReferedTypeCrossReference_3_0());
				}
			)
		)
	)
;

// Entry rule entryRuleReferedType
entryRuleReferedType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getReferedTypeRule()); }
	iv_ruleReferedType=ruleReferedType
	{ $current=$iv_ruleReferedType.current; }
	EOF;

// Rule ReferedType
ruleReferedType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_ref_0_0=RULE_STRING
			{
				newLeafNode(lv_ref_0_0, grammarAccess.getReferedTypeAccess().getRefSTRINGTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getReferedTypeRule());
				}
				setWithLastConsumed(
					$current,
					"ref",
					lv_ref_0_0,
					"org.eclipse.xtext.common.Terminals.STRING");
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;