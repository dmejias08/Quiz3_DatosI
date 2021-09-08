package com.list;

public class Main {
    public static void main(String[] args) {

        Queue queue = new Queue();

        //Creating queue
        queue.enqueue(4);

        // loop queue
        System.out.println("Recorrer queue");
        queue.displayList();

        //Enqueue
        System.out.println("Encolando elementos");
        queue.enqueue(5);
        queue.enqueue(8);
        queue.enqueue(3);
        queue.enqueue(12);
        queue.enqueue(0);
        queue.enqueue(89);
        queue.enqueue(77);


        // loop queue
        System.out.println("Recorro lista con los nuevos elementos");
        queue.displayList();

        //dequeue
        System.out.println("Desencolando 3 elementos");
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        //loop queue
        System.out.println("Recorro lista final");
        queue.displayList();


    }
}
// Se esperaba que al aplicar el método enqueue los elementos fuesen añadidos al final de la cola,
// además cuando se aplica un dequeue el primer elemento de la cola fuese eliminado. También que al recorrer la lista
// se impriman todos los elementos del queue en terminal. Concluyendo en que sí,  los resultados culminaron siendo los esperados.
