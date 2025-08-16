package core.basesyntax;

import java.util.Random;

public class Lottery {

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int number = random.nextInt(101);
        Ball.Color color = colorSupplier.getRandomColor();
        return new Ball(color, number);
    }

}
