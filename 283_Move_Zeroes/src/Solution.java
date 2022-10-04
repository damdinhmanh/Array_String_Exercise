public class Solution {
    //nums = [0,1,0,3,12]
    public void moveZeroes(int[] nums) {
        int SZ = nums.length;
        int[] nonZeroArr = new int[SZ];
        int nCnt = 0;

        for (int i = 0; i < SZ; i++) {
            if(nums[i] != 0) {
                nonZeroArr[nCnt++] = nums[i];
            }
        }

        if (nCnt > 0) {
            for (int i = 0; i < SZ; i++) {
                if (i < nCnt) {
                    nums[i] = nonZeroArr[i];
                } else {
                    nums[i] = 0;
                }
            }
        }
    }
}
