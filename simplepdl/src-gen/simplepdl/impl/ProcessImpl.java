/**
 */
package simplepdl.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.library.string.StringMatchesOperation;

import org.eclipse.ocl.pivot.messages.PivotMessages;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;

import simplepdl.Guidance;
import simplepdl.Resource;
import simplepdl.SimplepdlPackage;
import simplepdl.SimplepdlTables;
import simplepdl.WorkDefinition;
import simplepdl.WorkSequence;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simplepdl.impl.ProcessImpl#getName <em>Name</em>}</li>
 *   <li>{@link simplepdl.impl.ProcessImpl#getWorksequence <em>Worksequence</em>}</li>
 *   <li>{@link simplepdl.impl.ProcessImpl#getGuidance <em>Guidance</em>}</li>
 *   <li>{@link simplepdl.impl.ProcessImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link simplepdl.impl.ProcessImpl#getWorkdefinition <em>Workdefinition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessImpl extends MinimalEObjectImpl.Container implements simplepdl.Process {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWorksequence() <em>Worksequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorksequence()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkSequence> worksequence;

	/**
	 * The cached value of the '{@link #getGuidance() <em>Guidance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuidance()
	 * @generated
	 * @ordered
	 */
	protected EList<Guidance> guidance;

	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> resource;

	/**
	 * The cached value of the '{@link #getWorkdefinition() <em>Workdefinition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkdefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkDefinition> workdefinition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplepdlPackage.Literals.PROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplepdlPackage.PROCESS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WorkSequence> getWorksequence() {
		if (worksequence == null) {
			worksequence = new EObjectContainmentEList<WorkSequence>(WorkSequence.class, this,
					SimplepdlPackage.PROCESS__WORKSEQUENCE);
		}
		return worksequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Guidance> getGuidance() {
		if (guidance == null) {
			guidance = new EObjectContainmentEList<Guidance>(Guidance.class, this, SimplepdlPackage.PROCESS__GUIDANCE);
		}
		return guidance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Resource> getResource() {
		if (resource == null) {
			resource = new EObjectContainmentEList<Resource>(Resource.class, this, SimplepdlPackage.PROCESS__RESOURCE);
		}
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WorkDefinition> getWorkdefinition() {
		if (workdefinition == null) {
			workdefinition = new EObjectContainmentEList<WorkDefinition>(WorkDefinition.class, this,
					SimplepdlPackage.PROCESS__WORKDEFINITION);
		}
		return workdefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean NoSameNameBetweenActivitiesAndResources(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		final String constraintName = "Process::NoSameNameBetweenActivitiesAndResources";
		try {
			/**
			 *
			 * inv NoSameNameBetweenActivitiesAndResources:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.workdefinition->forAll(w |
			 *           self.resource->forAll(r | w.name <> r.name))
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					SimplepdlPackage.Literals.PROCESS___NO_SAME_NAME_BETWEEN_ACTIVITIES_AND_RESOURCES__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, SimplepdlTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<WorkDefinition> workdefinition = this.getWorkdefinition();
					final /*@NonInvalid*/ OrderedSetValue BOXED_workdefinition = idResolver
							.createOrderedSetOfAll(SimplepdlTables.ORD_CLSSid_WorkDefinition, workdefinition);
					/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
					Iterator<Object> ITERATOR_w = BOXED_workdefinition.iterator();
					/*@Thrown*/ Boolean result;
					while (true) {
						if (!ITERATOR_w.hasNext()) {
							if (accumulator == null) {
								result = null;
							} else if (accumulator == ValueUtil.TRUE_VALUE) {
								result = ValueUtil.TRUE_VALUE;
							} else {
								throw (InvalidValueException) accumulator;
							}
							break;
						}
						/*@NonInvalid*/ WorkDefinition w = (WorkDefinition) ITERATOR_w.next();
						/**
						 * self.resource->forAll(r | w.name <> r.name)
						 */
						final /*@NonInvalid*/ List<Resource> resource = this.getResource();
						final /*@NonInvalid*/ OrderedSetValue BOXED_resource = idResolver
								.createOrderedSetOfAll(SimplepdlTables.ORD_CLSSid_Resource, resource);
						/*@Thrown*/ Object accumulator_0 = ValueUtil.TRUE_VALUE;
						Iterator<Object> ITERATOR_r = BOXED_resource.iterator();
						/*@NonInvalid*/ Boolean forAll;
						while (true) {
							if (!ITERATOR_r.hasNext()) {
								if (accumulator_0 == ValueUtil.TRUE_VALUE) {
									forAll = ValueUtil.TRUE_VALUE;
								} else {
									throw (InvalidValueException) accumulator_0;
								}
								break;
							}
							/*@NonInvalid*/ Resource r = (Resource) ITERATOR_r.next();
							/**
							 * w.name <> r.name
							 */
							final /*@NonInvalid*/ String name = w.getName();
							final /*@NonInvalid*/ String name_0 = r.getName();
							final /*@NonInvalid*/ boolean ne = (name != null) ? !name.equals(name_0) : (name_0 != null);
							//
							if (!ne) { // Normal unsuccessful body evaluation result
								forAll = ValueUtil.FALSE_VALUE;
								break; // Stop immediately
							} else if (ne) { // Normal successful body evaluation result
								; // Carry on
							} else { // Impossible badly typed result
								accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
							}
						}
						//
						if (forAll == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
							result = ValueUtil.FALSE_VALUE;
							break; // Stop immediately
						} else if (forAll == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
							; // Carry on
						} else if (forAll == null) { // Abnormal null body evaluation result
							if (accumulator == ValueUtil.TRUE_VALUE) {
								accumulator = null; // Cache a null failure
							}
						} else { // Impossible badly typed result
							accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
						}
					}
					CAUGHT_result = result;
				} catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_result, SimplepdlTables.INT_0)
						.booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean ValidName(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Process::ValidName";
		try {
			/**
			 *
			 * inv ValidName:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = self.name.matches('[A-Za-z_][A-Za-z0-9_]*')
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					SimplepdlPackage.Literals.PROCESS___VALID_NAME__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, SimplepdlTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ String name = this.getName();
					if (name == null) {
						throw new InvalidValueException(
								"Null \'\'String\'\' rather than \'\'OclVoid\'\' value required");
					}
					final /*@Thrown*/ boolean result = StringMatchesOperation.INSTANCE.evaluate(executor,
							TypeId.BOOLEAN, name, SimplepdlTables.STR__91_A_m_Za_m_z__93_91_A_m_Za_m_z0_m_9__93_a)
							.booleanValue();
					CAUGHT_result = result;
				} catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_result, SimplepdlTables.INT_0)
						.booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SimplepdlPackage.PROCESS__WORKSEQUENCE:
			return ((InternalEList<?>) getWorksequence()).basicRemove(otherEnd, msgs);
		case SimplepdlPackage.PROCESS__GUIDANCE:
			return ((InternalEList<?>) getGuidance()).basicRemove(otherEnd, msgs);
		case SimplepdlPackage.PROCESS__RESOURCE:
			return ((InternalEList<?>) getResource()).basicRemove(otherEnd, msgs);
		case SimplepdlPackage.PROCESS__WORKDEFINITION:
			return ((InternalEList<?>) getWorkdefinition()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SimplepdlPackage.PROCESS__NAME:
			return getName();
		case SimplepdlPackage.PROCESS__WORKSEQUENCE:
			return getWorksequence();
		case SimplepdlPackage.PROCESS__GUIDANCE:
			return getGuidance();
		case SimplepdlPackage.PROCESS__RESOURCE:
			return getResource();
		case SimplepdlPackage.PROCESS__WORKDEFINITION:
			return getWorkdefinition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SimplepdlPackage.PROCESS__NAME:
			setName((String) newValue);
			return;
		case SimplepdlPackage.PROCESS__WORKSEQUENCE:
			getWorksequence().clear();
			getWorksequence().addAll((Collection<? extends WorkSequence>) newValue);
			return;
		case SimplepdlPackage.PROCESS__GUIDANCE:
			getGuidance().clear();
			getGuidance().addAll((Collection<? extends Guidance>) newValue);
			return;
		case SimplepdlPackage.PROCESS__RESOURCE:
			getResource().clear();
			getResource().addAll((Collection<? extends Resource>) newValue);
			return;
		case SimplepdlPackage.PROCESS__WORKDEFINITION:
			getWorkdefinition().clear();
			getWorkdefinition().addAll((Collection<? extends WorkDefinition>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case SimplepdlPackage.PROCESS__NAME:
			setName(NAME_EDEFAULT);
			return;
		case SimplepdlPackage.PROCESS__WORKSEQUENCE:
			getWorksequence().clear();
			return;
		case SimplepdlPackage.PROCESS__GUIDANCE:
			getGuidance().clear();
			return;
		case SimplepdlPackage.PROCESS__RESOURCE:
			getResource().clear();
			return;
		case SimplepdlPackage.PROCESS__WORKDEFINITION:
			getWorkdefinition().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case SimplepdlPackage.PROCESS__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case SimplepdlPackage.PROCESS__WORKSEQUENCE:
			return worksequence != null && !worksequence.isEmpty();
		case SimplepdlPackage.PROCESS__GUIDANCE:
			return guidance != null && !guidance.isEmpty();
		case SimplepdlPackage.PROCESS__RESOURCE:
			return resource != null && !resource.isEmpty();
		case SimplepdlPackage.PROCESS__WORKDEFINITION:
			return workdefinition != null && !workdefinition.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case SimplepdlPackage.PROCESS___NO_SAME_NAME_BETWEEN_ACTIVITIES_AND_RESOURCES__DIAGNOSTICCHAIN_MAP:
			return NoSameNameBetweenActivitiesAndResources((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case SimplepdlPackage.PROCESS___VALID_NAME__DIAGNOSTICCHAIN_MAP:
			return ValidName((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ProcessImpl
