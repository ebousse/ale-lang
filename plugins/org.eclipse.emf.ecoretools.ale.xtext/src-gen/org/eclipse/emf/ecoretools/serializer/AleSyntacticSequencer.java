/*******************************************************************************
 * Copyright (c) 2017 Inria and Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Inria - initial API and implementation
 *
 * generated by Xtext 2.10.0
 *******************************************************************************/
package org.eclipse.emf.ecoretools.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecoretools.services.AleGrammarAccess;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class AleSyntacticSequencer extends AbstractSyntacticSequencer {

	protected AleGrammarAccess grammarAccess;
	protected AbstractElementAlias match_rAttribute___ColonEqualsSignKeyword_5_0_ExpressionParserRuleCall_5_1__q;
	protected AbstractElementAlias match_rOpenClass___ExtendsKeyword_3_0_RQualifiedParserRuleCall_3_1___CommaKeyword_3_2_0_RQualifiedParserRuleCall_3_2_1__a__q;
	protected AbstractElementAlias match_rOperation_DefKeyword_1_0_or_OverrideKeyword_1_1;
	protected AbstractElementAlias match_rOperation_RTagParserRuleCall_0_a;
	protected AbstractElementAlias match_rRoot_RImportParserRuleCall_3_a;
	protected AbstractElementAlias match_rRoot_RServiceParserRuleCall_4_a;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (AleGrammarAccess) access;
		match_rAttribute___ColonEqualsSignKeyword_5_0_ExpressionParserRuleCall_5_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getRAttributeAccess().getColonEqualsSignKeyword_5_0()), new TokenAlias(false, false, grammarAccess.getRAttributeAccess().getExpressionParserRuleCall_5_1()));
		match_rOpenClass___ExtendsKeyword_3_0_RQualifiedParserRuleCall_3_1___CommaKeyword_3_2_0_RQualifiedParserRuleCall_3_2_1__a__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getROpenClassAccess().getExtendsKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getROpenClassAccess().getRQualifiedParserRuleCall_3_1()), new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getROpenClassAccess().getCommaKeyword_3_2_0()), new TokenAlias(false, false, grammarAccess.getROpenClassAccess().getRQualifiedParserRuleCall_3_2_1())));
		match_rOperation_DefKeyword_1_0_or_OverrideKeyword_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getROperationAccess().getDefKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getROperationAccess().getOverrideKeyword_1_1()));
		match_rOperation_RTagParserRuleCall_0_a = new TokenAlias(true, true, grammarAccess.getROperationAccess().getRTagParserRuleCall_0());
		match_rRoot_RImportParserRuleCall_3_a = new TokenAlias(true, true, grammarAccess.getRRootAccess().getRImportParserRuleCall_3());
		match_rRoot_RServiceParserRuleCall_4_a = new TokenAlias(true, true, grammarAccess.getRRootAccess().getRServiceParserRuleCall_4());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getExpressionRule())
			return getexpressionToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getRImportRule())
			return getrImportToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getRQualifiedRule())
			return getrQualifiedToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getRServiceRule())
			return getrServiceToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getRTagRule())
			return getrTagToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * expression :
	 * 	nonLeftRecExpression recExpression?
	 * ;
	 */
	protected String getexpressionToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "not";
	}
	
	/**
	 * rImport : 'import' rQualified 'as' Ident ';'
	 * ;
	 */
	protected String getrImportToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "importas;";
	}
	
	/**
	 * rQualified : Ident ('.'Ident)*
	 * ;
	 */
	protected String getrQualifiedToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * rService : 'use' Ident ('.' Ident)* ';'
	 * ;
	 */
	protected String getrServiceToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "use;";
	}
	
	/**
	 * rTag : '@'Ident
	 * ;
	 */
	protected String getrTagToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "@";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_rAttribute___ColonEqualsSignKeyword_5_0_ExpressionParserRuleCall_5_1__q.equals(syntax))
				emit_rAttribute___ColonEqualsSignKeyword_5_0_ExpressionParserRuleCall_5_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_rOpenClass___ExtendsKeyword_3_0_RQualifiedParserRuleCall_3_1___CommaKeyword_3_2_0_RQualifiedParserRuleCall_3_2_1__a__q.equals(syntax))
				emit_rOpenClass___ExtendsKeyword_3_0_RQualifiedParserRuleCall_3_1___CommaKeyword_3_2_0_RQualifiedParserRuleCall_3_2_1__a__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_rOperation_DefKeyword_1_0_or_OverrideKeyword_1_1.equals(syntax))
				emit_rOperation_DefKeyword_1_0_or_OverrideKeyword_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_rOperation_RTagParserRuleCall_0_a.equals(syntax))
				emit_rOperation_RTagParserRuleCall_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_rRoot_RImportParserRuleCall_3_a.equals(syntax))
				emit_rRoot_RImportParserRuleCall_3_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_rRoot_RServiceParserRuleCall_4_a.equals(syntax))
				emit_rRoot_RServiceParserRuleCall_4_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     (':=' expression)?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=Ident (ambiguity) ';' (rule end)
	 */
	protected void emit_rAttribute___ColonEqualsSignKeyword_5_0_ExpressionParserRuleCall_5_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('extends' rQualified (',' rQualified)*)?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=rQualified (ambiguity) '{' '}' (rule end)
	 *     name=rQualified (ambiguity) '{' attributes+=rAttribute
	 *     name=rQualified (ambiguity) '{' operations+=rOperation
	 */
	protected void emit_rOpenClass___ExtendsKeyword_3_0_RQualifiedParserRuleCall_3_1___CommaKeyword_3_2_0_RQualifiedParserRuleCall_3_2_1__a__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'def' | 'override'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) rTag* (ambiguity) type=rType
	 */
	protected void emit_rOperation_DefKeyword_1_0_or_OverrideKeyword_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     rTag*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) ('def' | 'override') type=rType
	 */
	protected void emit_rOperation_RTagParserRuleCall_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     rImport*
	 *
	 * This ambiguous syntax occurs at:
	 *     name=rQualified ';' (ambiguity) rService* (rule end)
	 *     name=rQualified ';' (ambiguity) rService* xtendedClasses+=rClass
	 */
	protected void emit_rRoot_RImportParserRuleCall_3_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     rService*
	 *
	 * This ambiguous syntax occurs at:
	 *     name=rQualified ';' rImport* (ambiguity) (rule end)
	 *     name=rQualified ';' rImport* (ambiguity) xtendedClasses+=rClass
	 */
	protected void emit_rRoot_RServiceParserRuleCall_4_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
