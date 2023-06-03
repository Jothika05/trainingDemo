package simpli;

import java.io.*;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import org.hibernate.*;

import com.ecommerce.EProduct;

@WebServlet("/HibernateQueryDemo")
public class HibernateQueryDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<html><body>");

		// STEP 1: Get a Session (connection) from the Session Factory class
		SessionFactory factory = HibernateUtil.getSessionFactory();

		Session session = factory.openSession();

		out.println("Hibernate Session opened.<br>");		

		// STEP 2 execute the HQL commands
		// for now we will only test if the connection is establised with MySQL server.
		List<EProduct> eproducts = session.createQuery("from EProduct").list();

		out.println("<br> Data from the eproduct table");
		for(EProduct prod: eproducts) {
			out.println(prod.getID() + ", " + prod.getName() + ",  "  
		+ prod.getPrice() + ",  "  + prod.getDateAdded() + "<br>" );
		}
		
		
		session.close();

		out.println("Hibernate Session closed.<br>");

		out.println("</body></html>");
	}

}