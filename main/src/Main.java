
import java.util.List;

public class Main {
    public static void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see h IntelliJ IDEA suggests fixing it.
        // SingleNumber_136 sol= new SingleNumber_136();
        // int[] a = {1,2,2,3,3,1,5};
        // int res = sol.singleNumber(a);
        // System.out.println(res);

        // ReverseString_344 sol1=new ReverseString_344();
        // char[] b = {'h', 'e', 'l', 'l', 'o'};
        // sol1.reverseString(b);
        // System.out.println(b);

        // BuyStock_121 sol2=new BuyStock_121();
        // int[] c={4,1,5,4,3};
        // int res2=sol2.maxProfit(c);
        // System.out.println(res2);
        // ContainsDuplicate_217 sol3=new ContainsDuplicate_217();
        // int[] nums ={1,2,3,4,4};
        // boolean result = sol3.containsDuplicate(nums);
        // System.out.println("ContainsDuplicate_217: "+result);

        // MajorityElement_169 sol4= new MajorityElement_169();
        // int[] d = {3,4,4,4,4,4,4,4,4,4,5,5,5,5,5,5,8,9};
        // int result4 = sol4.majorityElement(d);
        // System.out.println(result4);

        // First_Unique_CharIn_String_387 sol5=new First_Unique_CharIn_String_387();
        // String s= "lleetcode";
        // int result5 = sol5.firstUniqChar(s);
        // System.out.println(result5);

        // RemoveDuplicatesSorted_26 sol6 = new RemoveDuplicatesSorted_26();
        // int[] e = {1,1,2,2,2,3};
        // int f=sol6.removeDuplicates(e);
        // System.out.println(f);

        // OneDArrayTotwoDArray_2022 sol7=new OneDArrayTotwoDArray_2022();
        // int[] original={1,2};
        // int m=1;
        // int n=1;
        // int [][] g_= sol7.construct2DArray(original,m,n);
        // System.out.println(g_);

        // MatrixMultiple2D sol8 = new MatrixMultiple2D();
        // int[][]a1 = {{1,2,3},{3,4,5}};
        // int[][]b1 = {{1,2},{3,4}, {3,4}};
        // int [][] sol7_ = MatrixMultiple2D.maxtrixMultiple(a1,b1);
        // System.out.println(Arrays.deepToString(sol7_));

        // AddBinary_67 sol9 = new AddBinary_67();
        // String aa= "11";
        // String bb ="1";
        // String cc= sol9.addBinary(aa, bb);
        // System.out.println(cc);

        CapacityToShipPackageswithInDays_1011 sol10=new CapacityToShipPackageswithInDays_1011();
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int days=5;
        int capacity=sol10.shipWithinDays(weights, days);
        System.out.println("Ship: "+capacity);

        Permutations_46 sol12 = new Permutations_46();
        int[] nums={1,2,3};
        List<List<Integer>> a= sol12.permute(nums);
        System.out.println("Permutations"+a);

        HanoiProblem sol_13= new HanoiProblem();
        sol_13.hanoi(4, 1, 3);

        GenerateParentheses_22 sol_14= new GenerateParentheses_22();
        int n_=3;
        sol_14.generateParenthesis(n_);










    }

}