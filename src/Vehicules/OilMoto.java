package Vehicules;

public class OilMoto extends Moto {
    Carburant typeCarburant;

    public OilMoto(String modele, String couleur, int cylindree, Carburant typeCarburant) {
        super(modele, couleur, cylindree);
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
                ", cylindree : " + this.getCylindree() +
                ", carburant : " + this.getTypeCarburant()+
                ", type de vhc : " + this.getClass();

    }
}
