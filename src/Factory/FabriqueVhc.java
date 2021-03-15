package Factory;

import Vehicules.Car;
import Vehicules.Moto;

public interface FabriqueVhc {
    Car createCar();
    Moto createMoto();

}
