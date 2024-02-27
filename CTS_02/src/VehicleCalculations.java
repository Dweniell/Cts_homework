
interface VehicleCalculations {
    public double calculateValue();

}
class Bike implements VehicleCalculations {
    double value;
    @Override
    public double calculateValue() {
        return this.value* 0.8;
    }
}

class Car implements VehicleCalculations {
    double value;

    @Override
    public double calculateValue() {
        return this.value* 0.5;
    }
}