class Solution {
    public boolean isMonotonic(int[] nums) {
        int i = 0;
        int j = 1;
        int n = nums.length;
        int minc = 0;
        int mdec = 0;
        while(j < n){
            if(nums[i] <= nums[j]){
                minc++;
            }
            if(nums[i] >= nums[j]){
                mdec++;
            }
            i++;
            j++;
        }
        return minc == n - 1 || mdec == n - 1;
    }
}