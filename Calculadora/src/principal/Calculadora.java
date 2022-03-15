/**
 * Esta clase, tomara lo introducido de las otras clases y servira de calculadora.
 * Da cuatro opciones a elegir; Sumar, restar, multiplicar, y dividir 
 * Dependiendo de la opcion, preguntara por dos varibles para llevar acabo la ecuacion matematica. El esultado sera la respuesta.
 * @author irakaslea
 * M_Rajado
 * 
 * @param operacion Guardara el metodo menuOpciones
 * @param operandos Guardara los numeros pedidos. Tanto operacion como operandos sacaran lo escrito dentro
 *
 * @param menu Se utiliza para guardar los metodos. Tambian par elegir si se termina la calculadora o no.
 * 
 * @param operaciones Se utiliza para usar los metodos
 * @param resultado tomara la respuesta que haya en operaciones y a mostrara por pantalla
 * 
 * @throws Un bucle que hasta que se eliga la opcion de salir, usa el metodo repetir
 * @throws La eleccion del tipo de ecuacion
 */

package principal;
import menu.Menu;
import operaciones.Operaciones;

public class Calculadora{
    public static void main(String[] args) {   
        int resultado = 0;
        String operacion = "";
        int[] operandos = new int [2];
        
        Menu menu = new Menu();
        Operaciones operaciones = new Operaciones();
        
        do{
            operandos = menu.pedirNumeros();
            operacion = menu.menuOpciones();
            
            if (operacion.equalsIgnoreCase("+")){
                resultado = operaciones.sumar(operandos[0], operandos[1]);
                System.out.println ("Resultado: " + resultado);
            } else if (operacion.equalsIgnoreCase("-")){
                resultado = operaciones.restar(operandos[0], operandos[1]);
                System.out.println ("Resultado: " + resultado);
            } else if (operacion.equalsIgnoreCase("*")){
                resultado = operaciones.multiplicar(operandos[0], operandos[1]);
                System.out.println ("Resultado: " + resultado);
            } else if (operacion.equalsIgnoreCase("/")){
                resultado = operaciones.dividir(operandos[0], operandos[1]);
                System.out.println ("Resultado: " + resultado);
            } else if (operacion.equalsIgnoreCase("%")){
                resultado = operaciones.resto(operandos[0], operandos[1]);
                System.out.println ("Resultado: " + resultado);
            } else {
                System.out.println ("Operación no válida");
            }
        }   while (menu.repetir());
    }
}