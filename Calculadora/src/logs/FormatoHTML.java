package logs;

import java.nio.charset.Charset;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class FormatoHTML extends Formatter {

	@Override
	public String format(LogRecord record) {
		// TODO Auto-generated method stub
		return "<p>\n"+record.getMessage()+"\n</p>\n"; // \n: Separa en lineas
	}
	
	@Override
	public String getHead(Handler h) {
		return "<HTML> \n <BODY> \n";
	    
	}
	        		
	@Override
	public String getTail(Handler h) {
		return "</BODY> \n </HTML> \n";
	}

}
