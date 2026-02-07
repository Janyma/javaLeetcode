public class MergeSortedArray_88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int tail_nums1=m-1;
        int tail_nums2=n-1;
        int insert_pos=m+n-1;
        while(tail_nums2>=0){
            if(tail_nums1 >=0 && nums1[tail_nums1]>=nums2[tail_nums2]){
                nums1[insert_pos]=nums1[tail_nums1];
                insert_pos--;
                tail_nums1--;
            }else{
                nums1[insert_pos]=nums2[tail_nums2];
                insert_pos--;
                tail_nums2--;
            }
        }

    }
}
