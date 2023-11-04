package racing.domain;

public class CarPosition {
    private final int position;

    public CarPosition(int position) {
        this.position = position;
    }

    public CarPosition() {
        this(1);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CarPosition that = (CarPosition) o;

        return position == that.position;
    }

    @Override
    public int hashCode() {
        return position;
    }
}
