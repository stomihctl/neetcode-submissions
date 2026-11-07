class Solution {
    private static class Pair{
        int index;
        int height;
        Pair(int index, int height){
            this.index = index;
            this.height = height;
        }
    }
    public int largestRectangleArea(int[] heights) {
        Deque<Pair> stack = new ArrayDeque<>();
        int max = 0;
        int currInd = 0;
        while(currInd < heights.length){
            if(stack.isEmpty()){
                stack.push(new Pair(currInd, heights[currInd]));
            }
            else if(stack.peek().height <= heights[currInd]){
                stack.push(new Pair(currInd, heights[currInd]));
            }
            else{
                int prevIndex = 0;
                while(!stack.isEmpty() && stack.peek().height >= heights[currInd]){
                    Pair tmp = stack.pop();
                    max = Math.max(max, (currInd - tmp.index) * tmp.height);
                    prevIndex = tmp.index;
                }
                stack.push(new Pair(prevIndex, heights[currInd]));
            }
            currInd++;
        }
        while(!stack.isEmpty()){
            Pair tmp = stack.pop();
            max = Math.max(max, (currInd - tmp.index) * tmp.height);
        }
        return max;
    }
}
