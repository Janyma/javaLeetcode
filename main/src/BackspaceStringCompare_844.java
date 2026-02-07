
public class BackspaceStringCompare_844 {
    public boolean backspaceCompare(String s, String t) {
      return build(s).equals(build(t));

    }

    private String build(String str){
        StringBuilder s = new StringBuilder();
        for(char i: str.toCharArray()){
            if(i!='#'){
                s.append(i);
            }else{
                if(!s.isEmpty()){
                    s.deleteCharAt(s.length()-1);


                }
            }

        }
        return s.toString();
    }
}
