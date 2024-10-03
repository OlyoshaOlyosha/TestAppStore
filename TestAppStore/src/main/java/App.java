public class App {
    public static void main(String[] args) {
        DbConnectionImpl dbConnection = new DbConnectionImpl();

        dbConnection.insert(new Product("Motorolla", 10524));
    }
}
