# Assignment2 Documentation

### MyArrayListQueue
### ➕ enqueue
**Description**: Adds an element to the back of the queue.
```java
public void enqueue(T element) {
    myArrayList.add(element);
}
``` 

### ➖ dequeue
**Description**: Remove elements from the front of the queue.
```java
public T dequeue() {
    return (T) myArrayList.remove(0);
}
``` 

### 🔍 peek
**Description**: Returns the element at the front of the queue without removing it.
```java
public T peek() throws NoSuchFieldException {
    isEmptyThrowException();
    return (T) myArrayList.get(0);
}
``` 

### 📈 size
**Description**: Returns the number of elements in the queue.
```java
public int size() {
    return myArrayList.size();
}
``` 

### 🚨 isEmptyThrowException
**Description**: Throws a NoSuchFieldException if the queue is empty.
```java
private void isEmptyThrowException() throws NoSuchFieldException {
    if (isEmpty()) {
        throw new NoSuchFieldException();
    }
}
``` 

### 🤔 isEmpty
**Description**: Returns true if the queue is empty, false otherwise.
```java
public boolean isEmpty() {
    return this.size() == 0;
}
``` 

### MyArrayListQueue
### ➕ enqueue
**Description**: Adds an element to the back of the queue.
```java
public void enqueue(T element) {
    myLinkedList.add(element);
}
``` 

### ➖ dequeue
**Description**: Remove elements from the front of the queue.
```java
public T dequeue() {
    return (T) myLinkedList.remove(0);
}
``` 

### 🔍 peek
**Description**: Returns the element at the front of the queue without removing it.
```java
public T peek() {
    isEmptyThrowException();
    return (T) myLinkedList.get(0);
}
``` 

### 📈 size
**Description**: Returns the number of elements in the queue.
```java
public int size() {
    return myLinkedList.size();
}
``` 

### 🚨 isEmptyThrowException
**Description**: Throws a NoSuchElementException if the queue is empty.
```java
private void isEmptyThrowException() {
    if (isEmpty()) {
        throw new NoSuchElementException();
    }
}
``` 

### 🤔 isEmpty
**Description**: Returns true if the queue is empty, false otherwise.
```java
public boolean isEmpty() {
    return this.size() == 0;
}
```

### MyLinkedListStack
### 🔝 push
**Description**: Adds an element to the top of the stack.
```java
public void push(T element) {
    myLinkedList.add(element, 0);
}
``` 

### 🔄 pop
**Description**: Removes and returns the element at the top of the stack.
```java
public T pop() {
    isEmptyThrowException();
    return (T) myLinkedList.remove(0);
}
``` 

### 👀 peek
**Description**: Returns the element at the top of the stack without removing it.
```java
public T peek() {
    isEmptyThrowException();
    return (T) myLinkedList.get(0);
}
``` 

### 📏 size
**Description**: Returns the number of elements in the stack.
```java
public int size() {
    return myLinkedList.size();
}
``` 

### ✅ isEmpty
**Description**: Returns true if the stack is empty, false otherwise.
```java
public boolean isEmpty() {
    return this.size() == 0;
}
``` 

### 🛑 isEmptyThrowException
**Description**: Throws an EmptyStackException if the stack is empty.
```java
private void isEmptyThrowException() {
    if (isEmpty()) {
        throw new EmptyStackException();
    }
}
```

### MyArrayListStack
### ➕ push
**Description**: Adds an element to the top of the stack.
```java
public void push(T element) {
    myArrayList.add(element, 0);
}
``` 

### ➖ pop
**Description**: Removes and returns the element at the top of the stack.
```java
public T pop() {
    isEmptyThrowException();
    return (T) myArrayList.remove(0);
}
``` 

### 👀 peek
**Description**: Returns the element at the top of the stack without removing it.
```java
public T peek() {
    isEmptyThrowException();
    return (T) myArrayList.get(0);
}
``` 

### 🔢 size
**Description**: Returns the number of elements in the stack.
```java
public int size() {
    return myArrayList.size();
}
``` 

