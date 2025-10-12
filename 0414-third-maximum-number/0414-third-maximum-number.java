class Solution {
    public int thirdMax(int[] nums) {
        Long max=null,smax=null,tmax=null;
        for(int num:nums){
            long n=num;
            if((max!=null && n==max) || (smax!=null && n==smax) || (tmax!=null && n==tmax)){
                continue;
            }
            if(max==null || n>max){
                tmax=smax;
                smax=max;
                max=n;
            }
            else if(smax==null || (n>smax && n<max)){
                tmax=smax;
                smax=n;
            }
            else if(tmax==null || (n>tmax && n<smax)){
                tmax=n;
            }
        }
        return tmax==null?max.intValue():tmax.intValue();
        
    }
}