class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int count = 0, xor = 0;
        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    xor = xor ^ nums[i];
                    count++;
                }
            }
        }
        if (count == 0) {
            return 0;
        }
        return xor;
    }
}