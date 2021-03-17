import java.util.Objects;

public abstract class Humano {
    private String Nombre;
    private Integer edad;
    private Integer peso;
    private Beber beber;
    private Orinar orinar;

    public Humano(String nombre, Integer edad, Integer peso,Beber beber,Orinar orinar) {
        this.Nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.beber = beber;
        this.orinar = orinar;
    }

    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }
    public Integer getEdad(){
        return edad;
    }
    public void setEdad(Integer edad){
        this.edad = edad;
    }
    public Integer getPeso(){
        return peso;
    }
    public void setPeso(Integer peso){
        this.peso = peso;
    }
    public Beber getBeber() {
        return beber;
    }
    public void setBeber(Beber beber) {
        this.beber = beber;
    }
    public Orinar getOrinar() {
        return orinar;
    }
    public void setOrinar(Orinar orinar) {
        this.orinar = orinar;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Humano humano = (Humano) o;
        return Nombre.equals(humano.Nombre) && edad.equals(humano.edad) && peso.equals(humano.peso) && beber.equals(humano.beber) && orinar.equals(humano.orinar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Nombre, edad, peso, beber, orinar);
    }

    @Override
    public String toString() {
        return "Humano{" +
                "Nombre='" + Nombre + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", beber=" + beber +
                ", orinar=" + orinar +
                '}';
    }
}
