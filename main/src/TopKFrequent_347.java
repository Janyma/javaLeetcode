
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class TopKFrequent_347 {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frquence= new HashMap<>();
        for(int num: nums ){
            frquence.put(num, frquence.getOrDefault(num, 0)+1);
        }
        List<Pair<Integer, Integer>>  new_pairs= new ArrayList<>();

        for(var entry: frquence.entrySet()){
            Pair<Integer, Integer> a = new Pair<>(entry.getKey(), entry.getValue());
            new_pairs.add(a);

        }

        Collections.sort(new_pairs, (fc1, fc2)->{
            return fc2.getValue()-fc1.getValue();
        });

        int[] result = new int[k];
        for(int i=0; i<k; i++){
            result[i]=new_pairs.get(i).getKey();
        }
        return result;   
    }     
        
}
