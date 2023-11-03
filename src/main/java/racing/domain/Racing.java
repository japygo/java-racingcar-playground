package racing.domain;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Racing {
    private final RacingCars cars;
    private int count;
    private String winner;

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

    public String winner() {
        int max = Integer.MIN_VALUE;
        for (Car car : cars.getCars()) {
            max = setWinner(car, max);
        }
        return this.winner;
    }

    private int setWinner(Car car, int max) {
        int position = car.getPosition();
        if (position > max) {
            max = position;
            winner = car.getName();
            return max;
        }
        if (position == max) {
            if (!winner.isEmpty()) {
                winner += ", ";
            }
            winner += car.getName();
        }
        return max;
    }
}
