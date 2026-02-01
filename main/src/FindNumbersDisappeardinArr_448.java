import java.util.*;

public class FindNumbersDisappeardinArr_448 {
    public List<Integer> findDisappearedNumbers(int[] nums){
        HashMap<Integer, Integer> a = new HashMap<>();
        List<Integer> missing= new ArrayList<>();

        int len_=nums.length;
        for(int i=0; i<len_; i++){
            if(a.containsKey(nums[i])){
                continue;

            }else{
                a.put(nums[i], 1);
            }


        }
        int index=1;
        for(int key: a.keySet()){
            if (key==index){
                index++;
            }

        }
        return missing;

    }
}
