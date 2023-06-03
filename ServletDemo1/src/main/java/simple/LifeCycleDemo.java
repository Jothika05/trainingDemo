package simple;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LifeCycleDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String strABC;
	

	@Override
	public void init(ServletConfig config) throws ServletException {		
		super.init();
		System.out.println("Inside Init method");
		
		String strABC  = config.getInitParameter("ABC");
		System.out.println("Init parameter ABC has value = "+strABC);
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Inside doGet method");
		PrintWriter out = response.getWriter();	
		ServletContext sc = request.getServletContext();
				
		out.println("I am deployed on "+		sc.getServerInfo());
		out.println("I am listening  on port  "+		request.getServerPort());
		
		

		out.println("Servlet Init parameter ABC has value = "+strABC);
		
		//get the ServletContext object.
		// only one ServletContext is there for the entire application
		
		
		String strXYZ = sc.getInitParameter("XYZ");
		out.println("Context Param XYZ has value = " + strXYZ);
		
		//process the data submitted by the client.
	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// process the data submitted by the client.
		
		// process single valued parameters
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		
		// process single valued parameters (like checkboxes)
		String[] hobbies = request.getParameterValues("hobbies");

		PrintWriter out = response.getWriter();
		out.println("Thank you, " + name + ". Your age is " + age);
		out.println("\nYou hobbies are:");
		for(String hobby: hobbies) {
			out.println("<br>"+hobby);
		}
	}

	@Override
	public void destroy() {
		System.out.println("Inside Destroy method");
		super.destroy();
	}

}