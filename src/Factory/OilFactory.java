package Factory;

import Vehicules.Car;
import Vehicules.Moto;
import Vehicules.OilCar;
import Vehicules.OilMoto;

public class OilFactory implements FabriqueVhc {

    private static OilFactory INSTANCE;

    private OilFactory(){}

    public synchronized static OilFactory getInstance(){
        if (INSTANCE == null){
            INSTANCE = new OilFactory();
        }
        return INSTANCE;
    }

    public OilCar createCar(){
        return new OilCar();
    };
    public OilMoto createMoto(){
        return new OilMoto();
    };

}
