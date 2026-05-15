public class palidrome {

    static class Solution {

        public boolean isPalindrome(String s) {

            s = s.toLowerCase();
            s = s.replaceAll("[^a-z0-9]", "");

            int n = s.length();

            for (int i = 0; i < n / 2; i++) {

                if (s.charAt(i) != s.charAt(n - 1 - i)) {
                    return false;
                }
            }

            return true;
        }
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        String s1 = "A man, a plan, a canal: Panama";
        String s2 = "race a car";

        System.out.println("\"" + s1 + "\" -> " + obj.isPalindrome(s1));
        System.out.println("\"" + s2 + "\" -> " + obj.isPalindrome(s2));
    }
}