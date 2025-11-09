package level1ex1;

public class Main {

    public static void main(String[] args){

        Sale saleEmpty;
        Sale saleWithProducts;

        saleEmpty = new Sale();
        System.out.println("Execute saleEmpty.calculateTotal()");
        saleEmpty.calculateTotalSale();

        System.out.println("\nCreate saleWithProducts' variable and add products:");
        saleWithProducts = new Sale();
        saleWithProducts.addProduct(new Product("product1", 1.0));
        saleWithProducts.addProduct(new Product("product2", 1.0));
        saleWithProducts.addProduct(new Product("product3", 1.0));
        saleEmpty.calculateTotalSale();
        System.out.println(" The 'totalSalePrice' in 'saleWithProducts' -> " + saleWithProducts.getTotalSalePrice());
    }
}
