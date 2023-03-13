
public class Curso {

    private String nombrecurso;
    private String descrcion;
    private int capacidad;
    private Estudiantes[] estudiantes;
    private String semestre;
    private int indiceActual = 0;
//-------------------------------------------------------------------


    public Curso(String nombrecurso, String descrcion, int capacidad, String semestre) {
        this.nombrecurso = nombrecurso;
        this.descrcion = descrcion;
        this.capacidad = capacidad;
        this.semestre = semestre;
        this.estudiantes = new Estudiantes[capacidad];
    }
//------------------------------------------------------------------------


    public String getNombrecurso() {
        return nombrecurso;
    }

    public void setNombrecurso(String nombrecurso) {
        this.nombrecurso = nombrecurso;
    }

    public String getDescrcion() {
        return descrcion;
    }

    public void setDescrcion(String descrcion) {
        this.descrcion = descrcion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Estudiantes[] getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(Estudiantes[] estudiantes) {
        this.estudiantes = estudiantes;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public void agregarPersona(Estudiantes p) {
        if (indiceActual < this.capacidad) {
            this.estudiantes[indiceActual] = p;
            indiceActual++;
        } else
            System.out.println("No se puede agregar más");
    }

    public String getNombreEstudiantes(){
        String nombres = "";
        for(int i = 0; i < indiceActual; i++){
            nombres += estudiantes[i].getNombre() + ", ";
        }
        return nombres;

    }

    @Override
    public String toString() {
        return "Curso{" +
                "nombrecurso='" + nombrecurso + '\'' +
                ", descrcion='" + descrcion + '\'' +
                ", capacidad=" + capacidad +
                ", estudiantes=" + getNombreEstudiantes() +
                ", semestre='" + semestre + '\'' +
                ", Estudiantes Activos=" + indiceActual +
                '}';
    }
}


