package Practice.DesignPatterns.Creational.PrototypePattern;

public class PrototypeDesignPattern {
     public static void main(String[] args) throws CloneNotSupportedException {
        CoffeeShop cs =  new CoffeeShop();
        cs.setShopName("CCD");
        cs.loadStock();
        System.out.println(cs);

        System.out.println("--------------------------------------------------------------------- ");

        CoffeeShop cs1 = (CoffeeShop) cs.clone();
        cs.setShopName("CCD London");
        // here to load coffee types we again need to call load stocks method which probably has a db call 
        // We can ask cs object for data as it has already fetched it from db
        System.out.println(cs1);
    }
}
