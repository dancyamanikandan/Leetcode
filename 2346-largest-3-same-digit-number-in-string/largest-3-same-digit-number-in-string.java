class Solution {
    public String largestGoodInteger(String num) {
        List<String>list=new ArrayList<>();
        for(int i=0;i<num.length();i++){
            for(int j=i;j<=num.length();j++){
                String a=num.substring(i,j);
                if(a.length()==3){
                    boolean digit=false;
                for(int k=1;k<2;k++){
                   //boolean digit=false;
                   /*if(a.charAt(k)==0 && a.charAt(k-1)==0 && a.charAt(k+1)==0){
                    list.add(a);
                   }*/
                    if(a.charAt(k)==a.charAt(k-1) && a.charAt(k-1)==a.charAt(k+1)){
                         
                         digit=true;
                    }
                }
                if(digit){
                    //int ans=Integer.parseInt(a);
                    list.add(a);
                }
                }
            }
        }
        String b="";
        if(list.size()==1){
             b=list.get(0);
        }
        else if(list.size()>1){
           b=Collections.max(list);
        }
        //String c=String.valueOf(b);
        return b;
        
    }
}