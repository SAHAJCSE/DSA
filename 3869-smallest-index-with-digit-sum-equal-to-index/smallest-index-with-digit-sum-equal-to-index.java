class Solution {
    int smallestindex;

    private int sumofdigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public int smallestIndex(int[] nums) {
        smallestindex = 999999;
        for (int i = 0; i < nums.length; i++) {
            if (sumofdigits(nums[i]) == i) {
                if (smallestindex > i) {   // was: smallestindex < i
                    smallestindex = i;
                }
            }
        }
        return smallestindex == 999999 ? -1 : smallestindex;  // was: smallesindex
    }
}