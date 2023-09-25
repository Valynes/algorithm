package 罗马数字转整数;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Demon
 * @version 1.0
 * @since 2023/9/25
 * F
 */
public class Solution {
    static Map<Character, Integer> symbolValues = new HashMap<Character, Integer>() {{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};

    /**
     * 将罗马数字转换为整数的方法。
     *
     * @param s 罗马数字字符串
     * @return 对应的整数值
     */
    public static int romanToInt(String s) {
        // 初始化结果为0
        int ans = 0;
        // 获取字符串长度
        int n = s.length();
        // 遍历字符
        for (int i = 0; i < n; ++i) {
            // 获取当前字符对应的整数值
            int value = symbolValues.get(s.charAt(i));
            if (i < n - 1 && value < symbolValues.get(s.charAt(i + 1))) {
                // 如果当前字符比下一个字符小，减去当前字符的值
                ans -= value;
            } else {
                // 否则，累加当前字符的值
                ans += value;
            }
        }
        // 返回最终结果
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Solution.romanToInt("IV"));
    }
}
