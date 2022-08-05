package algo.one;

public class RotateArray {

    public static void main(String[] args) {
        System.out.println(11 % 10);
    }

    public void rotate(int[] nums, int k) {
        final var modulo = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, modulo - 1);
        reverse(nums, modulo, nums.length - 1);
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
