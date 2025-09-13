class Solution {
    public int maxFreqSum(String s) {
        int vowelfrq=0;
        int confrq=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int vcount=0;
            int concount=0;
            for(int j=0;j<s.length();j++){
                if(ch==s.charAt(j)){
                    if("aeiou".indexOf(ch)!=-1){
                        vcount++;
                    }
                    else{
                        concount++;
                    }
                }
            }
            if(vcount>vowelfrq){
                vowelfrq=vcount;
            }
            if(concount>confrq){
                confrq=concount;
            }
        }
        int sum=vowelfrq+confrq;
        return sum;

        
    }
}