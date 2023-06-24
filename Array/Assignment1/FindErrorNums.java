package AssignmentsPW;

import java.util.Arrays;

public class FindErrorNums {
    public int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int absValue = Math.abs(nums[i]);
            if (nums[absValue - 1] > 0) {
                nums[absValue - 1] *= -1;
            } else {
                result[0] = absValue;
            }
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                result[1] = i + 1;
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 1,2,2,4};

        FindErrorNums finder = new FindErrorNums();
        int[] result = finder.findErrorNums(nums);

        System.out.println("Result: " + Arrays.toString(result));
    }
}
