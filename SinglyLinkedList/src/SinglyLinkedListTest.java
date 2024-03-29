import ds.SinglyLinkedList;

public class SinglyLinkedListTest {

    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
//        System.out.println(singlyLinkedList.empty());

//        singlyLinkedList.print();
        System.out.println(singlyLinkedList.size());
        singlyLinkedList.clear();
        singlyLinkedList.add(2);
        singlyLinkedList.add(3);
        singlyLinkedList.add(4);
        singlyLinkedList.print();
        System.out.println("Size: " + singlyLinkedList.size());
        System.out.println(singlyLinkedList.get(0));
        System.out.println(singlyLinkedList.get(1));
        singlyLinkedList.add(3, 5);
        singlyLinkedList.add(2, 10);
        singlyLinkedList.print();
        System.out.println(singlyLinkedList.get(3));
        System.out.println("Contains: " + singlyLinkedList.contains(105));
        singlyLinkedList.print();

        singlyLinkedList.remove(2);
        singlyLinkedList.remove(0);
        System.out.println("Size: " + singlyLinkedList.size());

        singlyLinkedList.remove(2);
        singlyLinkedList.print();
        System.out.println("Size: " + singlyLinkedList.size());

    }
}
