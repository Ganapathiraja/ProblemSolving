public class MaximumProductSubarray {

    public static void main(String[] args) {

       int[] nums = new int[]{2,3,-2,4,8,5,};
       // int[] nums = new int[]{-2,0,-1};

        int currentMaxProduct = nums[0];
        int preMaxProduct = nums[0];
        int preMinProduct = nums[0];
        int result = nums[0];

        for (int i =1 ; i < nums.length;i++)
        {
            currentMaxProduct = Math.max(currentMaxProduct * nums[i] , Math.max(preMaxProduct * nums[i],nums[i]));
            int currentMinProduct = Math.max(preMinProduct * nums[i],Math.min( preMinProduct * nums[i],nums[i]));
            preMaxProduct = currentMaxProduct;
            preMinProduct = currentMinProduct;

        result = Math.max(result,preMaxProduct);

        }

        System.out.println(result);

    }
}
