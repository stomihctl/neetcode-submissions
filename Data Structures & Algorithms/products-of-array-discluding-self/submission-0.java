class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zero = 0;
        int mul = 1;
        for(int i : nums){
            if(i == 0){
                zero++;
            }
            else{
                mul *= i;
            }
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0 && zero == 1){
                nums[i] = mul;
            }
            else if(nums[i] == 0 && zero > 1){
                nums[i] = 0;
            }
            else if(nums[i] != 0 && zero == 0){
                nums[i] = mul / nums[i];
            }
            else{
                nums[i] = 0;
            }
        }
        return nums;
    }
}  
