class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int v:nums){
            map.put(v,map.getOrDefault(v,0)+1);
        }
        int max=0;
        int key=0;
       for(Map.Entry<Integer,Integer>entry:map.entrySet()){
        if(entry.getValue()>max){
            max=entry.getValue();
            key=entry.getKey();
        }
       }
        return key;
        
    }
}