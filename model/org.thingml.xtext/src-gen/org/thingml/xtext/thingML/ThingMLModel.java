/**
 * generated by Xtext 2.9.1
 */
package org.thingml.xtext.thingML;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.thingml.xtext.thingML.ThingMLModel#getImports <em>Imports</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.ThingMLModel#getTypes <em>Types</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.ThingMLModel#getProtocols <em>Protocols</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.ThingMLModel#getConfigs <em>Configs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.thingml.xtext.thingML.ThingMLPackage#getThingMLModel()
 * @model
 * @generated
 */
public interface ThingMLModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Imports</b></em>' reference list.
   * The list contents are of type {@link org.thingml.xtext.thingML.ThingMLModel}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' reference list.
   * @see org.thingml.xtext.thingML.ThingMLPackage#getThingMLModel_Imports()
   * @model
   * @generated
   */
  EList<ThingMLModel> getImports();

  /**
   * Returns the value of the '<em><b>Types</b></em>' containment reference list.
   * The list contents are of type {@link org.thingml.xtext.thingML.Type}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Types</em>' containment reference list.
   * @see org.thingml.xtext.thingML.ThingMLPackage#getThingMLModel_Types()
   * @model containment="true"
   * @generated
   */
  EList<Type> getTypes();

  /**
   * Returns the value of the '<em><b>Protocols</b></em>' containment reference list.
   * The list contents are of type {@link org.thingml.xtext.thingML.Protocol}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Protocols</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Protocols</em>' containment reference list.
   * @see org.thingml.xtext.thingML.ThingMLPackage#getThingMLModel_Protocols()
   * @model containment="true"
   * @generated
   */
  EList<Protocol> getProtocols();

  /**
   * Returns the value of the '<em><b>Configs</b></em>' containment reference list.
   * The list contents are of type {@link org.thingml.xtext.thingML.Configuration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Configs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Configs</em>' containment reference list.
   * @see org.thingml.xtext.thingML.ThingMLPackage#getThingMLModel_Configs()
   * @model containment="true"
   * @generated
   */
  EList<Configuration> getConfigs();

} // ThingMLModel
