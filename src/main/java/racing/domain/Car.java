package racing.domain;

public class Car {
    private final String name;

    public Car(String name) {
        validNameSize(name);
        this.name = name;
    }

    private void validNameSize(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException("자동차 이름은 5를 초과할 수 없습니다");
        }
    }

    public String getName() {
        return name;
    }
}
