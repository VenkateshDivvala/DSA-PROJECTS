package Linked_List;

public class Main {
    public static void main(String[] args) {
        // SingleLinkedList list=new SingleLinkedList();
        // list.insertAtFirst(4);
        // list.insertAtFirst(4);
        // list.insertAtFirst(3);
        // list.insertAtFirst(2);
        // list.insertAtFirst(1);
        // list.insertAtFirst(1);
        // list.insertAtFirst(1);
        // list.display();
        // list.duplicates();
        // list.display();
        // list.insert(4, 0);
        // list.display();
        // list.deleteAtFirst();
        // list.display();
        // list.deleteAtLast();
        // list.display();
        // list.delete(0);
        // list.display();
        // System.out.println(list.find(1));
        // DoubleLinkedList list1=new DoubleLinkedList();
        // list1.insert(8,0);
        // list1.insert(3,1);
        // list1.insert(7,2);
        // list1.insert(5,3);
        // list1.delete(2);
        // list1.display();
        // SingleLinkedList list1=new SingleLinkedList();
        // SingleLinkedList list2=new SingleLinkedList();
        // list1.insertAtLast(1);
        // list1.insertAtLast(2);
        // list1.insertAtLast(4);
        // list1.insertAtLast(8);
        // list2.insertAtLast(1);
        // list2.insertAtLast(3);
        // list2.insertAtLast(4);
        // list1.display();
        // list2.display();
        // SingleLinkedList dummy=SingleLinkedList.mergeLists(list1, list2);
        // dummy.display();
        SingleLinkedList list1=new SingleLinkedList();
        list1.insertAtLast(1);
        list1.insertAtLast(2);
        list1.insertAtLast(3);
        list1.insertAtLast(4);
        list1.insertAtLast(5);
        list1.insertAtLast(6);
        list1.insertAtLast(7);
        list1.insertAtLast(8);
        list1.display();
        list1.reverseInRange(4,8);
        list1.display();
    }
}
