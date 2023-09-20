class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max_sum = -Math.pow(10,4)*k-1;
        double max_avg = 0;
        int sum = 0;
        for (int i=0; i<nums.length; i++){
            sum = sum + nums[i];
            if (i>=k-1){
                max_sum = Math.max(max_sum, sum);
                sum = sum - nums[i-k+1];
            }
        }
        max_avg = max_sum/k;
        return max_avg;
    }
}