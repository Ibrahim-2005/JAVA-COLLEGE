public class Demo {
    static{

        System.out.println("0");
    }
    {
        System.out.println("1");
    }
    {
        System.out.println("2");
    }
    public static void main(String[] args) {
        Demo d=new Demo();
        Demo d1=new Demo();
    }
}
