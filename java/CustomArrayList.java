import java.util.Arrays;

public class CustomArrayList {
    //members should be private because people should manipulate through methods
    private int[] data;
    private int size=0;
    private static int DEFAULT_SIZE=10;
    public CustomArrayList(){
        this.data=new int[DEFAULT_SIZE];
    }
    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++]=num;
    }
    private boolean isFull(){
        return size==DEFAULT_SIZE;
    }
    private void resize(){
        int[] temp=new int[data.length*2];
        for(int i=0;i<data.length;i++){
            temp[i]=data[i];
        }
        data=temp;
    }
    public void pop(){
      data[--size]='\0';
    }
    public int get(int index){
        return data[index];
    }
    public void set(int num,int index){
        data[index]=num;
        size++;
    }
    public int size(){
        return size;
    }
    @Override
    public String toString(){
        return Arrays.toString(data);
    }
}
class Main{
    public static void main(){
    CustomArrayList li=new CustomArrayList();
    li.add(10);
    li.add(20);
    li.add(30);
    li.pop();
    li.set(43,3);
    System.out.println(li.size());
    System.out.println(li);
    }
}
