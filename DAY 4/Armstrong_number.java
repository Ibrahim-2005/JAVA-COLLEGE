import java.util.Scanner;
public class Armstrong_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int count=0;
        for(int i=1;i<=n;i/=10){
            count++;
        }
        
    }
}
       