### 📌 isEmptyThrowException
**Description**: Throws an EmptyStackException if the stack is empty.
```java
private void isEmptyThrowException() {
    if (isEmpty()) {
        throw new EmptyStackException();
    }
}
``` 

### 🚫 isEmpty
**Description**: Returns true if the stack is empty, false otherwise.
```java
public boolean isEmpty() {
    return this.size() == 0;
}
```

### myArrayList.java

### ➕ increaseBufferIfNeeded
**Description**: It creates a new array with twice the length of the current array, copies the elements of the old array to the new array, and replaces the old array with the new array.

```java
public void increaseBufferIfNeeded(){
    if(size == arr.length){
        T[] newArr = (T[]) new Object[arr.length*2];
        for(int i=0; i< arr.length; i++){
            newArr[i]=arr[i];
        }
        arr = newArr;
    }
}
```
### ➕ size
**Description**: This method returns the number of elements in the array.

```java
public int size() {
    return this.size;
}
```
### ➕ contains
**Description**: This method checks if the array contains the specified object. It returns true if the array contains the object and false otherwise.

```java
@Override
public boolean contains(Object o) {
    for(T element : arr) {
        if (o.equals(element)) return true;
    }
    return false;
}
```
### ➕ add
**Description**: This method adds an element to the end of the array. If the array is full, it calls the increaseBufferIfNeeded() method to increase the size of the array.

```java
@Override
public void add(Object item) {
    increaseBufferIfNeeded();
    arr[size++] = (T) item;
}
```
### ➕ add
**Description**: This method adds an element at a specified index in the array. If the array is full, it calls the increaseBufferIfNeeded() method to increase the size of the array. It shifts all the elements from the specified index to the end of the array one position to the right before inserting the new element.

```java
public void add(Object item, int index) {
    if (index < 0 || index > size) throw new IndexOutOfBoundsException();
    increaseBufferIfNeeded();
    for(int i = size; i>index; i--) {
        arr[i] = arr[i-1];
    }
    arr[index] = (T) item;
    size++;
}
```
### ➕ remove
**Description**: This method removes the element at the specified index from the array. It shifts all the elements from the specified index to the end of the array one position to the left after removing the element.

```java
@Override
public boolean remove(Object item) {
    int index = indexOf(item);
    if (index >= 0) {
        remove(index);
        return true;
    }
    return false;
}
```
### ➕ remove
**Description**: This method removes the element at the specified index from the array. It shifts all the elements from the specified index to the end of the array one position to the left after removing the element.

```java
@Override
public Object remove(int index) {
    checkIndex(index);
    T temporary = this.arr[index];
    for(int i= index + 1; i<=size; i++){
        arr[i-1] = arr[i];
    }
    this.size--;
    return temporary;
}
```
### ➕ clear
**Description**: This method clears the array by setting its size to 0 and creating a new array of length 5.

```java
@Override
public void clear(){
    this.arr = (T[]) new Object[5];
    this.size = 0;
}
```
### ➕ get
**Description**: This method returns the element at the specified index in the array.
```java
@Override
public Object get(int index) {
    checkIndex(index);
    return arr[index];
}
```
### ➕ indexOf
**Description**: This method returns the index of the first occurrence of the specified object in the array. If the object is not found, it returns -1.
```java
@Override
public int indexOf(Object o) {
    for (int i = 0; i < arr.length; i++) {
        if (arr[i].equals((T) o)) {
            return i;
        }
    }
    return -1;
}
```
### ➕ lastIndexOf
**Description**: This method returns the index of the last occurrence of the specified object in the array. If the object is not found, it returns -1.
```java
@Override
public int lastIndexOf(Object o) {
    int index = -1;
    for (int i = 0; i < arr.length; i++) if (arr[i].equals((T) o) && i > index) index = i;
    return index;
}
```

### ➕ sort
**Description**: This method sorts the elements of the array in ascending order using the bubble sort algorithm. It only works for arrays of Integer type.
```java
@Override
public void sort() {
    try{
        Integer.valueOf((int) this.get(0));
    } catch (ClassCastException e) {
        return;
    }
    for(int i = 0; i < size; i++) {
        for (int j = i; j < size; j++) {
            if ((int) arr[j] < (int) arr[i]) {
                T temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
}
```
### ➕ checkIndex
**Description**: This is a helper method that checks if the specified index is valid for the array. If the index is less than 0 or greater than or equal to the size of the array, it throws an IndexOutOfBoundsException.
```java
private void checkIndex(int index){
    if(index < 0 || index>=size){
        throw new IndexOutOfBoundsException();
    }
}
```

