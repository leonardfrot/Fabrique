import Factory.ElectricFactory;
import Vehicules.Car;
import Vehicules.Vehicule;

public class main {

        public static void main(String [] args){
                /*Car electriccar = ElectricFactory.getInstance().createCar();
                electriccar.setModele("Toyota");
                electriccar.setCouleur("rouge");
                electriccar.setNbPlaces(6);
                electriccar.setNbPortes(9);*/

                Vehicule electricCar = ElectricFactory.getInstance().createVehicule("Car");
                electricCar.setModele("Toyota");
                electricCar.setCouleur("rouge");









        }
}
