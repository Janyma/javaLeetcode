import java.util.HashMap;
import java.util.Map;

public class MajorityElement_169 {
    public int majorityElement(int[] nums){
       // int res=0;
      //  int majority_val=0;
      //  Map<Integer, Integer> hash_ = new HashMap();
      //  for (int num:nums){
         //   hash_.put(num, 1+hash_.getOrDefault(num, 0));
        //    if(majority_val<hash_.get(num)){
          //      System.out.println(hash_.get(num));
          //      res=num;
             //   majority_val=hash_.get(num);
         //   }
      //  }
      //  return res;

        int res=0;
        int majority=0;
        for(int num: nums){
            if(majority==0){
                res=num;
            }
            if(num==res){
                majority++;
            }else{
                majority--;
            }
        }
        return res;

    }
}
