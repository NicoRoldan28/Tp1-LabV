import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Espartano extends Humano{

    public int ToleranciaExtra;

    public Espartano(String nombre, Integer edad, Integer peso,Beber beber,Orinar orinar, int toleranciaExtra) {
        super(nombre, edad, peso,beber,orinar);
        ToleranciaExtra = toleranciaExtra;
    }

    public int getToleranciaExtra() {
        return ToleranciaExtra;
    }
    public void setToleranciaExtra(int toleranciaExtra) {
        ToleranciaExtra = toleranciaExtra;
    }

    public static void ordPorPeso(List listEsp ){
        List<Espartano> listOrd = new ArrayList<>();

        for (int i=0; i < listEsp.size();i++){
            System.out.println("holaaa");
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Espartano espartano = (Espartano) o;
        return ToleranciaExtra == espartano.ToleranciaExtra;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ToleranciaExtra);
    }

    @Override
    public String toString() {
        return "Espartano{" +
                "ToleranciaExtra=" + ToleranciaExtra +
                '}'+ super.toString();
    }
}
