class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s : strs){
            sb.append(s.length());
            sb.append("#");
            sb.append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> ret = new ArrayList<>();
        char[] arr = str.toCharArray();
        int numInd = 0;
        int startInd = 0;
        int i = 0;
        while(i < arr.length){
            if(arr[i] != '#'){
                numInd++;
            }
            else{
                String n = new String(arr, startInd, numInd - startInd);
                int num = Integer.parseInt(n);
                String substr = new String(arr, numInd + 1, num);
                ret.add(substr);
                i += num;
                startInd = i + 1;
                numInd = startInd;
            }
            i++;
        }
        return ret;
    }
}
