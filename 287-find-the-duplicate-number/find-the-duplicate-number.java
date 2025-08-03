class Solution {
    public int findDuplicate(int[] nums) {
        int slow=nums[0];
        int fast=nums[0];
        do{
            slow=nums[slow];
            fast=nums[nums[fast]]; // to check the loop exist or not
        }while(slow!=fast);
         
         slow=nums[0];
         while(slow!=fast){
            slow=nums[slow];  //to find the duplicate number
            fast=nums[fast];
         }
         return slow;
    }
}