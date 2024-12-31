public class PrefixSum {
    public static void main(String[] args) {
        // 724. Find Pivot Index (leetcode)
        int[] arr = { 2, 1, -1 };
        System.out.println(pivotIndex(arr));
    }

    static int pivotIndex(int[] nums) {
        int ts = 0;
        int ls = 0;
        for (int ele : nums) {
            ts += ele;
        }
        for (int i = 0; i < nums.length; i++) {
            int rs = ts - ls - nums[i];
            if (ls == rs) {
                return i;
            }
            ls += nums[i];
        }
        return -1;
    }
}
