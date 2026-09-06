class Solution {
    public long removeZeros(long n) {
       long rev = 0 , rev1 = 0;
        while(n>0){
            long rem = n%10;
            if(rem != 0){
                rev = 10 * rev + rem;
            }
            n/=10;
        } while(rev>0){
            long digit = rev%10;
            rev1 = 10 * rev1 + digit;
            rev/=10;
        }
        return rev1;
    }
}