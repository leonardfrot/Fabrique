import Factory.ElectricFactory;
import Factory.OilFactory;
import Vehicules.Car;
import Vehicules.Carburant;
import Vehicules.Vehicule;

import java.util.ArrayList;
import java.util.List;

public class main {

        public static void main(String [] args){


                Vehicule electricCar = ElectricFactory.getInstance().createCar("sfdsf", "fsf", 4,5, null);
                Vehicule electricMoto = ElectricFactory.getInstance().createMoto("fsdf", "sfsdf", 1, null);
                Vehicule oilCar = OilFactory.getInstance().createCar("sfsf", "sf", 4, 5, Carburant.diesel);
                Vehicule oilMoto = OilFactory.getInstance().createMoto("fsf", "sfds", 4, Carburant.diesel);

                List<Vehicule> list = new ArrayList<>();
                list.add(electricCar);
                list.add(electricMoto);
                list.add(oilCar);
                list.add(oilMoto);

                for(Vehicule v : list){
                        System.out.println(v);
                }









        }
}
