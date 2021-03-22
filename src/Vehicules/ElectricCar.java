package Vehicules;

public class ElectricCar extends Car{


    public ElectricCar(String modele, String couleur, int nbPlaces, int nbPortes) {
        super(modele, couleur, nbPlaces, nbPortes);


    }
    @Override
    public String toString() {
        return "modele: " + this.getModele() +
                "couleur " + this.getCouleur() +
                "nbPlaces " + this.getNbPlaces() +
                "nbPortes " + this.getNbPortes();
    }

}
