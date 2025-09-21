class Solution {
    public int[] getNoZeroIntegers(int n) {
        for(int a=1;a<n;a++){
            int b=n-a;
            if(!haszero(a) && !haszero(b)){
                return new int[]{a,b};

            }
        }
        return new int[]{};
        
    }
    private boolean haszero(int num){
        while(num>0){
            if(num%10==0){
                return true;
            }
            num/=10;
        }
        return false;
    }
}