class Solution {
    public int sumBase(int n, int k) {
        int sum = 0 , rev = 0;
        while(n>0){
            int rem = n%k;
            rev = 10 * rev + rem;
            n/=k;
        } while(rev>0){
            int digit = rev%10;
            sum = sum + digit;
            rev/=10;
        }
        return sum;
    }
}