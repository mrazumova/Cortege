package com.company;

public class Cortege implements Tuple, Comparable<Cortege> {
    int a;

    public Cortege(int a) {
        this.a = a;
    }

    public void testInstanceof() {
        Pair<Integer> p = new Pair<>(2, 3);

        if (IsInstanceOfPairString(p))
            System.out.println("true");
        else
            System.out.println("false");

    }

    <T> boolean IsInstanceOfPairString(T a) {
        if (a instanceof Pair<?>)
            return true;
        else
            return false;
    }

    @Override
    public Cortege clone() {
        return new Cortege(a);
    }
    @Override
    public Cortege plus(Tuple o) {
        Cortege cor = new Cortege(a + o.value());
        return cor;
    }
    @Override
    public Cortege max(Tuple o) {
        if (compareTo((Cortege) o) > 0)
            return this;
        else
            return (Cortege) o;
    }
    @Override
    public int less(Tuple o) {
        return a - o.value();
    }
    @Override
    public int value() {
        return a;
    }
    @Override
    public Cortege myClone() {
        return new Cortege(a);
    }

    @Override
    public int compareTo(Cortege o) {
        return a - o.a;
    }
    @Override
    public String toString() {
        return "[" + a + "]";
    }
}

class KjvCortegeD implements Tuple, Comparable<KjvCortegeD> {
    protected int a;

    public KjvCortegeD(int a) {
        this.a = a;
    }

    @Override
    public KjvCortegeD max (Tuple o) {
        if (compareTo((KjvCortegeD)o) > 0)
            return this;
        else
            return (KjvCortegeD)o;
    }
    @Override
    public KjvCortegeD plus(Tuple o) {
        KjvCortegeD c = new KjvCortegeD(a + o.value());
        return c;
    }
    @Override
    public int value() {
        return a;
    }
    @Override
    public  int less(Tuple o) {
        return a - o.value();
    }
    @Override
    public KjvCortegeD  myClone() {
        return new KjvCortegeD(a);
    }
    @Override
    public KjvCortegeD clone() {
        return new KjvCortegeD(a);
    }

    @Override
    public int compareTo (KjvCortegeD o) {
        return a - o.a;
    }
    @Override
    public String toString() {
        return "["+a+"]";
    }
}

class KjvCortegeDD extends KjvCortegeD {
    private int b;

    public KjvCortegeDD(int a, int b) {
        super(a);
        this.b = b;
    }

    @Override
    public KjvCortegeDD max (Tuple o) {
        if (compareTo((KjvCortegeDD)o) > 0)
            return this;
        else
            return (KjvCortegeDD)o;
    }
    @Override
    public KjvCortegeDD plus(Tuple o) {
        KjvCortegeDD c = new KjvCortegeDD(a + ((KjvCortegeDD)o).a, b+o.value());
        return c;
    }
    @Override
    public int value() { return b; }
    @Override
    public  int less(Tuple o) {
        return b - o.value();
    }
    @Override
    public KjvCortegeDD myClone() {
        return new KjvCortegeDD(a,b);
    }
    @Override
    public KjvCortegeDD clone() {
        return new KjvCortegeDD(a,b);
    }

    @Override
    public int compareTo (KjvCortegeD o) {
        return b - ((KjvCortegeDD)o).b;
    }
    @Override
    public String toString() {
        return "["+b+"]";
    }

}
