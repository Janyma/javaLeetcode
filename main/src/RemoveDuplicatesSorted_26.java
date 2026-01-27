public class RemoveDuplicatesSorted_26 {
    public int removeDuplicates(int[] nums) {
        int a=1;
        for (int i=1; i<nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                continue;

            }
            nums[a]= nums[i];
            a++;
            //[1,1,2,3,3
            //[1,2,2,3,3
        }

        return a;
    }
}
