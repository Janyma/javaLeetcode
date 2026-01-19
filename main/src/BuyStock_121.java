public class BuyStock_121 {
    public int maxProfit(int[] nums){
        int max_profit=0;
        int biggest_price=nums[nums.length-1];

        //int n=nums.length;

        for (int i=nums[nums.length-2]; i>0; i--){
            if(biggest_price-nums[i]>max_profit){
                max_profit=biggest_price-nums[i];
            }

            if (biggest_price<nums[i]) {
                biggest_price=nums[i];

            }



        }
        return max_profit;
    }
}
