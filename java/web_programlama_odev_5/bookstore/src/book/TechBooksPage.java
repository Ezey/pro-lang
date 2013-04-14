package book;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

	public class TechBooksPage extends CatalogPage {
		public void init() {
			String[] ids = { "hall001", "hall002" };
			setItems(ids);
			setTitle("All-Time Best Computer Books");
		}
}