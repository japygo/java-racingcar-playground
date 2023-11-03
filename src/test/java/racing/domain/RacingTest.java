package racing.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RacingTest {

    @Test
    @DisplayName("쉼표(,)를 기준으로 입력 받은 자동차 이름을 구분한다")
    void comma() {
        String names = "a,b,c";
        Racing racing = new Racing(names);
        RacingCars actual = racing.getCars();
        assertThat(actual.getCars()).hasSize(3);
    }
}