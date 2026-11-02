class Solution {
    public boolean isPalindrome(String s) {
        String sAlNum = s.replaceAll("[^a-zA-Z0-9]", "");
        String str = sAlNum.toLowerCase();
        int front = 0;
        int back = str.length() - 1;
        
        while(front < back){
            if(str.charAt(front) != str.charAt(back)){
                return false;
            }
            front++;
            back--;
        }
        return true;
    }
}
