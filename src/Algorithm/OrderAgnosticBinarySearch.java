package Algorithm;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {

        int arr[] = {2,3,4,5,9,10,78};
        int target = 9;
        BuildBinarySearch(arr,target);

    }

    private static void BuildBinarySearch(int[] arr, int target) {
       
        int start = 0;
        int end = arr.length-1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end ){

            int mid = start + (end-start)/2;
            System.out.println(mid);

            if (target == arr[mid]){
                System.out.printf("Target is at index %d",mid);
                return;
            }

            if (isAsc){

                if (target < arr[mid]){
                    end = mid-1;
                }else {
                    start = mid+1;
                }

            }else {
                if (target > arr[mid]){
                    end = mid-1;
                }else {
                    start = mid+1;
                }
            }
            
        }

        return;

    }
}
