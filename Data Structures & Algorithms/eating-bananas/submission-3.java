class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = 0;
        for(int i : piles){
            if(i > r){
                r = i;
            }
        }
        int prevRes = -1;

        while(l <= r){
            int m = (l + r) / 2;
            long res = 0;
            for(int i : piles){
                res += (long)Math.ceil((double)i / m);
            }
            if(res <= h){
                prevRes = m;
                r = m - 1;
            }
            else{
                l = m + 1;
            }
        }
        return prevRes;
    }
}
