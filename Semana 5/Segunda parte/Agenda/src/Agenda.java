import java.util.LinkedList;

public class Agenda {
    LinkedList<Contando> list = new LinkedList<Contando>();
    public void agregar(Contando c){
        list.add(c);
    }
    //buscar una dato en lista

    public void buscar(Contando d){
        list.indexOf(d);
    }
    public void eliminar(String e){
        for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getPersona().getNombre()==e) {
                    list.remove(i);
                    i--;
                }
        }

    }
    public void modificar(String m,Contando n){
       eliminar(m);
       agregar(n);
    }
    public void imprimirAgenda(){
        for (Contando c: list) {
            System.out.println(c);
        }
        for (Eventos m: listV) {
            System.out.println(m);
        }
    }
    LinkedList<Eventos> listV = new LinkedList<Eventos>();
    public void agregarv(Eventos l){
        listV.add(l);
    }
    public void relaconta(String h,String j){

    }

}
