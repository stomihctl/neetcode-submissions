class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        int len = 0;
        for(int i : nums){
            if(set.remove(i)){
                int up = i + 1;
                int down = i - 1;
                int cnt = 1;
                while(set.remove(up)){
                    up++;
                    cnt++;
                    
                }
                while(set.remove(down)){
                    down--;
                    cnt++;
                }
                len = Math.max(cnt, len);
            }
            
        }
        return len;
    }
}
