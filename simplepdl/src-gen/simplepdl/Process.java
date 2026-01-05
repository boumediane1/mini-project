/**
 */
package simplepdl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplepdl.Process#getName <em>Name</em>}</li>
 *   <li>{@link simplepdl.Process#getWorksequence <em>Worksequence</em>}</li>
 *   <li>{@link simplepdl.Process#getGuidance <em>Guidance</em>}</li>
 *   <li>{@link simplepdl.Process#getResource <em>Resource</em>}</li>
 *   <li>{@link simplepdl.Process#getWorkdefinition <em>Workdefinition</em>}</li>
 * </ul>
 *
 * @see simplepdl.SimplepdlPackage#getProcess()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ValidName'"
 * @generated
 */
public interface Process extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see simplepdl.SimplepdlPackage#getProcess_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link simplepdl.Process#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Worksequence</b></em>' containment reference list.
	 * The list contents are of type {@link simplepdl.WorkSequence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Worksequence</em>' containment reference list.
	 * @see simplepdl.SimplepdlPackage#getProcess_Worksequence()
	 * @model containment="true"
	 * @generated
	 */
	EList<WorkSequence> getWorksequence();

	/**
	 * Returns the value of the '<em><b>Guidance</b></em>' containment reference list.
	 * The list contents are of type {@link simplepdl.Guidance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guidance</em>' containment reference list.
	 * @see simplepdl.SimplepdlPackage#getProcess_Guidance()
	 * @model containment="true"
	 * @generated
	 */
	EList<Guidance> getGuidance();

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' containment reference list.
	 * The list contents are of type {@link simplepdl.Resource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' containment reference list.
	 * @see simplepdl.SimplepdlPackage#getProcess_Resource()
	 * @model containment="true"
	 * @generated
	 */
	EList<Resource> getResource();

	/**
	 * Returns the value of the '<em><b>Workdefinition</b></em>' containment reference list.
	 * The list contents are of type {@link simplepdl.WorkDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workdefinition</em>' containment reference list.
	 * @see simplepdl.SimplepdlPackage#getProcess_Workdefinition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<WorkDefinition> getWorkdefinition();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t        self.workdefinition-&gt;forAll(w |\n\t            self.resource-&gt;forAll(r |\n\t                w.name &lt;&gt; r.name\n\t            )\n\t        )'"
	 * @generated
	 */
	boolean NoSameNameBetweenActivitiesAndResources(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.name.matches(\'[A-Za-z_][A-Za-z0-9_]*\')'"
	 * @generated
	 */
	boolean ValidName(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Process
