public class Solution3 {
    public static boolean isPalindrome(String str, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String word = "radar"; 
        if (isPalindrome(word, 0, word.length() - 1)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
