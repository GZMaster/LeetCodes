import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 5};
        int target = 5;

        int[] sumOfTarget = twoSum(arr, target);
        int output[] = Arrays.stream(sumOfTarget).toArray();

        System.out.println(Arrays.toString(output));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    answer[0] = i;
                    answer[1] = j;
                    return answer;
                }
            }
        }
        return answer;
    }
}
