package racing.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CarTest {

    @Test
    @DisplayName("자동차는 이름이 있다")
    void name() {
        String actual = "자동차";
        Car car = new Car(actual);
        String expected = car.getName();
        assertThat(actual).isEqualTo(expected);
    }
}