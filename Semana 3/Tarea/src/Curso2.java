import java.util.Arrays;

public class Curso2 {
    private String nombre;
    private int cantMax;
    private Estudiantes[] personas;
    private int indiceActual = 0;

    public Curso2(String nombre, int cantMax) {
        this.nombre = nombre;
        this.cantMax = cantMax;
        this.personas = new Estudiantes[cantMax];
    }

    public void agregarPersona(Estudiantes p){
        if (indiceActual < this.cantMax) {
            this.personas[indiceActual] = p;
            indiceActual++;
        }
        else
            System.out.println("No se puede agregar más");
    }

    @Override
    public String toString() {
        return "Curso2{" +
                "nombre='" + nombre + '\'' +
                ", cantMax=" + cantMax +
                ", personas=" + Arrays.toString(personas) +
                ", indiceActual=" + indiceActual +
                '}';
    }
}

