package Algorithm;

public class BinarySearch {

    public static void main(String[] args) {


        int arr[] = {2,3,4,5,9,10,78};
        int target = 9;
        BuildBinarySearch(arr,target);


    }

    private static void BuildBinarySearch(int[] arr, int target) {


        int start = 0;
        int end = arr.length-1;


        while (start <= end)
        {
            int mid = start + (end-start)/2;

            if (target == mid)
            {
                System.out.println("we got the element");
                return;
            }

            if (target<arr[mid])
            {
                end = mid-1;

            }else if (target>arr[mid]){
                start  = mid+1;
            }else {
                System.out.printf("Target is at index %d",mid);
                return;
            }

        }

        return;

    }


}
