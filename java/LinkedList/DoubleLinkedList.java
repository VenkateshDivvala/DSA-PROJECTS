package Linked_List;

public class DoubleLinkedList {
    class Node{
        int value;
        Node next;
        Node previous;
        public Node(int val){
            this.value= val;
        }
    }
    private Node head;
    private int size;
    public DoubleLinkedList(){
        this.size=0;
    }
    //Insertion at first position
    public void insertAtFirst(int val){
        Node node=new Node(val);
        node.next=head;
        if(head!=null){
            head.previous=node;
        }
        head=node;
        size++;
    }
    //Insertion at last position
    public void insertAtLast(int val){
         Node node = new Node(val);
         if(head==null){
            insertAtFirst(val);
            return ;
         }
         Node temp=head;
         while(temp.next!=null){
           temp=temp.next;
         }
         node.previous=temp;
         temp.next=node;
         size++;
    }
    //insert in middle
    public void insert(int val,int index){
        if(index==0){
            insertAtFirst(val);
            return ;
        }
        if(index == size){
            insertAtLast(val);
            return ;
        }
        Node node=new Node(val);
        Node temp=head;
        for(int i=1;i<index;i++){
           temp=temp.next;
        }
        node.next=temp.next;
        node.previous=temp;
        temp.next.previous=node;
        temp.next=node;
        size++;
    }
    //Delete at first position
    public void deleteAtFirst(){
         if(head!=null){
            head=head.next;
            head.previous=null;
            size--;
         }
    }
    //delete at last position
    public void deleteAtLast(){
        if(head!=null){
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            if(size>1){
            temp.previous.next=null;
            temp.previous=null;
            size--;
            return ;
            }
        //If one element left to remove     
        head=null;
        }
    }
    //Delete at random 
    public void delete(int index){
        if(index==0){
            deleteAtFirst();
            return ;
        }
        if(index==size){
            deleteAtLast();
            return ;
        }
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        temp.previous.next=temp.next;
        temp.next.previous=temp.previous;
        return ;
    }
    public void display(){
        Node temp=head;
        if(head!=null){
        while(temp!=null){
            System.out.print(temp.value+"-> ");
            temp=temp.next;
        }
        System.out.println("End");
        //Display in reverse
        temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        while(temp!=null){
            System.out.print(temp.value+"-> ");
            temp=temp.previous;
        }
        System.out.print("Start");
    }
    }

}
