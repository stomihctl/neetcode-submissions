class StockSpanner {
    private static class Pair{
        int index;
        int value;
        public Pair(int index, int value){
            this.index = index;
            this.value = value;
        }
    }
    Deque<Pair> stack = new ArrayDeque<>();
    int i = 0;
    public StockSpanner() {
        
    }
    
    public int next(int price) {
        if(stack.isEmpty() || stack.peek().value > price){
            stack.push(new Pair(i, price));
            i++;
            return 1;
        }
        else{
            int i2 = i;
            while(!stack.isEmpty() && stack.peek().value <= price ){
                i2 = stack.peek().index;
                stack.pop();
            }
            stack.push(new Pair(i2, price));
            i++;
            return i - i2;
        }
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */