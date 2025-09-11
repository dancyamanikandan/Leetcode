class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
       int right=num.length-1;
       String s=String.valueOf(k);
       int idx=s.length()-1;
       int carry=0;
       List<Integer>list=new ArrayList<>();
       while(right>=0 || idx>=0 || carry!=0){
            int digit=(idx>=0)?s.charAt(idx)-'0' : 0;
            int n=(right>=0)?num[right] : 0;
            int sum=n+digit+carry;
            list.add(sum%10);
            carry=sum/10;
            right--;
            idx--;
       }
       Collections.reverse(list);
       return list;
        
    }
}