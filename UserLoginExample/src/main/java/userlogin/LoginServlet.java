package userlogin;

import java.io.IOException; 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Check if the username and password are valid (hard-coded values for demonstration purposes)
        if (username.equals("admin") && password.equals("admin123")) {
            // Set a session attribute to indicate successful login
            request.getSession().setAttribute("loggedIn", true);

            // Redirect to the dashboard page
            response.sendRedirect("dashboard");
        } else {
            // Redirect to the error message page for invalid login
            response.sendRedirect("login-error.html");
        }
    }
}
