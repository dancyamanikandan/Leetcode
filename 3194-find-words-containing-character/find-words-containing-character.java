class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer>found=new LinkedList<>();
        for(int i=0;i<words.length;i++){
            for(char c:words[i].toCharArray()){
               if( c==x){
                  found.add(i);
                  break;
               }
            }
        }
        return found;
        
    }
}