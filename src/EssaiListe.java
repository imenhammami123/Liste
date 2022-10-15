public class EssaiListe {
    public static void main(String[] arg) throws VideException {
        Liste liste = new Liste();
        try {
            liste.ajouter(12);
            liste.ajouter(25);
            liste.ajouter(2);
            liste.ajouter(17);
            liste.ecrire();
            liste.ecrireDecroissant();

            System.out.println("Nombre de maillons : " + liste.taille());
            System.out.print("On retire le plus petit : ");
            System.out.println(liste.retirerPlusPetit());
            System.out.println("Valeur du plus grand : " + liste.plusGrand());

            System.out.println("2 existe : " + liste.existe(2));
            System.out.println("17 existe : " + liste.existe(17));
            System.out.println("25 existe : " + liste.existe(25));
            System.out.println("18 existe : " + liste.existe(18));

            System.out.println(liste);

            System.out.print("On retire le plus petit : ");
            System.out.println(liste.retirerPlusPetit());
            System.out.print("On retire le plus petit : ");
            System.out.println(liste.retirerPlusPetit());
            System.out.print("On retire le plus petit : ");
            System.out.println(liste.retirerPlusPetit());
            System.out.print("On retire le plus petit : ");
            System.out.println(liste.retirerPlusPetit());
        }
        catch(VideException exc) {
            System.out.println(exc);
        }
        System.out.print("Valeur du plus grand : ");
        System.out.println(liste.plusGrand());
    }
}
