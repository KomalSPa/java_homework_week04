package program_17_carper_cost_calculator;

public class Floor {
    public double getArea() {
        return this.width * this.length;
    }
    double width;
    double length;

    public Floor(double width, double length) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
        if (length < 0) {
            this.length = 0;
        } else {
            this.length = length;
        }
    }



}
