import java.util.ArrayList;

public interface Product {
    void addPrice(int price);
    void  addProductDetails(String name,String expDate);
}
class Chocolate implements Product
{int price;
    String name;
    String expDate;
   public void addPrice(int price)
    {
        this.price=price;
    }
   public void addProductDetails(String name,String expDate)
    {
        this.expDate=expDate;
      this.name=name;
    }
    public String toString()
    {
        return "Name:"+this.name + " Price " + this.price +" Expirydate:"+this.expDate ;
    }
}
class Biscuit implements Product
{
    int price;
    String name;
    String expDate;
    public void addPrice(int price)
    {
        this.price=price;
    }
    public void addProductDetails(String name,String expDate)
    {
        this.expDate=expDate;
        this.name=name;
    }
    public String toString()
    {
        return "Name:"+this.name + " Price " + this.price +" Expirydate:"+this.expDate ;
    }
}
class Store
{
  static ArrayList<Product>  product=new ArrayList<>();
    public void addProduct(Product product)
    {
       this.product.add(product);

    }

}

