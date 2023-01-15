import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class App3 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        File file=new File("produits.dat");
        FileInputStream fis=new FileInputStream(file);
        ObjectInputStream ois=new ObjectInputStream(fis);

        List<Produit> produits= (List<Produit>) ois.readObject();
        System.out.println(produits.get(0).toString());
        System.out.println(produits.get(1).toString());


    }
}
