package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StringCalculatorTest {

    @Test
    @DisplayName("빈 문자열 또는 null 값을 입력할 경우 0을 반환해야 한다")
    void splitAndSum_null_or_empty() {
        int result = StringCalculator.splitAndSum(null);
        assertThat(result).isZero();

        result = StringCalculator.splitAndSum("");
        assertThat(result).isZero();
    }

    @Test
    @DisplayName("숫자 하나를 문자열로 입력할 경우 해당 숫자를 반환한다")
    void splitAndSum_number() {
        int result = StringCalculator.splitAndSum("1");
        assertThat(result).isEqualTo(1);
    }
}