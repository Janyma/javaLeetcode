import java.util.HashMap;
import java.util.Map;

public class First_Unique_CharIn_String_387 {
    public int firstUniqChar(String s) {
        //Map<Character, Integer> hash_map = new HashMap<>();
      //  int unique=0;
       // for(int i=s.length()-1; i>=0; i--){
       //     hash_map.put(s.charAt(i), 1+hash_map.getOrDefault(s.charAt(i), 0));
       //     }
    //    for (int j =0; j<s.length(); j++){
          //  if(hash_map.get(s.charAt(j))==1){
          //      return j;
         //   }
       // }
        //return -1;

        int biggeset=1000000000;
        for(char c='a'; c<'z'; c++){
            int first_letter = s.indexOf(c);
            int last_letter= s.lastIndexOf(c);

            if(first_letter!=-1 && first_letter==last_letter){
                biggeset = Math.min(biggeset, first_letter);
            }

        }
        if(biggeset==10000000){
            biggeset=-1;
        }
        return biggeset;

        }
    }

