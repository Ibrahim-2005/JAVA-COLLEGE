import java.util.Scanner;

public class Sum_of_digit_until_single {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER A NUMBER:");
        int num=sc.nextInt();
        int sum=0;
        int digit;
        while(num!=0){
            digit=num%10;
            
            sum+=digit;
            num=num/10;
        }
        int dig,total=0;
        while(sum!=0){
            dig=sum%10;
            total+=dig;
            sum=sum/10;
        }
        
        // for(int i=num;i!=0;i/=10){
        //     digit=num%10;
            
        //     sum+=digit;
        //     num/=10;
        // }
        System.out.println(total);
        sc.close();
    }
}
