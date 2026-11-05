class Solution {
    public int evalRPN(String[] tokens) {
        Deque <String> stack = new ArrayDeque<>();

        for(String str : tokens){
            if(str.length() == 1 && (int) str.charAt(0) < 48){
                int num2 = Integer.parseInt(stack.pop());
                int num1 = Integer.parseInt(stack.pop());
                switch((int) str.charAt(0)){
                    case 42:
                        num1 = num1 * num2;
                        break;
                    case 43:
                        num1 = num1 + num2;
                        break;
                    case 45:
                        num1 = num1 - num2;
                        break;
                    case 47:
                        num1 = num1 / num2;
                        break;
                }   
                stack.push(Integer.toString(num1));
            }
            else{
                stack.push(str);
            }
        }
        return Integer.parseInt(stack.pop());
    }
}