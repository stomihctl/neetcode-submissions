class MinStack {

    private static class Stack{
        int value;
        int min;
        Stack next = null;
        Stack(int value, int min, Stack next){
            this.value = value;
            this.min = min;
            this.next = next;
        }

    }

    private Stack head = null;


    public MinStack() {
        
    }
    
    public void push(int value) {
        int min = head == null ? value : Math.min(head.min, value);
        head = new Stack(value, min, head);
    }
    
    public void pop() {
        head = head.next;
    }
    
    public int top() {
        return head.value;
    }
    
    public int getMin() {
        return head.min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */