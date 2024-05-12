package StacksAndQueues;

public class QueueMain {
    public static void main(String[] args) throws Exception{
        CustomQueue queue=new DynamicQueue();
        queue.push(10);
        queue.push(20);
        queue.push(40);
        System.out.println(queue.pop());
        queue.display();
    }
}