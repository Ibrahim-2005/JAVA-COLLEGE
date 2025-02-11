public class Array_Duplicate {

    public static void main(String[] args) {
        int arr[]={2,3,1,2,3};
        // int res[]={};
        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            int count=1;
            for(int j=i+1;j<arr.length;j++){
                if(num==arr[j]){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
