package racing.domain;

import racing.dto.CarDto;
import racing.dto.RacingCarsDto;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class RacingCars {
    private final List<Car> cars;

    public RacingCars(List<Car> cars) {
        this.cars = cars;
    }

    public void race(CarMovable movable) {
        this.cars.forEach(car -> car.move(movable));
    }

    public RacingCars getWinner() {
        Car maxCar = this.cars.stream().max(Car::compareTo).orElseThrow(RuntimeException::new);
        return new RacingCars(
                this.cars.stream().filter(car -> car.isSamePosition(maxCar)).collect(Collectors.toList())
        );
    }

    public RacingCarsDto toDto() {
        return new RacingCarsDto(cars.stream().map(Car::toDto).collect(Collectors.toList()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RacingCars cars1 = (RacingCars) o;

        return Objects.equals(cars, cars1.cars);
    }

    @Override
    public int hashCode() {
        return cars != null ? cars.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "RacingCars{" +
                "cars=" + cars +
                '}';
    }
}
