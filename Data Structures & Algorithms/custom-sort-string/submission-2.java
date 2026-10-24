class Solution {
    public String customSortString(String order, String s) {

        ArrayList<Character> res = new ArrayList<>();
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for(int i = 0; i < order.length(); i++){
            if(map.containsKey(order.charAt(i))){
                while(map.get(order.charAt(i)) > 0){
                    map.put(order.charAt(i), map.get(order.charAt(i)) - 1);
                    res.add(order.charAt(i));
                }
                map.remove(order.charAt(i));
            }
        }
        for(Map.Entry<Character, Integer> e : map.entrySet()){
            int cnt = e.getValue();
            while(cnt > 0){
                res.add(e.getKey());
                cnt--;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : res) {
            sb.append(c);
        }
        return sb.toString();
    }
}