import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class sql {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String connectionURL="jdbc:mysql://localhost:(port)/mart";
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection(connectionURL);
        System.out.println("Connected to server");
        conn.close();
    }
}
