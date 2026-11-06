class Solution {
    private static class Pair{
        int index;
        int value;
        Pair(int index, int value){
            this.index = index;
            this.value = value;
        }
    }
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Pair> stack = new ArrayDeque<>();
        int[] res = new int[temperatures.length];

        for(int i = 0; i < temperatures.length; i++){
            if(stack.isEmpty() || stack.peek().value > temperatures[i]){
                stack.push(new Pair(i, temperatures[i]));
            }
            else{
                while(!stack.isEmpty() && stack.peek().value < temperatures[i]){
                    Pair p = stack.pop();
                    res[p.index] = i - p.index;
                }
                stack.push(new Pair(i, temperatures[i]));
            }
        }
        return res;

    }
}
