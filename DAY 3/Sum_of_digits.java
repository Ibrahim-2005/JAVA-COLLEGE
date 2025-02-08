import java.util.Scanner;

public class Sum_of_digits {
    public static void main(String_2[] args) {
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
        
        for(int i=num;i!=0;i/=10){
            digit=num%10;
            
            sum+=digit;
            num/=10;
        }
        System.out.println(sum);
        sc.close();
}
}
