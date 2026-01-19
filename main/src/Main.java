// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see h IntelliJ IDEA suggests fixing it.
        SingleNumber_136 sol= new SingleNumber_136();
        int[] a = {1,2,2,3,3,1,5};
        int res = sol.singleNumber(a);
        System.out.println(res);

        ReverseString_344 sol1=new ReverseString_344();
        char[] b = {'h', 'e', 'l', 'l', 'o'};
        sol1.reverseString(b);
        System.out.println(b);

        BuyStock_121 sol2=new BuyStock_121();
        int[] c={4,1,5,4,3};
        int res2=sol2.maxProfit(c);
        System.out.println(res2);



        }

}