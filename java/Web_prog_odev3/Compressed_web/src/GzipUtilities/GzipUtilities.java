package GzipUtilities;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.zip.*;

public class GzipUtilities {
	public static boolean isGzipSupported
		(HttpServletRequest request) {
	String encodings = request.getHeader("Accept-Encoding");
	return((encodings != null) &&(encodings.indexOf("gzip") != -1));
	}
	
	public static boolean isGzipDisabled
	(HttpServletRequest request) {
	String flag = request.getParameter("disableGzip");
	return((flag != null) && (!flag.equalsIgnoreCase("false")));
	}
	
	public static PrintWriter getGzipWriter
	(HttpServletResponse response) throws IOException {
	return(new PrintWriter
	(new GZIPOutputStream
	(response.getOutputStream())));
	}
}
