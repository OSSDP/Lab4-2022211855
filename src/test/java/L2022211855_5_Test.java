import org.example.Solution5;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * @description: 测试类 L学号_1_Test
 * @principle: 本测试类遵循等价类划分原则，测试不同输入情况下的代码行为。
 */
public class L2022211855_5_Test {

    /**
     * 测试目的：验证当输入为单个元素数组时，能正确返回非空子序列数量。
     * 测试用例：nums = [5], target = 10
     */
    @Test
    public void testNumSubseqSingleElement() {
        Solution5 solution = new Solution5();
        int[] nums = {5};
        int target = 10;
        int expected = 1; // 预期返回的有效子序列数量

        int actual = solution.numSubseq(nums, target);
        System.out.println("Expected: " + expected + ", Actual: " + actual);

        assertEquals(expected, actual);
    }

    /**
     * 测试目的：验证当输入数组包含多个元素且有多个有效子序列时的情况。
     * 测试用例：nums = [3, 5, 6, 7], target = 9
     */
    @Test
    public void testNumSubseqMultipleElements() {
        Solution5 solution = new Solution5();
        int[] nums = {3, 5, 6, 7};
        int target = 9;
        int expected = 4; // 预期返回的有效子序列数量

        int actual = solution.numSubseq(nums, target);
        System.out.println("Expected: " + expected + ", Actual: " + actual);

        assertEquals(expected, actual);
    }

    /**
     * 测试目的：验证当输入数组包含重复元素时的情况。
     * 测试用例：nums = [3, 3, 6, 8], target = 10
     */
    @Test
    public void testNumSubseqWithDuplicates() {
        Solution5 solution = new Solution5();
        int[] nums = {3, 3, 6, 8};
        int target = 10;
        int expected = 6; // 预期返回的有效子序列数量

        int actual = solution.numSubseq(nums, target);
        System.out.println("Expected: " + expected + ", Actual: " + actual);

        assertEquals(expected, actual);
    }

    /**
     * 测试目的：验证当目标小于数组中的最小值时的情况。
     * 测试用例：nums = [1, 2, 3], target = 0
     */
    @Test
    public void testNumSubseqTargetTooLow() {
        Solution5 solution = new Solution5();
        int[] nums = {1, 2, 3};
        int target = 0;
        int expected = 0; // 预期返回的有效子序列数量

        int actual = solution.numSubseq(nums, target);
        System.out.println("Expected: " + expected + ", Actual: " + actual);

        assertEquals(expected, actual);
    }

    /**
     * 测试目的：验证当目标大于数组中的最大值时的情况。
     * 测试用例：nums = [1, 2, 3], target = 10
     */
    @Test
    public void testNumSubseqTargetTooHigh() {
        Solution5 solution = new Solution5();
        int[] nums = {1, 2, 3};
        int target = 10;
        int expected = 7; // 预期返回的有效子序列数量，包括所有非空子序列

        int actual = solution.numSubseq(nums, target);
        System.out.println("Expected: " + expected + ", Actual: " + actual);

        assertEquals(expected, actual);
    }
}