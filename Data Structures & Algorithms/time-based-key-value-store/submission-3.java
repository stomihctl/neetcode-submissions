class TimeMap {
    HashMap<String, HashMap<Integer, String>> map = new HashMap<>();
    public TimeMap() {
        
    }
    
    public void set(String key, String value, int timestamp) {
        HashMap<Integer, String> tmp = map.getOrDefault(key, new HashMap<>());
        tmp.put(timestamp, value);
        map.put(key, tmp);
    }
    
    public String get(String key, int timestamp) {
        HashMap<Integer, String> tmp = map.get(key);
        if(tmp == null){
            return "";
        }
        else if(tmp.get(timestamp) == null){
            for(int i = timestamp - 1; i >= 0; i--){
                if(tmp.get(i) != null){
                    return tmp.get(i);
                }
            }
            return "";
        }
        return tmp.get(timestamp);
    }
}
