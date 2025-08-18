class Solution {
    public int bitwiseComplement(int n) {
        StringBuilder sb=new StringBuilder();
        String num=Integer.toBinaryString(n);
        for(int i=0;i<num.length();i++){
            if(num.charAt(i)=='1')
            sb.append('0');
            else{
                sb.append('1');
            }
        }
        int decimal=Integer.parseInt(sb.toString(),2);
        return decimal;

        
    }
}