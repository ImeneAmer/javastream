import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class App2 {

    public static void main(String[] args) throws IOException {

        File file=new File("produits.dat");
        FileOutputStream fos=new FileOutputStream(file);
        ObjectOutputStream oos=new ObjectOutputStream(fos);

        List<Produit> produits = new ArrayList<>();

        Produit p1 = new Produit(1, "produit1", "marque1", 1530.3d, "discription1", 100);
        Produit p2 = new Produit(2, "produit2", "marque2", 1930.3d, "discription2", 200);

        produits.add(p1);
        produits.add(p2);

        oos.writeObject(produits);

        oos.close();



    }
}
