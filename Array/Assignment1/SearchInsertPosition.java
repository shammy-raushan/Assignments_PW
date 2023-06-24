package AssignmentsPW;
import java.util.Scanner;

public class SearchInsertPosition {

        public int searchInsert(int[] nums, int target) {
            int left = 0;
            int right = nums.length - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (nums[mid] == target) {
                    return mid;
                } else if (nums[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            return left;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the number of elements in the sorted array: ");
            int length = scanner.nextInt();
            int[] nums = new int[length];

            System.out.println("Enter the elements of the sorted array:");
            for (int i = 0; i < length; i++) {
                nums[i] = scanner.nextInt();
            }

            System.out.print("Enter the target value: ");
            int target = scanner.nextInt();

            SearchInsertPosition searcher = new SearchInsertPosition();
            int index = searcher.searchInsert(nums, target);

            System.out.println("Index: " + index);

            scanner.close();
        }

}
