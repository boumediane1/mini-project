/**
 */
package simplePDL;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplePDL.Resource#getName <em>Name</em>}</li>
 *   <li>{@link simplePDL.Resource#getOccuranceNo <em>Occurance No</em>}</li>
 * </ul>
 *
 * @see simplePDL.SimplePDLPackage#getResource()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='PositiveOccuranceNumber'"
 * @generated
 */
public interface Resource extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see simplePDL.SimplePDLPackage#getResource_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link simplePDL.Resource#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Occurance No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occurance No</em>' attribute.
	 * @see #setOccuranceNo(int)
	 * @see simplePDL.SimplePDLPackage#getResource_OccuranceNo()
	 * @model required="true"
	 * @generated
	 */
	int getOccuranceNo();

	/**
	 * Sets the value of the '{@link simplePDL.Resource#getOccuranceNo <em>Occurance No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occurance No</em>' attribute.
	 * @see #getOccuranceNo()
	 * @generated
	 */
	void setOccuranceNo(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.name.matches(\'[A-Za-z_][A-Za-z0-9_]*\')'"
	 * @generated
	 */
	boolean ValidName(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Resource.allInstances()-&gt;isUnique(name)'"
	 * @generated
	 */
	boolean UniqueResourceNames(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n        \tself.occuranceNo &gt; 0'"
	 * @generated
	 */
	boolean PositiveOccuranceNumber(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Resource
