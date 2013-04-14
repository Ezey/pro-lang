package AjaxTestServlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Servlet implementation class AjaxTestServlet
 */
@WebServlet("/AjaxTestServlet")
public class AjaxTestServlet extends HttpServlet {
	 
	private Map mpCityState;

	    public AjaxTestServlet() {
	        super();
	        mpCityState = new HashMap();
	       
	        mpCityState.put("istanbul","bakirkoy");
	        mpCityState.put("samsun","atakum");
	        mpCityState.put("ankara","cankaya");
	    }

	    private String handleRequest(String param){
	       
	       
	        return null;
	    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/xml");
		response.setHeader("Cache-Control", "no-store, no-cache");
	     String sehir = "";
	        if(request.getParameter("sehir") != null) sehir = request.getParameter("sehir").trim();   
	        String ilce = (String)mpCityState.get(sehir);
	        if(ilce!=null)    response.getWriter().write(ilce);
	        else response.getWriter().write("boyle bir ilcesi yok");
	}
}
