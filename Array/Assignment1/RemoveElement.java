package AssignmentsPW;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 2, 2, 3 ,4};
        int val = 2;

        RemoveElement remover = new RemoveElement();
        int result = remover.removeElement(nums, val);

        System.out.println("Which element you have to remove: " + result);
        System.out.print("Modified numbers: [");
        for (int i = 0; i < result; i++) {
            System.out.print(nums[i]);
            if (i != result - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
