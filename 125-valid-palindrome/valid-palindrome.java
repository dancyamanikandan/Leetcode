class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        if(sb.toString().equals(s)){
            return true;
        }
        return false;
    }
}