package 回文数;

/**
 * @author Demon
 * @version 1.0
 * @since 2023/9/25
 * T
 */
public class Solution {
    /**
     * 判断给定的整数是否为回文数。
     * 回文数指的是正序和倒序读都一样的整数。
     *
     * @param n 要判断的整数
     * @return 如果是回文数，返回true；否则返回false
     */
    public static boolean isPalindrome(int n) {
        String s = String.valueOf(n);
        return new StringBuilder(s).reverse().toString().equals(s);
    }

    public static void main(String[] args) {
        System.out.println(Solution.isPalindrome(121));
        System.out.println(Solution.isPalindrome(12));
    }
}
