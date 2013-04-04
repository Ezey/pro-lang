package excel;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 * Servlet implementation class excel
 */
@WebServlet("/excel")
public class excel extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public excel() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/vnd.ms-excel");
		PrintWriter out = response.getWriter();
		out.println("\tQ1\tQ2\tQ3\tQ4\tTotal");
		out.println("Apples\t78\t87\t92\t29\t=SUM(B2:E2)");
		out.println("Oranges\t77\t86\t93\t30\t=SUM(B3:E3)");
		}
	}


