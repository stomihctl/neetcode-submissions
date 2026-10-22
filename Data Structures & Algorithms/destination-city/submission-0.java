class Solution {
    public String destCity(List<List<String>> paths) {
        Map<String, String> map = new HashMap<>();
        for(int i = 0; i < paths.size(); i++){
            map.put(paths.get(i).get(0), paths.get(i).get(1));
        }
        String s = map.get(paths.get(0).get(0));
        while(map.get(s) != null){
            s = map.get(s);
        }
        return s;
    }
}

