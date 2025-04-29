package bank.management.system;


import java.sql.*;

public class DBConnection {
//    Five steps for JDBC connection
//    Register the Driver
//    Create connections
//    Create statement
//    Execute query
//    Close connection

    String url = "jdbc:mariadb://localhost:3306/bank_management_system";
    String user = "root";
    String password = "";

    Connection conn;
    Statement stmt;

    public DBConnection() {
        try {
            // Load the MariaDB JDBC driver (optional in modern Java)
            // Class.forName("org.mariadb.jdbc.Driver");

            // Establish connection
            conn = DriverManager.getConnection(url, user, password);

            // Create statement
            stmt = conn.createStatement();


        } catch(Exception e) {
            System.out.println(e);
        }
    }

}
