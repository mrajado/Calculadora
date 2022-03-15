/** Esta clase, peddira los dos numeros y elegida el tipo de ecuacion que el usuario desea
 * @author irakaslea
 * M_Rajado
 */

package menu;
import java.util.Scanner;
public class Menu {
    private static Scanner teclado = new Scanner(System.in);
    
    /**Este metodo, tomara los dos numeros para haer la ecuacion
     * @param ret Un ArrayList que tomara en cada parte de esta, los dos operando
     * @return devuelte los numeros elegidos
     */
    public int[] pedirNumeros(){
        int[] ret = new int[2];
        System.out.print ("Operando 1: ");
        ret [0] = teclado.nextInt();
        System.out.print ("Operando 2: ");
        ret [1] = teclado.nextInt();
        return ret;
    }
    
    /**Este metodo, tomara los dos numeros para haer la ecuacion
     * @param ret Un String vacio que tomara el tipo de ecuacion
     * @throws Un do While que metera en bucle la eleccion, salvo que se escoja una de las que piden.
     * @return devuelte la ecuacion elegidos
     */
    public String menuOpciones() {
        String ret = "";
        do {
            System.out.print ("Operaciones [+, -, *, /, %]: ");
            ret = teclado.next();
        } while (!((ret.equalsIgnoreCase("+")) || (ret.equalsIgnoreCase("-")) ||
                (ret.equalsIgnoreCase("*")) || (ret.equalsIgnoreCase("/")) ||
                (ret.equalsIgnoreCase("%"))
                ));
                return ret;
    }
    
    /**Este metodo decidira si se termina la maquina
     * @param respuesta Un String vacio que tomara las letras 's' o 'n'
     * @param ret Un boolean determinara junto al do while. Si la respuesta el correcta, cambiara para salir.
     * @throws Un do While que metera en bucle la eleccion, salvo que se escoja una de las que piden.
     * @return devuelte la ecuacion elegidos
     */
    public boolean repetir(){
        boolean ret = false;
        String respuesta;
        do {
            System.out.print ("¿Desea continuar trabajando con la calculadora? [s / n]");
            respuesta = teclado.next();
        } while (!((respuesta.equalsIgnoreCase("s")) || (respuesta.equalsIgnoreCase("n"))
                    ));
                    
        if (respuesta.equalsIgnoreCase("s")){
            ret = true;
        }
        return ret;
    }
}