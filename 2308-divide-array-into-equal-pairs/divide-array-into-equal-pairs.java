class Solution {
    public boolean divideArray(int[] nums) {
        Arrays.sort(nums);
        int arr[]=new int[2];
        int n=nums.length/2;
        for(int i=0;i<nums.length;i+=2){
            arr[0]=nums[i];
            arr[1]=nums[i+1];
            if(arr[0]!=arr[1]){
                return false;
            }
        }
        return true;
        
    }
}