class Solution {
    public int maxArea(int[] heights) {
        int front = 0;
        int back = heights.length - 1;

        int max = 0;
        while(front < back){
            max = Math.max(max, (back - front) * Math.min(heights[front], heights[back]));
            if(heights[front] > heights[back]){
                back--;
            }
            else{
                front++;
            }
        }
        return max;
    }
}
