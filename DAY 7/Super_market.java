public class Super_market {
    // Global or non Static variables;
    String name;
    String pname;
    int price;
    int discount;

    public static void main(String[] args) {
        Super_market product1=new Super_market();
        
        
        product1.name="Rice";
        product1.price=50;
        product1.discount=5;
        System.out.println(product1.name);
        
        Super_market product2=new Super_market();
        product2.name="Biscuit";
        product2.price=50;
        product2.discount=5;
        System.out.println(product2.name);
        // System.out.println(name);
    }
}
