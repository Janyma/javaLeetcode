import java.sql.Array;
import java.util.List;

public class RotateArray_189 {
    public void rotate(int[] nums, int k) {
        if(k> nums.length){
            k=k%nums.length;
        }
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);


    }
    private void reverse(int[] a,int start, int end ){
        while(start<end){
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }

    }
}
