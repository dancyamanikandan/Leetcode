class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int row=dimensions.length;
        int col=dimensions[0].length;
        double max=0.00;
        int maxarea=0,area=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col-1;j++){
                double diagonal=Math.sqrt((dimensions[i][j]*dimensions[i][j] )+(dimensions[i][j+1]*dimensions[i][j+1]));
                area=dimensions[i][j]*dimensions[i][j+1];
                if(diagonal>max){
                    max=diagonal;
                    maxarea=dimensions[i][j]*dimensions[i][j+1];
                }
                else if(diagonal==max){
                    maxarea=Math.max(maxarea,area);
                }
            }
        }
        return maxarea;
        
    }
}