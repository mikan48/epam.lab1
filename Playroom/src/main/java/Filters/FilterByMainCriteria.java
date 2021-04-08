package Filters;

import Toys.Toy;

public class FilterByMainCriteria implements Filter{
    private double minSize;
    private double maxSize;
    private double minWeight;
    private double maxWeight;
    private double minCost;
    private double maxCost;
    private int minAgeLimit;
    private int maxAgeLimit;

    public FilterByMainCriteria(double minSize, double maxSize, double minWeight, double maxWeight, double minCost,
                                double maxCost, int minAgeLimit, int maxAgeLimit) {
        this.minSize = minSize;
        this.maxSize = maxSize;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.minCost = minCost;
        this.maxCost = maxCost;
        this.minAgeLimit = minAgeLimit;
        this.maxAgeLimit = maxAgeLimit;
    }

    @Override
    public boolean check (Toy toy) {
        return toy.getSize() <= maxSize
                && toy.getSize() >= minSize
                && toy.getWeight() <= maxWeight
                && toy.getWeight() >= minWeight
                && toy.getCost() <= maxCost
                && toy.getCost() >= minCost
                && toy.getAgeLimit() <= maxAgeLimit
                && toy.getAgeLimit() >= minAgeLimit;
    }
}
