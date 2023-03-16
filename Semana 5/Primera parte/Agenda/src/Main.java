public class Main {
    public static void main(String[] args) {
        System.out.println("-----------------------------------------------------");
        System.out.println("Datos de Personas");
        System.out.println("-----------------------------------------------------");

        Agenda laAgenda = new Agenda();
        laAgenda.agregar(new ContandoFamilia("Oscar",44,"la casa","A+"));
        laAgenda.agregar(new ContandoTec("Yindra",20,"la casa","yindraperez@gmail.com"));
        laAgenda.agregar(new ContandoAmigos("Kris",22,"la casa","Kris"));
        laAgenda.imprimirAgenda();

        System.out.println("-----------------------------------------------------");
        System.out.println("Datos de Personas eleminando a yindra");
        System.out.println("-----------------------------------------------------");
        laAgenda.eliminar("Yindra");
        laAgenda.imprimirAgenda();

        System.out.println("-----------------------------------------------------");
        System.out.println("Datos de Personas Modificados");
        System.out.println("-----------------------------------------------------");
        laAgenda.modificar("Oscar",new ContandoFamilia("Oscar",45,"Tec","A+") );
        laAgenda.imprimirAgenda();



    }
}