public class Main {
    public void Estudiante () {
        Estudiantes[] persona;
        persona = new Estudiantes[5];// 5 el limete de datos
        persona[0] = new Estudiantes("Pedro", 20, 2023, "Ingenieria en computacion");//mandar datos a la clase
        persona[1] = new Estudiantes("Ana", 18, 2023, "Agronomia");//se opoca nombre distentos

        Curso[] materia;
        materia = new Curso[5];// 5 el limete de datos
        materia[0] = new Curso("POO", "Orientado de objectos", 20, "1 Semestre");//mandar datos a la clase
        materia[1] = new Curso("Arqui", "Programar en EMO", 23, "1 Semestre");

        materia[0].agregarPersona(persona[0]);
        materia[0].agregarPersona(persona[1]);
        materia[1].agregarPersona(persona[0]);
        materia[1].agregarPersona(persona[1]);

        for (Estudiantes per : persona) {
            System.out.println(per);

        }

        for (Curso cur : materia) {
            System.out.println(cur);

        }



    }

    public static void main(String[] args) {
        (new Main()).Estudiante();
    }
}
