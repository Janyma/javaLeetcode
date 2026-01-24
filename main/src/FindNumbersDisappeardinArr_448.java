import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindNumbersDisappeardinArr_448 {
    public int findDisappearedNumbers(int[] nums){
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            if(nums[i]==nums[i]+1){
                return 0;
            }
        }
        return 0;

    }
}
