import java.util.Scanner;

public class Tutorial_Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Integer input
        System.out.print("ENTER ANY NUMBER:");
        int a=sc.nextInt();
        System.out.println("You entered: "+a);
        // Float input
        System.out.print("ENTER ANY FLOAT NUMBER:");
        float b=sc.nextFloat();
        System.out.println("You entered: "+b);
        // String input
        System.out.print("ENTER ANY STRING:");
        String c=sc.next();
        // This will only print the first word of the string
        System.out.println("You entered: "+c);
        // String input
        sc.nextLine();// This is used to clear the space
        System.out.print("ENTER ANY STRING:");
        String d=sc.nextLine();
        // This will print the whole string
        System.out.println("You entered: "+d);
        // Character input
        System.out.println("ENTER ANY WORD:");
        char f=sc.next().charAt(0);     // This will only take the first character
        System.out.println(f);
    sc.close();
    }
    
}
