
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence_128 {

    public int longestConsecutive(int[] nums) {
         Set<Integer> set = new HashSet<>();
        for(int n:nums){
            set.add(n);
        }
        int longest_set=0;

        for(int i: set){
            if(!set.contains(i-1)){
                int streak_start=i;
                int streak_end=i;

                while(set.contains(i+1)){
                    streak_end=i+1;
                    i++;
                }

                longest_set= Math.max(longest_set, streak_end-streak_start+1);
            }

        }
        return longest_set;


    }
}