package Vehicules;

public abstract class Vehicule {
    private String modele;
    private String couleur;

    public Vehicule(String modele, String couleur) {
        this.modele = modele;
        this.couleur = couleur;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
}
