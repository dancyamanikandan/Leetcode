class Solution {
    public int jump(int[] nums) {
        int maxreach=0,jump=0,currentend=0;
        for(int i=0;i<nums.length-1;i++){
            maxreach=Math.max(maxreach,nums[i]+i);
            if(i==currentend){
                jump++;
                currentend=maxreach;
            }
        }
        return jump;
    }
}