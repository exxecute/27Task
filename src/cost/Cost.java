package cost;

public class Cost {
    private int cost;
    public Cost(int cost) {
        this.cost = cost;
    }

    public Cost() {
        this(0);
    }

    public int getCost() {
        return this.cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return Integer.toString(cost);
    }
}
