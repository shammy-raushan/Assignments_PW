package AssignmentsPW;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
//
//
//
//public class Arrays1 {
//    public int[] twoSum(int[] nums, int target) {
//        Map<Integer, Integer> complementMap = new HashMap<>();
//
//        for (int i = 0; i < nums.length; i++) {
//            int complement = target - nums[i];
//
//            if (complementMap.containsKey(complement)) {
//                return new int[] { complementMap.get(complement), i };
//            }
//
//            complementMap.put(nums[i], i);
//        }
//
//        return new int[0];
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int[] nums = { 2, 1, 8, 15 };
//        int target = 9;
//
//        Arrays1 twoSum = new Arrays1();
//        int[] indices = twoSum.twoSum(nums, target);
//
//        System.out.println("Indices: " + indices[0] + ", " + indices[1]);
//    }
//}
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IndexValueSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> complementMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (complementMap.containsKey(complement)) {
                return new int[]{complementMap.get(complement), i};
            }

            complementMap.put(nums[i], i);
        }

        return new int[0];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int length = scanner.nextInt();
        int[] nums = new int[length];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < length; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.print("Enter the target sum: ");
        int target = scanner.nextInt();

        IndexValueSum twoSum = new IndexValueSum();
        int[] indices = twoSum.twoSum(nums, target);

        System.out.println("Index: " + indices[0] + ", " + indices[1]);

        scanner.close();
    }
}
