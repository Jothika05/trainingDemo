package simple;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectorDemo {
    public static void main(String[] args) {
        // Database connection parameters
        String url = "jdbc:mysql://localhost:3306/Productdetails";
        String username = "root";
        String password = "root";

        // Establishing a connection
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            // Connection successful, perform database operations here
            System.out.println("Connected to the database!");

            // Fetching table names from the "aruljothi" database
            try (Statement statement = connection.createStatement();
                 ResultSet resultSet = statement.executeQuery("SHOW TABLES")) {

                // Printing table names
                while (resultSet.next()) {
                    String tableName = resultSet.getString(1);
                    System.out.println(tableName);
                }
            } catch (SQLException e) {
                System.err.println("Failed to execute the query!");
                e.printStackTrace();
            }
        } catch (SQLException e) {
            // Connection failed, handle the exception
            System.err.println("Failed to connect to the database!");
            e.printStackTrace();
        }
    }
}