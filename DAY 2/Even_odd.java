import java.util.Scanner;

public class Even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER ANY NUMBER:");
        int a=sc.nextInt();
        if (a % 2 == 0) {
            System.out.println(a+" is even");
        } else {
            System.out.println(a+" is odd");
        }
        sc.close();
    }
}
