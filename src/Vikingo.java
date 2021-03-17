import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.lang.Object;

public class Vikingo extends Humano{

    public int BebedorProfesional;

    public Vikingo(String nombre, Integer edad, Integer peso,Beber beber,Orinar orinar, int bebedorProfesional) {
        super(nombre, edad, peso,beber,orinar);
        this.BebedorProfesional = bebedorProfesional;
    }

    public int getBebedorProfesional() {
        return BebedorProfesional;
    }
    public void setBebedorProfesional(int bebedorProfesional) {
        BebedorProfesional = bebedorProfesional;
    }

    public void Orinar(){
    }

    public static void ordPorPeso(List listVik ){
        List<Vikingo> listOrd = new ArrayList<>();


        for ( Object vik : listVik ) {
            System.out.println(vik.toString(super.getPeso()));
        }

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vikingo vikingo = (Vikingo) o;
        return BebedorProfesional == vikingo.BebedorProfesional;
    }

    @Override
    public int hashCode() {
        return Objects.hash(BebedorProfesional);
    }

    @Override
    public String toString() {
        return "Vikingo{" +
                "BebedorProfesional=" + BebedorProfesional +
                '}'+ super.toString();
    }
}
