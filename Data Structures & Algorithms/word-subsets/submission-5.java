class Solution {
    public String[] wordSubsets(String[] words1, String[] words2) {
        List<String> res = new ArrayList<>();
        int[] map = new int[26];

        for(int i = 0; i < words2.length; i++){
            int[] tmp = new int[26];
            for(int j = 0; j < words2[i].length(); j++){
                tmp[words2[i].charAt(j) - 'a']++;   
            }
            for(int j = 0; j < 26; j++){
                map[j] = Math.max(map[j], tmp[j]);
            }
        }

        for(int i = 0; i < words1.length; i++){
            int[] tmp = map.clone();
            boolean succ = true;
            for(int j = 0; j < words1[i].length(); j++){
                tmp[words1[i].charAt(j) - 'a']--;
            }
            for(int j = 0; j < 26; j++){
                if(tmp[j] > 0){
                    succ = false;
                    break;
                }
            }
            if(succ){
                res.add(words1[i]);
            }
        }
        return res.toArray(new String[0]);
    }
}