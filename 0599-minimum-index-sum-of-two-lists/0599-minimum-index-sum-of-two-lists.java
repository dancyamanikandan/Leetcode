class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String,Integer>map=new HashMap<>();
        for(int i=0;i<list1.length;i++){
            map.put(list1[i],i);
        }
        int min=Integer.MAX_VALUE;
        List<String>res=new ArrayList<>();
        for(int i=0;i<list2.length;i++){
            if(map.containsKey(list2[i])){
               int isum=map.get(list2[i])+i;
            
            if(isum <min){
                res.clear();
                res.add(list2[i]);
                min=isum;
            }
            else if(isum==min) { 
                res.add(list2[i]);
        
            }
            }
        }
        return res.toArray(new String[0]);
        
        
    }
}