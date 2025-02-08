public class Operators2 {
    public static void main(String_2[] args) {
                // This is main Method
                System.out.println("Hello World");
                byte a = 127;
                System.out.println(++a);
                // This is a Print Statement
                char c = '9';
                int ab = c;
                // System.out.println();
                System.out.println(ab);
                int caf = 12 | 15;
                int hex = 0xcf;
                int bit=~-5;
                int bitNew= ~5;
                System.out.println(bit);
                System.out.println(caf);
                System.out.println(bitNew);
                int leftShift= 6<<2;
                // Equation : N * 2^n ; N=6,n=2 ; Answer:24 
                int rightShift = 16>>3;
                // Equation : N / 2^n ; N=16,n=3 ; Answer:4
                int unsignedRightShift = 16>>>4;
                /*unsigned right shift is same as right shift, 
                 but the negative value will not come.
                 */
                System.out.println(leftShift);
                System.out.println(rightShift);
                System.out.println(unsignedRightShift);
                System.out.println(hex);
                /*
                 * This is a simple
                 * program in Java
                 */
    }
}
