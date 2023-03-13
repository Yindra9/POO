#include <iostream>
using namespace std;

//lista simple
struct nodoSimple{
    int dato;
    nodoSimple *sig;
};

//lista doblemente enlazada con referencia a sublista simple
struct nodoDoble{
    int dato;
    nodoSimple *sublista;

    nodoDoble *sig;
    nodoDoble *ant;

}*primero;

//insertar en lista doble
void insertarEnDoble(int dato){
    nodoDoble *nuevo = new nodoDoble();
    nuevo->dato = dato;
    nuevo->sig = NULL;
    nuevo->ant = NULL;
    nuevo->sublista = NULL;

    if(primero == NULL){
        primero = nuevo;
    }else{
        nodoDoble *aux = primero;
        while(aux->sig != NULL){
            aux = aux->sig;
        }
        aux->sig = nuevo;
        nuevo->ant = aux;
    }
}

void insertarEnSublista(int datoIdentificador, int datoInsertar)
{
    nodoDoble *aux = primero;
    while(aux != NULL){
        if(aux->dato == datoIdentificador){
            nodoSimple *nuevo = new nodoSimple();
            nuevo->dato = datoInsertar;
            nuevo->sig = NULL;

            if(aux->sublista == NULL){
                aux->sublista = nuevo;
            }else{
                nodoSimple *aux2 = aux->sublista;
                while(aux2->sig != NULL){
                    aux2 = aux2->sig;
                }
                aux2->sig = nuevo;
            }
        }
        aux = aux->sig;
    }
}

int main() {
    insertarEnDoble(1);
    insertarEnDoble(2);
    insertarEnDoble(3);

    insertarEnSublista(1, 10);
    insertarEnSublista(1, 20);
    insertarEnSublista(1, 30);
    return 0;
}
