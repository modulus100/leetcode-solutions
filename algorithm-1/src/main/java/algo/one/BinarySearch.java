package algo.one;

public class BinarySearch {

    public static void main(String[] args) {
        var binSearch = new BinarySearch();
        System.out.println(binSearch.search(new int[]{2, 5}, 0));
    }

    public int search(int[] nums, int target) {
        return binSearch(nums, target, 0, nums.length - 1);
    }

    public int binSearch(int[] nums, int target, int startIndex, int endIndex) {
        if (startIndex > endIndex) return -1;
        var pivot = startIndex + (endIndex - startIndex) / 2;

        if (nums[pivot] == target) return pivot;
        if (nums[pivot] > target) return binSearch(nums, target, startIndex, pivot - 1);
        return binSearch(nums, target, pivot + 1, endIndex);
    }

    public int search2(int[] nums, int target) {
        int pivot, left = 0, right = nums.length - 1;
        while (left <= right) {
            pivot = left + (right - left) / 2;
            if (nums[pivot] == target) return pivot;
            if (target < nums[pivot]) right = pivot - 1;
            else left = pivot + 1;
        }
        return -1;
    }
}
