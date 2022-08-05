package algo.one;

public class SquaresOfASortedArray {

    public int[] sortedSquares(int[] nums) {
        if (nums.length == 0) return nums;
        var arr = new int[nums.length];
        var start = 0;
        var end = nums.length - 1;
        var arrIndex = end;

        while (start <= end) {
            var squareOne = nums[start] * nums[start];
            var squareTwo = nums[end] * nums[end];

            if (squareOne > squareTwo) {
                start++;
                arr[arrIndex--] = squareOne;
            } else {
                end--;
                arr[arrIndex--] = squareTwo;
            }
        }

        return arr;
    }
}
