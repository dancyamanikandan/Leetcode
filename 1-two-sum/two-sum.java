class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
               int sum=nums[i]+nums[j];
                if(sum==target){
                    return new int[] {i,j};
                
                }

            }
            
        }
        return new int[] {};
        
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        Solution obj=new Solution();
        int target=sc.nextInt();
        int res[]=obj.twoSum(arr,target);
        System.out.println("["+res[0]+","+res[1]);
    }
}