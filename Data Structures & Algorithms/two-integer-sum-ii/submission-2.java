class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        int front = 0;
        int back = numbers.length - 1;
        while(front < back){
            if(numbers[front] + numbers[back] > target){
                back--;
            }
            else if(numbers[front] + numbers[back] < target){
                front++;
            }
            else{
                res[0] = front + 1;
                res[1] = back + 1;
                return res;
            }
        }
        return res;
    }
}
