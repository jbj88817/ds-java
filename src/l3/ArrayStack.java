package l3;

import l2.Array;

public class ArrayStack<E> implements Stack<E> {

    private Array<E> mArray;

    public ArrayStack(int capacity) {
        mArray = new Array<>(capacity);
    }

    public ArrayStack() {
        mArray = new Array<>();
    }

    public int getCapacity() {
        return mArray.getCapacity();
    }

    @Override
    public void push(E e) {
        mArray.addLast(e);
    }

    @Override
    public E pop() {
        return mArray.removeLast();
    }

    @Override
    public E peek() {
        return mArray.getLast();
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
        sb.append("Stack: ");
        sb.append("[");
        for (int i = 0; i < mArray.getSize(); i++) {
            sb.append(mArray.get(i));
            if (i != mArray.getSize() - 1) {
                sb.append(", ");
            }
        }
        sb.append("] top");
        return sb.toString();
    }
}
