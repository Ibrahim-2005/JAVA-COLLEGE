import java.util.Scanner;

public class Prime_range {
    public static void main(String_2[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER ANOTHER NUMBER:");
        int start=sc.nextInt();
        System.out.print("ENTER ANY RANGE:");
        int range=sc.nextInt();
        
        for (int i=start;i<=range;i++){
            // int divider=2;
            boolean isprime=true;
            // while(divider<=i/2){
            //     if(i%divider==0){
            //         isprime=false;
            //         break;
            //     }
            //     divider++;

            // }
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    isprime=false;
                            break;
                }
            }
            System.out.print((isprime)?i+" ":"");

        }
        sc.close();
    }
}
