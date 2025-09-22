class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer>freq=new HashMap<>();
        for(int a:nums){
            freq.put(a,freq.getOrDefault(a,0)+1);
        }
        int max=0;
        int sum=0;
        for(int v:freq.values()){
            if(v>max){
                max=v;
            }
        }
        for(int v:freq.values()){
            if(v==max){
                sum+=v;
            }
        }
        return sum;

    }
}