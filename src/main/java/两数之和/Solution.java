package 两数之和;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author Demon
 * @version 1.0
 * @since 2023/9/24
 * T
 */
public class Solution {

    /**
     * 在给定的整数数组中查找两个数字，使它们的和等于目标值。
     * 使用双重循环遍历数组进行查找。
     *
     * @param nums 整数数组
     * @param target 目标值
     * @param loop 数组的长度
     * @return 包含两个索引的数组，表示满足条件的两个数字在数组中的位置
     */
    public static int[] find(int[] nums, int target, int loop) {
        int i, j;
        int[] result = new int[2];
        for (i = 0; i < loop; i++) {
            int transit = target - nums[i];
            for (j = i + 1; j < loop; j++) {
                if (nums[j] == transit) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    /**
     * 在给定的整数数组中查找两个数字，使它们的和等于目标值。
     * 使用HashMap优化查找过程。
     *
     * @param nums 整数数组
     * @param target 目标值
     * @param loop 数组的长度
     * @return 包含两个索引的数组，表示满足条件的两个数字在数组中的位置
     */
    public static int[] findForMap(int[] nums, int target, int loop) {
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>(loop);
        for (int i = 0; i < loop ; i++) {
            int transit = target - nums[i];
            Integer integer = map.get(transit);
            if (integer != null) {
                result[0] = i;
                result[1] = integer;
                break;
            }
            map.put(nums[i], i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {21, 0, 2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(Solution.find(nums, target, 6)));
        System.out.println(Arrays.toString(Solution.findForMap(nums, target, 6)));
    }
}

