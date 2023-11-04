package racing.domain;

import java.util.Random;

public class RandomMovable implements CarMovable {
    private final Random random = new Random();

    @Override
    public boolean isMove() {
        return random.nextInt(10) > 4;
    }
}
