
import java.util.ArrayList;
import java.util.List;

class GenerateParentheses_22 {
    public List<String> generateParenthesis(int n) {
        List<String> result= new ArrayList<String>();
        backtracking(result, 0, 0, "", n);
        return result;


        
    }

    public void backtracking(List<String> res, int left, int right, String b, int n){
        if(b.length()==2*n){
            res.add(b);
        }

        if(left<n){
            backtracking(res, left+1, right, b+"(", n);
        }

        if(right<left){
            backtracking(res, left, right+1, b+")", n);
        }
    }
}