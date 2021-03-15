package Factory;

import Factory.FabriqueVhc;
import Vehicules.Car;
import Vehicules.Moto;

public class OilFactory implements FabriqueVhc {
    public Car createCar(){return null;};
    public Moto createMoto(){return null;};
}
