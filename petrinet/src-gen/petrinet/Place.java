/**
 */
package petrinet;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinet.Place#getJeton <em>Jeton</em>}</li>
 * </ul>
 *
 * @see petrinet.PetrinetPackage#getPlace()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NonNegativeTokens'"
 * @generated
 */
public interface Place extends Noeud {
	/**
	 * Returns the value of the '<em><b>Jeton</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jeton</em>' attribute.
	 * @see #setJeton(int)
	 * @see petrinet.PetrinetPackage#getPlace_Jeton()
	 * @model required="true"
	 * @generated
	 */
	int getJeton();

	/**
	 * Sets the value of the '{@link petrinet.Place#getJeton <em>Jeton</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jeton</em>' attribute.
	 * @see #getJeton()
	 * @generated
	 */
	void setJeton(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.jeton &gt;= 0'"
	 * @generated
	 */
	boolean NonNegativeTokens(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Place
