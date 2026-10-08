class Solution {
    public String removeDuplicates(String s) {
        if(s.length() == 1){
            return s;
        }
        StringBuilder res = new StringBuilder(s);
        int i = 1;
        while(i<res.length()){
            if(i-1>=0 && res.charAt(i) == res.charAt(i-1)){
                res.delete(i-1, i+1);
                i-=2;
            }
            i++;
        }
        return res.toString();
        
    }
}