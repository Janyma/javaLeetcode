import java.util.HashSet;
import java.util.Stack;

public class ValidParentheses_20 {
    public boolean isValid(String s) {
        Stack<Character> r=new Stack<>();
        for(char i: s.toCharArray()){
            if(i=='(' || i =='[' || i=='{'){
                r.add(i);
            }else{
                if(r.isEmpty()) {
                    return false;
                }
                Character top = r.pop();

                   if(i==')' && top!='('){
                return false;
            } if(i=='}' && top!='{'){
                return false;
            } if(i==']' && top!='['){
                return false;

            }}
        }
        return true;

    }
}
