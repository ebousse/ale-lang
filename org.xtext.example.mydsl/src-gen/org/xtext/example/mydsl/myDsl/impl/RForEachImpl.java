/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.RForEach;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RFor Each</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.RForEachImpl#getForEach <em>For Each</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RForEachImpl extends RStatementImpl implements RForEach
{
  /**
   * The cached value of the '{@link #getForEach() <em>For Each</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForEach()
   * @generated
   * @ordered
   */
  protected RForEach forEach;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RForEachImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MyDslPackage.Literals.RFOR_EACH;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RForEach getForEach()
  {
    return forEach;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetForEach(RForEach newForEach, NotificationChain msgs)
  {
    RForEach oldForEach = forEach;
    forEach = newForEach;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.RFOR_EACH__FOR_EACH, oldForEach, newForEach);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setForEach(RForEach newForEach)
  {
    if (newForEach != forEach)
    {
      NotificationChain msgs = null;
      if (forEach != null)
        msgs = ((InternalEObject)forEach).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.RFOR_EACH__FOR_EACH, null, msgs);
      if (newForEach != null)
        msgs = ((InternalEObject)newForEach).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.RFOR_EACH__FOR_EACH, null, msgs);
      msgs = basicSetForEach(newForEach, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.RFOR_EACH__FOR_EACH, newForEach, newForEach));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MyDslPackage.RFOR_EACH__FOR_EACH:
        return basicSetForEach(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MyDslPackage.RFOR_EACH__FOR_EACH:
        return getForEach();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.RFOR_EACH__FOR_EACH:
        setForEach((RForEach)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.RFOR_EACH__FOR_EACH:
        setForEach((RForEach)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.RFOR_EACH__FOR_EACH:
        return forEach != null;
    }
    return super.eIsSet(featureID);
  }

} //RForEachImpl
