package study;

public class StringCalculator {

    private StringCalculator() {
    }

    public static int splitAndSum(String formula) {
        if (formula == null || formula.isEmpty()) {
            return 0;
        }
        return Integer.parseInt(formula);
    }
}
