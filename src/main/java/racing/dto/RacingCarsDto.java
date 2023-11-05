package racing.dto;

import java.util.List;

public class RacingCarsDto {
    private final List<CarDto> cars;

    public RacingCarsDto(List<CarDto> cars) {
        this.cars = cars;
    }

    public List<CarDto> getCars() {
        return cars;
    }
}
