/**
 */
package org.xtext.example.mydsl.model;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.model.Root#getRef <em>Ref</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.model.Root#getEntries <em>Entries</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.model.ModelPackage#getRoot()
 * @model
 * @generated
 */
public interface Root extends EObject {
	/**
	 * Returns the value of the '<em><b>Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' containment reference.
	 * @see #setRef(ReferedType)
	 * @see org.xtext.example.mydsl.model.ModelPackage#getRoot_Ref()
	 * @model containment="true"
	 * @generated
	 */
	ReferedType getRef();

	/**
	 * Sets the value of the '{@link org.xtext.example.mydsl.model.Root#getRef <em>Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' containment reference.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(ReferedType value);

	/**
	 * Returns the value of the '<em><b>Entries</b></em>' map.
	 * The key is of type {@link org.xtext.example.mydsl.model.ReferedType},
	 * and the value is of type {@link org.xtext.example.mydsl.model.ReferedType},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entries</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' map.
	 * @see org.xtext.example.mydsl.model.ModelPackage#getRoot_Entries()
	 * @model mapType="org.xtext.example.mydsl.model.AnEntry&lt;org.xtext.example.mydsl.model.ReferedType, org.xtext.example.mydsl.model.ReferedType&gt;"
	 * @generated
	 */
	EMap<ReferedType, ReferedType> getEntries();

} // Root