## MyLinkedList.java

### ➕ size
**Description**: This method returns the number of elements in the list.

```java
public int size() {
    return this.size;
}
```
### ➕ contains
**Description**: This function returns true if the given object is present in the linked list, otherwise false.
```java
public boolean contains(Object o) {
    return (indexOf(o) != -1 ? true : false);
}
```
### ➕ createNode
**Description**: This function creates a new node containing the given item and adds it to the linked list.
```java
private void createNode(E item) {
    Node<E> node = new Node<>(item);
    if (size == 0) {
        this.head = node;
    } else {
        node.previous = this.tail;
        this.tail.next = node;
    }
    this.tail = node;
}
```
### ➕ add
**Description**: This function adds a new element to the end of the linked list.
```java
@Override
public void add(Object item) {
    createNode((E) item);
    elements.add(item);
    size++;
}
```
### ➕ add
**Description**: This function is similar to add(Object item) but also allows the option to not save the item in a separate ArrayList.
```java
public void add(Object item, boolean notSave) {
    createNode((E) item);
    if (notSave) elements.add(item);
    size++;
}
```
### ➕ add
**Description**: This function adds a new element at the specified index of the linked list.
```java
@Override
public void add(Object item, int index) {
    if (index < 0 || index > size) throw new IndexOutOfBoundsException();
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
    elements.add(item);
    size++;
}
```
### ➕ remove
**Description**: This function removes the given object from the linked list, if it exists.
```java
@Override
public boolean remove(Object item) {
    int objIndex = indexOf(item);
    if (objIndex >= 0) {
        remove(objIndex);
        size--;
        elements.remove(item);
        return true;
    }
    return false;
}
```
### ➕ remove
**Description**:  This function removes the element at the given index from the linked list.
```java
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
    elements.remove(index);
    this.size--;
    return node.val;

}
```
### ➕ clear
**Description**: This function removes all elements from the linked list.
```java
@Override
public void clear() {
    this.head = null;
    this.tail = null;
    size = 0;
}
```
### ➕ get
**Description**: This function returns the element at the given index in the linked list.
```java
@Override
public Object get(int index) {
    checkIndex(index);
    return getNodeByIndex(index).val;
}
```
### ➕ indexOf
**Description**: This function returns the index of the first occurrence of the given object in the linked list, or -1 if not found.
```java
@Override
public int indexOf(Object o) {
    int i = 0;
    Node<E> nextNode = this.head;
    while (!nextNode.equals(null)) {
        if (this.head.val.equals(o)) return i;
        nextNode = nextNode.next;
        i++;
    }
    return -1;
}
```
### ➕ lastIndexOf
**Description**: This function returns the index of the first occurrence of the given object in the linked list, or -1 if not found.
```java
@Override
public int lastIndexOf(Object o) {
    int i = size()-1;
    Node<E> node = this.tail;
    while (i >= 0) {
        if (node.equals(o)) return i;
        node = this.tail.previous;
        i--;
    }
    return -1;
}
```

### ➕ sort
**Description**: This function sorts the elements of the linked list in ascending order using bubble sort (O(n^2)). Note: this function will only work if all the elements in the linked list are integers.
```java
@Override
public void sort() {
    try{
        Integer.valueOf((int) this.get(0));
    } catch (ClassCastException e) {
        return;
    }
    elements.sort();
    this.clear();
    for (int i = 0; i < elements.size(); i++) {
        this.add(elements.get(i), false);
    }

}
```
### ➕ checkIndex
**Description**: This is a helper method that checks if the specified index is valid for the array. If the index is less than 0 or greater than or equal to the size of the array, it throws an IndexOutOfBoundsException.
```java
private void checkIndex(int index){
    if(index < 0 || index>=size){
        throw new IndexOutOfBoundsException();
    }
}
```


