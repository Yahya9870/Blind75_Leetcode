public class TwoSum {

    public static void main(String[] args) {
        // Create an instance of Solution to use the twoSum method
        TwoSum sol = new TwoSum();

        // Test case 1
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = sol.twoSum(nums1, target1);
        System.out.println("Output for test case 1: [" + result1[0] + ", " + result1[1] + "]"); // Expected: [0, 1]

        // Test case 2
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = sol.twoSum(nums2, target2);
        System.out.println("Output for test case 2: [" + result2[0] + ", " + result2[1] + "]"); // Expected: [1, 2]

        // Test case 3
        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] result3 = sol.twoSum(nums3, target3);
        System.out.println("Output for test case 3: [" + result3[0] + ", " + result3[1] + "]"); // Expected: [0, 1]
    }

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution found");
    }
}
