public class Solution {
    //[3,1,2,4]
    public int[] sortArrayByParity(int[] nums) {
        int SZ = nums.length;

        for (int i = 0; i < SZ; i++) {
            for (int j = i; j < SZ; j++) {
                if ((nums[j]%2)==0 && i==j) {
                    break;
                }
                if ((nums[j]%2)==0) {
                    int tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;

                    int tmp2 = nums[SZ-1];
                    nums[SZ-1] = nums[j];
                    nums[j] = tmp2;
                    SZ--;
                    break;
                }
            }
        }

        return nums;
    }
}
