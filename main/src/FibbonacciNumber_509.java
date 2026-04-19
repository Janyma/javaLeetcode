
import java.util.Arrays;

class FibbonaciNumber_509 {
    
        
    static int[] mem= new int[100];
    public int fib_(int n) {
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }else if(mem[n]!=-1){
            return mem[n];
        }
            mem[n]= fib_(n-1)+fib_(n-2);
        return mem[n];

        
    }

    public int fib(int n){
        Arrays.fill(mem, -1);
        return fib_(n);

    }
}