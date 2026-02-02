public class LongestCommonPrefix_14 {
    public String longestCommonPrefix(String[] strs) {
        String ans="";
        int len_=strs.length;
        for (int i=0; i<strs[0].length(); i++){
            boolean allEquals=true;
            for(int j=1; j<len_; j++){
                if(i>=strs[j].length()){
                    allEquals=false;
                    break;
                }
                if(strs[0].charAt(i)!=strs[j].charAt(i)){
                    allEquals=false;
                    break;
                }

            }
            if(allEquals){
                ans=ans+strs[0].charAt(i);
            }else{
                break;
            }
        }
        return ans;

    }
}
