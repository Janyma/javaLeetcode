public class RemoveDuplicates_80 {
    public int removeDuplicates(int[] nums) {
        int insert_pos=2;
        for (int i=2; i<nums.length; i++){

            if (nums[i] != nums[insert_pos-2]) {
                nums[insert_pos]=nums[i];
                insert_pos++;

            }
        }
        return insert_pos;

    }
}
