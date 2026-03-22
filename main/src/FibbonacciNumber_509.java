class FibbonaciNumber_509 {
    
        
    private int[] f;
    public int fib_(int n) {
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        if(f[n]==0){
            f[n]=fib_(n-1)+fib_(n-2);
        }
        return f[n];

        
    }

    public int fib(int n){
        f= new int[n+1];
        return fib_(n);

    }
}