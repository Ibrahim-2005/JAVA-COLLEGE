import java.util.Scanner;

public class Tables {
    public static void main(String_2[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int a=sc.nextInt();
        for (int i=1;i<=10;i++){
            System.out.println(a+"*"+i+"="+a*i);
        }
        sc.close();
    
    }
    
}
