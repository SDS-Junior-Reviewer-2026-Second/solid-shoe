package house;

public class PenthouseSuite extends Apartment {
    public PenthouseSuite() {
        this.numberOfBedrooms = 4;
    }

    @Override
    public void setSquareFootage(int sqft) {
        this.squareFootage = sqft;
    }

    @Override
    void upgradeBedroomNumber() {
        this.numberOfBedrooms += 1;
    }
}