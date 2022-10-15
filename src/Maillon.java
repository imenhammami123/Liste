public class Maillon  {
    private int donnee;
    private Maillon suivant;

    public Maillon( int donnee, Maillon suivant){
        this.donnee = donnee;
        this.suivant = suivant;
    }

    public Maillon getSuivant() {
        return suivant;
    }
    public void setSuivant(Maillon suivant) {
        this.suivant = suivant;
    }
    public int getDonnee() {
        return donnee;
    }
    public void setDonnee(int donnee) {
        this.donnee = donnee;
    }
}
