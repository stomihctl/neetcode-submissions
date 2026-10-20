class Solution {
    public boolean isCircularSentence(String sentence) {
        int n = sentence.length();
        if(n == 0){
            return true;
        }
        int b = 0;
        while(true){
            while(b < n && sentence.charAt(b) != ' '){
                b++;
            }
            if(b == n){
                return sentence.charAt(b - 1) == sentence.charAt(0);
            }
            else if (sentence.charAt(b - 1) == sentence.charAt(b + 1)){
                b++;
            }
            else{
                return false;
            }
        }

    }
}
