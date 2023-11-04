package racing.domain;

public class CarPosition {
    private int position;

    public CarPosition(int position) {
        this.position = position;
    }

    public CarPosition() {
        this(1);
    }

    public void forward() {
        this.position++;
    }

    public int compareTo(CarPosition carPosition) {
        return carPosition.compareTo(position);
    }

    private int compareTo(int position) {
        return position - this.position;
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

    @Override
    public String toString() {
        return "CarPosition{" +
                "position=" + position +
                '}';
    }
}
