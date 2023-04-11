import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyLinkedList myLinkedListInt = new MyLinkedList<Integer>();
        MyLinkedList myLinkedListStr = new MyLinkedList<String>();
        MyArrayList myArrayListInt = new MyArrayList<Integer>();
        MyArrayList myArrayListStr = new MyArrayList<String>();
        System.out.println("Велком! Начнем с MyArrayList<Integer>:");
        System.out.println("Size: " + myArrayListInt.size());
        System.out.println("Давайте добавим элементов типа <Integer>:");
        System.out.println("Введите что то кроме числа чтобы остановить ввод");
        while(sc.hasNextInt()) myArrayListInt.add(sc.nextInt());
        System.out.println("Size: " + myArrayListInt.size());



    }
}