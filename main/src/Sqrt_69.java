class Sqrt_69 {
    public int mySqrt(int x) {
        int left=1;
        int right=x;
        int answer=0;
        while(left<=right){
            int middle= (left+right)/2;
            if(middle*middle > x){
                right=middle-1;
            }else{
                answer=middle;
                left=middle+1;
            }
        }
        return answer;
        
    }
}