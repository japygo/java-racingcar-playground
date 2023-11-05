package racing.view;

import racing.dto.CarDto;
import racing.dto.RacingCarsDto;

import java.util.stream.Collectors;

public class ResultView {

    public void startGame(RacingCarsDto carsDto) {
        System.out.println("실행 결과");
        printCars(carsDto);
    }

    public void printCars(RacingCarsDto carsDto) {
        carsDto.getCars().stream()
                .map(carDto -> carDto.getName() + " : " + "-".repeat(carDto.getPosition()))
                .forEach(System.out::println);
        System.out.println();
    }

    public void printWinners(RacingCarsDto carsDto) {
        System.out.println(
                carsDto.getCars().stream()
                        .map(CarDto::getName)
                        .collect(Collectors.joining(", ")) + "가 최종 우승했습니다."
        );
    }
}
