class Solution {
    public void sortColors(int[] nums) {

        for(int i = 0; i < nums.length; i++){
            int min = nums[i];
            int minIndex = i;
            for(int j = i+1; j < nums.length; j++){
                if(nums[j] < min){
                    min = nums[j];
                    minIndex = j;
                }
            }
            nums[minIndex] = nums[i];
            nums[i] = min;
        }
        
    }
}