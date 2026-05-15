public class RemoveDuplicates {

    static class Solution {

        public int removeDuplicates(int[] nums) {

            int n = nums.length;
            if (n == 0) {
                return 0;
            }

            int j = 1;

            for (int i = 1; i < n; i++) {

                if (nums[i] != nums[j - 1]) {
                    nums[j] = nums[i];
                    j++;
                }
            }

            return j;
        }
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        int[] nums = {1, 1, 2, 2, 3, 4, 4};

        int k = obj.removeDuplicates(nums);

        System.out.println("Number of unique elements: " + k);

        System.out.print("Array after removing duplicates: ");

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}