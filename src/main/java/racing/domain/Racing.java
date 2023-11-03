package racing.domain;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Racing {
    private final RacingCars cars;

    public Racing(String names) {
        List<Car> carList =
                Arrays.stream(names.split(","))
                        .map(Car::new)
                        .collect(Collectors.toList());
        cars = new RacingCars(carList);
    }

    public RacingCars getCars() {
        return cars;
    }
}
