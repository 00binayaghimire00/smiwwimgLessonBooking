package swimmingBooking.Controller;
import swimmingBooking.DatabaseConnection;
import swimmingBooking.ExceptionHandling.InputHandling;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Learners {
    public static void checkValidUser(String username, String password) {
        Connection connection = null;
        try{
            connection = DatabaseConnection.getConnection();
            String query = "SELECT * FROM user_pass WHERE username = ? AND password = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, username);
            statement.setString(2, password);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                System.out.println("Welcome " + username + "!");
            } else {
                System.out.println("Invalid username or password.");
                System.out.print("Enter username: ");
                username = InputHandling.getInputByString();
                System.out.print("Enter password: ");
                password = InputHandling.getInputByString();
                checkValidUser(username, password);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    public static void registerNewLearners() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Register a new user");
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        Connection connection = null;
        try{
            connection = DatabaseConnection.getConnection();
            String query = "INSERT INTO user_pass (username, password) VALUES (?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, username);
            statement.setString(2, password);
            int rowsInserted = statement.executeUpdate();

            if (rowsInserted > 0) {
                System.out.println("A new user was registered successfully!");
            } else {
                System.out.println("Failed to register the user.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    }
}
