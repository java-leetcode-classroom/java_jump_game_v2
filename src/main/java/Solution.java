public class Solution {
  public int jump(int[] nums) {
    int nLen = nums.length;
    int left = 0;
    int right = 0;
    int res = 0;
    while (right < nLen-1) {
      int farthest = 0;
      for (int pos = left; pos <= right; pos++) {
        farthest = Math.max(farthest, nums[pos]+pos);
      }
      left = right+1;
      right = farthest;
      res++;
    }
    return res;
  }
  public int jumpDp(int[] nums) {
    int nLen = nums.length;
    int[] dp = new int[nLen];
    for (int pos = 0; pos < nLen-1; pos++) {
      int maxJump = nums[pos];
      for (int jp = maxJump; jp >= 1; jp--) {
        if (jp + pos <= nLen-1) {
          if (dp[jp+pos] == 0) {
            dp[jp+pos] = 1 + dp[pos];
          }
          dp[jp+pos] = Math.min(dp[jp+pos], nums[pos]+pos);
        }
      }
    }
    return dp[nLen-1];
  }
}
