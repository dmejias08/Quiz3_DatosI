package com.list;

public class Main {
    public static void main(String[] args) {

        Queue queue = new Queue();

        //Creating queue
        queue.enqueue(11);
        queue.enqueue(12);
        queue.enqueue(23);
        queue.enqueue(1);
        queue.enqueue(34);
        queue.enqueue(2);
        queue.enqueue(8);
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


        


    }
}
