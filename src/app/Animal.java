package app;

public class Animal {
    String nume;
    String scientificName;
    TipAnimal tip;
    Locatie locatie;
    public Animal(String nume, String scientificName, TipAnimal tip, Locatie locatie) {
        this.nume = nume;
        this.scientificName = scientificName;
        this.tip = tip;
        this.locatie = locatie;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getScientificName() {
        return scientificName;
    }

    public void setScientificName(String scientificName) {
        this.scientificName = scientificName;
    }

    public TipAnimal getTip() {
        return tip;
    }

    public void setTip(TipAnimal tip) {
        this.tip = tip;
    }

    public Locatie getLocatie() {
        return locatie;
    }

    public void setLocatie(Locatie locatie) {
        this.locatie = locatie;
    }
}
