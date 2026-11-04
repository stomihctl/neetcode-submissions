class Solution {
    public boolean isValid(String s) {
        //Deque<Character> st = new ArrayDeque<>();
        /*for(int i = 0; i < s.length(); i++){
            if(!st.isEmpty() && (s.charAt(i) - st.peek() == 1 || s.charAt(i) - st.peek() == 2)){
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
        }
        return st.isEmpty();*/
        char[] stack = new char[s.length()];
        int size = 0;
        int index = 0;
        for(int i = 0; i < s.length(); i++){
            if(index != 0 && (s.charAt(i) - stack[index-1] == 1 || s.charAt(i) - stack[index-1] == 2)){
                index--;
            }
            else{
                stack[index++] = s.charAt(i);
            }
        }
        return index == 0;
    }
}
