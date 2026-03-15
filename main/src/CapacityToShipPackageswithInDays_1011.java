

class CapacityToShipPackageswithInDays_1011 {
    public boolean check(int cap, int[] weights, int days){
        int current_day= 1;
        int curr_capa=0;
        int n= weights.length;

        for (int i=0; i<n; i++){
            if(weights[i]>cap){
                return false;
            }
            if(curr_capa+weights[i]>cap){
                current_day+=1;
                curr_capa=weights[i];
            }else
            {
                curr_capa+=weights[i];

            }
            
             
            if(current_day>days){
                return false;
            }
        }
        return true;
    }
    
    public int shipWithinDays(int[] weights, int days) {
        int sum=0;
        
        for(int i=0; i<weights.length; i++){
            sum+=weights[i];

        }
        int left=0;
        int right=sum;
        int return_value=sum;

        while(left+1<right){

            int middle= (left+right)/2;
            if(check(middle, weights, days)){
                right=middle;
                return_value=right;
            }else{
                left=middle;
            }


        }
        return return_value;
        
        
    }
}