package racing.domain;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class RacingGame {
    private static final String SPLIT_DELIMITER = ",";

    private final RacingCars cars;
    private int tryCount;

    public RacingGame(String names, int tryCount) {
        this(
                new RacingCars(
                        Arrays.stream(names.split(SPLIT_DELIMITER))
                                .map(CarName::new)
                                .map(Car::new)
                                .collect(Collectors.toList())
                ),
                tryCount
        );
    }

    public RacingGame(RacingCars cars, int tryCount) {
        this.cars = cars;
        this.tryCount = tryCount;
    }

    public void race(CarMovable movable) {
        cars.race(movable);
        tryCount--;
    }

    public boolean isEnd() {
        return tryCount <= 0;
    }

    public RacingCars getWinner() {
        return cars.getWinner();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RacingGame that = (RacingGame) o;

        if (tryCount != that.tryCount) return false;
        return Objects.equals(cars, that.cars);
    }

    @Override
    public int hashCode() {
        int result = cars != null ? cars.hashCode() : 0;
        result = 31 * result + tryCount;
        return result;
    }
}
