package array_methods;

public class ArrayMethods {
    public static void pairsDivisibleByNumber(int divisor, int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = i + 1; j < data.length; j++) {
                if ((data[i] + data[j]) % divisor == 0) {
                    System.out.print("(" + data[i] + "," + data[j] + ")");
                }
            }
        }
        System.out.println();
    }

    public static boolean checkLeftSubArrayEqualsRightSubArray(int[] data) {
        for (int i = 1; i < data.length - 1; i++) {
            int leftSum = leftSum(i, data);
            int rightSum = rightSum(i, data);
            if (leftSum == rightSum) return true;
        }
        return false;
    }

    static int leftSum(int index, int[] data) {
        int sum = 0;
        for (int i = 0; i < index; i++) sum += data[i];
        return sum;
    }

    static int rightSum(int index, int[] data) {
        int sum = 0;
        for (int i = index; i < data.length; i++) sum += data[i];
        return sum;
    }
}
