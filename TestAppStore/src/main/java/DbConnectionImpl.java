import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnectionImpl implements DbConnections{

    @Override
    public void select() {
        try {
            String request = "SELECT * FROM public.products_db";
            Statement statement = connect().createStatement();
            ResultSet resultSet = statement.executeQuery(request);
            while (resultSet.next()) {
                var id = resultSet.getLong("id");
                var model = resultSet.getString("model");
                var price = resultSet.getDouble("price");

                System.out.println("Id - " + id +
                        ", model - " + model +
                        ", price - " + price);
            }
        } catch (SQLException e) {
            System.out.print("Data selection failed");
            //throw new RuntimeException(e);
        }
    }

    @Override
    public void insert() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void update() {

    }
}
