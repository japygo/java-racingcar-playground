package study;

import java.util.Arrays;

public class StringCalculator {

    private StringCalculator() {
    }

    public static int splitAndSum(String formula) {
        if (formula == null || formula.isEmpty()) {
            return 0;
        }
        return Arrays.stream(formula.split("[,:]")).mapToInt(Integer::parseInt).sum();
    }
}
