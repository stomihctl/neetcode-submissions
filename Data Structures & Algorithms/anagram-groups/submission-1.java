class Solution {
    /*public Boolean check(String s1, String s2){
        HashMap<Character, Integer> map = new HashMap<>();
        if(s1.length() != s2.length()){
            return false;
        }
        for(int i = 0; i < s1.length(); i++){
            map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0) + 1);
        }
        for(int i = 0; i < s2.length(); i++){
            map.put(s2.charAt(i), map.getOrDefault(s2.charAt(i), 0) - 1);
        }
        for(int val : map.values()){
            if(val != 0){
                return false;
            }
        }
        return true;
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        for(int i = 0; i < strs.length; i++){
            boolean inserted = false;
            for(int j = 0; j < res.size(); j++){
                if(check(strs[i], res.get(j).get(0))){
                    res.get(j).add(strs[i]);
                    inserted = true;
                    break;
                }
            }
            if(!inserted){
                List<String> tmp = new ArrayList<>();
                tmp.add(strs[i]);
                res.add(tmp);
            }
        }   
        return res;
    }*/
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(int i = 0; i < strs.length; i++){
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars);
            if (!map.containsKey(sortedStr)) {
                map.put(sortedStr, new ArrayList<>());
            }
            map.get(sortedStr).add(strs[i]);
        }   
        List<List<String>> res = new ArrayList<>(map.values());
        return res;
    }
    
}
