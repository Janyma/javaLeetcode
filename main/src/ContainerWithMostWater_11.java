class ContainerWithMostWater_11 {
    public int maxArea(int[] height) {
        int left=0;
        int right = height.length-1;
        
        int best_answer=0;
        while(left<right){
            int weight=right-left;
            int min_between_two=Math.min(height[left], height[right]);
            if(weight*min_between_two > best_answer){
                best_answer=weight*min_between_two;

            }
            if(height[left]>height[right]){
                right--;
            }else{
                left++;
            }


        }
        return best_answer;
        
    }
}