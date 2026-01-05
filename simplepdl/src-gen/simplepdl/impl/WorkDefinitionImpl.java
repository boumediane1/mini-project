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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.classifier.ClassifierAllInstancesOperation;

import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.library.string.StringMatchesOperation;
import org.eclipse.ocl.pivot.library.string.StringSizeOperation;

import org.eclipse.ocl.pivot.messages.PivotMessages;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SetValue;

import org.eclipse.ocl.pivot.values.SetValue.Accumulator;

import simplepdl.Guidance;
import simplepdl.Parameter;
import simplepdl.SimplepdlPackage;
import simplepdl.SimplepdlTables;
import simplepdl.WorkDefinition;
import simplepdl.WorkSequence;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simplepdl.impl.WorkDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link simplepdl.impl.WorkDefinitionImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link simplepdl.impl.WorkDefinitionImpl#getGuidance <em>Guidance</em>}</li>
 *   <li>{@link simplepdl.impl.WorkDefinitionImpl#getLinksToSuccessors <em>Links To Successors</em>}</li>
 *   <li>{@link simplepdl.impl.WorkDefinitionImpl#getLinksToPredecessors <em>Links To Predecessors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkDefinitionImpl extends MinimalEObjectImpl.Container implements WorkDefinition {
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
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameter;

	/**
	 * The cached value of the '{@link #getGuidance() <em>Guidance</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuidance()
	 * @generated
	 * @ordered
	 */
	protected EList<Guidance> guidance;

	/**
	 * The cached value of the '{@link #getLinksToSuccessors() <em>Links To Successors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinksToSuccessors()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkSequence> linksToSuccessors;

	/**
	 * The cached value of the '{@link #getLinksToPredecessors() <em>Links To Predecessors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinksToPredecessors()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkSequence> linksToPredecessors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplepdlPackage.Literals.WORK_DEFINITION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SimplepdlPackage.WORK_DEFINITION__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Parameter> getParameter() {
		if (parameter == null) {
			parameter = new EObjectContainmentEList<Parameter>(Parameter.class, this,
					SimplepdlPackage.WORK_DEFINITION__PARAMETER);
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Guidance> getGuidance() {
		if (guidance == null) {
			guidance = new EObjectResolvingEList<Guidance>(Guidance.class, this,
					SimplepdlPackage.WORK_DEFINITION__GUIDANCE);
		}
		return guidance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WorkSequence> getLinksToSuccessors() {
		if (linksToSuccessors == null) {
			linksToSuccessors = new EObjectWithInverseResolvingEList<WorkSequence>(WorkSequence.class, this,
					SimplepdlPackage.WORK_DEFINITION__LINKS_TO_SUCCESSORS, SimplepdlPackage.WORK_SEQUENCE__PREDECESSOR);
		}
		return linksToSuccessors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WorkSequence> getLinksToPredecessors() {
		if (linksToPredecessors == null) {
			linksToPredecessors = new EObjectWithInverseResolvingEList<WorkSequence>(WorkSequence.class, this,
					SimplepdlPackage.WORK_DEFINITION__LINKS_TO_PREDECESSORS, SimplepdlPackage.WORK_SEQUENCE__SUCCESSOR);
		}
		return linksToPredecessors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean NoSelfDependency(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "WorkDefinition::NoSelfDependency";
		try {
			/**
			 *
			 * inv NoSelfDependency:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.linksToSuccessors->forAll(ws | ws.successor <> self) and
			 *         self.linksToPredecessors->forAll(ws | ws.predecessor <> self)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					SimplepdlPackage.Literals.WORK_DEFINITION___NO_SELF_DEPENDENCY__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, SimplepdlTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<WorkSequence> linksToSuccessors = this.getLinksToSuccessors();
					final /*@NonInvalid*/ OrderedSetValue BOXED_linksToSuccessors = idResolver
							.createOrderedSetOfAll(SimplepdlTables.ORD_CLSSid_WorkSequence, linksToSuccessors);
					/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
					Iterator<Object> ITERATOR_ws = BOXED_linksToSuccessors.iterator();
					/*@NonInvalid*/ Boolean forAll;
					while (true) {
						if (!ITERATOR_ws.hasNext()) {
							if (accumulator == ValueUtil.TRUE_VALUE) {
								forAll = ValueUtil.TRUE_VALUE;
							} else {
								throw (InvalidValueException) accumulator;
							}
							break;
						}
						/*@NonInvalid*/ WorkSequence ws = (WorkSequence) ITERATOR_ws.next();
						/**
						 * ws.successor <> self
						 */
						final /*@NonInvalid*/ WorkDefinition successor = ws.getSuccessor();
						final /*@NonInvalid*/ boolean ne = !successor.equals(this);
						//
						if (!ne) { // Normal unsuccessful body evaluation result
							forAll = ValueUtil.FALSE_VALUE;
							break; // Stop immediately
						} else if (ne) { // Normal successful body evaluation result
							; // Carry on
						} else { // Impossible badly typed result
							accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
						}
					}
					final /*@Thrown*/ Boolean result;
					if (forAll == ValueUtil.FALSE_VALUE) {
						result = ValueUtil.FALSE_VALUE;
					} else {
						final /*@NonInvalid*/ List<WorkSequence> linksToPredecessors = this.getLinksToPredecessors();
						final /*@NonInvalid*/ OrderedSetValue BOXED_linksToPredecessors = idResolver
								.createOrderedSetOfAll(SimplepdlTables.ORD_CLSSid_WorkSequence, linksToPredecessors);
						/*@Thrown*/ Object accumulator_0 = ValueUtil.TRUE_VALUE;
						Iterator<Object> ITERATOR_ws_0 = BOXED_linksToPredecessors.iterator();
						/*@NonInvalid*/ Boolean forAll_0;
						while (true) {
							if (!ITERATOR_ws_0.hasNext()) {
								if (accumulator_0 == ValueUtil.TRUE_VALUE) {
									forAll_0 = ValueUtil.TRUE_VALUE;
								} else {
									throw (InvalidValueException) accumulator_0;
								}
								break;
							}
							/*@NonInvalid*/ WorkSequence ws_0 = (WorkSequence) ITERATOR_ws_0.next();
							/**
							 * ws.predecessor <> self
							 */
							final /*@NonInvalid*/ WorkDefinition predecessor = ws_0.getPredecessor();
							final /*@NonInvalid*/ boolean ne_0 = !predecessor.equals(this);
							//
							if (!ne_0) { // Normal unsuccessful body evaluation result
								forAll_0 = ValueUtil.FALSE_VALUE;
								break; // Stop immediately
							} else if (ne_0) { // Normal successful body evaluation result
								; // Carry on
							} else { // Impossible badly typed result
								accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
							}
						}
						if (forAll_0 == ValueUtil.FALSE_VALUE) {
							result = ValueUtil.FALSE_VALUE;
						} else {
							if ((forAll == null) || (forAll_0 == null)) {
								result = null;
							} else {
								result = ValueUtil.TRUE_VALUE;
							}
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
		final String constraintName = "WorkDefinition::ValidName";
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
					SimplepdlPackage.Literals.WORK_DEFINITION___VALID_NAME__DIAGNOSTICCHAIN_MAP);
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
	public boolean UniqueActivityNames(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "WorkDefinition::UniqueActivityNames";
		try {
			/**
			 *
			 * inv UniqueActivityNames:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = WorkDefinition.allInstances()
			 *         ->isUnique(name)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					SimplepdlPackage.Literals.WORK_DEFINITION___UNIQUE_ACTIVITY_NAMES__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, SimplepdlTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_simplepdl_c_c_WorkDefinition = idResolver
							.getClass(SimplepdlTables.CLSSid_WorkDefinition, null);
					final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(
							executor, SimplepdlTables.SET_CLSSid_WorkDefinition, TYP_simplepdl_c_c_WorkDefinition);
					/*@Thrown*/ Accumulator accumulator = ValueUtil
							.createSetAccumulatorValue(SimplepdlTables.SET_CLSSid_WorkDefinition);
					Iterator<Object> ITERATOR__1 = allInstances.iterator();
					/*@Thrown*/ boolean result;
					while (true) {
						if (!ITERATOR__1.hasNext()) {
							result = true;
							break;
						}
						/*@NonInvalid*/ WorkDefinition _1 = (WorkDefinition) ITERATOR__1.next();
						/**
						 * name
						 */
						final /*@NonInvalid*/ String name = _1.getName();
						//
						if (accumulator.includes(name) == ValueUtil.TRUE_VALUE) {
							result = false;
							break; // Abort after second find
						} else {
							accumulator.add(name);
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
	public boolean NameLengthGreaterThanOne(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "WorkDefinition::NameLengthGreaterThanOne";
		try {
			/**
			 *
			 * inv NameLengthGreaterThanOne:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = self.name.size() > 1
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					SimplepdlPackage.Literals.WORK_DEFINITION___NAME_LENGTH_GREATER_THAN_ONE__DIAGNOSTICCHAIN_MAP);
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
					final /*@Thrown*/ IntegerValue size = StringSizeOperation.INSTANCE.evaluate(name);
					final /*@Thrown*/ boolean result = OclComparableGreaterThanOperation.INSTANCE
							.evaluate(executor, size, SimplepdlTables.INT_1).booleanValue();
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SimplepdlPackage.WORK_DEFINITION__LINKS_TO_SUCCESSORS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getLinksToSuccessors()).basicAdd(otherEnd,
					msgs);
		case SimplepdlPackage.WORK_DEFINITION__LINKS_TO_PREDECESSORS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getLinksToPredecessors()).basicAdd(otherEnd,
					msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SimplepdlPackage.WORK_DEFINITION__PARAMETER:
			return ((InternalEList<?>) getParameter()).basicRemove(otherEnd, msgs);
		case SimplepdlPackage.WORK_DEFINITION__LINKS_TO_SUCCESSORS:
			return ((InternalEList<?>) getLinksToSuccessors()).basicRemove(otherEnd, msgs);
		case SimplepdlPackage.WORK_DEFINITION__LINKS_TO_PREDECESSORS:
			return ((InternalEList<?>) getLinksToPredecessors()).basicRemove(otherEnd, msgs);
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
		case SimplepdlPackage.WORK_DEFINITION__NAME:
			return getName();
		case SimplepdlPackage.WORK_DEFINITION__PARAMETER:
			return getParameter();
		case SimplepdlPackage.WORK_DEFINITION__GUIDANCE:
			return getGuidance();
		case SimplepdlPackage.WORK_DEFINITION__LINKS_TO_SUCCESSORS:
			return getLinksToSuccessors();
		case SimplepdlPackage.WORK_DEFINITION__LINKS_TO_PREDECESSORS:
			return getLinksToPredecessors();
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
		case SimplepdlPackage.WORK_DEFINITION__NAME:
			setName((String) newValue);
			return;
		case SimplepdlPackage.WORK_DEFINITION__PARAMETER:
			getParameter().clear();
			getParameter().addAll((Collection<? extends Parameter>) newValue);
			return;
		case SimplepdlPackage.WORK_DEFINITION__GUIDANCE:
			getGuidance().clear();
			getGuidance().addAll((Collection<? extends Guidance>) newValue);
			return;
		case SimplepdlPackage.WORK_DEFINITION__LINKS_TO_SUCCESSORS:
			getLinksToSuccessors().clear();
			getLinksToSuccessors().addAll((Collection<? extends WorkSequence>) newValue);
			return;
		case SimplepdlPackage.WORK_DEFINITION__LINKS_TO_PREDECESSORS:
			getLinksToPredecessors().clear();
			getLinksToPredecessors().addAll((Collection<? extends WorkSequence>) newValue);
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
		case SimplepdlPackage.WORK_DEFINITION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case SimplepdlPackage.WORK_DEFINITION__PARAMETER:
			getParameter().clear();
			return;
		case SimplepdlPackage.WORK_DEFINITION__GUIDANCE:
			getGuidance().clear();
			return;
		case SimplepdlPackage.WORK_DEFINITION__LINKS_TO_SUCCESSORS:
			getLinksToSuccessors().clear();
			return;
		case SimplepdlPackage.WORK_DEFINITION__LINKS_TO_PREDECESSORS:
			getLinksToPredecessors().clear();
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
		case SimplepdlPackage.WORK_DEFINITION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case SimplepdlPackage.WORK_DEFINITION__PARAMETER:
			return parameter != null && !parameter.isEmpty();
		case SimplepdlPackage.WORK_DEFINITION__GUIDANCE:
			return guidance != null && !guidance.isEmpty();
		case SimplepdlPackage.WORK_DEFINITION__LINKS_TO_SUCCESSORS:
			return linksToSuccessors != null && !linksToSuccessors.isEmpty();
		case SimplepdlPackage.WORK_DEFINITION__LINKS_TO_PREDECESSORS:
			return linksToPredecessors != null && !linksToPredecessors.isEmpty();
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
		case SimplepdlPackage.WORK_DEFINITION___NO_SELF_DEPENDENCY__DIAGNOSTICCHAIN_MAP:
			return NoSelfDependency((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case SimplepdlPackage.WORK_DEFINITION___VALID_NAME__DIAGNOSTICCHAIN_MAP:
			return ValidName((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case SimplepdlPackage.WORK_DEFINITION___UNIQUE_ACTIVITY_NAMES__DIAGNOSTICCHAIN_MAP:
			return UniqueActivityNames((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case SimplepdlPackage.WORK_DEFINITION___NAME_LENGTH_GREATER_THAN_ONE__DIAGNOSTICCHAIN_MAP:
			return NameLengthGreaterThanOne((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
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

} //WorkDefinitionImpl
