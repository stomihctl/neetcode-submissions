class Solution {
    public int minOperations(String s) {

        int cnt1 = 0;
        int cnt0 = 0;
        int cnt21 = 0;
        int cnt20 = 0;
        for(int i = 0; i < s.length(); i++){
            if(i % 2 == 0 && s.charAt(i) == '1'){
                cnt1++;
            }
            else if(i % 2 == 0 && s.charAt(i) == '0'){
                cnt0++;
            }
            else if(i % 2 == 1 && s.charAt(i) == '1'){
                cnt21++;
            }
            else if(i % 2 == 1 && s.charAt(i) == '0'){
                cnt20++;
            }
        }
        System.out.println(cnt1);
        System.out.println(cnt0);
        System.out.println(cnt21);
        System.out.println(cnt20);
        return Math.min(cnt1 + cnt20, cnt21 + cnt0);
    }
}