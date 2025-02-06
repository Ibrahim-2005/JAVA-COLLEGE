import java.util.Scanner;
public class Number_of_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER A NUMBER:");
        int num=sc.nextInt();
        int digit=0;
        // while(num!=0){
        //     int n=num%10;
        //     digit++;
        //     num=num/10;
        // }
        for(int i=num;i!=0;i/=10){
            digit++;
        }
        System.out.println("THE COUNT OF DIGIT IS: "+digit);
        sc.close();
    }
}
