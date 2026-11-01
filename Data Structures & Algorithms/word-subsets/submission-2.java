class Solution {
    private boolean check(String str, HashMap<Character, Integer> map){
        for(int i = 0; i < str.length(); i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i), map.get(str.charAt(i)) - 1);
            }
        }
        for(Map.Entry<Character, Integer> e : map.entrySet()){
            if(e.getValue() > 0){
                return false;
            }
        }
        return true;
    }
    public String[] wordSubsets(String[] words1, String[] words2) {
        HashMap<Character, Integer> map = new HashMap<>();

        List<String> res = new ArrayList<>();
        int cnt = 0;

        for(int z = 0; z < words1.length; z++){
            for(int i = 0; i < words2.length; i++){
                map.clear();
                for(int j = 0; j < words2[i].length(); j++){
                    map.put(words2[i].charAt(j), map.getOrDefault(words2[i].charAt(j), 0) + 1);
                }                
                if(check(words1[z], new HashMap<>(map))){
                    cnt++;
                }
                else{
                    break;
                }
            }
            if(cnt == words2.length){
                res.add(words1[z]);
            }
            cnt = 0;
        }

        
        return res.toArray(new String[0]);
    }
}
