package domain;

public class Exercise {

    public static int calculate(int[] numbers) {
        if (numbers == null || numbers.length < 2) {
            return Integer.MIN_VALUE;
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int number : numbers) {
            if (number > max) {
                secondMax = max;
                max = number;
            } else if (number > secondMax && number < max) {
                secondMax = number;
            }
        }

        return secondMax;
    }
}
