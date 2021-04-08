package Toys;

public class Cubes extends Toy {

    public Cubes(String name, double size, double weight, double cost, int ageLimit) {
        this.name = name;
        this.size = size;
        this.weight = weight;
        this.cost = cost;
        this.ageLimit = ageLimit;
    }

    public static class CubesBuilder extends Builder {

        public Cubes build() {
            return new Cubes(name, size, weight, cost, ageLimit);
        }
    }
}
