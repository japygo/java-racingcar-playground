package racing.dto;

import racing.domain.CarName;
import racing.domain.CarPosition;

public class CarDto {
    private String name;
    private int position;

    public CarDto(String name, int position) {
        this.name = name;
        this.position = position;
    }

    public CarDto(CarName name, CarPosition position) {
        this.from(name, position);
    }

    public String getName() {
        return name;
    }

    public CarDto setName(String name) {
        this.name = name;
        return this;
    }

    public int getPosition() {
        return position;
    }

    public CarDto setPosition(int position) {
        this.position = position;
        return this;
    }

    public CarDto from(CarName name, CarPosition position) {
        return from(name).from(position);
    }

    private CarDto from(CarName name) {
        return name.toDto(this);
    }

    private CarDto from(CarPosition position) {
        return position.toDto(this);
    }
}
