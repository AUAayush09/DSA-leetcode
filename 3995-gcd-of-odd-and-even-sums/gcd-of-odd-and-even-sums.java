class Solution {
    public int gcdOfOddEvenSums(int n) {
        int odd = sumOdd(n);
        int even = sumEven(n);
        return gcd(odd, even);
    }

    public int sumOdd(int n){
       return n*n;
    }
    public int sumEven(int n){
        return  n*(n+1);
    }
    public int gcd(int sumOdd, int sumEven){
        if(sumOdd == 0){
            return sumEven;
        }
        return gcd(sumEven % sumOdd , sumOdd);
    }
}