class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count = 0;
        int currentWindowSum = 0;
        int targetSum = k * threshold; 
        for (int i = 0; i < k; i++) {
            currentWindowSum += arr[i];
        }
        if (currentWindowSum >= targetSum) {
            count++;
        }
        for (int i = k; i < arr.length; i++) {
            currentWindowSum += arr[i] - arr[i - k];
            
            if (currentWindowSum >= targetSum) {
                count++;
            }
        }
        
        return count;
    }
}
