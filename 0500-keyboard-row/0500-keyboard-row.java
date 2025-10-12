class Solution {
    public String[] findWords(String[] words) {
        String f="qwertyuiop";
        String s="asdfghjkl";
        String t="zxcvbnm";
        List<String>list=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            String l=words[i].toLowerCase();
            String check="";
            char ch=l.charAt(0);
            if(f.indexOf(ch)>=0){
                check=f;
            }
            else if(s.indexOf(ch)>=0){
                check=s;
            }
            else{
                check=t;
            }
            boolean valid=true;
            for(char c:l.toCharArray()){
                if(check.indexOf(c)==-1){
                   valid=false;
                   break;
                }
            }
            if(valid){
                list.add(words[i]);
            }
        }
        return list.toArray(new String[0]);
    }
}