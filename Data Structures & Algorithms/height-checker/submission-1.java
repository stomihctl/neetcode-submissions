class Solution {
    public int heightChecker(int[] heights) {
        /*int[] harr = heights.clone();
        Arrays.sort(harr);
        int n = 0;
        for(int i = 0; i < heights.length; i++){
            if(heights[i] != harr[i]){
                n++;
            }
        }
        return n;*/
        int[] hmap = new int[101];
        for(int i = 0; i < heights.length; i++){
            hmap[heights[i]]++;
        }
        int cnt = 0;
        int indexa = 0;
        int indexm = 0;
        while(indexa < heights.length){
            if(hmap[indexm] != 0){
                if(heights[indexa] != indexm){
                    cnt++;
                }
                hmap[indexm]--;
                indexa++;
            }
            else{
                indexm++;
            }
        }
        return cnt;
    }
}