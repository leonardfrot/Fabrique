package Vehicules;

import Vehicules.Car;

public class OilCar extends Car {
    Carburant typeCarburant;

    public Carburant getTypeCarburant() {
        return typeCarburant;
    }

    public void setTypeCarburant(Carburant typeCarburant) {
        this.typeCarburant = typeCarburant;
    }
}
