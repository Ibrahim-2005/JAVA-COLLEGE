public class Divisible_by_3n5 {
    public static void main(String[] args) {
        for (int i=1; i<=100; i++)
        {
            if (i%3==0 && i%5==0)
            {
                System.out.println(i);
            }
            // System.out.println((i%2==0 && i%5==0)? (i):("**"));
        }
    }
}

