import javax.swing.plaf.nimbus.State;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnectionImpl implements DbConnections{

    @Override
    public void select() {
        try {
            String request = "SELECT * FROM public.products";
            Statement statement =  connect().createStatement();
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
    public void insert(Product product) {
        try {
            var request = "INSERT INTO public.products(model, price) VALUES(?, ?)";

            var connections = connect();

            var prepareStatement = connections.prepareStatement(
                    request, Statement.RETURN_GENERATED_KEYS
            );

            prepareStatement.setString(1, product.getModel());
            prepareStatement.setDouble(2, product.getPrice());

            prepareStatement.executeUpdate();
            System.out.println("Data insertion process completed!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete() {

    }

    @Override
    public void update() {

    }
}
