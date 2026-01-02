/**
 */
package simplePDL.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import simplePDL.Guidance;
import simplePDL.Parameter;
import simplePDL.Resource;
import simplePDL.SimplePDLPackage;
import simplePDL.WorkDefinition;
import simplePDL.WorkSequence;
import simplePDL.WorkSequenceType;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see simplePDL.SimplePDLPackage
 * @generated
 */
public class SimplePDLValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SimplePDLValidator INSTANCE = new SimplePDLValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "simplePDL";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Positive Quantity' of 'Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PARAMETER__POSITIVE_QUANTITY = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Valid Name' of 'Resource'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESOURCE__VALID_NAME = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique Resource Names' of 'Resource'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESOURCE__UNIQUE_RESOURCE_NAMES = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Positive Occurance Number' of 'Resource'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESOURCE__POSITIVE_OCCURANCE_NUMBER = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'No Self Dependency' of 'Work Definition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int WORK_DEFINITION__NO_SELF_DEPENDENCY = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Valid Name' of 'Work Definition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int WORK_DEFINITION__VALID_NAME = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique Activity Names' of 'Work Definition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int WORK_DEFINITION__UNIQUE_ACTIVITY_NAMES = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Name Length Greater Than One' of 'Work Definition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int WORK_DEFINITION__NAME_LENGTH_GREATER_THAN_ONE = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'No Same Name Between Activities And Resources' of 'Process'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCESS__NO_SAME_NAME_BETWEEN_ACTIVITIES_AND_RESOURCES = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Valid Name' of 'Process'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCESS__VALID_NAME = 10;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 10;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimplePDLValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return SimplePDLPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case SimplePDLPackage.PARAMETER:
			return validateParameter((Parameter) value, diagnostics, context);
		case SimplePDLPackage.RESOURCE:
			return validateResource((Resource) value, diagnostics, context);
		case SimplePDLPackage.WORK_SEQUENCE:
			return validateWorkSequence((WorkSequence) value, diagnostics, context);
		case SimplePDLPackage.WORK_DEFINITION:
			return validateWorkDefinition((WorkDefinition) value, diagnostics, context);
		case SimplePDLPackage.GUIDANCE:
			return validateGuidance((Guidance) value, diagnostics, context);
		case SimplePDLPackage.PROCESS:
			return validateProcess((simplePDL.Process) value, diagnostics, context);
		case SimplePDLPackage.WORK_SEQUENCE_TYPE:
			return validateWorkSequenceType((WorkSequenceType) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameter(Parameter parameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(parameter, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(parameter, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(parameter, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(parameter, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(parameter, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(parameter, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(parameter, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(parameter, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(parameter, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateParameter_PositiveQuantity(parameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the PositiveQuantity constraint of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameter_PositiveQuantity(Parameter parameter, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return parameter.PositiveQuantity(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResource(Resource resource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(resource, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(resource, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(resource, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(resource, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(resource, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(resource, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(resource, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(resource, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(resource, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateResource_PositiveOccuranceNumber(resource, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateResource_ValidName(resource, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateResource_UniqueResourceNames(resource, diagnostics, context);
		return result;
	}

	/**
	 * Validates the PositiveOccuranceNumber constraint of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResource_PositiveOccuranceNumber(Resource resource, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return resource.PositiveOccuranceNumber(diagnostics, context);
	}

	/**
	 * Validates the ValidName constraint of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResource_ValidName(Resource resource, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return resource.ValidName(diagnostics, context);
	}

	/**
	 * Validates the UniqueResourceNames constraint of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResource_UniqueResourceNames(Resource resource, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return resource.UniqueResourceNames(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkSequence(WorkSequence workSequence, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(workSequence, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkDefinition(WorkDefinition workDefinition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(workDefinition, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(workDefinition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(workDefinition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(workDefinition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(workDefinition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(workDefinition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(workDefinition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(workDefinition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(workDefinition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateWorkDefinition_NameLengthGreaterThanOne(workDefinition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateWorkDefinition_NoSelfDependency(workDefinition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateWorkDefinition_ValidName(workDefinition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateWorkDefinition_UniqueActivityNames(workDefinition, diagnostics, context);
		return result;
	}

	/**
	 * Validates the NameLengthGreaterThanOne constraint of '<em>Work Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkDefinition_NameLengthGreaterThanOne(WorkDefinition workDefinition,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return workDefinition.NameLengthGreaterThanOne(diagnostics, context);
	}

	/**
	 * Validates the NoSelfDependency constraint of '<em>Work Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkDefinition_NoSelfDependency(WorkDefinition workDefinition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return workDefinition.NoSelfDependency(diagnostics, context);
	}

	/**
	 * Validates the ValidName constraint of '<em>Work Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkDefinition_ValidName(WorkDefinition workDefinition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return workDefinition.ValidName(diagnostics, context);
	}

	/**
	 * Validates the UniqueActivityNames constraint of '<em>Work Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkDefinition_UniqueActivityNames(WorkDefinition workDefinition,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return workDefinition.UniqueActivityNames(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGuidance(Guidance guidance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(guidance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcess(simplePDL.Process process, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(process, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(process, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(process, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(process, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(process, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(process, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(process, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(process, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(process, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateProcess_ValidName(process, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateProcess_NoSameNameBetweenActivitiesAndResources(process, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ValidName constraint of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcess_ValidName(simplePDL.Process process, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return process.ValidName(diagnostics, context);
	}

	/**
	 * Validates the NoSameNameBetweenActivitiesAndResources constraint of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcess_NoSameNameBetweenActivitiesAndResources(simplePDL.Process process,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return process.NoSameNameBetweenActivitiesAndResources(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkSequenceType(WorkSequenceType workSequenceType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //SimplePDLValidator
