public class For_loop {
    public static void main(String[] args) {
        int i=0; // i is global variable    
        for (i=0; i <= 10; i++) {      // i is local variable
            System.out.print(i+"*");
        }
        
        System.out.println();
        System.out.println(i);
    }
}
