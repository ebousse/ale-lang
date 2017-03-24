/*******************************************************************************
 * Copyright (c) 2017 Inria and Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Inria - initial API and implementation
 *******************************************************************************/
/*
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.xtext.example.mydsl.ide.contentassist.antlr.internal.InternalMyDslParser;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

public class MyDslParser extends AbstractContentAssistParser {

	@Inject
	private MyDslGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalMyDslParser createParser() {
		InternalMyDslParser result = new InternalMyDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getRClassAccess().getAlternatives(), "rule__RClass__Alternatives");
					put(grammarAccess.getROperationAccess().getAlternatives_1(), "rule__ROperation__Alternatives_1");
					put(grammarAccess.getRStatementAccess().getAlternatives(), "rule__RStatement__Alternatives");
					put(grammarAccess.getRCollectionAccess().getAlternatives(), "rule__RCollection__Alternatives");
					put(grammarAccess.getRecExpressionAccess().getAlternatives_0(), "rule__RecExpression__Alternatives_0");
					put(grammarAccess.getNavigationSegmentAccess().getAlternatives(), "rule__NavigationSegment__Alternatives");
					put(grammarAccess.getNonLeftRecExpressionAccess().getAlternatives(), "rule__NonLeftRecExpression__Alternatives");
					put(grammarAccess.getAddOpAccess().getAlternatives(), "rule__AddOp__Alternatives");
					put(grammarAccess.getCompOpAccess().getAlternatives(), "rule__CompOp__Alternatives");
					put(grammarAccess.getCallExpAccess().getAlternatives(), "rule__CallExp__Alternatives");
					put(grammarAccess.getCollectionIteratorAccess().getAlternatives(), "rule__CollectionIterator__Alternatives");
					put(grammarAccess.getLiteralAccess().getAlternatives(), "rule__Literal__Alternatives");
					put(grammarAccess.getTypeLiteralAccess().getAlternatives(), "rule__TypeLiteral__Alternatives");
					put(grammarAccess.getClassifierTypeRuleAccess().getAlternatives(), "rule__ClassifierTypeRule__Alternatives");
					put(grammarAccess.getRTypeAccess().getAlternatives(), "rule__RType__Alternatives");
					put(grammarAccess.getRRootAccess().getGroup(), "rule__RRoot__Group__0");
					put(grammarAccess.getRImportAccess().getGroup(), "rule__RImport__Group__0");
					put(grammarAccess.getRServiceAccess().getGroup(), "rule__RService__Group__0");
					put(grammarAccess.getRServiceAccess().getGroup_2(), "rule__RService__Group_2__0");
					put(grammarAccess.getROpenClassAccess().getGroup(), "rule__ROpenClass__Group__0");
					put(grammarAccess.getROpenClassAccess().getGroup_3(), "rule__ROpenClass__Group_3__0");
					put(grammarAccess.getROpenClassAccess().getGroup_3_2(), "rule__ROpenClass__Group_3_2__0");
					put(grammarAccess.getRNewClassAccess().getGroup(), "rule__RNewClass__Group__0");
					put(grammarAccess.getROperationAccess().getGroup(), "rule__ROperation__Group__0");
					put(grammarAccess.getRTagAccess().getGroup(), "rule__RTag__Group__0");
					put(grammarAccess.getRParametersAccess().getGroup(), "rule__RParameters__Group__0");
					put(grammarAccess.getRParametersAccess().getGroup_1(), "rule__RParameters__Group_1__0");
					put(grammarAccess.getRVariableAccess().getGroup(), "rule__RVariable__Group__0");
					put(grammarAccess.getRAttributeAccess().getGroup(), "rule__RAttribute__Group__0");
					put(grammarAccess.getRAttributeAccess().getGroup_2(), "rule__RAttribute__Group_2__0");
					put(grammarAccess.getRVarDeclAccess().getGroup(), "rule__RVarDecl__Group__0");
					put(grammarAccess.getRVarDeclAccess().getGroup_2(), "rule__RVarDecl__Group_2__0");
					put(grammarAccess.getRAssignAccess().getGroup(), "rule__RAssign__Group__0");
					put(grammarAccess.getRForEachAccess().getGroup(), "rule__RForEach__Group__0");
					put(grammarAccess.getRCollectionAccess().getGroup_0(), "rule__RCollection__Group_0__0");
					put(grammarAccess.getRBlockAccess().getGroup(), "rule__RBlock__Group__0");
					put(grammarAccess.getRBlockAccess().getGroup_1(), "rule__RBlock__Group_1__0");
					put(grammarAccess.getRIfAccess().getGroup(), "rule__RIf__Group__0");
					put(grammarAccess.getRIfAccess().getGroup_5(), "rule__RIf__Group_5__0");
					put(grammarAccess.getRWhileAccess().getGroup(), "rule__RWhile__Group__0");
					put(grammarAccess.getRExpressionAccess().getGroup(), "rule__RExpression__Group__0");
					put(grammarAccess.getExpressionAccess().getGroup(), "rule__Expression__Group__0");
					put(grammarAccess.getRecExpressionAccess().getGroup(), "rule__RecExpression__Group__0");
					put(grammarAccess.getRecExpressionAccess().getGroup_0_1(), "rule__RecExpression__Group_0_1__0");
					put(grammarAccess.getRecExpressionAccess().getGroup_0_2(), "rule__RecExpression__Group_0_2__0");
					put(grammarAccess.getRecExpressionAccess().getGroup_0_3(), "rule__RecExpression__Group_0_3__0");
					put(grammarAccess.getRecExpressionAccess().getGroup_0_4(), "rule__RecExpression__Group_0_4__0");
					put(grammarAccess.getRecExpressionAccess().getGroup_0_5(), "rule__RecExpression__Group_0_5__0");
					put(grammarAccess.getRecExpressionAccess().getGroup_0_6(), "rule__RecExpression__Group_0_6__0");
					put(grammarAccess.getRecExpressionAccess().getGroup_0_7(), "rule__RecExpression__Group_0_7__0");
					put(grammarAccess.getNavigationSegmentAccess().getGroup_0(), "rule__NavigationSegment__Group_0__0");
					put(grammarAccess.getNavigationSegmentAccess().getGroup_1(), "rule__NavigationSegment__Group_1__0");
					put(grammarAccess.getNavigationSegmentAccess().getGroup_2(), "rule__NavigationSegment__Group_2__0");
					put(grammarAccess.getNonLeftRecExpressionAccess().getGroup_0(), "rule__NonLeftRecExpression__Group_0__0");
					put(grammarAccess.getNonLeftRecExpressionAccess().getGroup_1(), "rule__NonLeftRecExpression__Group_1__0");
					put(grammarAccess.getNonLeftRecExpressionAccess().getGroup_4(), "rule__NonLeftRecExpression__Group_4__0");
					put(grammarAccess.getNonLeftRecExpressionAccess().getGroup_5(), "rule__NonLeftRecExpression__Group_5__0");
					put(grammarAccess.getNonLeftRecExpressionAccess().getGroup_6(), "rule__NonLeftRecExpression__Group_6__0");
					put(grammarAccess.getNonLeftRecExpressionAccess().getGroup_6_2(), "rule__NonLeftRecExpression__Group_6_2__0");
					put(grammarAccess.getBindingAccess().getGroup(), "rule__Binding__Group__0");
					put(grammarAccess.getBindingAccess().getGroup_1(), "rule__Binding__Group_1__0");
					put(grammarAccess.getCallExpAccess().getGroup_0(), "rule__CallExp__Group_0__0");
					put(grammarAccess.getCallExpAccess().getGroup_1(), "rule__CallExp__Group_1__0");
					put(grammarAccess.getExpressionSequenceAccess().getGroup(), "rule__ExpressionSequence__Group__0");
					put(grammarAccess.getExpressionSequenceAccess().getGroup_1(), "rule__ExpressionSequence__Group_1__0");
					put(grammarAccess.getVariableDefinitionAccess().getGroup(), "rule__VariableDefinition__Group__0");
					put(grammarAccess.getVariableDefinitionAccess().getGroup_1(), "rule__VariableDefinition__Group_1__0");
					put(grammarAccess.getLiteralAccess().getGroup_6(), "rule__Literal__Group_6__0");
					put(grammarAccess.getLiteralAccess().getGroup_7(), "rule__Literal__Group_7__0");
					put(grammarAccess.getLiteralAccess().getGroup_8(), "rule__Literal__Group_8__0");
					put(grammarAccess.getLiteralAccess().getGroup_9(), "rule__Literal__Group_9__0");
					put(grammarAccess.getTypeLiteralAccess().getGroup_4(), "rule__TypeLiteral__Group_4__0");
					put(grammarAccess.getTypeLiteralAccess().getGroup_5(), "rule__TypeLiteral__Group_5__0");
					put(grammarAccess.getTypeLiteralAccess().getGroup_7(), "rule__TypeLiteral__Group_7__0");
					put(grammarAccess.getTypeLiteralAccess().getGroup_7_2(), "rule__TypeLiteral__Group_7_2__0");
					put(grammarAccess.getClassifierTypeRuleAccess().getGroup_0(), "rule__ClassifierTypeRule__Group_0__0");
					put(grammarAccess.getClassifierTypeRuleAccess().getGroup_1(), "rule__ClassifierTypeRule__Group_1__0");
					put(grammarAccess.getRQualifiedAccess().getGroup(), "rule__RQualified__Group__0");
					put(grammarAccess.getRQualifiedAccess().getGroup_1(), "rule__RQualified__Group_1__0");
					put(grammarAccess.getRRootAccess().getXtendedClassesAssignment_5(), "rule__RRoot__XtendedClassesAssignment_5");
					put(grammarAccess.getROpenClassAccess().getNameAssignment_2(), "rule__ROpenClass__NameAssignment_2");
					put(grammarAccess.getROpenClassAccess().getAttributesAssignment_5(), "rule__ROpenClass__AttributesAssignment_5");
					put(grammarAccess.getROpenClassAccess().getOperationsAssignment_6(), "rule__ROpenClass__OperationsAssignment_6");
					put(grammarAccess.getRNewClassAccess().getNameAssignment_1(), "rule__RNewClass__NameAssignment_1");
					put(grammarAccess.getRNewClassAccess().getAttributesAssignment_3(), "rule__RNewClass__AttributesAssignment_3");
					put(grammarAccess.getRNewClassAccess().getOperationsAssignment_4(), "rule__RNewClass__OperationsAssignment_4");
					put(grammarAccess.getROperationAccess().getTypeAssignment_2(), "rule__ROperation__TypeAssignment_2");
					put(grammarAccess.getROperationAccess().getNameAssignment_3(), "rule__ROperation__NameAssignment_3");
					put(grammarAccess.getROperationAccess().getParamListAssignment_5(), "rule__ROperation__ParamListAssignment_5");
					put(grammarAccess.getROperationAccess().getBodyAssignment_7(), "rule__ROperation__BodyAssignment_7");
					put(grammarAccess.getRParametersAccess().getParamsAssignment_0(), "rule__RParameters__ParamsAssignment_0");
					put(grammarAccess.getRParametersAccess().getParamsAssignment_1_1(), "rule__RParameters__ParamsAssignment_1_1");
					put(grammarAccess.getRVariableAccess().getTypeAssignment_0(), "rule__RVariable__TypeAssignment_0");
					put(grammarAccess.getRVariableAccess().getNameAssignment_1(), "rule__RVariable__NameAssignment_1");
					put(grammarAccess.getRAttributeAccess().getTypeAssignment_0(), "rule__RAttribute__TypeAssignment_0");
					put(grammarAccess.getRAttributeAccess().getNameAssignment_1(), "rule__RAttribute__NameAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalMyDslParser typedParser = (InternalMyDslParser) parser;
			typedParser.entryRulerRoot();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MyDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
