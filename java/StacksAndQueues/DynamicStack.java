package StacksAndQueues;

public class DynamicStack extends CustomStack{
    public DynamicStack(){
        super();
    }
    public DynamicStack(int size){
      super(size);
    }
    //We should override the push method because it is responsible for stack getting full
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
