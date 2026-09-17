package vehicle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VehicleTest {

    @Test
    public void testInitialFuel() {
        Vehicle vehicle = new Vehicle(10);

        assertEquals(10, vehicle.getRemainingFuel());
    }

    @Test
    public void testRefuel() {
        Vehicle vehicle = new Vehicle(10);

        vehicle.accelerate();
        vehicle.accelerate();

        assertEquals(8, vehicle.getRemainingFuel());

        FuelPump fuelPump = new FuelPump();
        fuelPump.refuel(vehicle);

        assertEquals(10, vehicle.getRemainingFuel());
    }
}