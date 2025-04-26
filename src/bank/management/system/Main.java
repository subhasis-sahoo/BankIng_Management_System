package bank.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        // Replace "todo_app" with your actual database name
        String url = "jdbc:mariadb://localhost:3306/todo_app";
        String user = "root";         // XAMPP default username
        String password = "";         // Leave blank if no password set

        try {
            // Load the MariaDB JDBC driver (optional in modern Java)
            // Class.forName("org.mariadb.jdbc.Driver");

            // Establish connection
            Connection conn = DriverManager.getConnection(url, user, password);

            // If no exception, connection is successful
            System.out.println("✅ Connection to MariaDB successful!");

            // Close connection
            conn.close();
        } catch (SQLException e) {
            System.out.println("❌ Connection failed:");
            e.printStackTrace();
        }
    }
}
