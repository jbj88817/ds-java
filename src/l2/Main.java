package l2;

public class Main {
    public static void main(String[] args) {
        Array<Integer> arr = new Array<>(5);
        for (int i = 0; i < 10; i++) {
            arr.addLast(i);
        }
        System.out.println(arr);
        arr.add(1,100);
        System.out.println(arr);
        arr.addFirst(-1);
        System.out.println(arr);
        int remove = arr.remove(11);
        System.out.println(arr);
        System.out.println(remove);
        arr.removeElement(100);
        System.out.println(arr);
        arr.addFirst(-1);
        arr.addLast(-1);
        System.out.println(arr);
        arr.removeAllElement(-1);
        System.out.println(arr);
        arr.removeFirst();
        arr.removeFirst();
        arr.removeFirst();
        arr.removeFirst();
        arr.removeFirst();
        System.out.println(arr);
    }
}
