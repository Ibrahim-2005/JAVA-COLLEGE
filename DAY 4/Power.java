public class Power {
    public static void main(String[] args) {
        int base=2,power=4;
        int total=1;
        while(power>0){
            total*=base;
            power--;
        }
        System.out.println(total);
    }
}
