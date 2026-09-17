package vehicle;

public class FuelPump {

    public void refuel(Vehicle vehicle) {
        vehicle.setRemainingFuel(vehicle.getMaxFuel());
    }
}