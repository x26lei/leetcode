// 724. Find Pivot Index
class Solution {
    public int pivotIndex(int[] nums) {
        int right = 0;
        for (int i=1; i<nums.length; i++){
            right = right + nums[i];
        }
        int left = 0;
        int i = 0;
        while (i<=nums.length-1){
            if (right==left){
                return i;
            }
            left = left + nums[i];
            if (i<nums.length-1){
                right = right - nums[i+1];
            }
            i++;
        }
        return -1;
    }
}