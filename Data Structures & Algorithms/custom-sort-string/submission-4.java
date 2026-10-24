class Solution {
    public String customSortString(String order, String s) {

        //ArrayList<Character> res = new ArrayList<>();
        //HashMap<Character, Integer> map = new HashMap<>();
        int[] map = new int[26];
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            //map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            map[s.charAt(i) - 'a']++;
        }

        for(int i = 0; i < order.length(); i++){
            /*if(map.containsKey(order.charAt(i))){
                while(map.get(order.charAt(i)) > 0){
                    map.put(order.charAt(i), map.get(order.charAt(i)) - 1);
                    res.add(order.charAt(i));
                }
                map.remove(order.charAt(i));
            }*/
                while(map[order.charAt(i) - 'a'] > 0){
                    map[order.charAt(i) - 'a'] = map[order.charAt(i) - 'a'] - 1;
                    sb.append(order.charAt(i));
                }
            
        }
        /*for(Map.Entry<Character, Integer> e : map.entrySet()){
            int cnt = e.getValue();
            while(cnt > 0){
                res.add(e.getKey());
                cnt--;
            }
        }*/
        for(int i = 0; i < map.length; i++){
            int cnt = map[i];
            while(cnt > 0){
                sb.append((char)(i + 'a'));
                cnt--;
            }
        }
        /*StringBuilder sb = new StringBuilder();
        for (char c : res) {
            sb.append(c);
        }*/
        return sb.toString();
    }
}