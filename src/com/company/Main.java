package com.company;

public class Main {

    public static void main(String[] args) {
        Pair<Integer> p = new Pair<>(2,3);

        if (p instanceof Pair<?>)
            System.out.println("pair p = " + p);

        Cortege tpl = new Cortege(78);
        System.out.println(tpl.value());

        Cortege [] a = {new Cortege(1), new Cortege(2)};
        ArrayCortege<Cortege> aJv = new ArrayCortege<Cortege>(a);
        Cortege x = aJv.maxTuple();
        System.out.println("x = " + x);
        x.testInstanceof();

        KjvCortegeD [] b = {new KjvCortegeD(3), new KjvCortegeD(4)};
        ArrayCortege<KjvCortegeD> aJv2 = new ArrayCortege<KjvCortegeD>(b);

        if (aJv.compareMaxTuple(aJv2)==-1)
            System.out.println("aJv < aJv2");
        else
            System.out.println("aJv >= aJv2");


        System.out.println("toString(): " + aJv2.toString());
        Pair<Tuple> pair = new Pair(new Cortege(56),new Cortege(78));

        //aJv.setMinMaxTuples(aJv2, pair);
        System.out.println(pair.getFirst() + " " + pair.getSecond() );
        System.out.println("aJv.Sum()" + aJv.sum());
        System.out.println("aJv2.Sum()" + aJv2.sum());
        if ( aJv.compareSumTuples(aJv2)==-1 )
            System.out.println("sum aJv < sum aJv2");
        else
            System.out.println("sum aJv >= sum aJv2");

        if ( aJv2.compareSumTuples(aJv)==-1 )
            System.out.println("sum aJv > sum aJv2");
        else
            System.out.println("sum aJv <= sum aJv2");
        //------------------------------------------------------------
        KjvCortegeD  b1 = new KjvCortegeD(3);
        aJv2.setFirstCortege(b1);
        KjvCortegeDD  b11 = new KjvCortegeDD(3,4);
        aJv2.setFirstCortege(b11);

        Pair<Integer> aaa = new Pair<Integer>(2,3);
        Pair aao = aaa;
        Pair<String> ppp0 = (Pair<String>)aao;
        Pair<String> ppp = new Pair<String>("a","b");
        if (aaa.getClass() == ppp.getClass())
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }

    }
}
