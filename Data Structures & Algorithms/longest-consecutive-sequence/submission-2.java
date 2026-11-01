class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        int len = 0;
        while(set.size() > 0 && len < set.size()){
            int num = set.iterator().next();
            int up = num + 1;
            int down = num - 1;
            int cnt = 1;
            set.remove(num);
            while(set.contains(up)){
                set.remove(up);
                up++;
                cnt++;
                
            }
            while(set.contains(down)){
                set.remove(down);
                down--;
                cnt++;
                
            }
            len = Math.max(cnt, len);
        }
        return len;
    }
}
