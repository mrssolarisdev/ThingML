/**
 * generated by Xtext 2.9.1
 */
package org.thingml.xtext.thingML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.thingml.xtext.thingML.InstanceRef#getInstance <em>Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.thingml.xtext.thingML.ThingMLPackage#getInstanceRef()
 * @model
 * @generated
 */
public interface InstanceRef extends EObject
{
  /**
   * Returns the value of the '<em><b>Instance</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Instance</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instance</em>' reference.
   * @see #setInstance(Instance)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getInstanceRef_Instance()
   * @model
   * @generated
   */
  Instance getInstance();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.InstanceRef#getInstance <em>Instance</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Instance</em>' reference.
   * @see #getInstance()
   * @generated
   */
  void setInstance(Instance value);

} // InstanceRef
