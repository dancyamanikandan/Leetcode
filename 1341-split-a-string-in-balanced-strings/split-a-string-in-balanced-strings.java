class Solution {
    public int balancedStringSplit(String s) {
        int c=0;
        int a=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='L'){
                c++;
            }
            else{
                c--;
            }
            if(c==0){
                a++;
            }
        }
        return a;
        
    }
}