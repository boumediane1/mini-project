/**
 */
package simplePDL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
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
 * @see simplePDL.SimplePDLFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface SimplePDLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "simplePDL";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/simplePDL";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "simplePDL";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimplePDLPackage eINSTANCE = simplePDL.impl.SimplePDLPackageImpl.init();

	/**
	 * The meta object id for the '{@link simplePDL.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplePDL.impl.ParameterImpl
	 * @see simplePDL.impl.SimplePDLPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 0;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__QUANTITY = 0;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__RESOURCE = 1;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Positive Quantity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___POSITIVE_QUANTITY__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link simplePDL.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplePDL.impl.ResourceImpl
	 * @see simplePDL.impl.SimplePDLPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Occurance No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__OCCURANCE_NO = 1;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Valid Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE___VALID_NAME__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Unique Resource Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE___UNIQUE_RESOURCE_NAMES__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>Positive Occurance Number</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE___POSITIVE_OCCURANCE_NUMBER__DIAGNOSTICCHAIN_MAP = 2;

	/**
	 * The number of operations of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link simplePDL.impl.WorkSequenceImpl <em>Work Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplePDL.impl.WorkSequenceImpl
	 * @see simplePDL.impl.SimplePDLPackageImpl#getWorkSequence()
	 * @generated
	 */
	int WORK_SEQUENCE = 2;

	/**
	 * The feature id for the '<em><b>Link Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_SEQUENCE__LINK_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Predecessor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_SEQUENCE__PREDECESSOR = 1;

	/**
	 * The feature id for the '<em><b>Successor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_SEQUENCE__SUCCESSOR = 2;

	/**
	 * The number of structural features of the '<em>Work Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_SEQUENCE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Work Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_SEQUENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link simplePDL.impl.WorkDefinitionImpl <em>Work Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplePDL.impl.WorkDefinitionImpl
	 * @see simplePDL.impl.SimplePDLPackageImpl#getWorkDefinition()
	 * @generated
	 */
	int WORK_DEFINITION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_DEFINITION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Links To Successors</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_DEFINITION__LINKS_TO_SUCCESSORS = 1;

	/**
	 * The feature id for the '<em><b>Links To Predecessors</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_DEFINITION__LINKS_TO_PREDECESSORS = 2;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_DEFINITION__PARAMETER = 3;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_DEFINITION__GUIDANCE = 4;

	/**
	 * The number of structural features of the '<em>Work Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_DEFINITION_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>No Self Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_DEFINITION___NO_SELF_DEPENDENCY__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Valid Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_DEFINITION___VALID_NAME__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>Unique Activity Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_DEFINITION___UNIQUE_ACTIVITY_NAMES__DIAGNOSTICCHAIN_MAP = 2;

	/**
	 * The operation id for the '<em>Name Length Greater Than One</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_DEFINITION___NAME_LENGTH_GREATER_THAN_ONE__DIAGNOSTICCHAIN_MAP = 3;

	/**
	 * The number of operations of the '<em>Work Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_DEFINITION_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link simplePDL.impl.GuidanceImpl <em>Guidance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplePDL.impl.GuidanceImpl
	 * @see simplePDL.impl.SimplePDLPackageImpl#getGuidance()
	 * @generated
	 */
	int GUIDANCE = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIDANCE__DESCRIPTION = 0;

	/**
	 * The number of structural features of the '<em>Guidance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIDANCE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Guidance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIDANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link simplePDL.impl.ProcessImpl <em>Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplePDL.impl.ProcessImpl
	 * @see simplePDL.impl.SimplePDLPackageImpl#getProcess()
	 * @generated
	 */
	int PROCESS = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Worksequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__WORKSEQUENCE = 1;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__GUIDANCE = 2;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__RESOURCE = 3;

	/**
	 * The feature id for the '<em><b>Workdefinition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__WORKDEFINITION = 4;

	/**
	 * The number of structural features of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>No Same Name Between Activities And Resources</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___NO_SAME_NAME_BETWEEN_ACTIVITIES_AND_RESOURCES__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Valid Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___VALID_NAME__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The number of operations of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link simplePDL.WorkSequenceType <em>Work Sequence Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplePDL.WorkSequenceType
	 * @see simplePDL.impl.SimplePDLPackageImpl#getWorkSequenceType()
	 * @generated
	 */
	int WORK_SEQUENCE_TYPE = 6;

	/**
	 * Returns the meta object for class '{@link simplePDL.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see simplePDL.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link simplePDL.Parameter#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see simplePDL.Parameter#getQuantity()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Quantity();

	/**
	 * Returns the meta object for the reference '{@link simplePDL.Parameter#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource</em>'.
	 * @see simplePDL.Parameter#getResource()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Resource();

	/**
	 * Returns the meta object for the '{@link simplePDL.Parameter#PositiveQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Positive Quantity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Positive Quantity</em>' operation.
	 * @see simplePDL.Parameter#PositiveQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getParameter__PositiveQuantity__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link simplePDL.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see simplePDL.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the attribute '{@link simplePDL.Resource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see simplePDL.Resource#getName()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Name();

	/**
	 * Returns the meta object for the attribute '{@link simplePDL.Resource#getOccuranceNo <em>Occurance No</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occurance No</em>'.
	 * @see simplePDL.Resource#getOccuranceNo()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_OccuranceNo();

	/**
	 * Returns the meta object for the '{@link simplePDL.Resource#ValidName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Valid Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Valid Name</em>' operation.
	 * @see simplePDL.Resource#ValidName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getResource__ValidName__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link simplePDL.Resource#UniqueResourceNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Resource Names</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique Resource Names</em>' operation.
	 * @see simplePDL.Resource#UniqueResourceNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getResource__UniqueResourceNames__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link simplePDL.Resource#PositiveOccuranceNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Positive Occurance Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Positive Occurance Number</em>' operation.
	 * @see simplePDL.Resource#PositiveOccuranceNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getResource__PositiveOccuranceNumber__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link simplePDL.WorkSequence <em>Work Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Sequence</em>'.
	 * @see simplePDL.WorkSequence
	 * @generated
	 */
	EClass getWorkSequence();

	/**
	 * Returns the meta object for the attribute '{@link simplePDL.WorkSequence#getLinkType <em>Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link Type</em>'.
	 * @see simplePDL.WorkSequence#getLinkType()
	 * @see #getWorkSequence()
	 * @generated
	 */
	EAttribute getWorkSequence_LinkType();

	/**
	 * Returns the meta object for the reference '{@link simplePDL.WorkSequence#getPredecessor <em>Predecessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Predecessor</em>'.
	 * @see simplePDL.WorkSequence#getPredecessor()
	 * @see #getWorkSequence()
	 * @generated
	 */
	EReference getWorkSequence_Predecessor();

	/**
	 * Returns the meta object for the reference '{@link simplePDL.WorkSequence#getSuccessor <em>Successor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Successor</em>'.
	 * @see simplePDL.WorkSequence#getSuccessor()
	 * @see #getWorkSequence()
	 * @generated
	 */
	EReference getWorkSequence_Successor();

	/**
	 * Returns the meta object for class '{@link simplePDL.WorkDefinition <em>Work Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Definition</em>'.
	 * @see simplePDL.WorkDefinition
	 * @generated
	 */
	EClass getWorkDefinition();

	/**
	 * Returns the meta object for the attribute '{@link simplePDL.WorkDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see simplePDL.WorkDefinition#getName()
	 * @see #getWorkDefinition()
	 * @generated
	 */
	EAttribute getWorkDefinition_Name();

	/**
	 * Returns the meta object for the reference '{@link simplePDL.WorkDefinition#getLinksToSuccessors <em>Links To Successors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Links To Successors</em>'.
	 * @see simplePDL.WorkDefinition#getLinksToSuccessors()
	 * @see #getWorkDefinition()
	 * @generated
	 */
	EReference getWorkDefinition_LinksToSuccessors();

	/**
	 * Returns the meta object for the reference '{@link simplePDL.WorkDefinition#getLinksToPredecessors <em>Links To Predecessors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Links To Predecessors</em>'.
	 * @see simplePDL.WorkDefinition#getLinksToPredecessors()
	 * @see #getWorkDefinition()
	 * @generated
	 */
	EReference getWorkDefinition_LinksToPredecessors();

	/**
	 * Returns the meta object for the containment reference list '{@link simplePDL.WorkDefinition#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see simplePDL.WorkDefinition#getParameter()
	 * @see #getWorkDefinition()
	 * @generated
	 */
	EReference getWorkDefinition_Parameter();

	/**
	 * Returns the meta object for the reference list '{@link simplePDL.WorkDefinition#getGuidance <em>Guidance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Guidance</em>'.
	 * @see simplePDL.WorkDefinition#getGuidance()
	 * @see #getWorkDefinition()
	 * @generated
	 */
	EReference getWorkDefinition_Guidance();

	/**
	 * Returns the meta object for the '{@link simplePDL.WorkDefinition#NoSelfDependency(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>No Self Dependency</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>No Self Dependency</em>' operation.
	 * @see simplePDL.WorkDefinition#NoSelfDependency(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getWorkDefinition__NoSelfDependency__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link simplePDL.WorkDefinition#ValidName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Valid Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Valid Name</em>' operation.
	 * @see simplePDL.WorkDefinition#ValidName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getWorkDefinition__ValidName__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link simplePDL.WorkDefinition#UniqueActivityNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Activity Names</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique Activity Names</em>' operation.
	 * @see simplePDL.WorkDefinition#UniqueActivityNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getWorkDefinition__UniqueActivityNames__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link simplePDL.WorkDefinition#NameLengthGreaterThanOne(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Name Length Greater Than One</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Name Length Greater Than One</em>' operation.
	 * @see simplePDL.WorkDefinition#NameLengthGreaterThanOne(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getWorkDefinition__NameLengthGreaterThanOne__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link simplePDL.Guidance <em>Guidance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guidance</em>'.
	 * @see simplePDL.Guidance
	 * @generated
	 */
	EClass getGuidance();

	/**
	 * Returns the meta object for the attribute '{@link simplePDL.Guidance#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see simplePDL.Guidance#getDescription()
	 * @see #getGuidance()
	 * @generated
	 */
	EAttribute getGuidance_Description();

	/**
	 * Returns the meta object for class '{@link simplePDL.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process</em>'.
	 * @see simplePDL.Process
	 * @generated
	 */
	EClass getProcess();

	/**
	 * Returns the meta object for the attribute '{@link simplePDL.Process#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see simplePDL.Process#getName()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link simplePDL.Process#getWorksequence <em>Worksequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Worksequence</em>'.
	 * @see simplePDL.Process#getWorksequence()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Worksequence();

	/**
	 * Returns the meta object for the containment reference list '{@link simplePDL.Process#getGuidance <em>Guidance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Guidance</em>'.
	 * @see simplePDL.Process#getGuidance()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Guidance();

	/**
	 * Returns the meta object for the containment reference list '{@link simplePDL.Process#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource</em>'.
	 * @see simplePDL.Process#getResource()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Resource();

	/**
	 * Returns the meta object for the containment reference list '{@link simplePDL.Process#getWorkdefinition <em>Workdefinition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Workdefinition</em>'.
	 * @see simplePDL.Process#getWorkdefinition()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Workdefinition();

	/**
	 * Returns the meta object for the '{@link simplePDL.Process#NoSameNameBetweenActivitiesAndResources(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>No Same Name Between Activities And Resources</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>No Same Name Between Activities And Resources</em>' operation.
	 * @see simplePDL.Process#NoSameNameBetweenActivitiesAndResources(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getProcess__NoSameNameBetweenActivitiesAndResources__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link simplePDL.Process#ValidName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Valid Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Valid Name</em>' operation.
	 * @see simplePDL.Process#ValidName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getProcess__ValidName__DiagnosticChain_Map();

	/**
	 * Returns the meta object for enum '{@link simplePDL.WorkSequenceType <em>Work Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Work Sequence Type</em>'.
	 * @see simplePDL.WorkSequenceType
	 * @generated
	 */
	EEnum getWorkSequenceType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SimplePDLFactory getSimplePDLFactory();

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
		 * The meta object literal for the '{@link simplePDL.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplePDL.impl.ParameterImpl
		 * @see simplePDL.impl.SimplePDLPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__QUANTITY = eINSTANCE.getParameter_Quantity();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__RESOURCE = eINSTANCE.getParameter_Resource();

		/**
		 * The meta object literal for the '<em><b>Positive Quantity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER___POSITIVE_QUANTITY__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getParameter__PositiveQuantity__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link simplePDL.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplePDL.impl.ResourceImpl
		 * @see simplePDL.impl.SimplePDLPackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__NAME = eINSTANCE.getResource_Name();

		/**
		 * The meta object literal for the '<em><b>Occurance No</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__OCCURANCE_NO = eINSTANCE.getResource_OccuranceNo();

		/**
		 * The meta object literal for the '<em><b>Valid Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE___VALID_NAME__DIAGNOSTICCHAIN_MAP = eINSTANCE.getResource__ValidName__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Unique Resource Names</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE___UNIQUE_RESOURCE_NAMES__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getResource__UniqueResourceNames__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Positive Occurance Number</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE___POSITIVE_OCCURANCE_NUMBER__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getResource__PositiveOccuranceNumber__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link simplePDL.impl.WorkSequenceImpl <em>Work Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplePDL.impl.WorkSequenceImpl
		 * @see simplePDL.impl.SimplePDLPackageImpl#getWorkSequence()
		 * @generated
		 */
		EClass WORK_SEQUENCE = eINSTANCE.getWorkSequence();

		/**
		 * The meta object literal for the '<em><b>Link Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_SEQUENCE__LINK_TYPE = eINSTANCE.getWorkSequence_LinkType();

		/**
		 * The meta object literal for the '<em><b>Predecessor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_SEQUENCE__PREDECESSOR = eINSTANCE.getWorkSequence_Predecessor();

		/**
		 * The meta object literal for the '<em><b>Successor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_SEQUENCE__SUCCESSOR = eINSTANCE.getWorkSequence_Successor();

		/**
		 * The meta object literal for the '{@link simplePDL.impl.WorkDefinitionImpl <em>Work Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplePDL.impl.WorkDefinitionImpl
		 * @see simplePDL.impl.SimplePDLPackageImpl#getWorkDefinition()
		 * @generated
		 */
		EClass WORK_DEFINITION = eINSTANCE.getWorkDefinition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_DEFINITION__NAME = eINSTANCE.getWorkDefinition_Name();

		/**
		 * The meta object literal for the '<em><b>Links To Successors</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_DEFINITION__LINKS_TO_SUCCESSORS = eINSTANCE.getWorkDefinition_LinksToSuccessors();

		/**
		 * The meta object literal for the '<em><b>Links To Predecessors</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_DEFINITION__LINKS_TO_PREDECESSORS = eINSTANCE.getWorkDefinition_LinksToPredecessors();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_DEFINITION__PARAMETER = eINSTANCE.getWorkDefinition_Parameter();

		/**
		 * The meta object literal for the '<em><b>Guidance</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_DEFINITION__GUIDANCE = eINSTANCE.getWorkDefinition_Guidance();

		/**
		 * The meta object literal for the '<em><b>No Self Dependency</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WORK_DEFINITION___NO_SELF_DEPENDENCY__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getWorkDefinition__NoSelfDependency__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Valid Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WORK_DEFINITION___VALID_NAME__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getWorkDefinition__ValidName__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Unique Activity Names</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WORK_DEFINITION___UNIQUE_ACTIVITY_NAMES__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getWorkDefinition__UniqueActivityNames__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Name Length Greater Than One</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WORK_DEFINITION___NAME_LENGTH_GREATER_THAN_ONE__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getWorkDefinition__NameLengthGreaterThanOne__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link simplePDL.impl.GuidanceImpl <em>Guidance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplePDL.impl.GuidanceImpl
		 * @see simplePDL.impl.SimplePDLPackageImpl#getGuidance()
		 * @generated
		 */
		EClass GUIDANCE = eINSTANCE.getGuidance();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUIDANCE__DESCRIPTION = eINSTANCE.getGuidance_Description();

		/**
		 * The meta object literal for the '{@link simplePDL.impl.ProcessImpl <em>Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplePDL.impl.ProcessImpl
		 * @see simplePDL.impl.SimplePDLPackageImpl#getProcess()
		 * @generated
		 */
		EClass PROCESS = eINSTANCE.getProcess();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__NAME = eINSTANCE.getProcess_Name();

		/**
		 * The meta object literal for the '<em><b>Worksequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__WORKSEQUENCE = eINSTANCE.getProcess_Worksequence();

		/**
		 * The meta object literal for the '<em><b>Guidance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__GUIDANCE = eINSTANCE.getProcess_Guidance();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__RESOURCE = eINSTANCE.getProcess_Resource();

		/**
		 * The meta object literal for the '<em><b>Workdefinition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__WORKDEFINITION = eINSTANCE.getProcess_Workdefinition();

		/**
		 * The meta object literal for the '<em><b>No Same Name Between Activities And Resources</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROCESS___NO_SAME_NAME_BETWEEN_ACTIVITIES_AND_RESOURCES__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getProcess__NoSameNameBetweenActivitiesAndResources__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Valid Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROCESS___VALID_NAME__DIAGNOSTICCHAIN_MAP = eINSTANCE.getProcess__ValidName__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link simplePDL.WorkSequenceType <em>Work Sequence Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplePDL.WorkSequenceType
		 * @see simplePDL.impl.SimplePDLPackageImpl#getWorkSequenceType()
		 * @generated
		 */
		EEnum WORK_SEQUENCE_TYPE = eINSTANCE.getWorkSequenceType();

	}

} //SimplePDLPackage
