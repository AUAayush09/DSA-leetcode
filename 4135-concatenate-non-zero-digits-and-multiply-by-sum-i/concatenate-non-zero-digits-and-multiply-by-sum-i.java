class Solution {
    public long sumAndMultiply(int n) {
        long sum = 0 , rev = 0 , rev1 = 0;
        while(n>0){
            int rem = n%10;
            if(rem != 0){
                rev = 10 * rev + rem;
            }
            n/=10;
        } while(rev>0){
            long digit = rev%10;
            rev1 = 10 * rev1 + digit;
            sum = sum + digit;
            rev/=10;
        }
        return sum * rev1;
    }
}