package entities;

public class salle {
    private int id;
    private String nom;
    private String adresse;
    private String image;
    private String description ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "salle{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", image='" + image + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public salle() {
    }

    public salle(int id, String nom, String adresse, String image, String description) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.image = image;
        this.description = description;
    }

    public salle(String nom, String adresse, String image, String description) {
        this.nom = nom;
        this.adresse = adresse;
        this.image = image;
        this.description = description;
    }
}
