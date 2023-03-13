public class Estudiantes {
    private String nombre;//string son objectos como se puede escribirelNombrePrimero o norma; simpre se escribe en minoscula.
    private int edad;
    private int anoactual;
    private String carrera;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAnoactual() {
        return anoactual;
    }

    public void setAnoactual(int anoactual) {
        this.anoactual = anoactual;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public Estudiantes (String nombre, int edad, int anoactual, String carrera) {
        this.nombre = nombre;
        this.edad = edad;
        this.anoactual = anoactual;
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", anoactual=" + anoactual +
                ", carrera='" + carrera + '\'' +
                '}';
    }
}
