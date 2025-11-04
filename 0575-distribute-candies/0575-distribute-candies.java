class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer>candies=new HashSet<>();
        for(int c:candyType){
            candies.add(c);
        }
        if(candies.size()>candyType.length/2){
            return candyType.length/2;
        }
        return candies.size();
        
        
    }
}