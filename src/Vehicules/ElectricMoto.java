package Vehicules;

public class ElectricMoto extends Moto {
    public ElectricMoto(String modele, String couleur, int cylindree) {
        super(modele, couleur, cylindree);
    }

    @Override
    public String toString() {
        return "modele: " + this.getModele() +
                "couleur " + this.getCouleur() +
                "cylindree " + this.getCylindree();

    }
}
