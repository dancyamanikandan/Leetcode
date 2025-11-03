class Solution {
    public String reverseWords(String s) {
        String arr[]=s.split("\\s");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<arr.length;i++){
             StringBuilder reverseword=new StringBuilder(arr[i]);
             sb.append(reverseword.reverse());
            if(i!=arr.length-1)
            sb.append(" ");
        }
        return sb.toString();
    }
}
