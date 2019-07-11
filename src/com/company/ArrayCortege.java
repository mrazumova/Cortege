package com.company;

import java.util.*;

public class ArrayCortege<T extends Tuple & Comparable<T>> implements Iterable<T> {
    T value;
    T array[];

    public ArrayCortege(T[] ar) {
        this.array = ar;
    }

    public T maxTuple() {
        T m = this.array[0];
        for (T e: array)
        {
            m = (T) e.max(m);
        }
        return m;
    }

    public <N extends T> void setFirstCortege(N n) {
        array[0] = n;
        value = n;
    }

    public void modify(ArrayCortege<? super KjvCortegeD > c) {
        KjvCortegeD  b = new KjvCortegeD(3);
        c.setFirstCortege(b);
    }

    public int compareMaxTuple(ArrayCortege<? extends Tuple> aCort) {
        KjvCortegeD  b = new KjvCortegeD(3);

        T t = maxTuple();
        Tuple tu = aCort.maxTuple();
        if (t.less(tu)<0)
            return -1;
        else
            return 1;

    }

    @SuppressWarnings("unchecked")
    public T sum() {
        T s = (T)array[0].myClone();
        for (int i = 1; i < array.length; ++i)
            s = (T)s.plus(array[i]);
        return s;
    }

    public <N extends Tuple & Comparable<N>> int compareSumTuples(ArrayCortege<N> c) {
        T sum1 = sum();
        N sum2 = c.sum();
        if (sum1.less(sum2) < 0)
            return -1;
        else
            return 1;

    }

    public void setMinMaxTuples(ArrayCortege<T> c, Pair<? super Tuple> result) {
        if (c.maxTuple().less(maxTuple()) < 0) {
            result.setFirst(maxTuple());
            result.setSecond(maxTuple());
        }
        else {
            result.setFirst(c.maxTuple());
            result.setSecond(c.maxTuple());
        }
    }

    public ACIterator iterator() {
        return new ACIterator(this);
    }
    class ACIterator implements Iterator<T> {
        private ArrayCortege cort;
        private int index;
        public ACIterator(ArrayCortege c)
        {
            cort = c;
        }
        public boolean hasNext()
        {
            return (index < cort.array.length);
        }
        public void remove() {
            throw new UnsupportedOperationException();
        }
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T item = (T)cort.array[index];
            ++index;
            return item;
        }
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (T item : this)
            s.append(item + " ");
        return s.toString();
    }
}
