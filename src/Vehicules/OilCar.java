package Vehicules;

import Vehicules.Car;

public class OilCar extends Car {
    Carburant typeCarburant;

    public OilCar(String modele, String couleur, int nbPlaces, int nbPortes, Carburant typeCarburant) {
        super(modele, couleur, nbPlaces, nbPortes);
        this.typeCarburant = typeCarburant;
    }

    public Carburant getTypeCarburant() {
        return typeCarburant;
    }

    public void setTypeCarburant(Carburant typeCarburant) {
        this.typeCarburant = typeCarburant;
    }

    @Override
    public String toString() {
        return "modele : " + this.getModele() +
                ", couleur : " + this.getCouleur() +
                ", nbPlaces : " + this.getNbPlaces() +
                ", nbPortes : " + this.getNbPortes() +
                ", carburant : " + this.getTypeCarburant()+
                ", type de vhc : " + this.getClass();
    }
}
