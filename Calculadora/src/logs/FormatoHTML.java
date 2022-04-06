package logs;

import java.nio.charset.Charset;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class FormatoHTML extends Formatter {

	/**
	 * @param array[] toma las cadenas separadas de un objeto tipo LogRecord.
	 * split divide un objeto tipo String en un array de cadenas.
	 */
	@Override
	public String format(LogRecord record) {
		// TODO Auto-generated method stub
		String [] array = record.getMessage().split("\\|");
		return "<p>\n"+array[array.length-1]+"\n</p>\n"; // \n: Separa en lineas
	}
	
	
	public boolean rcero(int resultado) {
		
		if (resultado==0) {
			return true;
		
		} else {
			return false;
		}
		
	}
	
	/**
	 * @return el comienzo del codigo html
	 */
	@Override
	public String getHead(Handler h) {
		return "<HTML> \n <BODY> \n";
	    
	}
	     
	/**
	 * @return el fin del codigo html
	 */
	@Override
	public String getTail(Handler h) {
		return "</BODY> \n </HTML> \n";
	}

}
