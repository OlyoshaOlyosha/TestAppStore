import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnectionImpl implements DbConnection{

    @Override
    public void select() {
        try {
            String request = "SELECT * FROM public.users";
            Statement statement = connect().createStatement();
            ResultSet resultSet = statement.executeQuery(request);

            while (resultSet.next()) {
                var id = resultSet.getLong("id");
                var username = resultSet.getString("username");
                var password = resultSet.getString("password");

                System.out.println("ID - " + id + ", username - " + username + ", password - " + password);
            }
        } catch (SQLException e) {
            System.out.println("Cannot load data from db. Please try again.");
        }
    }

    @Override
    public void insert(User user) {
        try {
            var request = "INSERT INTO public.users(username, password) VALUES(?, ?)";

            var connection = connect();

            var prepareStatement = connection.prepareStatement(
                    request, Statement.RETURN_GENERATED_KEYS
            );

            prepareStatement.setString(1, user.getUsername());
            prepareStatement.setString(2, Encryption.encrypt(user.getPassword()));

            prepareStatement.executeUpdate();

            System.out.println("Data inserted successfully!");
        }
        catch (SQLException e) {
            System.out.println("Data insertion failed. Please, try again!");
            System.out.println(e);
        }
    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }


}

