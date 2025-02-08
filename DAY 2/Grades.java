import java.util.Scanner;

public class Grades {
    public static void main(String_2[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks:");
        int marks = sc.nextInt();
        if (marks>=90){
            System.out.println("GRADE:A");
        }
        else if(marks>=80 && marks<90){
            System.out.println("GRADE:B");
        }
        else if(marks>=70 && marks<80){
            System.out.println("GRADE:C");
        }
        else if(marks>=60 && marks<70){
            System.out.println("GRADE:D");
        }
        else{
            System.out.println("Congratulations!! You are failed");
        }
    sc.close();
    }
}
