import java.util.Scanner;
public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int m=n/2;
        for(int i=1;i<=m;i++){
            if(n%i==0){
                System.out.print(i+"  ");
            }
            // System.out.println((n%i==0)? (i):"");
        }
        sc.close();
    }
}
