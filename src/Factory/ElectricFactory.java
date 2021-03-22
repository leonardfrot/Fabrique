package Factory;

import Vehicules.*;

public class ElectricFactory implements FabriqueVhc {
    private static ElectricFactory INSTANCE;

    private ElectricFactory(){}

    public synchronized static ElectricFactory getInstance(){
        if (INSTANCE == null){
            INSTANCE = new ElectricFactory();
        }
        return INSTANCE;
    }

    @Override
    public Vehicule createVehicule(String model, String color, int nbSeats, int nbDoors, Carburant carburant) {
        return this.createCar(model, color, nbSeats, nbDoors, null);
    }
    @Override
    public Vehicule createVehicule(String model, String color, int cylindree, Carburant carburant) {
        return this.createMoto(model, color, cylindree, null);
    }

    @Override
    public Car createCar(String model, String color, int nbSeats, int nbDoors, Carburant carburant) {
        return new ElectricCar(model, color, nbSeats, nbDoors);
    }

    @Override
    public Moto createMoto(String model, String color, int cylindree, Carburant carburant) {
        return new ElectricMoto(model, color, cylindree);
    }

}
