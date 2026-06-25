public class Insertion {
    public static void main(String[] args) {
        int arr[]={2,4,5,6,7,8};
        int idx=3;
        int val=99;

        for(int i=arr.length-1;i>idx;i--){
            arr[i]=arr[i-1];
        }
    arr[idx]= val;
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    }
}