/**
 */
package org.xtext.example.mydsl.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Refered Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.model.ReferedType#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.model.ModelPackage#getReferedType()
 * @model
 * @generated
 */
public interface ReferedType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' attribute.
	 * @see #setRef(String)
	 * @see org.xtext.example.mydsl.model.ModelPackage#getReferedType_Ref()
	 * @model unique="false"
	 * @generated
	 */
	String getRef();

	/**
	 * Sets the value of the '{@link org.xtext.example.mydsl.model.ReferedType#getRef <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' attribute.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(String value);

} // ReferedType
