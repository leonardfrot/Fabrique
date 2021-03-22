package Factory;

import Vehicules.Car;
import Vehicules.Carburant;
import Vehicules.Moto;
import Vehicules.Vehicule;

public interface FabriqueVhc {
    Vehicule createVehicule(String caracteristics);
    Car createCar(String model, String color, int nbSeats, int nbDoors, Carburant carburant);
    Moto createMoto(String model, String color, int cubicCapacity, Carburant carburant);

}
