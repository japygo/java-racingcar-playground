package racing.domain;

import racing.dto.CarDto;

import java.util.Objects;

public class Car {
    private final CarName name;
    private final CarPosition position;

    public Car(CarName name, CarPosition position) {
        this.name = name;
        this.position = position;
    }

    public Car(CarName name) {
        this(name, new CarPosition());
    }

    public void move(CarMovable movable) {
        if (movable.isMove()) {
            position.forward();
        }
    }

    public int compareTo(Car car) {
        return car.compareTo(position);
    }

    public int compareTo(CarPosition carPosition) {
        return carPosition.compareTo(position);
    }

    public boolean isSamePosition(Car car) {
        return car.isSamePosition(position);
    }

    private boolean isSamePosition(CarPosition carPosition) {
        return position.equals(carPosition);
    }

    public CarDto toDto() {
        return new CarDto(name, position);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (!Objects.equals(name, car.name)) return false;
        return Objects.equals(position, car.position);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (position != null ? position.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name=" + name +
                ", position=" + position +
                '}';
    }
}
