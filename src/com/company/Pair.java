package com.company;

public class Pair<T extends Object>{
    private T first;
    private T second;

    public Pair() {
        first = null;
        second = null;
    }
    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }
    public Pair(Pair<T> p){
        this.first = p.first;
        this.second = p.second;
    }

    public T getFirst() {
        return first;
    }
    public T getSecond() {
        return second;
    }

    public void setFirst(T newValue) {
        first = newValue;
    }
    public void setSecond(T newValue) {
        second = newValue;
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }
}
