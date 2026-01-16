// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see h IntelliJ IDEA suggests fixing it.
        SingleNumber sol= new SingleNumber();
        int a[] = {1,2,2,3,3,1,5};
        int res = sol.singleNumber(a);
        System.out.println(res);

        }

}