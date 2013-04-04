package searchengine;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import SearchUtilities.SearchUtilities;

import java.net.*;

@WebServlet("/searchengines")
public class searchengines extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public searchengines() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("deprecation")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String searchString = request.getParameter("searchString");
	
	if ((searchString == null) ||(searchString.length() == 0)) {
		reportProblem(response, "Missing search string");
		return;
	}
	searchString = URLEncoder.encode(searchString);
		
	String searchEngineName =request.getParameter("searchEngine");
	if ((searchEngineName == null) ||(searchEngineName.length() == 0)) {
		reportProblem(response, "Missing search engine name");
		return;
	}
	String searchURL =SearchUtilities.makeURL(searchEngineName, searchString);
	if (searchURL != null) {
		response.sendRedirect(searchURL);
	} 
	else {
		reportProblem(response, "Unrecognized search engine");
	}
}
	private void reportProblem(HttpServletResponse response,String message)throws IOException {
		response.sendError(response.SC_NOT_FOUND, message);
	}
}
