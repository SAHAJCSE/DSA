class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] res = new int[n];

        int product = 1;
        int zerocount = 0;

        for (int i : nums) {
            if (i == 0) {
                zerocount++;
            }
        }

        if (zerocount > 1) {
            return res;
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                product *= nums[i];
            }
        }

        if (zerocount == 1) {

            for (int i = 0; i < n; i++) {
                if (nums[i] == 0) {
                    res[i] = product;
                }
            }

        } else {

            for (int i = 0; i < n; i++) {
                res[i] = product / nums[i];
            }

        }

        return res;
    }
}