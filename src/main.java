import Factory.ElectricFactory;
import Factory.OilFactory;
import Vehicules.Car;
import Vehicules.Carburant;
import Vehicules.ElectricCar;
import Vehicules.Vehicule;

import java.util.ArrayList;
import java.util.List;

public class main {

        public static void main(String [] args){


                Vehicule electricCar = ElectricFactory.getInstance().createCar("Renault", "Bleu", 4,5, null);
                Vehicule electricMoto = ElectricFactory.getInstance().createMoto("Susuki", "Noir", 900, null);
                Vehicule oilCar = OilFactory.getInstance().createCar("Subaru", "Rouge", 4, 5, Carburant.diesel);
                Vehicule oilMoto = OilFactory.getInstance().createMoto("Yamaha", "Gris", 1500, Carburant.sansPlomp95);
                //Création de vehicules génériques qui se spécialise selon la signature
                Vehicule newVhc = ElectricFactory.getInstance().createVehicule("Toyota", "Rouge", 3, 5, null);
                Vehicule newVhc2 = ElectricFactory.getInstance().createVehicule("Toyota", "Blanche", 3, 5, null);

                List<Vehicule> list = new ArrayList<>();
                list.add(electricCar);
                list.add(electricMoto);
                list.add(oilCar);
                list.add(oilMoto);
                list.add(newVhc);
                list.add(newVhc2);

                for(Vehicule v : list){
                        System.out.println(v);
                }









        }
}
