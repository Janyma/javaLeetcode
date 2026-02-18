public class AddBinary_67 {
    public String addBinary(String a, String b){
        int i=a.length()-1;
        int j=b.length()-1;
        int carry=0;
        StringBuilder result= new StringBuilder();
        while(carry>0 || i>=0 || j>=0) {
            int sum = carry;
            if (i >= 0) {
                sum = sum + a.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                sum = sum + b.charAt(j) - '0';
                j--;

            }

            carry = sum / 2;
            int c = sum % 2;
            result.append(c);


        }
        String g= result.reverse().toString();
        return g;

    }
}
