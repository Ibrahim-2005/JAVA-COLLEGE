public class String_Demo4 {
    public static void main(String[] args) {
        String s=new String("IBRAHIM");
        String str="";
        int len=s.length()-1;
        for(int i=0;i<s.length();i++){
            str+=(s.charAt(len-i));
        }
        System.out.println(str);
    }
}
