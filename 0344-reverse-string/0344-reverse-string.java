class Solution {
    public void reverseString(char[] s) {
      char arr[]=Arrays.copyOf(s,s.length);
      int idx=s.length-1;
      for(int i=0;i<s.length;i++){
         s[i]=arr[idx--];
      }

        
    }
}