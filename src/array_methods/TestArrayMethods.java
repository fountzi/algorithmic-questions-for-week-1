package array_methods;

public class TestArrayMethods {
    public static void main(String[] args) {
        int[] data = {14, 6, 8, 8, 2, 9, 1, 7, 74, 26, 0, 22, 88, 45};
        int divisor = 5;
        ArrayMethods.pairsDivisibleByNumber(divisor, data);
        System.out.println(
                ArrayMethods.checkLeftSubArrayEqualsRightSubArray(data));
    }
}


