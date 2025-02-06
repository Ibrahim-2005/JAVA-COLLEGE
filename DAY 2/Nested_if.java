import java.util.Scanner;

public class Nested_if {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER YOUR ATTENDANCE PERCENTAGE:");
        int a=sc.nextInt();
        System.out.print("Do you have hall ticket(true/false):");
        boolean hall_ticket=sc.nextBoolean();
        if(hall_ticket){
            if(a>=60){
                System.out.println("You are allowed to write the exam");
            }
            else{
                System.out.println("Pay fine and go to write the exam");
            }
        }
        else{
            System.out.println("You are not allowed to write the exam");
        }
        sc.close();
    }
}
