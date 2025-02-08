import java.util.Scanner;
public class Palindrome_of_numbers {
    public static void main(String_2[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER A NUMBER:");
        int num=sc.nextInt();
        int rev=0;
        int digit;
        while(num!=0){
            digit=num%10;
            rev*=10;
            rev+=digit;
            num=num/10;
            // System.out.print((digit));
        }
        
        for(int i=num;i!=0;i/=10){
            digit=num%10;
            rev*=10;
            rev+=digit;
            num/=10;
        }
        System.out.println(rev);
        sc.close();
    }
}
