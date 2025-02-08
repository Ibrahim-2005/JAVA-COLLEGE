import java.util.Scanner;
public class Prime {
    public static void main(String_2[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER ANY NUMBER:");
        int num=sc.nextInt();
        // int factor=0;
        // for(int i=1;i<=num;i++){
        //     if(num%i==0){
        //         factor++;
        //     }
        // }
        // if (factor<=2){
        //     System.out.println(num+" IS A PRIME NUMBER");
        // }
        // else{
        //     System.out.println(num+" IS NOT A PRIME NUMBER");
        // }
        boolean isprime=true;
        int i=2;
        while(i<=num/2){
            if(num%i==0){
                isprime=false;
            }
            i++;
        }
        if(isprime){
            System.out.println("prime");
        }
        else{
            System.out.println("no prime");
        }
        sc.close();
    }

}
