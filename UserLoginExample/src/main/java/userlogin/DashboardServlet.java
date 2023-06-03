package userlogin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/dashboard")
public class DashboardServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Check if the user is logged in
        boolean isLoggedIn = (request.getSession().getAttribute("loggedIn") != null);

        if (isLoggedIn) {
            // Show the dashboard page
            response.setContentType("text/html");
            response.getWriter().println("<html><head><title>Dashboard</title></head><body>");
            response.getWriter().println("<h2>Welcome to the Dashboard!</h2>");
            response.getWriter().println("<h4>Successfully Login!</h2>");
            response.getWriter().println("<a href='logout'>Logout</a>");
            response.getWriter().println("</body></html>");
        } else {
            // Redirect to the login page if not logged in
            response.sendRedirect("login.html");
        }
    }
}
