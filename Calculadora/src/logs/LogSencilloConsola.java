package logs;

import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LogSencilloConsola {
    private static final Logger LOGGER = Logger.getLogger(LogSencilloConsola.class.getName());
    public static void main(String[] args) {
 
        LOGGER.info("Nombre Logger: "+LOGGER.getName());
         
        LOGGER.warning("Puede causar un ArrayIndexOutOfBoundsException");
         
        //Array de tamaÃ±o 3
        int []a = {1,2,3};
        int index = 4;
		
        LOGGER.log(Level.CONFIG,"Index vale: "+index);
        LOGGER.log(Level.FINE,"Index vale: "+index);
        LOGGER.log(Level.INFO,"Index vale: "+index);

        try{
        	System.out.println(a[index]);
        }catch(ArrayIndexOutOfBoundsException ex){
            LOGGER.log(Level.SEVERE, "Ocurrió una excepción", ex);
        }
         
        System.out.println("FIN");
    }

}
