package algo.one;

public class SearchInsertPosition {

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1, 3}, 2));
    }

    public static int searchInsert(int[] nums, int target) {
        if (nums[0] > target) return 0;

        var start = 0;
        var end = nums.length - 1;
        var pos = 0;

        while (end >= start) {
            final var mid = start + (end - start) / 2;
            if (nums[mid] == target) return mid;
            if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            pos = mid;
        }

        return (nums[pos] < target) ? pos + 1 : pos;
    }
}
