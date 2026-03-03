import java.util.Arrays;

public class SlidingWindowMax_239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n= nums.length;
        int sqrt = (int) Math.ceil(Math.sqrt(n));
        int[] max_block=new int[sqrt];
        Arrays.fill(max_block, Integer.MIN_VALUE);

        for(int i = 0; i<n;i++){
            int block= i%sqrt;
            max_block[block]= Math.max(nums[i], max_block[block]);

        }

        int[] results = new int[n-k+1];

        for (int i=0; i+k-1<n; i++){
            int l=i;
            int r=i+k-1;
            int result= Integer.MIN_VALUE;
            for(int j=l; j<=r;){
                if(j%sqrt==0 && j+sqrt-1<n){
                    int block= j/sqrt;
                    result= Math.max(block, result);
                    j+=sqrt;

                }else{
                    result=Math.max(result, nums[j]);

                }

            }
            results[i]=result;


        }
        return results;


    }
}
