import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProductDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		try {
			Connection connection = DBConnection.getConnection();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM Product");

			out.println("<html><head><title>Product Details</title></head><body>");
			out.println("<h2>Product Details</h2>");

			while (resultSet.next()) {
				int id = resultSet.getInt(1);
				String name = resultSet.getString(2);
				double price = resultSet.getDouble(3);
				String color = resultSet.getString(4);
				String description = resultSet.getString(5);

				out.println("<p>ProductID: " + id + "</p>");
				out.println("<p>ProductName: " + name + "</p>");
				out.println("<p>ProductPrice: " + price + "</p>");
				out.println("<p>ProductColor: " + color + "</p>");
				out.println("<p>ProductDescription: " + description + "</p>");
				out.println("<hr>");

			}

			out.println("</body></html>");

			DBConnection.closeConnection(connection);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			out.println("Error retrieving product details.");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
