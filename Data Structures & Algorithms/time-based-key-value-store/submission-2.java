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
            /*System.out.println("Sdfs");
            int l = 1;
            int r = timestamp;
            int prevm = -1;
            while(l <= r){
                int m = (l + r) / 2;
                if(tmp.get(m) != null){
                    //System.out.println(m);
                    prevm = m;
                    l =  m + 1;
                }
                else{
                    r = m - 1;
                }
            }
            if(prevm == -1){
                return "";
            }
            else {
                return tmp.get(prevm);
            }*/
        }
        return tmp.get(timestamp);
    }
}
