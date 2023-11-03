package racing;

import racing.domain.Car;
import racing.domain.Racing;
import racing.domain.RacingCars;
import racing.view.InputView;
import racing.view.ResultView;

import java.util.Random;

public class RacingMain {
    private static final InputView inputView = new InputView();
    private static final ResultView resultView = new ResultView();
    private static final Random random = new Random();

    public static void main(String[] args) {

        String names = inputView.inputNames();
        int count = inputView.inputCount();
        System.out.println();

        Racing racing = new Racing(names, count);
        RacingCars cars = racing.getCars();
        System.out.println("실행 결과");
        resultView.showCarsInfo(cars);

        for (int i = 0; i < racing.getCount(); i++) {
            moveCars(cars);
        }

        resultView.result(racing);
    }

    private static void moveCars(RacingCars cars) {
        for (Car car : cars.getCars()) {
            car.move(random.nextInt(10));
        }
        resultView.showCarsInfo(cars);
    }
}
