public class Deal {
    private final int length;
    private final int width;
    private final int cost;

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getCost() {
        return cost;
    }

    public Deal(final int length, final int width, final int cost) {
        this.length = length;
        this.width = width;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Deal{"
                + length
                + "/"
                + width
                + ". cost=" + cost + '}';
    }
}
