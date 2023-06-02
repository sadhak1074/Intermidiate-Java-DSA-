public class isSorted{
    public static boolean issorted(int arr[], int idx){
        if(idx==arr.length-1){
            return true;
        }
        if(arr[idx] < arr[idx +1]){
        return issorted(arr, idx);
        }else{
            return false;
        }
    }

    public static void main (String[] args){
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        if(issorted(arr, arr.length-1)){
            System.out.println("Array is sorted");
            }else{
                System.out.println("Array is not sorted");
                }
    }
    
}