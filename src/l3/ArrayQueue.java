package l3;

import l2.Array;

// dequeue is O(n)
public class ArrayQueue<E> implements Queue<E> {

    private Array<E> mArray;

    public ArrayQueue(int capacity) {
        mArray = new Array<>(capacity);
    }

    public ArrayQueue() {
        mArray = new Array<>();
    }

    public int getCapacity() {
        return mArray.getCapacity();
    }

    @Override
    public void enqueue(E e) {
        mArray.addLast(e);
    }

    @Override
    public E dequeue() {
        return mArray.removeFirst();
    }

    @Override
    public E getFront() {
        return mArray.getFirst();
    }

    @Override
    public int getSize() {
        return mArray.getSize();
    }

    @Override
    public boolean isEmpty() {
        return mArray.isEmpty();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Queue: ");
        sb.append("front [");
        for (int i = 0; i < mArray.getSize(); i++) {
            sb.append(mArray.get(i));
            if (i != mArray.getSize() - 1) {
                sb.append(", ");
            }
        }
        sb.append("] tail");
        return sb.toString();
    }

    public static void main(String[] args) {
        ArrayQueue<Integer> queue = new ArrayQueue<>();

        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
            System.out.println(queue);
            if (i % 3 == 2) {
                queue.dequeue();
                System.out.println(queue);
            }
        }
    }
}
