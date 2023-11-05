package racing.domain;

import racing.dto.CarDto;

import java.util.Objects;

public class CarName {
    private static final int MAX_SIZE = 5;

    private final String name;

    public CarName(String name) {
        validSize(name);
        this.name = name;
    }

    private void validSize(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("이름은 값이 존재해야 합니다.");
        }
        if (name.length() > MAX_SIZE) {
            throw new IllegalArgumentException("이름은 5자를 초과할 수 없습니다.");
        }
    }

    public CarDto toDto(CarDto carDto) {
        return carDto.setName(name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CarName carName = (CarName) o;

        return Objects.equals(name, carName.name);
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
