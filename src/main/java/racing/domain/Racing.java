package racing.domain;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Racing {
    private final RacingCars cars;
    private int count;

    public Racing(String names) {
        List<Car> carList =
                Arrays.stream(names.split(","))
                        .map(Car::new)
                        .collect(Collectors.toList());
        this.cars = new RacingCars(carList);
        this.count = 0;
    }

    public Racing(String names, int count) {
        this(names);
        this.count = count;
    }

    public RacingCars getCars() {
        return cars;
    }

    public int getCount() {
        return count;
    }
}
