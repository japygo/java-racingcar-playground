package racing.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CarTest {

    @Test
    @DisplayName("자동차는 이름이 있다")
    void name() {
        String actual = "자동차";
        Car car = new Car(actual);
        String expected = car.getName();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("자동차 이름은 5자를 초과할 수 없다")
    void name_size() {
        String actual = "가나다라마바";
        assertThatThrownBy(() -> new Car(actual))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("자동차의 처음 위치는 1이다")
    void position() {
        Car car = new Car("자동차");
        int actual = car.getPosition();
        assertThat(actual).isEqualTo(1);
    }

    @Test
    @DisplayName("자동차는 전진할 수 있다")
    void forward() {
        Car car = new Car("자동차");
        car.forward();
        int actual = car.getPosition();
        assertThat(actual).isEqualTo(2);
    }

    @Test
    @DisplayName("자동차는 random 값이 4이상일 경우 전진한다")
    void move() {
        Car car = new Car("자동차");
        car.move(1);
        assertThat(car.getPosition()).isEqualTo(1);
        car.move(9);
        assertThat(car.getPosition()).isEqualTo(2);
    }
}