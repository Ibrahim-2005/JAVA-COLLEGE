import java.util.Scanner;

public class Bit_manupulation {
    public static void main(String_2[] args) {
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.print("ENTER A NUMBER:");
        a=sc.nextInt();
        if ((a&1)==0){
            System.out.println(a+" IS EVEN");
        }
        else{
            System.out.println((a+" IS ODD"));
        }
        
        sc.close();
    }
}
