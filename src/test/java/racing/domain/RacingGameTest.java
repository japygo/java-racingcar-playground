package racing.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class RacingGameTest {

    @Test
    @DisplayName("자동차 경주 게임을 생성한다")
    void create() {
        RacingGame racingGame = new RacingGame("a,b,c", 5);
        assertThat(racingGame).isEqualTo(new RacingGame("a,b,c", 5));
    }

    @Test
    @DisplayName("자동차 경주 게임을 경주한다")
    void race() {
        RacingGame racingGame = new RacingGame(
                new RacingCars(Arrays.asList(new Car(new CarName("a")), new Car(new CarName("b")))),
                5
        );
        racingGame.race(() -> true);
        assertThat(racingGame).isEqualTo(
                new RacingGame(
                        new RacingCars(
                                Arrays.asList(
                                        new Car(new CarName("a"), new CarPosition(2)),
                                        new Car(new CarName("b"), new CarPosition(2))
                                )
                        ),
                        4
                )
        );
    }

    @Test
    @DisplayName("자동차 경주 게임이 끝인지 확인한다")
    void end() {
        RacingGame racingGame = new RacingGame("a,b,c", 2);
        racingGame.race(() -> true);
        assertThat(racingGame.isEnd()).isFalse();
        racingGame.race(() -> true);
        assertThat(racingGame.isEnd()).isTrue();
    }

    @Test
    @DisplayName("자동차 경주 게임 우승자를 확인한다")
    void winner() {
        RacingGame racingGame = new RacingGame(
                new RacingCars(
                        Arrays.asList(
                                new Car(new CarName("a"), new CarPosition(1)),
                                new Car(new CarName("b"), new CarPosition(2)),
                                new Car(new CarName("c"), new CarPosition(2))
                        )
                ),
                5
        );
        assertThat(racingGame.getWinner()).isEqualTo(
                new RacingCars(
                        Arrays.asList(
                                new Car(new CarName("b"), new CarPosition(2)),
                                new Car(new CarName("c"), new CarPosition(2))
                        )
                )
        );
    }
}