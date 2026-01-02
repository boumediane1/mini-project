/**
 */
package simplePDL.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Iterator;
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
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.classifier.ClassifierAllInstancesOperation;

import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsSetOperation;
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
import org.eclipse.ocl.pivot.values.SetValue;

import org.eclipse.ocl.pivot.values.SetValue.Accumulator;

import simplePDL.Guidance;
import simplePDL.Parameter;
import simplePDL.SimplePDLPackage;
import simplePDL.SimplePDLTables;
import simplePDL.WorkDefinition;
import simplePDL.WorkSequence;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simplePDL.impl.WorkDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link simplePDL.impl.WorkDefinitionImpl#getLinksToSuccessors <em>Links To Successors</em>}</li>
 *   <li>{@link simplePDL.impl.WorkDefinitionImpl#getLinksToPredecessors <em>Links To Predecessors</em>}</li>
 *   <li>{@link simplePDL.impl.WorkDefinitionImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link simplePDL.impl.WorkDefinitionImpl#getGuidance <em>Guidance</em>}</li>
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
	 * The cached value of the '{@link #getLinksToSuccessors() <em>Links To Successors</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinksToSuccessors()
	 * @generated
	 * @ordered
	 */
	protected WorkSequence linksToSuccessors;

	/**
	 * The cached value of the '{@link #getLinksToPredecessors() <em>Links To Predecessors</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinksToPredecessors()
	 * @generated
	 * @ordered
	 */
	protected WorkSequence linksToPredecessors;

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
		return SimplePDLPackage.Literals.WORK_DEFINITION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SimplePDLPackage.WORK_DEFINITION__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkSequence getLinksToSuccessors() {
		if (linksToSuccessors != null && linksToSuccessors.eIsProxy()) {
			InternalEObject oldLinksToSuccessors = (InternalEObject) linksToSuccessors;
			linksToSuccessors = (WorkSequence) eResolveProxy(oldLinksToSuccessors);
			if (linksToSuccessors != oldLinksToSuccessors) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SimplePDLPackage.WORK_DEFINITION__LINKS_TO_SUCCESSORS, oldLinksToSuccessors,
							linksToSuccessors));
			}
		}
		return linksToSuccessors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkSequence basicGetLinksToSuccessors() {
		return linksToSuccessors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLinksToSuccessors(WorkSequence newLinksToSuccessors) {
		WorkSequence oldLinksToSuccessors = linksToSuccessors;
		linksToSuccessors = newLinksToSuccessors;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplePDLPackage.WORK_DEFINITION__LINKS_TO_SUCCESSORS,
					oldLinksToSuccessors, linksToSuccessors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkSequence getLinksToPredecessors() {
		if (linksToPredecessors != null && linksToPredecessors.eIsProxy()) {
			InternalEObject oldLinksToPredecessors = (InternalEObject) linksToPredecessors;
			linksToPredecessors = (WorkSequence) eResolveProxy(oldLinksToPredecessors);
			if (linksToPredecessors != oldLinksToPredecessors) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SimplePDLPackage.WORK_DEFINITION__LINKS_TO_PREDECESSORS, oldLinksToPredecessors,
							linksToPredecessors));
			}
		}
		return linksToPredecessors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkSequence basicGetLinksToPredecessors() {
		return linksToPredecessors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLinksToPredecessors(WorkSequence newLinksToPredecessors) {
		WorkSequence oldLinksToPredecessors = linksToPredecessors;
		linksToPredecessors = newLinksToPredecessors;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SimplePDLPackage.WORK_DEFINITION__LINKS_TO_PREDECESSORS, oldLinksToPredecessors,
					linksToPredecessors));
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
					SimplePDLPackage.WORK_DEFINITION__PARAMETER);
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
					SimplePDLPackage.WORK_DEFINITION__GUIDANCE);
		}
		return guidance;
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
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					SimplePDLPackage.Literals.WORK_DEFINITION___NO_SELF_DEPENDENCY__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, SimplePDLTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					/*@Caught*/ Object CAUGHT_forAll;
					try {
						final /*@NonInvalid*/ WorkSequence linksToSuccessors = this.getLinksToSuccessors();
						final /*@Thrown*/ SetValue oclAsSet = OclAnyOclAsSetOperation.INSTANCE.evaluate(executor,
								SimplePDLTables.SET_CLSSid_WorkSequence, linksToSuccessors);
						/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
						Iterator<Object> ITERATOR_ws = oclAsSet.iterator();
						/*@Thrown*/ Boolean forAll;
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
						CAUGHT_forAll = forAll;
					} catch (Exception e) {
						CAUGHT_forAll = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ Boolean result;
					if (CAUGHT_forAll == ValueUtil.FALSE_VALUE) {
						result = ValueUtil.FALSE_VALUE;
					} else {
						/*@Caught*/ Object CAUGHT_forAll_0;
						try {
							final /*@NonInvalid*/ WorkSequence linksToPredecessors = this.getLinksToPredecessors();
							final /*@Thrown*/ SetValue oclAsSet_0 = OclAnyOclAsSetOperation.INSTANCE.evaluate(executor,
									SimplePDLTables.SET_CLSSid_WorkSequence, linksToPredecessors);
							/*@Thrown*/ Object accumulator_0 = ValueUtil.TRUE_VALUE;
							Iterator<Object> ITERATOR_ws_0 = oclAsSet_0.iterator();
							/*@Thrown*/ Boolean forAll_0;
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
							CAUGHT_forAll_0 = forAll_0;
						} catch (Exception e) {
							CAUGHT_forAll_0 = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_forAll_0 == ValueUtil.FALSE_VALUE) {
							result = ValueUtil.FALSE_VALUE;
						} else {
							if (CAUGHT_forAll instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_forAll;
							}
							if (CAUGHT_forAll_0 instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_forAll_0;
							}
							if ((CAUGHT_forAll == null) || (CAUGHT_forAll_0 == null)) {
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
								(Object) null, severity_0, CAUGHT_result, SimplePDLTables.INT_0)
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
					SimplePDLPackage.Literals.WORK_DEFINITION___VALID_NAME__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, SimplePDLTables.INT_0).booleanValue();
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
							TypeId.BOOLEAN, name, SimplePDLTables.STR__91_A_m_Za_m_z__93_91_A_m_Za_m_z0_m_9__93_a)
							.booleanValue();
					CAUGHT_result = result;
				} catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_result, SimplePDLTables.INT_0)
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
					SimplePDLPackage.Literals.WORK_DEFINITION___UNIQUE_ACTIVITY_NAMES__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, SimplePDLTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_simplePDL_c_c_WorkDefinition = idResolver
							.getClass(SimplePDLTables.CLSSid_WorkDefinition, null);
					final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(
							executor, SimplePDLTables.SET_CLSSid_WorkDefinition, TYP_simplePDL_c_c_WorkDefinition);
					/*@Thrown*/ Accumulator accumulator = ValueUtil
							.createSetAccumulatorValue(SimplePDLTables.SET_CLSSid_WorkDefinition);
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
								(Object) null, severity_0, CAUGHT_result, SimplePDLTables.INT_0)
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
					SimplePDLPackage.Literals.WORK_DEFINITION___NAME_LENGTH_GREATER_THAN_ONE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, SimplePDLTables.INT_0).booleanValue();
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
							.evaluate(executor, size, SimplePDLTables.INT_1).booleanValue();
					CAUGHT_result = result;
				} catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_result, SimplePDLTables.INT_0)
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
		case SimplePDLPackage.WORK_DEFINITION__PARAMETER:
			return ((InternalEList<?>) getParameter()).basicRemove(otherEnd, msgs);
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
		case SimplePDLPackage.WORK_DEFINITION__NAME:
			return getName();
		case SimplePDLPackage.WORK_DEFINITION__LINKS_TO_SUCCESSORS:
			if (resolve)
				return getLinksToSuccessors();
			return basicGetLinksToSuccessors();
		case SimplePDLPackage.WORK_DEFINITION__LINKS_TO_PREDECESSORS:
			if (resolve)
				return getLinksToPredecessors();
			return basicGetLinksToPredecessors();
		case SimplePDLPackage.WORK_DEFINITION__PARAMETER:
			return getParameter();
		case SimplePDLPackage.WORK_DEFINITION__GUIDANCE:
			return getGuidance();
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
		case SimplePDLPackage.WORK_DEFINITION__NAME:
			setName((String) newValue);
			return;
		case SimplePDLPackage.WORK_DEFINITION__LINKS_TO_SUCCESSORS:
			setLinksToSuccessors((WorkSequence) newValue);
			return;
		case SimplePDLPackage.WORK_DEFINITION__LINKS_TO_PREDECESSORS:
			setLinksToPredecessors((WorkSequence) newValue);
			return;
		case SimplePDLPackage.WORK_DEFINITION__PARAMETER:
			getParameter().clear();
			getParameter().addAll((Collection<? extends Parameter>) newValue);
			return;
		case SimplePDLPackage.WORK_DEFINITION__GUIDANCE:
			getGuidance().clear();
			getGuidance().addAll((Collection<? extends Guidance>) newValue);
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
		case SimplePDLPackage.WORK_DEFINITION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case SimplePDLPackage.WORK_DEFINITION__LINKS_TO_SUCCESSORS:
			setLinksToSuccessors((WorkSequence) null);
			return;
		case SimplePDLPackage.WORK_DEFINITION__LINKS_TO_PREDECESSORS:
			setLinksToPredecessors((WorkSequence) null);
			return;
		case SimplePDLPackage.WORK_DEFINITION__PARAMETER:
			getParameter().clear();
			return;
		case SimplePDLPackage.WORK_DEFINITION__GUIDANCE:
			getGuidance().clear();
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
		case SimplePDLPackage.WORK_DEFINITION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case SimplePDLPackage.WORK_DEFINITION__LINKS_TO_SUCCESSORS:
			return linksToSuccessors != null;
		case SimplePDLPackage.WORK_DEFINITION__LINKS_TO_PREDECESSORS:
			return linksToPredecessors != null;
		case SimplePDLPackage.WORK_DEFINITION__PARAMETER:
			return parameter != null && !parameter.isEmpty();
		case SimplePDLPackage.WORK_DEFINITION__GUIDANCE:
			return guidance != null && !guidance.isEmpty();
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
		case SimplePDLPackage.WORK_DEFINITION___NO_SELF_DEPENDENCY__DIAGNOSTICCHAIN_MAP:
			return NoSelfDependency((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case SimplePDLPackage.WORK_DEFINITION___VALID_NAME__DIAGNOSTICCHAIN_MAP:
			return ValidName((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case SimplePDLPackage.WORK_DEFINITION___UNIQUE_ACTIVITY_NAMES__DIAGNOSTICCHAIN_MAP:
			return UniqueActivityNames((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case SimplePDLPackage.WORK_DEFINITION___NAME_LENGTH_GREATER_THAN_ONE__DIAGNOSTICCHAIN_MAP:
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
