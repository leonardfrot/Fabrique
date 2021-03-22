package Vehicules;

public abstract class Car extends Vehicule {
    private int nbPlaces;
    private int nbPortes;

    public Car(String modele, String couleur, int nbPlaces, int nbPortes) {
        super(modele, couleur);
        this.nbPlaces = nbPlaces;
        this.nbPortes = nbPortes;
    }

    public int getNbPlaces() {
        return nbPlaces;
    }

    public void setNbPlaces(int nbPlaces) {
        this.nbPlaces = nbPlaces;
    }

    public int getNbPortes() {
        return nbPortes;
    }

    public void setNbPortes(int nbPortes) {
        this.nbPortes = nbPortes;
    }
}
