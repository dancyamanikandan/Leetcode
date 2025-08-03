class Solution {
    public char findTheDifference(String s, String t) {
        //char a;
        List<Character>list1=new ArrayList<>();
        List<Character>list2=new ArrayList<>();
        for(char c:s.toCharArray()){
            list1.add(c);
        }
        for(char c:t.toCharArray()){
            list2.add(c);
        }
        for(char c:s.toCharArray()){
            list2.remove((Character)c);
        }
        char a=list2.get(0);
            
        
        return a;
        
    }
}