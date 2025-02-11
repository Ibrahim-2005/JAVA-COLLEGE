public class Merge_String_Alternatively {
    public static void main(String[] args) {
        String s1="abc";
        String s2="pqrs";
        StringBuilder word1=new StringBuilder(s1);
        StringBuilder word2=new StringBuilder(s2);
        StringBuilder finalword=new StringBuilder("");
        int total_length=s1.length()+s2.length();
        for(int i=0;i<total_length;i++){
            for (int j=i;j<word1.length();){
                finalword.append(word1.charAt(j));
                break;
            }
            for (int j=i;j<word2.length();){
                finalword.append(word2.charAt(j));
                break;
            }
        }
        String final_output=finalword.toString();
        System.out.println(final_output);
    }
}