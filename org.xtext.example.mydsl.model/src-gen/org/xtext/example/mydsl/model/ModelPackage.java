/**
 */
package org.xtext.example.mydsl.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.model.ModelFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='org.xtext.example.mydsl'"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.xtext.example.mydsl.model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = org.xtext.example.mydsl.model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.xtext.example.mydsl.model.impl.RootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.mydsl.model.impl.RootImpl
	 * @see org.xtext.example.mydsl.model.impl.ModelPackageImpl#getRoot()
	 * @generated
	 */
	int ROOT = 0;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__REF = 0;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__ENTRIES = 1;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.xtext.example.mydsl.model.impl.AnEntryImpl <em>An Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.mydsl.model.impl.AnEntryImpl
	 * @see org.xtext.example.mydsl.model.impl.ModelPackageImpl#getAnEntry()
	 * @generated
	 */
	int AN_ENTRY = 1;

	/**
	 * The feature id for the '<em><b>Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AN_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AN_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>An Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AN_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>An Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AN_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.xtext.example.mydsl.model.impl.ReferedTypeImpl <em>Refered Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.example.mydsl.model.impl.ReferedTypeImpl
	 * @see org.xtext.example.mydsl.model.impl.ModelPackageImpl#getReferedType()
	 * @generated
	 */
	int REFERED_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERED_TYPE__REF = 0;

	/**
	 * The number of structural features of the '<em>Refered Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERED_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Refered Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERED_TYPE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.xtext.example.mydsl.model.Root <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see org.xtext.example.mydsl.model.Root
	 * @generated
	 */
	EClass getRoot();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.model.Root#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ref</em>'.
	 * @see org.xtext.example.mydsl.model.Root#getRef()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Ref();

	/**
	 * Returns the meta object for the map '{@link org.xtext.example.mydsl.model.Root#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Entries</em>'.
	 * @see org.xtext.example.mydsl.model.Root#getEntries()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Entries();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>An Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>An Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyType="org.xtext.example.mydsl.model.ReferedType" keyContainment="true"
	 *        valueType="org.xtext.example.mydsl.model.ReferedType" valueContainment="true"
	 * @generated
	 */
	EClass getAnEntry();

	/**
	 * Returns the meta object for the containment reference '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getAnEntry()
	 * @generated
	 */
	EReference getAnEntry_Key();

	/**
	 * Returns the meta object for the containment reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getAnEntry()
	 * @generated
	 */
	EReference getAnEntry_Value();

	/**
	 * Returns the meta object for class '{@link org.xtext.example.mydsl.model.ReferedType <em>Refered Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Refered Type</em>'.
	 * @see org.xtext.example.mydsl.model.ReferedType
	 * @generated
	 */
	EClass getReferedType();

	/**
	 * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.model.ReferedType#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see org.xtext.example.mydsl.model.ReferedType#getRef()
	 * @see #getReferedType()
	 * @generated
	 */
	EAttribute getReferedType_Ref();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.xtext.example.mydsl.model.impl.RootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.mydsl.model.impl.RootImpl
		 * @see org.xtext.example.mydsl.model.impl.ModelPackageImpl#getRoot()
		 * @generated
		 */
		EClass ROOT = eINSTANCE.getRoot();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__REF = eINSTANCE.getRoot_Ref();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__ENTRIES = eINSTANCE.getRoot_Entries();

		/**
		 * The meta object literal for the '{@link org.xtext.example.mydsl.model.impl.AnEntryImpl <em>An Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.mydsl.model.impl.AnEntryImpl
		 * @see org.xtext.example.mydsl.model.impl.ModelPackageImpl#getAnEntry()
		 * @generated
		 */
		EClass AN_ENTRY = eINSTANCE.getAnEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AN_ENTRY__KEY = eINSTANCE.getAnEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AN_ENTRY__VALUE = eINSTANCE.getAnEntry_Value();

		/**
		 * The meta object literal for the '{@link org.xtext.example.mydsl.model.impl.ReferedTypeImpl <em>Refered Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.example.mydsl.model.impl.ReferedTypeImpl
		 * @see org.xtext.example.mydsl.model.impl.ModelPackageImpl#getReferedType()
		 * @generated
		 */
		EClass REFERED_TYPE = eINSTANCE.getReferedType();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERED_TYPE__REF = eINSTANCE.getReferedType_Ref();

	}

} //ModelPackage
