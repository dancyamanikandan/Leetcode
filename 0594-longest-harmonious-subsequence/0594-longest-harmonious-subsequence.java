class Solution {
    public int findLHS(int[] nums) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int a:nums){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        int max=Integer.MIN_VALUE;
        int sum=0;
        boolean found=false;
        for(int key:map.keySet()){
            if(map.containsKey(key+1)){
                 sum=map.get(key)+map.get(key+1);
                max=Math.max(sum,max);
                found=true;
            }
        }
        if(!found) return 0;
        return max;
    }
}