package Linked_List;


public class SingleLinkedList {
    //Creating a node data structure
    class Node{
        int value;
        Node next;
        public Node(){

        }
        public Node(int val){
            this.value=val;
        }
        @Override
        public String toString(){
            return this.value + "";
        }
    }
    private Node head;
    //Optional but for better performance of our linked we should use tail
    private Node tail;
    private int size;
    public SingleLinkedList(){
        this.size=0;
    }
    //To pass the linkedList 
    public void insertRec(int val,int index){
        if(head==null){
            insertAtFirst(val);
            return ;
        }
        insertRec(val, index, head);
    }
    //Insert using recursion
    public Node insertRec(int val,int index,Node node){
        if(index == 0){
            Node temp=new Node(val);
            temp.next=node;
            size++;
            return temp;
        }
        //Making connection from one node to another untill position is found.
        //After position found it won't disturb the connections of right side nodes from inserting node.
        node.next=insertRec(val,index-1,node.next);
        return node;
    }
    //For inserting element at first position every time
    public void insertAtFirst(int value){
       Node node=new Node(value);
       node.next=head;
       head=node;
       if(tail==null){
        tail=head;
       }
       size++;
    }
    public void insertAtLast(int value){
        Node node = new Node(value);
        if(tail==null){
            insertAtFirst(value);
            return ;
        }
        tail.next=node;
        tail=node;
        size++;
    }
    //Insert at given specified node position
    public void insert(int value,int index){
        Node node=new Node(value);
        Node temp=head;
        if(index==0 || head==null){
          insertAtFirst(value);
          return;
        }
        if(index==size){
            insertAtFirst(value);
            return ;
        }
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        node.next=temp.next;
        temp.next=node;
        size++;
    }
    //Delete at first position 
    public void deleteAtFirst(){
     head=head.next;
     if(head==null){
        tail=head;
     }
     size--;
    }
    //Delete at last position
    public void deleteAtLast(){
     Node secondLast=get(size-2);
     tail=secondLast;
     secondLast.next=null;
     size--;
    }
    //Delete at given position
    public void delete(int index){
        if(index==0){
            deleteAtFirst();
            return ;
        }
        if(index==size){
            deleteAtLast();
            return ;
        }
      Node node=get(index-1);
      node.next=node.next.next;
      size--;
    }
    //Find an element 
    public Node find(int value){
        Node temp=head;
        while(temp!=null){
            if(temp.value==value){
             return temp;
            }
            temp=temp.next;
        }
        return null;
    }
    public Node get(int index){
        Node node=head;
        for(int i=0;i<index;i++){
            node=node.next;
        }
        return node;
    }
    //remove duplicates from sorted list
    public void duplicates(){
     Node temp=head;
     if(head==null){
        return ;
     }
     while(temp.next!=null){
        if(temp.next.value==temp.value){
            temp.next=temp.next.next;
        }
        else{
            temp=temp.next;
        }
     }
    }
    //Merge twosorted lists
    public static SingleLinkedList mergeLists(SingleLinkedList l1,SingleLinkedList l2){
     Node head1=l1.head;
     Node head2=l2.head;
     SingleLinkedList ans=new SingleLinkedList();
     while(head1!=null && head2!=null){
        if(head1.value<=head2.value){
           ans.insertAtLast(head1.value);
           head1=head1.next;
        }
        else{
            ans.insertAtLast(head2.value);
            head2=head2.next;
        }
     }
     while(head1!=null){
        ans.insertAtLast(head1.value);
        head1=head1.next;
     }
     while(head2!=null){
        ans.insertAtLast(head2.value);
        head2=head2.next;
     }
     return ans;
    }
    //Gettting middle node
    public Node getMid(Node node){
        Node fast=head;
        Node slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public void reverseRec(){
        reverseRec(head);
    }
    //Reversing a linked using recursion 
    public void reverseRec(Node node){
       if(node==tail){
         head=tail;
         return ;
       }
       reverseRec(node.next);
       tail.next=node;
       tail=node;
       tail.next=null;
    }
    //In-place reverse of a linked list
    public void reverse(){
        if(size<2){
            return ;
        }
        Node prev=null;
        Node cur=head;
        Node next=cur.next;
        cur.next=prev;
        while(next!=null){
            prev=cur;
            cur=next;
            if(next!=null){
                next=next.next;
            }
            cur.next=prev;
        }
        head=cur;
    }
    //reversing inplace when given range
    public void reverseInRange(int left,int right){
        Node cur=head;
        Node prev=null;
        for(int i=0;i<left-1;i++){
           prev=cur;
           cur=cur.next;
        }
        Node beginNode=prev;
        Node endNode=cur;
        Node next=cur.next;
        while(left<=right){
            cur.next=prev;
            prev=cur;
            cur=next;
            if(next!=null){
                next=next.next;
            }
            left++;
        }
        if(beginNode==null){
            head=prev;
            endNode.next=cur;
            return ;
        }
        beginNode.next=prev;
        endNode.next=cur;
    }
    public void display(){
        //Do not disturb the original structure of linked list
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value + "-> ");
            //After node gets printed move to next node
            temp=temp.next;
        }
        System.out.println("End");
        System.out.println(size);
    }
}
