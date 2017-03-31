/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.myDsl.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.example.mydsl.myDsl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage
 * @generated
 */
public class MyDslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MyDslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = MyDslPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case MyDslPackage.RROOT:
      {
        RRoot rRoot = (RRoot)theEObject;
        T result = caseRRoot(rRoot);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.RCLASS:
      {
        RClass rClass = (RClass)theEObject;
        T result = caseRClass(rClass);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.ROPEN_CLASS:
      {
        ROpenClass rOpenClass = (ROpenClass)theEObject;
        T result = caseROpenClass(rOpenClass);
        if (result == null) result = caseRClass(rOpenClass);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.RNEW_CLASS:
      {
        RNewClass rNewClass = (RNewClass)theEObject;
        T result = caseRNewClass(rNewClass);
        if (result == null) result = caseRClass(rNewClass);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.ROPERATION:
      {
        rOperation rOperation = (rOperation)theEObject;
        T result = caserOperation(rOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.RPARAMETERS:
      {
        rParameters rParameters = (rParameters)theEObject;
        T result = caserParameters(rParameters);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.RVARIABLE:
      {
        rVariable rVariable = (rVariable)theEObject;
        T result = caserVariable(rVariable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.RATTRIBUTE:
      {
        rAttribute rAttribute = (rAttribute)theEObject;
        T result = caserAttribute(rAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.RSTATEMENT:
      {
        RStatement rStatement = (RStatement)theEObject;
        T result = caseRStatement(rStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.RVAR_DECL:
      {
        rVarDecl rVarDecl = (rVarDecl)theEObject;
        T result = caserVarDecl(rVarDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.RASSIGN:
      {
        RAssign rAssign = (RAssign)theEObject;
        T result = caseRAssign(rAssign);
        if (result == null) result = caseRStatement(rAssign);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.RFOR_EACH:
      {
        RForEach rForEach = (RForEach)theEObject;
        T result = caseRForEach(rForEach);
        if (result == null) result = caseRStatement(rForEach);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.RCOLLECTION:
      {
        rCollection rCollection = (rCollection)theEObject;
        T result = caserCollection(rCollection);
        if (result == null) result = caseRForEach(rCollection);
        if (result == null) result = caseRStatement(rCollection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.RBLOCK:
      {
        rBlock rBlock = (rBlock)theEObject;
        T result = caserBlock(rBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.RIF:
      {
        RIf rIf = (RIf)theEObject;
        T result = caseRIf(rIf);
        if (result == null) result = caseRStatement(rIf);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.RWHILE:
      {
        RWhile rWhile = (RWhile)theEObject;
        T result = caseRWhile(rWhile);
        if (result == null) result = caseRStatement(rWhile);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.REXPRESSION:
      {
        RExpression rExpression = (RExpression)theEObject;
        T result = caseRExpression(rExpression);
        if (result == null) result = caseRStatement(rExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.EXPR:
      {
        Expr expr = (Expr)theEObject;
        T result = caseExpr(expr);
        if (result == null) result = caserVarDecl(expr);
        if (result == null) result = caserCollection(expr);
        if (result == null) result = caseRWhile(expr);
        if (result == null) result = caseRExpression(expr);
        if (result == null) result = caseRecExpression(expr);
        if (result == null) result = casenonLeftRecExpression(expr);
        if (result == null) result = casebinding(expr);
        if (result == null) result = casecallExp(expr);
        if (result == null) result = caseRForEach(expr);
        if (result == null) result = caseRStatement(expr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.REC_EXPRESSION:
      {
        RecExpression recExpression = (RecExpression)theEObject;
        T result = caseRecExpression(recExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.NAVIGATION_SEGMENT:
      {
        NavigationSegment navigationSegment = (NavigationSegment)theEObject;
        T result = caseNavigationSegment(navigationSegment);
        if (result == null) result = caseRecExpression(navigationSegment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.NON_LEFT_REC_EXPRESSION:
      {
        nonLeftRecExpression nonLeftRecExpression = (nonLeftRecExpression)theEObject;
        T result = casenonLeftRecExpression(nonLeftRecExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.BINDING:
      {
        binding binding = (binding)theEObject;
        T result = casebinding(binding);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.CALL_EXP:
      {
        callExp callExp = (callExp)theEObject;
        T result = casecallExp(callExp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.EXPRESSION_SEQUENCE:
      {
        expressionSequence expressionSequence = (expressionSequence)theEObject;
        T result = caseexpressionSequence(expressionSequence);
        if (result == null) result = casecallExp(expressionSequence);
        if (result == null) result = caseliteral(expressionSequence);
        if (result == null) result = casenonLeftRecExpression(expressionSequence);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.LITERAL:
      {
        literal literal = (literal)theEObject;
        T result = caseliteral(literal);
        if (result == null) result = casenonLeftRecExpression(literal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.RVAL_DECL:
      {
        RValDecl rValDecl = (RValDecl)theEObject;
        T result = caseRValDecl(rValDecl);
        if (result == null) result = caseRStatement(rValDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.FINAL_IDENT_SEGMENT:
      {
        FinalIdentSegment finalIdentSegment = (FinalIdentSegment)theEObject;
        T result = caseFinalIdentSegment(finalIdentSegment);
        if (result == null) result = caseNavigationSegment(finalIdentSegment);
        if (result == null) result = caseRecExpression(finalIdentSegment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.FINAL_IDENT_CALL_SEGMENT:
      {
        FinalIdentCallSegment finalIdentCallSegment = (FinalIdentCallSegment)theEObject;
        T result = caseFinalIdentCallSegment(finalIdentCallSegment);
        if (result == null) result = caseNavigationSegment(finalIdentCallSegment);
        if (result == null) result = caseRecExpression(finalIdentCallSegment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.FINAL_CALL_EXP_SEGMENT:
      {
        FinalCallExpSegment finalCallExpSegment = (FinalCallExpSegment)theEObject;
        T result = caseFinalCallExpSegment(finalCallExpSegment);
        if (result == null) result = caseNavigationSegment(finalCallExpSegment);
        if (result == null) result = caseRecExpression(finalCallExpSegment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>RRoot</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>RRoot</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRRoot(RRoot object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>RClass</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>RClass</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRClass(RClass object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ROpen Class</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ROpen Class</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseROpenClass(ROpenClass object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>RNew Class</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>RNew Class</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRNewClass(RNewClass object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>rOperation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>rOperation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caserOperation(rOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>rParameters</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>rParameters</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caserParameters(rParameters object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>rVariable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>rVariable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caserVariable(rVariable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>rAttribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>rAttribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caserAttribute(rAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>RStatement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>RStatement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRStatement(RStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>rVar Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>rVar Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caserVarDecl(rVarDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>RAssign</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>RAssign</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRAssign(RAssign object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>RFor Each</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>RFor Each</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRForEach(RForEach object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>rCollection</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>rCollection</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caserCollection(rCollection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>rBlock</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>rBlock</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caserBlock(rBlock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>RIf</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>RIf</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRIf(RIf object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>RWhile</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>RWhile</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRWhile(RWhile object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>RExpression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>RExpression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRExpression(RExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpr(Expr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rec Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rec Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRecExpression(RecExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Navigation Segment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Navigation Segment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNavigationSegment(NavigationSegment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>non Left Rec Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>non Left Rec Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenonLeftRecExpression(nonLeftRecExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>binding</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>binding</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casebinding(binding object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>call Exp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>call Exp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casecallExp(callExp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>expression Sequence</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>expression Sequence</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseexpressionSequence(expressionSequence object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseliteral(literal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>RVal Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>RVal Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRValDecl(RValDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Final Ident Segment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Final Ident Segment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFinalIdentSegment(FinalIdentSegment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Final Ident Call Segment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Final Ident Call Segment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFinalIdentCallSegment(FinalIdentCallSegment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Final Call Exp Segment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Final Call Exp Segment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFinalCallExpSegment(FinalCallExpSegment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //MyDslSwitch
