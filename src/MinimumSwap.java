public class MinimumSwap {

    public static void main(String[] args) {
        int[] nums = new int[] {0,1,0,1,1};

        System.out.println(solution(nums));
    }

    private static int solution(int[] nums) {

        // using 2 pointer to solve this problem use while loop

        int i=0;
        int j = nums.length-1;
        int ans=0;

        System.out.println("J: "+j+" Size is :"+nums.length);


        //0,1,0,1,1
        while (i<j)
        {

            if (nums[i]==0){
                i++;
                //continue;
            }

            if (nums[j]==1){
                j--;
               // continue;
            }

            if (nums[i]==1 && nums[j]==0){
                i++;
                j--;
                ans++;
            }
        }

        return ans;



    }
}
