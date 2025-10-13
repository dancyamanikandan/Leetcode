class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String>list=new ArrayList<>();
        String prev="";
        for(String s:words){
            char arr[]=s.toCharArray();
            Arrays.sort(arr);
            String sorted=new String(arr);
            if(!sorted.equals(prev)){
                list.add(s);
                prev=sorted;
            }
        }
        return list;
    }
}