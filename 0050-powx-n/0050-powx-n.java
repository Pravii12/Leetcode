class Solution {
    public double myPow(double x, int n) {
        double a=1.0;
        int on=n;
        long p=n;
        if(n==0)
        return 1;
        if(p<0){
            p=-1*p;
            x=1/x;
        }
        while(p>0){
            if(p%2!=0){
                a=a*x;
                p=p-1;
            }
            else{
                x=x*x;
                p=p/2;
            }
        }
        return a;
    }
}