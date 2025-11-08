class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double tsum=0;
        for(int i=0;i<k;i++){
            tsum+=nums[i];
        }
        double maxsum=tsum;
        for(int i=k;i<nums.length;i++){
            tsum+=nums[i]-nums[i-k];
            maxsum=Math.max(maxsum,tsum);
        }
        double avg=maxsum/k;
        return (double)avg;
        
    }
}