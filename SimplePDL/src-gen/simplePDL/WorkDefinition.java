/**
 */
package simplePDL;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplePDL.WorkDefinition#getName <em>Name</em>}</li>
 *   <li>{@link simplePDL.WorkDefinition#getLinksToSuccessors <em>Links To Successors</em>}</li>
 *   <li>{@link simplePDL.WorkDefinition#getLinksToPredecessors <em>Links To Predecessors</em>}</li>
 *   <li>{@link simplePDL.WorkDefinition#getParameter <em>Parameter</em>}</li>
 *   <li>{@link simplePDL.WorkDefinition#getGuidance <em>Guidance</em>}</li>
 * </ul>
 *
 * @see simplePDL.SimplePDLPackage#getWorkDefinition()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NameLengthGreaterThanOne'"
 * @generated
 */
public interface WorkDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see simplePDL.SimplePDLPackage#getWorkDefinition_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link simplePDL.WorkDefinition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Links To Successors</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links To Successors</em>' reference.
	 * @see #setLinksToSuccessors(WorkSequence)
	 * @see simplePDL.SimplePDLPackage#getWorkDefinition_LinksToSuccessors()
	 * @model
	 * @generated
	 */
	WorkSequence getLinksToSuccessors();

	/**
	 * Sets the value of the '{@link simplePDL.WorkDefinition#getLinksToSuccessors <em>Links To Successors</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Links To Successors</em>' reference.
	 * @see #getLinksToSuccessors()
	 * @generated
	 */
	void setLinksToSuccessors(WorkSequence value);

	/**
	 * Returns the value of the '<em><b>Links To Predecessors</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links To Predecessors</em>' reference.
	 * @see #setLinksToPredecessors(WorkSequence)
	 * @see simplePDL.SimplePDLPackage#getWorkDefinition_LinksToPredecessors()
	 * @model
	 * @generated
	 */
	WorkSequence getLinksToPredecessors();

	/**
	 * Sets the value of the '{@link simplePDL.WorkDefinition#getLinksToPredecessors <em>Links To Predecessors</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Links To Predecessors</em>' reference.
	 * @see #getLinksToPredecessors()
	 * @generated
	 */
	void setLinksToPredecessors(WorkSequence value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link simplePDL.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see simplePDL.SimplePDLPackage#getWorkDefinition_Parameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameter();

	/**
	 * Returns the value of the '<em><b>Guidance</b></em>' reference list.
	 * The list contents are of type {@link simplePDL.Guidance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guidance</em>' reference list.
	 * @see simplePDL.SimplePDLPackage#getWorkDefinition_Guidance()
	 * @model
	 * @generated
	 */
	EList<Guidance> getGuidance();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t        self.linksToSuccessors-&gt;forAll(ws | ws.successor &lt;&gt; self)\n        \t\tand\n\t        self.linksToPredecessors-&gt;forAll(ws | ws.predecessor &lt;&gt; self)'"
	 * @generated
	 */
	boolean NoSelfDependency(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='WorkDefinition.allInstances()-&gt;isUnique(name)'"
	 * @generated
	 */
	boolean UniqueActivityNames(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.name.size() &gt; 1'"
	 * @generated
	 */
	boolean NameLengthGreaterThanOne(DiagnosticChain diagnostics, Map<Object, Object> context);

} // WorkDefinition
