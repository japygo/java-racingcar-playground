package racing.view;

import racing.domain.Car;
import racing.domain.Racing;
import racing.domain.RacingCars;

import java.util.Random;

public class ResultView {
    private final Random random = new Random();

    public void result(Racing racing) {
        System.out.println(racing.winner() + "가 최종 우승했습니다.");
    }

    public void showCarsInfo(RacingCars cars) {
        for (Car car : cars.getCars()) {
            showCarInfo(car);
        }
        System.out.println();
    }

    private void showCarInfo(Car car) {
        System.out.println(car.getName() + " : " + "-".repeat(car.getPosition()));
    }
}
