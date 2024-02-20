import java.sql.*;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;

class main {
public static void main(String[] args) {
    try {
        Connection connection = DriverManager.getConnection("jdbc:mysql://@localhost:3306/bazatestowa");
        Statement statement = connection.createStatement();
        } catch (SQLException e) {
         System.out.println("nie połączono z baza");
    }

}
}




