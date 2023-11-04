package racing.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CarTest {
    private Car car;

    @BeforeEach
    void setUp() {
        car = new Car(new CarName("test"));
    }

    @Test
    @DisplayName("자동차를 생성한다")
    void create() {
        assertThat(car).isEqualTo(new Car(new CarName("test")))
                .isEqualTo(new Car(new CarName("test"), new CarPosition()));
    }

    @Test
    @DisplayName("자동차는 조건에 따라 전진한다")
    void move_condition() {
        car.move(() -> false);
        assertThat(car).isEqualTo(new Car(new CarName("test"), new CarPosition(1)));
        car.move(() -> true);
        assertThat(car).isEqualTo(new Car(new CarName("test"), new CarPosition(2)));
    }
}