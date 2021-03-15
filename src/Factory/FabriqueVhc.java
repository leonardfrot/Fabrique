package Factory;

import Vehicules.Car;
import Vehicules.Moto;
import javafx.scene.shape.MoveTo;

public interface FabriqueVhc {
    Car createCar();
    Moto createMoto();

}
