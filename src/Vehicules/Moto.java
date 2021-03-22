package Vehicules;

public abstract class Moto extends Vehicule {
    private int cylindree;

    public Moto(String modele, String couleur, int cylindree) {
        super(modele, couleur);
        this.cylindree = cylindree;
    }

    public int getCylindree() {
        return cylindree;
    }

    public void setCylindree(int cylindree) {
        this.cylindree = cylindree;
    }
}
