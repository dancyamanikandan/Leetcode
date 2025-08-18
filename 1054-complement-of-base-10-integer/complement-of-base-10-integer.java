class Solution {
    public int bitwiseComplement(int n) {
        String s="";
        String num=Integer.toBinaryString(n);
        for(int i=0;i<num.length();i++){
            if(num.charAt(i)=='1')
            s=s+'0';
            else{
                s=s+'1';
            }
        }
        int decimal=Integer.parseInt(s,2);
        return decimal;

        
    }
}