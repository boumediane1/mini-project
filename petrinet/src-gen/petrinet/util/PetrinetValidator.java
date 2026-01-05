/**
 */
package petrinet.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import petrinet.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see petrinet.PetrinetPackage
 * @generated
 */
public class PetrinetValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final PetrinetValidator INSTANCE = new PetrinetValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "petrinet";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Different Node Types' of 'Arc'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ARC__DIFFERENT_NODE_TYPES = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Non Negative Tokens' of 'Place'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLACE__NON_NEGATIVE_TOKENS = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique Node Names' of 'Petri Net'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PETRI_NET__UNIQUE_NODE_NAMES = 3;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 3;

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
	public PetrinetValidator() {
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
		return PetrinetPackage.eINSTANCE;
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
		case PetrinetPackage.NOEUD:
			return validateNoeud((Noeud) value, diagnostics, context);
		case PetrinetPackage.ARC:
			return validateArc((Arc) value, diagnostics, context);
		case PetrinetPackage.TRANSITION:
			return validateTransition((Transition) value, diagnostics, context);
		case PetrinetPackage.PLACE:
			return validatePlace((Place) value, diagnostics, context);
		case PetrinetPackage.PETRI_NET:
			return validatePetriNet((PetriNet) value, diagnostics, context);
		case PetrinetPackage.ARC_TYPE:
			return validateArcType((ArcType) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoeud(Noeud noeud, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(noeud, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArc(Arc arc, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(arc, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(arc, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(arc, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(arc, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(arc, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(arc, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(arc, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(arc, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(arc, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateArc_DifferentNodeTypes(arc, diagnostics, context);
		return result;
	}

	/**
	 * Validates the DifferentNodeTypes constraint of '<em>Arc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArc_DifferentNodeTypes(Arc arc, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return arc.DifferentNodeTypes(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransition(Transition transition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlace(Place place, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(place, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(place, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(place, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(place, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(place, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(place, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(place, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(place, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(place, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePlace_NonNegativeTokens(place, diagnostics, context);
		return result;
	}

	/**
	 * Validates the NonNegativeTokens constraint of '<em>Place</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlace_NonNegativeTokens(Place place, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return place.NonNegativeTokens(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePetriNet(PetriNet petriNet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(petriNet, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(petriNet, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(petriNet, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(petriNet, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(petriNet, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(petriNet, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(petriNet, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(petriNet, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(petriNet, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePetriNet_UniqueNodeNames(petriNet, diagnostics, context);
		return result;
	}

	/**
	 * Validates the UniqueNodeNames constraint of '<em>Petri Net</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePetriNet_UniqueNodeNames(PetriNet petriNet, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return petriNet.UniqueNodeNames(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArcType(ArcType arcType, DiagnosticChain diagnostics, Map<Object, Object> context) {
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

} //PetrinetValidator
