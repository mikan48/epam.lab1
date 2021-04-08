package ToysLists;

import java.util.ArrayList;

import Toys.*;

public class ToysBox {

	public ArrayList<Toy> createList() {
		Doll.DollBuilder dollBuilder = new Doll.DollBuilder();
		Ball.BallBuilder ballBuilder = new Ball.BallBuilder();
		Car.CarBuilder carBuilder = new Car.CarBuilder();
		Cubes.CubesBuilder cubesBuilder = new Cubes.CubesBuilder();

		ArrayList<Toy> Toys = new ArrayList<Toy>();

		dollBuilder.setSex("Female").setName("Barbie").setSize(20).setWeight(0.3).setCost(20).setAgeLimit(3);
		Toys.add(dollBuilder.build());

		dollBuilder.setName("Baby Doll").setSize(20).setWeight(0.7).setCost(35).setAgeLimit(3);
		Toys.add(dollBuilder.build());

		ballBuilder.setName("Soccer ball").setSize(20).setWeight(0.4).setCost(60).setAgeLimit(6);
		Toys.add(ballBuilder.build());

		ballBuilder.setName("Rubber ball").setSize(15).setWeight(0.2).setCost(15).setAgeLimit(3);
		Toys.add(ballBuilder.build());

		ballBuilder.setName("Bouncy ball").setSize(7).setWeight(0.02).setCost(11).setAgeLimit(6);
		Toys.add(ballBuilder.build());

		carBuilder.isRideable(false).hasRadioControl(true).setColor("Green").setName("Tractor").setSize(40)
				.setWeight(0.4).setCost(55).setAgeLimit(6);
		Toys.add(carBuilder.build());

		carBuilder.isRideable(false).hasRadioControl(false).setColor("Blue").setName("Racing car")
				.setSize(25).setWeight(0.3).setCost(25).setAgeLimit(3);
		Toys.add(carBuilder.build());

		carBuilder.isRideable(false).hasRadioControl(false).setColor("Red").setName("Truck")
			.setSize(15).setWeight(0.1).setCost(10).setAgeLimit(3);
		Toys.add(carBuilder.build());

		cubesBuilder.setName("Cubes with numbers").setSize(10).setWeight(0.1).setCost(3).setAgeLimit(3);
		Toys.add(cubesBuilder.build());

		cubesBuilder.setName("Cubes with different shapes").setSize(15).setWeight(0.15).setCost(5).setAgeLimit(3);
		Toys.add(cubesBuilder.build());

		cubesBuilder.setName("Cubes with different colors").setSize(7).setWeight(0.1).setCost(2.5).setAgeLimit(3);
		Toys.add(cubesBuilder.build());

		return Toys;
	}
}
