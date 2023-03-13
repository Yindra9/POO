import java.util.ArrayList;
import java.util.List;
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        List<String>Nombre_jugadores=new ArrayList<> ();//Haci se hace una listasssss
        Nombre_jugadores.add("Messi , 30");//agregar cosas a una lista
        Nombre_jugadores.add("Cristiano, 13");
        Nombre_jugadores.add("Neymar, 10");
        Nombre_jugadores.add("Hazard, 19");
        Nombre_jugadores.add("Kevin, 7");
        Nombre_jugadores.add("oblak, 12");
        Nombre_jugadores.add("Van, 3");
        Nombre_jugadores.add("Dijk, 14");
        Nombre_jugadores.add("Mohamed,16");
        Nombre_jugadores.add("Modric, 11");
        Nombre_jugadores.add("TerStegen, 13");
        Nombre_jugadores.add("Mbappe, 9");


        System.out.println("Tamano de lista : " + Nombre_jugadores.size());//para saver tamano de una lista .size()
        System.out.println("Dato de pocion 1 es : " +Nombre_jugadores.get(1));//Para estraer datos de una lista y emplimir segun la posicion.
        Nombre_jugadores.remove(0);// para elimar segun la posicion
        System.out.println("Tamano;  "+Nombre_jugadores.size()); //implimir la lista de nuevo
        for(String n: Nombre_jugadores){// recoreer una lista en java
            System.out.println("Nombre del jugador y camisa: "+n);}


    }
}