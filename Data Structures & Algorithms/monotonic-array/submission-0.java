class Solution {
    public boolean isMonotonic(int[] nums) {
        int i = 0;
        int j = 1;
        int n = nums.length;
        int minc = 0;
        while(j < n){
            if(nums[i] <= nums[j]){
                minc++;
            }
            i++;
            j++;
        }
        if(minc == n - 1){
            return true;
        }
        i = 0;
        j = 1;
        int mdec = 0;
        while(j < n){
            if(nums[i] >= nums[j]){
                mdec++;
            }
            i++;
            j++;
        }
        if(mdec == n - 1){
            return true;
        }
        return false;
    }
}