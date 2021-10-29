import java.util.Arrays;
import java.util.HashSet;

public class TwoSum {
    public static void main(String[] args) {

        int[] arr= {2,7,11,15};
        twoSum(arr,9);

    }

    public static void twoSum(int[] nums, int target) {

        HashSet<Integer> hashSet = new HashSet<Integer>();

       // 0,1, 2, 3
        //2,7,11,15 -- 9

        for(int i=0;i<nums.length;i++){

            int diff = target - nums[i];

            if(hashSet.contains(diff)){

                System.out.println(Arrays.toString(new int[]{nums[i], diff}));
            }

            hashSet.add(nums[i]);

        }

    }
}