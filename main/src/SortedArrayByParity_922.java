public class SortedArrayByParity_922 {
    public int[] sortArrayByParityII(int[] nums) {
        int i = 0;
        int j=1;
        int lene= nums.length;
        while(i<lene && j<lene){
            while(i<lene && nums[i]%2==0 ){
                i+=2;
            }
            while(j<lene && nums[j]%2==1){
                j+=2;
            }

            if(i<lene && j<lene ){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
        }
        return nums;


}}
