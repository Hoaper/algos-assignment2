import java.util.Scanner;

public class Main {
    public static void showcaseArrayList(){
        Scanner sc = new Scanner(System.in);
        MyArrayList myArrayListInt = new MyArrayList<Integer>();
        System.out.println("Велком! Начнем с MyArrayList<Integer>:");
        System.out.println("> Size: " + myArrayListInt.size());
        System.out.println("Давайте добавим элементов типа <Integer>:");
        System.out.println("Введите -1 чтобы остановить ввод");
        int nextInt;
        while(true) {
            nextInt = sc.nextInt();
            if (nextInt == -1) break;
            myArrayListInt.add(nextInt);
        }
        System.out.println("> Your array: " + myArrayListInt);
        System.out.println("> Size: " + myArrayListInt.size());

        System.out.println("Давайте добавим элемент на индекс. Введите элемент и индекс через пробел:");
        nextInt = sc.nextInt();
        int nextIndex = sc.nextInt();
        myArrayListInt.add(nextInt, nextIndex);

        System.out.println("Давайте удалим элемент с вашим индексом. Введите его:");
        nextIndex = sc.nextInt();
        myArrayListInt.remove(nextIndex);
        System.out.println("> Your array: " + myArrayListInt);

        System.out.println("А теперь удалим элемент не зная его индекса. Введите число для удаления:");
        nextInt = sc.nextInt();
        myArrayListInt.remove((Object) nextInt);
        System.out.println("> Your array: " + myArrayListInt);

        System.out.println("А теперь давайте узнаем, находится ли введенный вами элемент в массиве?");
        nextInt = sc.nextInt();
        System.out.println(myArrayListInt.contains(nextInt));

        System.out.println("А теперь давайте узнаем первый индекс вхождения введенного вами элемент в массиве");
        nextInt = sc.nextInt();
        System.out.println(myArrayListInt.indexOf(nextInt));

        System.out.println("А теперь давайте узнаем последний индекс вхождения введенного вами элемент в массиве");
        nextInt = sc.nextInt();
        System.out.println(myArrayListInt.lastIndexOf(nextInt));
    }

    public static void showCaseLinkedNode(){
        Scanner sc = new Scanner(System.in);
        MyLinkedList myLinkedList = new MyLinkedList<Integer>();
        System.out.println("Велком! Начнем с MyLinkedList<Integer>:");
        System.out.println("> Size: " + myLinkedList.size());
        System.out.println("Давайте добавим элементов типа <Integer>:");
        System.out.println("Введите -1 чтобы остановить ввод");
        int nextInt;
        while(true) {
            nextInt = sc.nextInt();
            if (nextInt == -1) break;
            myLinkedList.add(nextInt);
        }
        System.out.println("> Size: " + myLinkedList.size());

        System.out.println("Давайте добавим элемент на индекс. Введите элемент и индекс через пробел:");
        nextInt = sc.nextInt();
        int nextIndex = sc.nextInt();
        myLinkedList.add(nextInt, nextIndex);

        System.out.println("Давайте удалим элемент с вашим индексом. Введите его:");
        nextIndex = sc.nextInt();
        myLinkedList.remove(nextIndex);
        System.out.println("> Your array: " + myLinkedList);

        System.out.println("А теперь удалим элемент не зная его индекса. Введите число для удаления:");
        nextInt = sc.nextInt();
        myLinkedList.remove((Object) nextInt);
        System.out.println("> Your array: " + myLinkedList);

        System.out.println("А теперь давайте узнаем, находится ли введенный вами элемент в линкед ноде?");
        nextInt = sc.nextInt();
        System.out.println(myLinkedList.contains(nextInt));

        System.out.println("А теперь давайте узнаем первый индекс вхождения введенного вами элемент в линкед ноде");
        nextInt = sc.nextInt();
        System.out.println(myLinkedList.indexOf(nextInt));

        System.out.println("А теперь давайте узнаем последний индекс вхождения введенного вами элемент в линкед ноде");
        nextInt = sc.nextInt();
        System.out.println(myLinkedList.lastIndexOf(nextInt));
    }


    public static void main(String[] args) {
        showcaseArrayList();
        showCaseLinkedNode();

    }
}