package DSA;

public class MaxProductSubArray {
    public static int maxProduct(int[] nums){

        if(nums.length==1) return nums[0];
        if(nums.length==2){
            int out = Math.max(nums[0], nums[1]);
            out = Math.max(out, nums[0]*nums[1]);
            return out;
        }

        int product = 1;
        int maxProduct = Integer.MIN_VALUE;

        for (int i=0; i<nums.length-1; i++){
            if (nums[i] > maxProduct){
                maxProduct = nums[i];
            }
            product *= nums[i];
            for (int j=i+1; j< nums.length; j++){
                product *= nums[j];
                if (product > maxProduct){
                    maxProduct = product;
                }
            }
            product = 1 ;
        }
        if (nums[nums.length-1] > maxProduct){
            maxProduct = nums[nums.length-1];
        }
        return maxProduct;
    }

    public static void main(String[] args) {
        int[] nums = {-3,0,1,-2};
        System.out.println(maxProduct(nums));
    }
}
