package program_17_carper_cost_calculator;

public class Carpet {
    public double getCost() {
        return this.cost;
    }
    double cost;

    public Carpet(double cost) {
        if (cost < 0) {
            this.cost = 0;
        } else {
            this.cost = cost;
        }
    }


}
