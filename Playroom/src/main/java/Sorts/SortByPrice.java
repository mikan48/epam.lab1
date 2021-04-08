package Sorts;

import Toys.Toy;

import java.util.Comparator;

public class SortByPrice implements Comparator<Toy> {

    public int compare (Toy one, Toy two) {
        return one.getCost().compareTo(two.getCost());
    }
}
