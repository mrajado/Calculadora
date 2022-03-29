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
import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

import logs.FiltroLogMultiplicar;
import logs.FormatoHTML;
import logs.LogConsolaMasFichero;
import menu.Menu;
import operaciones.Operaciones;

public class Calculadora{
	
	 private static final Logger LOGGER = Logger.getLogger(Calculadora.class.getName());
	 
	 public static void main(String[] args) {   
		 configurarLog();
		 
        int resultado = 0;
        String operacion = "";
        int[] operandos = new int [2];
        
        Menu menu = new Menu();
        Operaciones operaciones = new Operaciones();
        
        do{
            operandos = menu.pedirNumeros();
            operacion = menu.menuOpciones();
            
            try {
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
	            LOGGER.log(Level.FINE, "Operacion: "+operacion+" Operando1: "+operandos[0]+" Operando2: "+operandos[1]+" Resultado: "+resultado);
            } catch (ArithmeticException e) {
            	System.out.println("Operacion aritmetica no valida: "+e.getMessage());
            	LOGGER.log(Level.WARNING, "Dividision entre cero.");
            }
        }   while (menu.repetir());
    }
	 
	 public static void configurarLog() {
	        //Evita que muestre algo por consola
		 	LOGGER.setUseParentHandlers(false); 
	        
	        Handler fileHandler=null;
	        Handler consoleHandler = new ConsoleHandler();
	        
	        //asociar
	        LOGGER.addHandler(consoleHandler);


	        try {
	            fileHandler  = new FileHandler("./logs/LOGoperaciones.html");//con true le añade contenido
	            consoleHandler = new ConsoleHandler();

	        } catch(IOException exception){
	            LOGGER.log(Level.SEVERE, "Ocurrió un error en FileHandler.", exception);
	        }
	        
	        //implementamos el formateo de salida y lo añadimos
	        fileHandler.setFormatter(new FormatoHTML());
	        LOGGER.addHandler(fileHandler);

	        
	        //Establecer niveles a handlers y LOGGER
	        consoleHandler.setLevel(Level.WARNING);
	        fileHandler.setLevel(Level.FINE);
	        
	        fileHandler.setFilter(new FiltroLogMultiplicar());
	        
	        LOGGER.setLevel(Level.FINE);//O ALL
	 }
}