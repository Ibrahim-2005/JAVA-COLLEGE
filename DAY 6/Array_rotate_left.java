import java.util.Arrays;
public class Array_rotate_left {
    public static void main(String_2[] args) {
        int a[] = { 1, 2, 3, 4, 5 };
        int d = 3;
        for (int i = 0; i < d; i++) {
            int last = a[a.length - 1];
            for (int j = a.length - 1; j > 0; j--) {
                a[j] = a[j - 1];
            }
            a[0] = last;
            System.out.println(Arrays.toString(a));
        }
    }
}