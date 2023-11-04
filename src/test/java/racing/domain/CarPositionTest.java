package racing.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CarPositionTest {

    @Test
    @DisplayName("위치를 생성한다")
    void create() {
        CarPosition carPosition = new CarPosition(10);
        assertThat(carPosition).isEqualTo(new CarPosition(10));
    }

    @Test
    @DisplayName("처음 위치는 1이다")
    void position_default() {
        CarPosition carPosition = new CarPosition();
        assertThat(carPosition).isEqualTo(new CarPosition(1));
    }
}