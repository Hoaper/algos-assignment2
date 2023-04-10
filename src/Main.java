public class Main {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList<Integer>();
        myLinkedList.add(123);
        myLinkedList.add(456);
        myLinkedList.add(789);
        myLinkedList.add(1, 1);
        System.out.println(myLinkedList);
    }
}