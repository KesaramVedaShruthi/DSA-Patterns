public class TwoPointersEx1{

    // Two Sum II - Input Array Is Sorted
    static class Solution {
        public int[] twoSum(int[] numbers, int target) {
            int left = 0;
            int right = numbers.length - 1;
            int[] res = new int[2];

            while (left < right) {
                int sum = numbers[left] + numbers[right];

                if (sum == target) {
                    res[0] = left + 1;   // 1-based indexing
                    res[1] = right + 1;
                    return res;

                } else if (sum < target) {
                    left++;

                } else {
                    right--;
                }
            }

            return res;
        }
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        int[] numbers = {2, 7, 11, 15};
        int target = 9;

        int[] result = obj.twoSum(numbers, target);

        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}