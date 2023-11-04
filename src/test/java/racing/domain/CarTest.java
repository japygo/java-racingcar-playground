package racing.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CarTest {

    @Test
    @DisplayName("자동차를 생성한다")
    void create() {
        Car car = new Car(new CarName("test"));
        assertThat(car).isEqualTo(new Car(new CarName("test")))
                .isEqualTo(new Car(new CarName("test"), new CarPosition()));
    }
}