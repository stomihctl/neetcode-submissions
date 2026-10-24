class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> mapNumsCnt = new HashMap<>();
        HashMap<Integer, ArrayList<Integer>> mapCntNums = new HashMap<>();

        for(int i : nums){
            mapNumsCnt.put(i, mapNumsCnt.getOrDefault(i, 0) + 1);
        }
        int maxCnt = 0;
        for(Map.Entry<Integer, Integer> e : mapNumsCnt.entrySet()){
            mapCntNums.computeIfAbsent(e.getValue(), x -> new ArrayList<>()).add(e.getKey());
            if(maxCnt < e.getValue()){
                maxCnt = e.getValue();
            }
        }
        int[] res = new int[k];
        int i = 0;
        while(k != 0){
            if(mapCntNums.containsKey(maxCnt) && mapCntNums.get(maxCnt).size() > 0){
                res[i] = mapCntNums.get(maxCnt).remove(mapCntNums.get(maxCnt).size() - 1);
                k--;
                i++;
            }
            else{
                maxCnt--;
            }
        }
        return res;
    }
}
