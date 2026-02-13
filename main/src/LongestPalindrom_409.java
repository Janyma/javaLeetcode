import java.util.HashSet;

public class LongestPalindrom_409 {
    public int longestPalindrome(String s) {
        if(s==null || s.length()==0){
            return 0;
        }
        int length=0;
        HashSet<Character> hash = new HashSet<Character>();
        for(char a: s.toCharArray()){
            if(hash.contains(a)){
                length+=2;
                hash.remove(a);


            }
            else{
                hash.add(a);
            }
        }
        if(!hash.isEmpty()){
            length+=1;
        }
        return length;

    }
}
