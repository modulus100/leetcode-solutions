package algo.one;

public class SearchInsertPosition {

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1, 3}, 2));
    }

    public static int searchInsert(int[] nums, int target) {
        var start = 0;
        var end = nums.length - 1;
        var pos = 0;

        while (end >= start) {
            var mid = start + (end - start) / 2;
            if (nums[mid] == target) return mid;
            if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            pos = mid;
        }

        if (nums[pos] < target) return pos + 1;
        if (nums[pos] > target && pos == 0) return 0;
        return pos;
    }
}
