package racing.domain;

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
}
