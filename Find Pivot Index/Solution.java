class Solution {
    public int pivotIndex(int[] nums) {
        int index = 0;
        for (int i =0; i<nums.length;i++){
            int leftSum = 0, rightSum =0; 
            if(index != 0) {
            for(int j = 0;j < index;j++){
                leftSum = leftSum + nums[j];
            }
            } else {
                leftSum = 0;
            }
            if(index != nums.length){
            for(int k = index+1;k < nums.length;k++){
                rightSum = rightSum + nums[k];
            }
            } else {
                rightSum = 0;
            }
            if(leftSum == rightSum){
                return index;
            } else if(index == nums.length-1){
                return -1;
            }else {
                index++;
            }
        }
        return index;
    }
}