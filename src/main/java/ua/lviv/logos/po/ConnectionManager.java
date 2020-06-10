package ua.lviv.logos.po;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class ConnectionManager {
    private ConnectionManager() {

    }

    private static String URL = "jdbc:mysql://localhost:3306/olenka?serverTimezone=UTC";
    private static String NAME = "db_user";
    private static String PASSWORD = "db_pass";
    private static Connection connection;

    public static Connection createConnection() {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection(URL, NAME, PASSWORD);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return connection;
        }

        return connection;
    }

    public static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}