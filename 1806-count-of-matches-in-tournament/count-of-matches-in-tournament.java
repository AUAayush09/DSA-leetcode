class Solution {
    public int numberOfMatches(int n) {
        int match = 0;
        int totalMatch = 0;
        while(n>1){
            if(n%2 == 0){
                match = n/2;
                totalMatch += match;
                n/=2; 
            }
            if(n%2 == 1){
                match = (n-1)/2;
                totalMatch += match;
                n = match + 1; 
            }
        }return totalMatch;
    }
}