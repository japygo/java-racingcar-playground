package racing;

import racing.domain.RacingGame;
import racing.domain.RandomMovable;
import racing.view.InputView;
import racing.view.ResultView;

public class RacingMain {
    private static final InputView inputView = new InputView();
    private static final ResultView resultView = new ResultView();

    public static void main(String[] args) {
        String names = inputView.enterCarNames();
        int tryCount = inputView.enterTryCount();
        RacingGame racingGame = new RacingGame(names, tryCount);

        resultView.startGame(racingGame.toDto());
        while (!racingGame.isEnd()) {
            racingGame.race(new RandomMovable());
            resultView.printCars(racingGame.toDto());
        }
        resultView.printWinners(racingGame.getWinner().toDto());
    }
}
