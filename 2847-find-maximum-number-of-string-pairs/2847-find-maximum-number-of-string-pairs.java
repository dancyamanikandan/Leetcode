class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
      int count=0;
      for(int i=0;i<words.length;i++){
        for(int j=i+1;j<words.length;j++){
            if(words[i].charAt(0)==words[j].charAt(1) && words[i].charAt(1)==words[j].charAt(0)){
                count++;
            }
        }
      }
      return count;

       /* Set<String>same=new HashSet<>();
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
               String a=words[i]+words[j];
               StringBuilder sb=new StringBuilder();
               sb.append(a);
               if(sb.reverse().toString().equals(a)){
                same.add(a);
               }
            }
        }
        return same.size();*/
        
    }
}