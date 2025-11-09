package level1ex1;

public class Main {
    private static void calculateTotalSale(Sale sale) {
        try {
            sale.calculateTotal();
        } catch (SaleEmptyException e) {
            System.out.println("ERROR : " + e.getMessage());
        }
    }
    public static void main(String[] args){

        Sale saleEmpty;
        Sale saleWithProducts;

        saleEmpty = new Sale();
        System.out.println("Execute saleEmpty.calculateTotal()");
        calculateTotalSale(saleEmpty);

        System.out.println("\nCreate saleWithProducts' variable and add products:");
        saleWithProducts = new Sale();
        saleWithProducts.addProduct(new Product("product1", 1.0));
        saleWithProducts.addProduct(new Product("product2", 1.0));
        saleWithProducts.addProduct(new Product("product3", 1.0));
        calculateTotalSale(saleWithProducts);
        System.out.println(" The 'totalSalePrice' in 'saleWithProducts' -> " + saleWithProducts.getTotalSalePrice());
    }
}
