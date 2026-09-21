public class Products {
    private int price;
    private String name;

    public Products(String productName, int price){
        this.name = productName;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(int nome) {
        this.name = name;
    }


}
