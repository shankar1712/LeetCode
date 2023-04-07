class Solution {
    public int[] runningSum(int[] nums) {
        int[] output = new int[nums.length];
        for (int i =0; i<nums.length;i++)
        {
            if(i > 0){
                int sum = 0;
                for(int j=0;j<=i;j++){
                    sum  = sum + nums[j];
                }
                output[i] = sum;
            } else {
                output[i] = nums[i];
            }
        }
        return output;
    }
}