package level1ex1;

import java.util.ArrayList;

public class Sale {
    private ArrayList<Product> productCollection;
    private Double totalSalePrice;

    public Sale(){
        this.productCollection = new ArrayList<>();
        this.totalSalePrice = 0.0;
    }

    public void addProduct(Product product){
        productCollection.add(product);
    }

    public Double getTotalSalePrice(){
        return totalSalePrice;
    }

    public void calculateTotal() throws SaleEmptyException{
       if (productCollection.isEmpty())
                throw new SaleEmptyException("To make a sale you first have to add products");
            for (Product product : productCollection) totalSalePrice += product.getPrice();
    }
}
