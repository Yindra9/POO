public class Main {
    private int edad=15;
    public void run() {
        //arreglo
        Persona[] personas;
        personas = new Persona[5];// 5 el limete de datos
        personas[0] = new Persona("Pedro", edad, false);//mandar datos a la clase
        personas[1] = new Persona("Ana", 17, true);//se opoca nombre distentos
        //System.out.println(personas[0].toString());
        //imprimir el arreglo de personas
        /*for (int i = 0; i < personas.length-1; i++) {

        }*/
        for (Persona per : personas) {
            System.out.println(per);

        }
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        (new Main()).run();
    }
}