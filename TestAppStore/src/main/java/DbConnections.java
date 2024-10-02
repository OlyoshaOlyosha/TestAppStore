import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public interface DbConnections {
    default Connection connect() {
        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/test_db",
                    "postgres",
                    "admin"
            );
            System.out.println("Connection successed!");
            return connection;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Connection failed!");
            return null;
        }
    }
    void select();
    void insert();
    void delete();
    void update();
}
