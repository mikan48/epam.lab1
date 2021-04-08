package Toys;

public class Ball extends Toy {

    public Ball(String name, double size, double weight, double cost, int ageLimit) {
        this.name = name;
        this.size = size;
        this.weight = weight;
        this.cost = cost;
        this.ageLimit = ageLimit;
    }

    public static class BallBuilder extends Builder {
        public Ball build() {
            return new Ball(name, size, weight, cost, ageLimit);
        }
    }
}
