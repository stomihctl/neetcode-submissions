class MinStack {
    private int index = 0;
    private int[] stack = new int[100];
    private int max = 100;
    public MinStack() {
        
    }
    
    public void push(int val) {
        if(index > max - 1){
            int[] tmp = new int[2 * max];
            for(int i = 0; i < max; i++){
                tmp[i] = stack[i];
            }
            stack = tmp;
            max = max * 2;
        }
        stack[index++] = val;
    }
    
    public void pop() {
        if(index > 0){
            index--;
        }
    }
    
    public int top() {
        if(index > 0){
            return stack[index - 1];
        }
        else{
            return -1;
        }
    }
    
    public int getMin() {
        if(index > 0){
            int min = stack[0];
            for(int i = 1; i < index; i++){
                if(stack[i] < min){
                    min = stack[i];
                }
            }
            return min;
        }
        return -1;
    }
}
