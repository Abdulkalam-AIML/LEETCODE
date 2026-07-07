

class Solution {
    public long sumAndMultiply(int n) {
        long rem=0;
        long sum=0;
        long place=1;
        while(n>0) 
        {
            int d=n%10;
            if (d!=0) 
            {
                rem=d*place+rem;
                place*=10;
                sum+=d;
            }
            n/=10;
        }
        return rem*sum;
    }
}
