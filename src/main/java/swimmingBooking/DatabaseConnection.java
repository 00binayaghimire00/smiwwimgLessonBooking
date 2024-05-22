package swimmingBooking;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/swimmingBooking";
    private static final String USER = "root"; // your MySQL username
    private static final String PASSWORD = "root"; // your MySQL password

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
//    public static void main(String[] args) {
//        try (Connection connection = getConnection()) {
//            if (connection != null) {
//                System.out.println("Connected to the database!");
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
}
