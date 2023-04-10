public class MyLinkedList<E> implements MyList{

    private class Node<E> {
        E val;
        Node previous;
        Node next;
        public Node(E v) {
            val = v;
            previous = null;
            next = null;
        }
    }

    private Node<E> head;

    private Node<E> tail;
    private int size;

    MyLinkedList() {
        size = 0;
    }
    /**
     * @function size возвращает длину LinkedList
     * @noparams
     * @return int
     * **/
    @Override
    public int size() {
        return this.size;
    }
    /**
     * @function contains true если Object o в LinkedList
     * @param o объект поиска
     * @return boolean
     * **/
    @Override
    public boolean contains(Object o) {
        Node<E> nextNode = this.head;
        while (!nextNode.equals(null)) {
            if (this.head.val.equals(o)) return true;
            nextNode = nextNode.next;
        } return false;
    }
    /**
     * @function add добавляет объект в LinkedList
     * @param item объект для добавления
     * @return void
     * **/
    @Override
    public void add(Object item) {
        Node<E> node = new Node<>((E) item);
        if (size == 0) {
            this.head = node;
        } else {
            node.previous = this.tail;
            this.tail.next = node;
        }
        this.tail = node;
        size++;
    }
    /**
     * @function add добавляет объект на определенный индекс
     * @param item объект для добавления
     * @param index индекс куда нужно добавить item
     * @return void
     * **/
    @Override
    public void add(Object item, int index) {
        Node oldNode = getNodeByIndex(index);
        Node node = new Node<E>((E) item);
        if (this.head.equals(oldNode)) {
            node.next = this.head;
            this.head.previous = node;
            this.head = node;
        } else if (this.tail.equals(oldNode)){
            node.next = this.tail;
            node.previous = this.tail.previous;
            this.tail.previous.next = node;
            this.tail.previous = node;
        } else {
            node.previous = oldNode.previous;
            node.next = oldNode;
            oldNode.previous.next = node;
            oldNode.previous = node;
        }
        size++;
    }

    @Override
    public boolean remove(Object item) {
        return false;
    }
    /**
     * @function remove удаляет объект из LinkedList
     * @param index индекст элемента для удаления
     * @return Object
     * **/
    @Override
    public Object remove(int index) {
        checkIndex(index);
        Node node = getNodeByIndex(index);

        if (node.previous == null) {
            this.head = node.next;
            this.head.previous = null;
        }
        else if (node.next == null) {
            this.tail = node.previous;
            this.tail.next = null;
        }
        else {
            node.previous.next = node.next;
            node.next.previous = node.previous;
        }

        this.size--;
        return node.val;

    }
    /**
     * @function clear очищает LinkedList
     * @noparam
     * @return void
     * **/
    @Override
    public void clear() {
        this.head = null;
        this.tail = null;
        size = 0;
    }
    /**
     * @function get возвращает объект из LinkedList под его индексом
     * @param index индекс объекта
     * @return E
     * **/
    @Override
    public Object get(int index) {
        checkIndex(index);
        return getNodeByIndex(index).val;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public void sort() {

    }
    private Node getNodeByIndex(int index) {
        checkIndex(index);
        Node toSearch;
        toSearch = this.head;
        while (index != 0) {
            toSearch = toSearch.next;
            index--;
        }
        return toSearch;
    }
    private void checkIndex(int index){
        if(index < 0 || index>=size){
            throw new IndexOutOfBoundsException();
        }
    }
}
