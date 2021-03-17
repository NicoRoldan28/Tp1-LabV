import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code

        List<Vikingo> listVik = new ArrayList<>();
        List<Espartano> listEsp = new ArrayList<>();

        listVik.add(new Vikingo("Aren",30,120,new BeberVikingoImp(),new OrinarVikingoImp(),50));
        listEsp.add(new Espartano("Leonidas ",30,120,new BeberEspartanoImp(),new OrinarEspartanoImp(),80));

        //Vikingo.ordPorPeso(listVik);
        listVik.forEach(f -> System.out.println(f.toString()));
        listVik.forEach(f -> System.out.println(f.getPeso()));

    }
}
