class Solution {
    public int minOperations(int[] nums, int k) {
        int c=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
             sum+=nums[i];
        }
        if(sum%k==0){
            return 0;
        }
        for(int i=sum;i>=0;i--){
            if(i%k==0){
                break;
            }
            else{
                c++;
            }
            
        }
        return c;



    }
}