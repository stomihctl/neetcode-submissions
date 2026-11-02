class Solution {
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase();
        int front = 0;
        int back = str.length() - 1;
        
        while(front < back){
            while(front < str.length() && !Character.isLetterOrDigit(str.charAt(front))){
                front++;
            }
            while(back > 0 && !Character.isLetterOrDigit(str.charAt(back))){
                back--;
            }
            if(front < back && str.charAt(front++) != str.charAt(back--)){
                return false;
            }
        }
        return true;
    }
}
