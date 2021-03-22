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

    public Vehicule createVehicule(String type){
        switch(type){
            case "Car": return this.createCar();
            case "Moto": return this.createMoto();
            default:
                System.out.println("erreur");
                return null;
        }


    }

    public ElectricCar createCar(){
        return new ElectricCar();
    }
    public ElectricMoto createMoto(){
        return new ElectricMoto();
    };
}
