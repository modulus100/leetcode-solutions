package algo.one;

public class MoveZeros {

    public static void main(String[] args) {
        var zeros = new MoveZeros();
        zeros.moveZeroes(new int[] {0,1,0,3,12});
    }

    public void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0) {
                swapZero(nums, i);
            }
        }
    }

    public void swapZero(int[] nums, int index) {
        var swapIndex = index;

        while (nums[swapIndex] == 0 && swapIndex < nums.length - 1) {
            swapIndex++;
        }

        nums[index] = nums[swapIndex];
        nums[swapIndex] = 0;
    }
}
