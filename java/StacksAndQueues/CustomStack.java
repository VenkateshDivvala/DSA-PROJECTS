package StacksAndQueues;

public class CustomStack {
    protected int[] data;
    private static int Default_Size=4;//If empty constructor has been called stack size should be default
    public CustomStack(){
        this.data=new int[Default_Size];
    }
    public CustomStack(int size){
      this.data=new int[size];
    }
    int ptr=-1;
    public void push(int item){
       if(isFull()){
        System.out.println("Stack is full!!");
        return ;
       }
       ptr++;
       data[ptr]=item;
       return ;
    }
    //Deletion of a element always at top most level element
    public int pop() throws StackException{
     if(isEmpty()){
      throw new StackException("Stack is empty!!");
     }
     return data[ptr--];
    }
    //Getting top most element
    public int peek() throws StackException{
      if(isEmpty()){
        throw new StackException("Stack is empty!!");
      }
      return data[ptr];
    }
    protected boolean isFull(){
      return ptr==data.length-1;
    }
    protected boolean isEmpty(){
      return ptr == -1;
    }
    public void display()throws StackException{
      if(isEmpty()){
        throw new StackException("Stack is empty!!");
      }
      for(int i=0;i<=ptr;i++){
        System.out.println(data[i]);
      }
    }
}
