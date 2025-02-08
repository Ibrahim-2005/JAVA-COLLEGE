public class Length_in_String {
    public static void main(String[] args) {
        String s="HELLO";
        int count=1;
        for(int i=0;i<s.length();i++){
            if(s.equals(" ")){
                count=0;
                break;
            }
            if(s.charAt(i)==' '){
                count++;
            }
            else{
                continue;
            }
        }
        System.out.println(count);
    }
}
