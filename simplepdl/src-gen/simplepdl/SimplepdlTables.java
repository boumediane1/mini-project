/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /simplepdl/model/simplepdl.ecore
 * using:
 *   /simplepdl/model/simplepdl.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package simplepdl;

import java.lang.String;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.EnumerationId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.RootPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
// import simplepdl.SimplepdlPackage;
// import simplepdl.SimplepdlTables;

/**
 * SimplepdlTables provides the dispatch tables for the simplepdl for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class SimplepdlTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(SimplepdlPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ RootPackageId PACKid_$metamodel$ = IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_example_org_s_simplepdl = IdManager.getNsURIPackageId("http://www.example.org/simplepdl", null, SimplepdlPackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_Class = SimplepdlTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Guidance = SimplepdlTables.PACKid_http_c_s_s_www_example_org_s_simplepdl.getClassId("Guidance", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Parameter = SimplepdlTables.PACKid_http_c_s_s_www_example_org_s_simplepdl.getClassId("Parameter", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Process = SimplepdlTables.PACKid_http_c_s_s_www_example_org_s_simplepdl.getClassId("Process", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Resource = SimplepdlTables.PACKid_http_c_s_s_www_example_org_s_simplepdl.getClassId("Resource", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_WorkDefinition = SimplepdlTables.PACKid_http_c_s_s_www_example_org_s_simplepdl.getClassId("WorkDefinition", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_WorkSequence = SimplepdlTables.PACKid_http_c_s_s_www_example_org_s_simplepdl.getClassId("WorkSequence", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EInt = SimplepdlTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ EnumerationId ENUMid_WorkSequenceType = SimplepdlTables.PACKid_http_c_s_s_www_example_org_s_simplepdl.getEnumerationId("WorkSequenceType");
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ IntegerValue INT_1 = ValueUtil.integerValueOf("1");
	public static final /*@NonInvalid*/ String STR__91_A_m_Za_m_z__93_91_A_m_Za_m_z0_m_9__93_a = "[A-Za-z_][A-Za-z0-9_]*";
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Parameter = TypeId.BAG.getSpecializedId(SimplepdlTables.CLSSid_Parameter, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_WorkDefinition = TypeId.BAG.getSpecializedId(SimplepdlTables.CLSSid_WorkDefinition, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Guidance = TypeId.ORDERED_SET.getSpecializedId(SimplepdlTables.CLSSid_Guidance, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Parameter = TypeId.ORDERED_SET.getSpecializedId(SimplepdlTables.CLSSid_Parameter, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Resource = TypeId.ORDERED_SET.getSpecializedId(SimplepdlTables.CLSSid_Resource, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_WorkDefinition = TypeId.ORDERED_SET.getSpecializedId(SimplepdlTables.CLSSid_WorkDefinition, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_WorkSequence = TypeId.ORDERED_SET.getSpecializedId(SimplepdlTables.CLSSid_WorkSequence, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Resource = TypeId.SET.getSpecializedId(SimplepdlTables.CLSSid_Resource, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_WorkDefinition = TypeId.SET.getSpecializedId(SimplepdlTables.CLSSid_WorkDefinition, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			SimplepdlTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SimplepdlTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _Guidance = new EcoreExecutorType(SimplepdlPackage.Literals.GUIDANCE, PACKAGE, 0);
		public static final EcoreExecutorType _Parameter = new EcoreExecutorType(SimplepdlPackage.Literals.PARAMETER, PACKAGE, 0);
		public static final EcoreExecutorType _Process = new EcoreExecutorType(SimplepdlPackage.Literals.PROCESS, PACKAGE, 0);
		public static final EcoreExecutorType _Resource = new EcoreExecutorType(SimplepdlPackage.Literals.RESOURCE, PACKAGE, 0);
		public static final EcoreExecutorType _WorkDefinition = new EcoreExecutorType(SimplepdlPackage.Literals.WORK_DEFINITION, PACKAGE, 0);
		public static final EcoreExecutorType _WorkSequence = new EcoreExecutorType(SimplepdlPackage.Literals.WORK_SEQUENCE, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _WorkSequenceType = new EcoreExecutorEnumeration(SimplepdlPackage.Literals.WORK_SEQUENCE_TYPE, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Guidance,
			_Parameter,
			_Process,
			_Resource,
			_WorkDefinition,
			_WorkSequence,
			_WorkSequenceType
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SimplepdlTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _Guidance__Guidance = new ExecutorFragment(Types._Guidance, SimplepdlTables.Types._Guidance);
		private static final ExecutorFragment _Guidance__OclAny = new ExecutorFragment(Types._Guidance, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Guidance__OclElement = new ExecutorFragment(Types._Guidance, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Parameter__OclAny = new ExecutorFragment(Types._Parameter, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Parameter__OclElement = new ExecutorFragment(Types._Parameter, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Parameter__Parameter = new ExecutorFragment(Types._Parameter, SimplepdlTables.Types._Parameter);

		private static final ExecutorFragment _Process__OclAny = new ExecutorFragment(Types._Process, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Process__OclElement = new ExecutorFragment(Types._Process, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Process__Process = new ExecutorFragment(Types._Process, SimplepdlTables.Types._Process);

		private static final ExecutorFragment _Resource__OclAny = new ExecutorFragment(Types._Resource, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Resource__OclElement = new ExecutorFragment(Types._Resource, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Resource__Resource = new ExecutorFragment(Types._Resource, SimplepdlTables.Types._Resource);

		private static final ExecutorFragment _WorkDefinition__OclAny = new ExecutorFragment(Types._WorkDefinition, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _WorkDefinition__OclElement = new ExecutorFragment(Types._WorkDefinition, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _WorkDefinition__WorkDefinition = new ExecutorFragment(Types._WorkDefinition, SimplepdlTables.Types._WorkDefinition);

		private static final ExecutorFragment _WorkSequence__OclAny = new ExecutorFragment(Types._WorkSequence, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _WorkSequence__OclElement = new ExecutorFragment(Types._WorkSequence, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _WorkSequence__WorkSequence = new ExecutorFragment(Types._WorkSequence, SimplepdlTables.Types._WorkSequence);

		private static final ExecutorFragment _WorkSequenceType__OclAny = new ExecutorFragment(Types._WorkSequenceType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _WorkSequenceType__OclElement = new ExecutorFragment(Types._WorkSequenceType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _WorkSequenceType__OclEnumeration = new ExecutorFragment(Types._WorkSequenceType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _WorkSequenceType__OclType = new ExecutorFragment(Types._WorkSequenceType, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _WorkSequenceType__WorkSequenceType = new ExecutorFragment(Types._WorkSequenceType, SimplepdlTables.Types._WorkSequenceType);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SimplepdlTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SimplepdlTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SimplepdlTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _Guidance__description = new EcoreExecutorProperty(SimplepdlPackage.Literals.GUIDANCE__DESCRIPTION, Types._Guidance, 0);
		public static final ExecutorProperty _Guidance__Process__guidance = new ExecutorPropertyWithImplementation("Process", Types._Guidance, 1, new EcoreLibraryOppositeProperty(SimplepdlPackage.Literals.PROCESS__GUIDANCE));
		public static final ExecutorProperty _Guidance__WorkDefinition__guidance = new ExecutorPropertyWithImplementation("WorkDefinition", Types._Guidance, 2, new EcoreLibraryOppositeProperty(SimplepdlPackage.Literals.WORK_DEFINITION__GUIDANCE));

		public static final ExecutorProperty _Parameter__quantity = new EcoreExecutorProperty(SimplepdlPackage.Literals.PARAMETER__QUANTITY, Types._Parameter, 0);
		public static final ExecutorProperty _Parameter__resource = new EcoreExecutorProperty(SimplepdlPackage.Literals.PARAMETER__RESOURCE, Types._Parameter, 1);
		public static final ExecutorProperty _Parameter__WorkDefinition__parameter = new ExecutorPropertyWithImplementation("WorkDefinition", Types._Parameter, 2, new EcoreLibraryOppositeProperty(SimplepdlPackage.Literals.WORK_DEFINITION__PARAMETER));

		public static final ExecutorProperty _Process__guidance = new EcoreExecutorProperty(SimplepdlPackage.Literals.PROCESS__GUIDANCE, Types._Process, 0);
		public static final ExecutorProperty _Process__name = new EcoreExecutorProperty(SimplepdlPackage.Literals.PROCESS__NAME, Types._Process, 1);
		public static final ExecutorProperty _Process__resource = new EcoreExecutorProperty(SimplepdlPackage.Literals.PROCESS__RESOURCE, Types._Process, 2);
		public static final ExecutorProperty _Process__workdefinition = new EcoreExecutorProperty(SimplepdlPackage.Literals.PROCESS__WORKDEFINITION, Types._Process, 3);
		public static final ExecutorProperty _Process__worksequence = new EcoreExecutorProperty(SimplepdlPackage.Literals.PROCESS__WORKSEQUENCE, Types._Process, 4);

		public static final ExecutorProperty _Resource__name = new EcoreExecutorProperty(SimplepdlPackage.Literals.RESOURCE__NAME, Types._Resource, 0);
		public static final ExecutorProperty _Resource__occuranceNo = new EcoreExecutorProperty(SimplepdlPackage.Literals.RESOURCE__OCCURANCE_NO, Types._Resource, 1);
		public static final ExecutorProperty _Resource__Parameter__resource = new ExecutorPropertyWithImplementation("Parameter", Types._Resource, 2, new EcoreLibraryOppositeProperty(SimplepdlPackage.Literals.PARAMETER__RESOURCE));
		public static final ExecutorProperty _Resource__Process__resource = new ExecutorPropertyWithImplementation("Process", Types._Resource, 3, new EcoreLibraryOppositeProperty(SimplepdlPackage.Literals.PROCESS__RESOURCE));

		public static final ExecutorProperty _WorkDefinition__guidance = new EcoreExecutorProperty(SimplepdlPackage.Literals.WORK_DEFINITION__GUIDANCE, Types._WorkDefinition, 0);
		public static final ExecutorProperty _WorkDefinition__linksToPredecessors = new EcoreExecutorProperty(SimplepdlPackage.Literals.WORK_DEFINITION__LINKS_TO_PREDECESSORS, Types._WorkDefinition, 1);
		public static final ExecutorProperty _WorkDefinition__linksToSuccessors = new EcoreExecutorProperty(SimplepdlPackage.Literals.WORK_DEFINITION__LINKS_TO_SUCCESSORS, Types._WorkDefinition, 2);
		public static final ExecutorProperty _WorkDefinition__name = new EcoreExecutorProperty(SimplepdlPackage.Literals.WORK_DEFINITION__NAME, Types._WorkDefinition, 3);
		public static final ExecutorProperty _WorkDefinition__parameter = new EcoreExecutorProperty(SimplepdlPackage.Literals.WORK_DEFINITION__PARAMETER, Types._WorkDefinition, 4);
		public static final ExecutorProperty _WorkDefinition__Process__workdefinition = new ExecutorPropertyWithImplementation("Process", Types._WorkDefinition, 5, new EcoreLibraryOppositeProperty(SimplepdlPackage.Literals.PROCESS__WORKDEFINITION));

		public static final ExecutorProperty _WorkSequence__linkType = new EcoreExecutorProperty(SimplepdlPackage.Literals.WORK_SEQUENCE__LINK_TYPE, Types._WorkSequence, 0);
		public static final ExecutorProperty _WorkSequence__predecessor = new EcoreExecutorProperty(SimplepdlPackage.Literals.WORK_SEQUENCE__PREDECESSOR, Types._WorkSequence, 1);
		public static final ExecutorProperty _WorkSequence__successor = new EcoreExecutorProperty(SimplepdlPackage.Literals.WORK_SEQUENCE__SUCCESSOR, Types._WorkSequence, 2);
		public static final ExecutorProperty _WorkSequence__Process__worksequence = new ExecutorPropertyWithImplementation("Process", Types._WorkSequence, 3, new EcoreLibraryOppositeProperty(SimplepdlPackage.Literals.PROCESS__WORKSEQUENCE));
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SimplepdlTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _Guidance =
			{
				Fragments._Guidance__OclAny /* 0 */,
				Fragments._Guidance__OclElement /* 1 */,
				Fragments._Guidance__Guidance /* 2 */
			};
		private static final int /*@NonNull*/ [] __Guidance = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Parameter =
			{
				Fragments._Parameter__OclAny /* 0 */,
				Fragments._Parameter__OclElement /* 1 */,
				Fragments._Parameter__Parameter /* 2 */
			};
		private static final int /*@NonNull*/ [] __Parameter = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Process =
			{
				Fragments._Process__OclAny /* 0 */,
				Fragments._Process__OclElement /* 1 */,
				Fragments._Process__Process /* 2 */
			};
		private static final int /*@NonNull*/ [] __Process = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Resource =
			{
				Fragments._Resource__OclAny /* 0 */,
				Fragments._Resource__OclElement /* 1 */,
				Fragments._Resource__Resource /* 2 */
			};
		private static final int /*@NonNull*/ [] __Resource = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _WorkDefinition =
			{
				Fragments._WorkDefinition__OclAny /* 0 */,
				Fragments._WorkDefinition__OclElement /* 1 */,
				Fragments._WorkDefinition__WorkDefinition /* 2 */
			};
		private static final int /*@NonNull*/ [] __WorkDefinition = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _WorkSequence =
			{
				Fragments._WorkSequence__OclAny /* 0 */,
				Fragments._WorkSequence__OclElement /* 1 */,
				Fragments._WorkSequence__WorkSequence /* 2 */
			};
		private static final int /*@NonNull*/ [] __WorkSequence = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _WorkSequenceType =
			{
				Fragments._WorkSequenceType__OclAny /* 0 */,
				Fragments._WorkSequenceType__OclElement /* 1 */,
				Fragments._WorkSequenceType__OclType /* 2 */,
				Fragments._WorkSequenceType__OclEnumeration /* 3 */,
				Fragments._WorkSequenceType__WorkSequenceType /* 4 */
			};
		private static final int /*@NonNull*/ [] __WorkSequenceType = { 1,1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Guidance.initFragments(_Guidance, __Guidance);
			Types._Parameter.initFragments(_Parameter, __Parameter);
			Types._Process.initFragments(_Process, __Process);
			Types._Resource.initFragments(_Resource, __Resource);
			Types._WorkDefinition.initFragments(_WorkDefinition, __WorkDefinition);
			Types._WorkSequence.initFragments(_WorkSequence, __WorkSequence);
			Types._WorkSequenceType.initFragments(_WorkSequenceType, __WorkSequenceType);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SimplepdlTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _Guidance__Guidance = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Guidance__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Guidance__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Parameter__Parameter = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Parameter__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Parameter__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Process__Process = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Process__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Process__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Resource__Resource = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Resource__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Resource__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _WorkDefinition__WorkDefinition = {};
		private static final ExecutorOperation /*@NonNull*/ [] _WorkDefinition__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _WorkDefinition__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _WorkSequence__WorkSequence = {};
		private static final ExecutorOperation /*@NonNull*/ [] _WorkSequence__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _WorkSequence__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _WorkSequenceType__WorkSequenceType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _WorkSequenceType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _WorkSequenceType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _WorkSequenceType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _WorkSequenceType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Guidance__Guidance.initOperations(_Guidance__Guidance);
			Fragments._Guidance__OclAny.initOperations(_Guidance__OclAny);
			Fragments._Guidance__OclElement.initOperations(_Guidance__OclElement);

			Fragments._Parameter__OclAny.initOperations(_Parameter__OclAny);
			Fragments._Parameter__OclElement.initOperations(_Parameter__OclElement);
			Fragments._Parameter__Parameter.initOperations(_Parameter__Parameter);

			Fragments._Process__OclAny.initOperations(_Process__OclAny);
			Fragments._Process__OclElement.initOperations(_Process__OclElement);
			Fragments._Process__Process.initOperations(_Process__Process);

			Fragments._Resource__OclAny.initOperations(_Resource__OclAny);
			Fragments._Resource__OclElement.initOperations(_Resource__OclElement);
			Fragments._Resource__Resource.initOperations(_Resource__Resource);

			Fragments._WorkDefinition__OclAny.initOperations(_WorkDefinition__OclAny);
			Fragments._WorkDefinition__OclElement.initOperations(_WorkDefinition__OclElement);
			Fragments._WorkDefinition__WorkDefinition.initOperations(_WorkDefinition__WorkDefinition);

			Fragments._WorkSequence__OclAny.initOperations(_WorkSequence__OclAny);
			Fragments._WorkSequence__OclElement.initOperations(_WorkSequence__OclElement);
			Fragments._WorkSequence__WorkSequence.initOperations(_WorkSequence__WorkSequence);

			Fragments._WorkSequenceType__OclAny.initOperations(_WorkSequenceType__OclAny);
			Fragments._WorkSequenceType__OclElement.initOperations(_WorkSequenceType__OclElement);
			Fragments._WorkSequenceType__OclEnumeration.initOperations(_WorkSequenceType__OclEnumeration);
			Fragments._WorkSequenceType__OclType.initOperations(_WorkSequenceType__OclType);
			Fragments._WorkSequenceType__WorkSequenceType.initOperations(_WorkSequenceType__WorkSequenceType);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SimplepdlTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _Guidance = {
			SimplepdlTables.Properties._Guidance__description,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Parameter = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			SimplepdlTables.Properties._Parameter__quantity,
			SimplepdlTables.Properties._Parameter__resource
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Process = {
			SimplepdlTables.Properties._Process__guidance,
			SimplepdlTables.Properties._Process__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			SimplepdlTables.Properties._Process__resource,
			SimplepdlTables.Properties._Process__workdefinition,
			SimplepdlTables.Properties._Process__worksequence
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Resource = {
			SimplepdlTables.Properties._Resource__name,
			SimplepdlTables.Properties._Resource__occuranceNo,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _WorkDefinition = {
			SimplepdlTables.Properties._WorkDefinition__guidance,
			SimplepdlTables.Properties._WorkDefinition__linksToPredecessors,
			SimplepdlTables.Properties._WorkDefinition__linksToSuccessors,
			SimplepdlTables.Properties._WorkDefinition__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			SimplepdlTables.Properties._WorkDefinition__parameter
		};

		private static final ExecutorProperty /*@NonNull*/ [] _WorkSequence = {
			SimplepdlTables.Properties._WorkSequence__linkType,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			SimplepdlTables.Properties._WorkSequence__predecessor,
			SimplepdlTables.Properties._WorkSequence__successor
		};

		private static final ExecutorProperty /*@NonNull*/ [] _WorkSequenceType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Guidance__Guidance.initProperties(_Guidance);
			Fragments._Parameter__Parameter.initProperties(_Parameter);
			Fragments._Process__Process.initProperties(_Process);
			Fragments._Resource__Resource.initProperties(_Resource);
			Fragments._WorkDefinition__WorkDefinition.initProperties(_WorkDefinition);
			Fragments._WorkSequence__WorkSequence.initProperties(_WorkSequence);
			Fragments._WorkSequenceType__WorkSequenceType.initProperties(_WorkSequenceType);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SimplepdlTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		public static final EcoreExecutorEnumerationLiteral _WorkSequenceType__startToStart = new EcoreExecutorEnumerationLiteral(SimplepdlPackage.Literals.WORK_SEQUENCE_TYPE.getEEnumLiteral("startToStart"), Types._WorkSequenceType, 0);
		public static final EcoreExecutorEnumerationLiteral _WorkSequenceType__finishToStart = new EcoreExecutorEnumerationLiteral(SimplepdlPackage.Literals.WORK_SEQUENCE_TYPE.getEEnumLiteral("finishToStart"), Types._WorkSequenceType, 1);
		public static final EcoreExecutorEnumerationLiteral _WorkSequenceType__startToFinish = new EcoreExecutorEnumerationLiteral(SimplepdlPackage.Literals.WORK_SEQUENCE_TYPE.getEEnumLiteral("startToFinish"), Types._WorkSequenceType, 2);
		public static final EcoreExecutorEnumerationLiteral _WorkSequenceType__finishToFinish = new EcoreExecutorEnumerationLiteral(SimplepdlPackage.Literals.WORK_SEQUENCE_TYPE.getEEnumLiteral("finishToFinish"), Types._WorkSequenceType, 3);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _WorkSequenceType = {
			_WorkSequenceType__startToStart,
			_WorkSequenceType__finishToStart,
			_WorkSequenceType__startToFinish,
			_WorkSequenceType__finishToFinish
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._WorkSequenceType.initLiterals(_WorkSequenceType);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SimplepdlTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new SimplepdlTables();
	}

	private SimplepdlTables() {
		super(SimplepdlPackage.eNS_URI);
	}

	/*
	 * The EClasses whose instances should be cached to support allInstances().
	 */
	private static final EClass allInstancesEClasses /*@NonNull*/ [] = {
		SimplepdlPackage.Literals.RESOURCE,
		SimplepdlPackage.Literals.WORK_DEFINITION
	};

	@Override
	public EClass /*@NonNull*/ [] basicGetAllInstancesClasses() {
		return allInstancesEClasses;
	}
}
