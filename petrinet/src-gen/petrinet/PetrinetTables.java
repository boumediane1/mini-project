/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /petrinet/model/petrinet.ecore
 * using:
 *   /petrinet/model/petrinet.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package petrinet;

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
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorType;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
// import petrinet.PetrinetPackage;
// import petrinet.PetrinetTables;

/**
 * PetrinetTables provides the dispatch tables for the petrinet for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class PetrinetTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(PetrinetPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ RootPackageId PACKid_$metamodel$ = IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_example_org_s_petrinet = IdManager.getNsURIPackageId("http://www.example.org/petrinet", null, PetrinetPackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_Arc = PetrinetTables.PACKid_http_c_s_s_www_example_org_s_petrinet.getClassId("Arc", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Class = PetrinetTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Noeud = PetrinetTables.PACKid_http_c_s_s_www_example_org_s_petrinet.getClassId("Noeud", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_PetriNet = PetrinetTables.PACKid_http_c_s_s_www_example_org_s_petrinet.getClassId("PetriNet", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Place = PetrinetTables.PACKid_http_c_s_s_www_example_org_s_petrinet.getClassId("Place", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Transition = PetrinetTables.PACKid_http_c_s_s_www_example_org_s_petrinet.getClassId("Transition", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EInt = PetrinetTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ EnumerationId ENUMid_ArcType = PetrinetTables.PACKid_http_c_s_s_www_example_org_s_petrinet.getEnumerationId("ArcType");
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Arc = TypeId.ORDERED_SET.getSpecializedId(PetrinetTables.CLSSid_Arc, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Noeud = TypeId.ORDERED_SET.getSpecializedId(PetrinetTables.CLSSid_Noeud, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			PetrinetTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of PetrinetTables::TypeParameters and all preceding sub-packages.
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

		public static final EcoreExecutorType _Arc = new EcoreExecutorType(PetrinetPackage.Literals.ARC, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _ArcType = new EcoreExecutorEnumeration(PetrinetPackage.Literals.ARC_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _Noeud = new EcoreExecutorType(PetrinetPackage.Literals.NOEUD, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _PetriNet = new EcoreExecutorType(PetrinetPackage.Literals.PETRI_NET, PACKAGE, 0);
		public static final EcoreExecutorType _Place = new EcoreExecutorType(PetrinetPackage.Literals.PLACE, PACKAGE, 0);
		public static final EcoreExecutorType _Transition = new EcoreExecutorType(PetrinetPackage.Literals.TRANSITION, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Arc,
			_ArcType,
			_Noeud,
			_PetriNet,
			_Place,
			_Transition
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of PetrinetTables::Types and all preceding sub-packages.
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

		private static final ExecutorFragment _Arc__Arc = new ExecutorFragment(Types._Arc, PetrinetTables.Types._Arc);
		private static final ExecutorFragment _Arc__OclAny = new ExecutorFragment(Types._Arc, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Arc__OclElement = new ExecutorFragment(Types._Arc, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _ArcType__ArcType = new ExecutorFragment(Types._ArcType, PetrinetTables.Types._ArcType);
		private static final ExecutorFragment _ArcType__OclAny = new ExecutorFragment(Types._ArcType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ArcType__OclElement = new ExecutorFragment(Types._ArcType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ArcType__OclEnumeration = new ExecutorFragment(Types._ArcType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _ArcType__OclType = new ExecutorFragment(Types._ArcType, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _Noeud__Noeud = new ExecutorFragment(Types._Noeud, PetrinetTables.Types._Noeud);
		private static final ExecutorFragment _Noeud__OclAny = new ExecutorFragment(Types._Noeud, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Noeud__OclElement = new ExecutorFragment(Types._Noeud, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _PetriNet__OclAny = new ExecutorFragment(Types._PetriNet, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _PetriNet__OclElement = new ExecutorFragment(Types._PetriNet, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _PetriNet__PetriNet = new ExecutorFragment(Types._PetriNet, PetrinetTables.Types._PetriNet);

		private static final ExecutorFragment _Place__Noeud = new ExecutorFragment(Types._Place, PetrinetTables.Types._Noeud);
		private static final ExecutorFragment _Place__OclAny = new ExecutorFragment(Types._Place, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Place__OclElement = new ExecutorFragment(Types._Place, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Place__Place = new ExecutorFragment(Types._Place, PetrinetTables.Types._Place);

		private static final ExecutorFragment _Transition__Noeud = new ExecutorFragment(Types._Transition, PetrinetTables.Types._Noeud);
		private static final ExecutorFragment _Transition__OclAny = new ExecutorFragment(Types._Transition, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Transition__OclElement = new ExecutorFragment(Types._Transition, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Transition__Transition = new ExecutorFragment(Types._Transition, PetrinetTables.Types._Transition);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of PetrinetTables::Fragments and all preceding sub-packages.
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
		 * Force initialization of the fields of PetrinetTables::Parameters and all preceding sub-packages.
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
		 * Force initialization of the fields of PetrinetTables::Operations and all preceding sub-packages.
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

		public static final ExecutorProperty _Arc__poid = new EcoreExecutorProperty(PetrinetPackage.Literals.ARC__POID, Types._Arc, 0);
		public static final ExecutorProperty _Arc__source = new EcoreExecutorProperty(PetrinetPackage.Literals.ARC__SOURCE, Types._Arc, 1);
		public static final ExecutorProperty _Arc__target = new EcoreExecutorProperty(PetrinetPackage.Literals.ARC__TARGET, Types._Arc, 2);
		public static final ExecutorProperty _Arc__type = new EcoreExecutorProperty(PetrinetPackage.Literals.ARC__TYPE, Types._Arc, 3);
		public static final ExecutorProperty _Arc__PetriNet__arc = new ExecutorPropertyWithImplementation("PetriNet", Types._Arc, 4, new EcoreLibraryOppositeProperty(PetrinetPackage.Literals.PETRI_NET__ARC));

		public static final ExecutorProperty _Noeud__ingoing = new EcoreExecutorProperty(PetrinetPackage.Literals.NOEUD__INGOING, Types._Noeud, 0);
		public static final ExecutorProperty _Noeud__name = new EcoreExecutorProperty(PetrinetPackage.Literals.NOEUD__NAME, Types._Noeud, 1);
		public static final ExecutorProperty _Noeud__outgoing = new EcoreExecutorProperty(PetrinetPackage.Literals.NOEUD__OUTGOING, Types._Noeud, 2);
		public static final ExecutorProperty _Noeud__PetriNet__noeud = new ExecutorPropertyWithImplementation("PetriNet", Types._Noeud, 3, new EcoreLibraryOppositeProperty(PetrinetPackage.Literals.PETRI_NET__NOEUD));

		public static final ExecutorProperty _PetriNet__arc = new EcoreExecutorProperty(PetrinetPackage.Literals.PETRI_NET__ARC, Types._PetriNet, 0);
		public static final ExecutorProperty _PetriNet__name = new EcoreExecutorProperty(PetrinetPackage.Literals.PETRI_NET__NAME, Types._PetriNet, 1);
		public static final ExecutorProperty _PetriNet__noeud = new EcoreExecutorProperty(PetrinetPackage.Literals.PETRI_NET__NOEUD, Types._PetriNet, 2);

		public static final ExecutorProperty _Place__jeton = new EcoreExecutorProperty(PetrinetPackage.Literals.PLACE__JETON, Types._Place, 0);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of PetrinetTables::Properties and all preceding sub-packages.
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

		private static final ExecutorFragment /*@NonNull*/ [] _Arc =
			{
				Fragments._Arc__OclAny /* 0 */,
				Fragments._Arc__OclElement /* 1 */,
				Fragments._Arc__Arc /* 2 */
			};
		private static final int /*@NonNull*/ [] __Arc = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ArcType =
			{
				Fragments._ArcType__OclAny /* 0 */,
				Fragments._ArcType__OclElement /* 1 */,
				Fragments._ArcType__OclType /* 2 */,
				Fragments._ArcType__OclEnumeration /* 3 */,
				Fragments._ArcType__ArcType /* 4 */
			};
		private static final int /*@NonNull*/ [] __ArcType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Noeud =
			{
				Fragments._Noeud__OclAny /* 0 */,
				Fragments._Noeud__OclElement /* 1 */,
				Fragments._Noeud__Noeud /* 2 */
			};
		private static final int /*@NonNull*/ [] __Noeud = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _PetriNet =
			{
				Fragments._PetriNet__OclAny /* 0 */,
				Fragments._PetriNet__OclElement /* 1 */,
				Fragments._PetriNet__PetriNet /* 2 */
			};
		private static final int /*@NonNull*/ [] __PetriNet = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Place =
			{
				Fragments._Place__OclAny /* 0 */,
				Fragments._Place__OclElement /* 1 */,
				Fragments._Place__Noeud /* 2 */,
				Fragments._Place__Place /* 3 */
			};
		private static final int /*@NonNull*/ [] __Place = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Transition =
			{
				Fragments._Transition__OclAny /* 0 */,
				Fragments._Transition__OclElement /* 1 */,
				Fragments._Transition__Noeud /* 2 */,
				Fragments._Transition__Transition /* 3 */
			};
		private static final int /*@NonNull*/ [] __Transition = { 1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Arc.initFragments(_Arc, __Arc);
			Types._ArcType.initFragments(_ArcType, __ArcType);
			Types._Noeud.initFragments(_Noeud, __Noeud);
			Types._PetriNet.initFragments(_PetriNet, __PetriNet);
			Types._Place.initFragments(_Place, __Place);
			Types._Transition.initFragments(_Transition, __Transition);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of PetrinetTables::TypeFragments and all preceding sub-packages.
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

		private static final ExecutorOperation /*@NonNull*/ [] _Arc__Arc = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Arc__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Arc__OclElement = {
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

		private static final ExecutorOperation /*@NonNull*/ [] _ArcType__ArcType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ArcType__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _ArcType__OclElement = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _ArcType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ArcType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Noeud__Noeud = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Noeud__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Noeud__OclElement = {
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

		private static final ExecutorOperation /*@NonNull*/ [] _PetriNet__PetriNet = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PetriNet__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _PetriNet__OclElement = {
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

		private static final ExecutorOperation /*@NonNull*/ [] _Place__Place = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Place__Noeud = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Place__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Place__OclElement = {
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

		private static final ExecutorOperation /*@NonNull*/ [] _Transition__Transition = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Transition__Noeud = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Transition__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Transition__OclElement = {
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

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Arc__Arc.initOperations(_Arc__Arc);
			Fragments._Arc__OclAny.initOperations(_Arc__OclAny);
			Fragments._Arc__OclElement.initOperations(_Arc__OclElement);

			Fragments._ArcType__ArcType.initOperations(_ArcType__ArcType);
			Fragments._ArcType__OclAny.initOperations(_ArcType__OclAny);
			Fragments._ArcType__OclElement.initOperations(_ArcType__OclElement);
			Fragments._ArcType__OclEnumeration.initOperations(_ArcType__OclEnumeration);
			Fragments._ArcType__OclType.initOperations(_ArcType__OclType);

			Fragments._Noeud__Noeud.initOperations(_Noeud__Noeud);
			Fragments._Noeud__OclAny.initOperations(_Noeud__OclAny);
			Fragments._Noeud__OclElement.initOperations(_Noeud__OclElement);

			Fragments._PetriNet__OclAny.initOperations(_PetriNet__OclAny);
			Fragments._PetriNet__OclElement.initOperations(_PetriNet__OclElement);
			Fragments._PetriNet__PetriNet.initOperations(_PetriNet__PetriNet);

			Fragments._Place__Noeud.initOperations(_Place__Noeud);
			Fragments._Place__OclAny.initOperations(_Place__OclAny);
			Fragments._Place__OclElement.initOperations(_Place__OclElement);
			Fragments._Place__Place.initOperations(_Place__Place);

			Fragments._Transition__Noeud.initOperations(_Transition__Noeud);
			Fragments._Transition__OclAny.initOperations(_Transition__OclAny);
			Fragments._Transition__OclElement.initOperations(_Transition__OclElement);
			Fragments._Transition__Transition.initOperations(_Transition__Transition);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of PetrinetTables::FragmentOperations and all preceding sub-packages.
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

		private static final ExecutorProperty /*@NonNull*/ [] _Arc = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PetrinetTables.Properties._Arc__poid,
			PetrinetTables.Properties._Arc__source,
			PetrinetTables.Properties._Arc__target,
			PetrinetTables.Properties._Arc__type
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ArcType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Noeud = {
			PetrinetTables.Properties._Noeud__ingoing,
			PetrinetTables.Properties._Noeud__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PetrinetTables.Properties._Noeud__outgoing
		};

		private static final ExecutorProperty /*@NonNull*/ [] _PetriNet = {
			PetrinetTables.Properties._PetriNet__arc,
			PetrinetTables.Properties._PetriNet__name,
			PetrinetTables.Properties._PetriNet__noeud,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Place = {
			PetrinetTables.Properties._Noeud__ingoing,
			PetrinetTables.Properties._Place__jeton,
			PetrinetTables.Properties._Noeud__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PetrinetTables.Properties._Noeud__outgoing
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Transition = {
			PetrinetTables.Properties._Noeud__ingoing,
			PetrinetTables.Properties._Noeud__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PetrinetTables.Properties._Noeud__outgoing
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Arc__Arc.initProperties(_Arc);
			Fragments._ArcType__ArcType.initProperties(_ArcType);
			Fragments._Noeud__Noeud.initProperties(_Noeud);
			Fragments._PetriNet__PetriNet.initProperties(_PetriNet);
			Fragments._Place__Place.initProperties(_Place);
			Fragments._Transition__Transition.initProperties(_Transition);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of PetrinetTables::FragmentProperties and all preceding sub-packages.
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

		public static final EcoreExecutorEnumerationLiteral _ArcType__SIMPLE = new EcoreExecutorEnumerationLiteral(PetrinetPackage.Literals.ARC_TYPE.getEEnumLiteral("SIMPLE"), Types._ArcType, 0);
		public static final EcoreExecutorEnumerationLiteral _ArcType__READ_ARC = new EcoreExecutorEnumerationLiteral(PetrinetPackage.Literals.ARC_TYPE.getEEnumLiteral("READ_ARC"), Types._ArcType, 1);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _ArcType = {
			_ArcType__SIMPLE,
			_ArcType__READ_ARC
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._ArcType.initLiterals(_ArcType);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of PetrinetTables::EnumerationLiterals and all preceding sub-packages.
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
		new PetrinetTables();
	}

	private PetrinetTables() {
		super(PetrinetPackage.eNS_URI);
	}
}
