public class Length_of_last_word {
    public static void main(String[] args) {
        String s1="Hello world java muhammad";
        s1=s1.trim();
        int lindex=s1.lastIndexOf(" ");
        int count=0;
        // System.out.println(s1.substring(lindex+1, s1.length()));
        for(int i=lindex+1;i<=s1.length()-1;i++){
            count++;
        }
        System.out.println(count);
        System.out.println(s1.strip());
    }
}
