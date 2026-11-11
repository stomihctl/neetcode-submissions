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
                //System.out.println(i + " " + m + " " + (int)Math.ceil((double)i / m));
                res += (long)Math.ceil((double)i / m);
            }
            System.out.println(res + "-----------------");
            if(res <= h){
                prevRes = m;
                r = m - 1;
            }
            /*else if(prevRes != -1){
                return prevRes;
            }*/
            else{
                l = m + 1;
            }
        }
        return prevRes;
    }
}
