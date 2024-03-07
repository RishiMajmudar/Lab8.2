package org.example;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class MyStack<E> {
    private ArrayList<E> delegate;

    public MyStack() {
        this.delegate = new ArrayList<>();
    }

    public void push(E e) {
        delegate.add(e); // Replaced with delegate.add(e)
    }

    public E pop() {
        if (isEmpty()) throw new EmptyStackException();
        E e = delegate.get(delegate.size() - 1); // Replaced with delegate.get(...)
        delegate.remove(delegate.size() - 1); // Replaced with delegate.remove(...)
        return e;
    }

    public boolean isEmpty() {
        return delegate.isEmpty();
    }

    public int size() {
        return delegate.size();
    }

    public E get(int index) {
        return delegate.get(index);
    }
}

