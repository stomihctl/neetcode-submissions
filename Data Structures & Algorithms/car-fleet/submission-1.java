class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Deque<Double> stack = new ArrayDeque<>();

        Integer[] idx = new Integer[position.length];
        for(int i = 0; i < position.length; i++){
            idx[i] = i;
        }
        Arrays.sort(idx, (a,b) -> Integer.compare(position[a], position[b]));

        int[] positionSorted = new int[position.length];
        int[] speedSorted = new int[position.length];

        for(int i = 0; i < position.length; i++){
            positionSorted[i] = position[idx[i]];
            speedSorted[i] = speed[idx[i]];
        }

        for(int i = positionSorted.length - 1; i >= 0; i--){
            double res = (double)(target - positionSorted[i]) / speedSorted[i];
            if(stack.isEmpty() || stack.peek() < res){
                stack.push(res);
            }
        }
        return stack.size();
    }
}
