class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int row=dimensions.length;
        int col=dimensions[0].length;
        int max=0;
        int maxarea=0,area=0;
        for(int i=0;i<row;i++){
           int l=dimensions[i][0];
           int w=dimensions[i][1];
            int diagonal=l*l + w*w;
                area=l*w;
                if(diagonal>max){
                    max=diagonal;
                    maxarea=l*w;
                }
                else if(diagonal==max){
                    maxarea=Math.max(maxarea,area);
                }
            
        }
        return maxarea;
        
    }
}