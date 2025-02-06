import java.util.Scanner;
public class Count_of_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+"  ");
                count++;

            }
            // System.out.println((n%i==0)? (i):"");
        }
        System.out.println("\nTotal number of factors: "+count);
        sc.close();
    }
}


