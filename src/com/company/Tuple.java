package com.company;

public interface Tuple {

    Tuple max(Tuple o);

    int less(Tuple o);

    Tuple plus(Tuple o);

    int value();

    Tuple myClone();
}
