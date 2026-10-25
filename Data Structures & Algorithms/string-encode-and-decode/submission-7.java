class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < strs.size(); i++){
            int len = strs.get(i).length();
            sb.append(len).append('#').append(strs.get(i));
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        StringBuilder num = new StringBuilder();
        int len = 0;
        int state = 0;
        for(int i = 0; i < str.length(); i++){
            if(state == 0){
                num.append(str.charAt(i));
                if(str.charAt(i + 1) == '#'){
                    state = 1;
                    len = Integer.parseInt(num.toString());
                    if(len == 0){
                        res.add("");
                        state = 3;
                    }
                    num.setLength(0);
                }                
            }
            else if(state == 2){
                sb.append(str.charAt(i));
                len--;
                if(len == 0){
                    state = 0;
                    res.add(sb.toString());
                    sb.setLength(0);
                }                
            }
            else if(state == 3){
                state = 0;
            }
            else{
                state = 2;
            }
        }
        return res;
    }
}
