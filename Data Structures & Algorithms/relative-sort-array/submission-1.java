class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] res = new int[arr1.length];
        //Map<Integer, Integer> map = new HashMap<>();
        int[] map = new int[1001];
        for (int i = 0; i < arr1.length; i++){
            //map.put(arr1[i], map.getOrDefault(arr1[i], 0));
            map[arr1[i]]++;
        }
        int ind2 = 0;
        int i = 0;
        while(ind2 < arr2.length){
            //if(ind2 < arr2.length && map.get(arr2[ind2]) > 0){
            if(ind2 < arr2.length && map[arr2[ind2]] > 0){
                res[i] = arr2[ind2];
                //map.put(arr2[ind2], map.get(arr2[ind2] - 1));
                map[arr2[ind2]]--;
                i++;
            }
            else{
                ind2++;
            }
        }
        int j = 0;
        while(j < map.length){
            while(map[j] > 0){
                res[i] = j;
                i++;
                map[j]--;
            }
            j++;
        }
        return res;
    }
}