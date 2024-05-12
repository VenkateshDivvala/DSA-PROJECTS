package StacksAndQueues;

public class CustomQueue {
    private static final int DEFAULT_SIZE=10;
    protected int[] data;
    public CustomQueue(){
        this.data=new int[DEFAULT_SIZE];
    }
    public CustomQueue(int size){
        this.data=new int[size];
    }
     int ptr=-1;
     public void push(int item){
      if(isFull()){
        System.out.println("Queue is full!!");
        return ;    
      }
      ptr++;
      data[ptr]=item;
      return ;
     }
     public int pop() throws Exception{
        if(isEmpty()){
         throw new Exception("Queue is Empty");
        }
        int removed=data[0];
        for(int i=1;i<=ptr;i++){
            data[i-1]=data[i];
        }
        ptr--;
        return removed;
     }
     public int getFirst() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        return data[0];
     }
     protected boolean isFull(){
        return ptr==data.length-1;
      }
      protected boolean isEmpty(){
        return ptr == -1;
      }
     public void display() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        for(int i=0;i<=ptr;i++){
            System.out.println(data[i]);
        }
        System.out.println(ptr);
        return ;
     }
}
