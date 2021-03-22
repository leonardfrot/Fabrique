package Factory;

import Vehicules.*;

public class OilFactory implements FabriqueVhc {

    private static OilFactory INSTANCE;

    private OilFactory(){}

    public synchronized static OilFactory getInstance(){
        if (INSTANCE == null){
            INSTANCE = new OilFactory();
        }
        return INSTANCE;
    }
/*
    @Override
    public Vehicule createVehicule(String caracteristics) {
        return null;
    }*/


    public Vehicule createVehicule(String model, String color, int nbSeats, int nbDoors, Carburant carburant){
        return new OilCar(model, color, nbSeats, nbDoors, carburant);
    }
    public Vehicule createVehicule(String model, String color, int cylindree, Carburant carburant){
        return new OilMoto(model, color, cylindree, carburant);
    }

    @Override
    public Car createCar(String model, String color, int nbSeats, int nbDoors, Carburant carburant) {
        return new OilCar(model, color, nbSeats, nbDoors, carburant);
    }

    @Override
    public Moto createMoto(String model, String color, int cylindree, Carburant carburant) {
        return new OilMoto(model, color, cylindree, carburant);
    }



}
