import java.util.Arrays;

public class Array_two_sum {
    public static void main(String[] args) {
        int arr[]={2,7,11,15};
        int target=9;
        int res[]=new int[2];
        for (int i=0;i<arr.length;){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[i+1]==target){
                    res[0]=i;
                    res[1]=j;
                    break;
                }
            }
            break;
        }
        System.out.println(Arrays.toString(res));
    }
}
