public class Main {
    public static void main(String[] args) {
        Product product=new Biscuit();
        product.addPrice(50);
        product.addProductDetails("Milkbikis","7-7-2023");
Store store=new Store();
        store.addProduct(product);
        product=new Chocolate();
        product.addPrice(40);

        product.addProductDetails("Kitkat","23-9-2022");
        store.addProduct(product);
        for(Product product1:Store.product)
        {
            System.out.println(product1);
        }
    }
}