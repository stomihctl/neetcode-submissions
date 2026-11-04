class Solution {
    public int trap(int[] height) {
        /*int front = 1;
        int back = 0;
        int trap = 0;
        int tmp = 0;
        while(front < height.length){
            if(height[back] > height[front] && front != height.length - 1){
                tmp += height[back] - height[front];
                front++;
                //System.out.println("TMP " + tmp);
            }
            else if(height[back] > height[front] && front == height.length - 1){
                tmp = 0;
                back++;
                front = back + 1;
            }
            else{
                trap += tmp;
                tmp = 0;
                back = front;
                front++;
                //System.out.println("tramp " + trap);
            }
            
            
        }
        return trap;
    }*/
        int res = 0;
        int[] maxpre = new int[height.length];
        int[] maxpost = new int[height.length];

        int maxpr = 0;
        for(int i = 0 ; i < height.length; i++){
            if(height[i] > maxpr){
                maxpr = height[i];
            }
            maxpre[i] = maxpr;
        }
        int maxpo = 0;
        for(int i = height.length - 1 ; i >= 0 ; i--){
            if(height[i] > maxpo){
                maxpo = height[i];
            }
            maxpost[i] = maxpo;
        }
        for(int i = 0 ; i < height.length; i++){
            res += Math.min(maxpost[i], maxpre[i]) - height[i];
        }
        return res;
    }
}
