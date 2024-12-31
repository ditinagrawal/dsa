public class KadanesAlgo {
    public static void main(String[] args) {
        // 53. Maximum Subarray (leetcode)
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println(maxSubArray(arr));
    }

    static int maxSubArray(int[] nums) {
        int maxS = Integer.MIN_VALUE;
        int curS = 0;
        for (int ele : nums) {
            curS += ele;
            maxS = Math.max(maxS, curS);
            if (curS < 0) {
                curS = 0;
            }
        }
        return maxS;
    }
}
