package cyclicSort;

import java.util.Arrays;

public class MissingNumber {

    public static void main(String[] args) {

        //cyclic sort
        int[] arr = {3, 5, 2, 1, 4};
        int i = 0;
        while (i < arr.length) {
            int index = arr[i] - 1;
            if (arr[i] != arr[index]) {
                swapNumbers(arr, i, index);
            } else {
                i++;
            }
        }

        System.out.println(Arrays.toString(arr));

        // missing number
        int[] arrary = {0,1,5,3,2};
        missingNumberSolution(arrary);


    }

    private static void missingNumberSolution(int[] arr) {

        int i=0;
        while (i <arr.length){

            int correct = arr[i];

            if (arr[i] < arr.length && arr[i] != arr[correct]){
                swapNumbers(arr,i,correct);
            }else {
                i++;
            }

        }

        System.out.println(Arrays.toString(arr));

        for (int j=0;j<arr.length;j++){
            if (arr[j] != j){
                System.out.println("this is missing " +j);
                return;
            }
        }

    }

    private static void swapNumbers(int[] arr, int first, int second) {

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
