/**
 * Una sola clase que toma el labor de una calculadora, con cinco opciones; Sumar, restar, multiplicar, dividir, y resto 
 * @author irakaslea
 * M_Rajado
 * 
 */

package operaciones;
public class Operaciones{
	
	/** El metodo para seleccionar el valor de las variables, y hacer la suma
	 * @param valor1 Consigue primer valor
	 * @param valor2 Consigue segundo valor
	 * @param numero Hace la suma
	 * @return devuelve la suma de las dos variables
	 */
    public int sumar (int valor1, int valor2){
        int numero;
        numero = valor1 + valor2;
        return numero;
    }
    
	/** El metodo para seleccionar el valor de las variables, y hacer la resta
	 * @param valor1 Consigue primer valor
	 * @param valor2 Consigue segundo valor
	 * @param numero Hace la resta
	 * @return devuelve la resta de las dos variables
	 */
    public int restar (int valor1, int valor2){
        int numero;
        numero = valor1 - valor2;
        return numero;
    }
    
	/** El metodo para seleccionar el valor de las variables, y hacer la multiplicacion
	 * @param valor1 Consigue primer valor
	 * @param valor2 Consigue segundo valor
	 * @param numero Hace la multiplicacion
	 * @return devuelve la multiplicacion de las dos variables
	 */
    public int multiplicar (int valor1, int valor2){
        int numero;
        numero = valor1 * valor2;
        return numero;
    }
    
	/** El metodo para seleccionar el valor de las variables, y hacer la division
	 * @param valor1 Consigue primer valor
	 * @param valor2 Consigue segundo valor
	 * @param numero Hace la division
	 * @return devuelve la division de las dos variables
	 */
    public int dividir (int valor1, int valor2){
        int numero;
        numero = valor1 / valor2;
        return numero;
    }
    
	/** El metodo para seleccionar el valor de las variables, y hacer el resto
	 * @param valor1 Consigue primer valor
	 * @param valor2 Consigue segundo valor
	 * @param numero Hace el resto
	 * @return devuelve el resto de las dos variables
	 */
    public int resto (int valor1, int valor2){
        int numero;
        numero = valor1 % valor2;
        return numero;
    }
}