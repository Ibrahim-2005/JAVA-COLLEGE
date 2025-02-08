public class Total_length_of_String {
    public static void main(String[] args) {
        String s="Hello";
        char c[]=s.toCharArray();
        for(int i=0;i<c.length;i++){
            System.out.println(c[i]);
        }
        String s1=new String(c);
        System.out.println(s1);
    }
}
