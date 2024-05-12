package StacksAndQueues;

public class DynamicQueue extends CustomQueue{
    public DynamicQueue(){
        super();
    }
    public DynamicQueue(int size){
        super(size);
    }
    @Override
    public void push(int item){
     if(isFull()){
        int[] temp=new int[data.length*2];
        for(int i=0;i<=ptr;i++){
          temp[i]=data[i];
        }
        data=temp;
     }
     super.push(item);
     return ;
    }
}