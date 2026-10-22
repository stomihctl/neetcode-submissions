class Solution {
    public int heightChecker(int[] heights) {
        int[] harr = heights.clone();
        Arrays.sort(harr);
        int n = 0;
        for(int i = 0; i < heights.length; i++){
            if(heights[i] != harr[i]){
                n++;
            }
        }
        return n;
    }
}