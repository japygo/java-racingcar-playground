package study;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {

    private StringCalculator() {
    }

    public static int splitAndSum(String formula) {
        if (formula == null || formula.isEmpty()) {
            return 0;
        }

        String delimiter = "[,:]";
        Matcher matcher = Pattern.compile("//(.)\n(.*)").matcher(formula);
        if (matcher.find()) {
            delimiter = matcher.group(1);
            formula = matcher.group(2);
        }

        return Arrays.stream(formula.split(delimiter)).mapToInt(Integer::parseInt).sum();
    }
}
