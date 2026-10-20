class Solution {
    public int specialArray(int[] nums) {
        int num = nums.length;
        for(int i = 1; i <= nums.length; i++){
            int res = 0;
            for(int j = 0; j < nums.length; j++){
                if(nums[j] >= i){
                    res++;
                }
            }
            if(res == i){
                return res;
            }
        }
        return -1;
    }
}