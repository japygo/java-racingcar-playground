package racing.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class RacingCarsTest {

    @Test
    @DisplayName("자동차들이 경주를 한다")
    void race() {
        RacingCars racingCars = new RacingCars(Arrays.asList(new Car(new CarName("a")), new Car(new CarName("b"))));
        racingCars.race(() -> true);
        assertThat(racingCars).isEqualTo(
                new RacingCars(
                        Arrays.asList(
                                new Car(new CarName("a"), new CarPosition(2)),
                                new Car(new CarName("b"), new CarPosition(2))
                        )
                )
        );
    }
}