
import java.util.ArrayList;
import java.util.List;

class Permutations_46 {
    static int n;
    List<List<Integer>> ans;
    static void print(int[] ar){
        System.out.print("[]");
        for(int i=0; i<n; i++){
            System.err.print(ar[i]);
            if(i+1<n){
                System.out.print(",");
            }
        }
        System.err.println("]");
    }
    

    static void fun(int[] nums, int[]arr, int ind, List<List<Integer>>ans){
        if(ind==n){
            List<Integer> copy=new ArrayList<>();
            for(int i=0; i<n;i++){
                copy.add(arr[i]);
            }
            ans.add(copy);
            return;
        }
        System.out.println("nums=");
        print(arr);
        for(int i=0; i<n; i++){
            boolean has=false;
            for (int j=0; j<ind; j++){
                if(nums[i]==arr[j]){
                    has=true;
                    break;
                }
            }
            if(!has){
                arr[ind]=nums[i];
                fun(nums, arr, ind+1, ans);
            }
            
        }
        return;
    }
    public List<List<Integer>> permute(int[] nums) {
        n= nums.length;
        ans=new ArrayList<>();
        int[] arr=new int[n];
        fun(nums, arr, 0, ans);
        return ans;

    }

    
}