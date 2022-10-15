import java.util.Arrays;

public class Tri {
    public static void trier(int[] tableau){
         Arrays.parallelSort(tableau);
    }

    public static void afficher(int[] tableau){
     for(int i : tableau){
         System.out.println(i);
     }

    }
    public static void main(String[] args){
    int[] tab = new int[]{1,9,69,56,93,76};
    afficher(tab);
     System.out.println("***********************************");
    trier(tab);
     afficher(tab);
    }
}
