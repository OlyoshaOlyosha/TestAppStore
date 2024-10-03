public class Product {
    private long id;
    private String model;
    private double price;

    public Product(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public long getId() {
        return id;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

}
