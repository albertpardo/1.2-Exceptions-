package level1ex1;

public class Product {
    private String name;
    private Double price;

    public Product(String name, Double price){
        this.name = name;
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        return ("Name: " + name+ ", Price: " + price);
    }
}
