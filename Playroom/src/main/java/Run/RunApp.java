package Run;

import java.util.*;

import Filters.Filter;
import Sorts.SortByPrice;
import Toys.Toy;
import ToysLists.ToysBox;
import Filters.FilterByMainCriteria;

public class RunApp {
	private final static int SORT_ROOM = 1;
	private final static int FIND_TOY = 2;
	private final static int EXIT = 3;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ToysBox list = new ToysBox();

		ArrayList<Toy> Toys = list.createList();
		Collections.shuffle(Toys);
		ArrayList<Toy> Playroom = new ArrayList<>();

		System.out.println("Введите сумму денег, на которую необходимо собрать игрушки:");
		Double bank = scanner.nextDouble();

		for(Toy toy : Toys) {
			if (bank <= 0)
				break;
			if (bank >= toy.getCost()) {
				Playroom.add(toy);
				bank -= toy.getCost();
			}
		}

		if(Playroom.isEmpty()){
			System.out.println("Не удалось собрать комнату на выделенную сумму денег");
		} else {
			System.out.println("Комната, собранная на указанную сумму денег:");

			for(Toy toy : Playroom){
				System.out.println(toy);
			}
		}

		int option = 0;

		double minSize, maxSize,
				minWeight, maxWeight,
				minCost, maxCost;
		int minAgeLimit, maxAgeLimit;

		while (option != EXIT) {
			System.out.println("Выберите операцию:");
			System.out.println("1. Отсортировать комнату");
			System.out.println("2. Найти игрушку");
			System.out.println("3. Выйти");

			option = scanner.nextInt();

			switch (option) {
				case SORT_ROOM -> {
					System.out.println("Игрушки отсортированы в комнате по цене: ");
					Playroom.sort(new SortByPrice());
					for (Toy toy : Playroom) {
						System.out.println(toy);
					}
				}
				case FIND_TOY -> {
					System.out.println("Введите диапазон параметров:");
					System.out.println("Размер игрушки");

					System.out.println("От:");
					minSize = scanner.nextDouble();
					System.out.println("До:");
					maxSize = scanner.nextDouble();

					System.out.println("Вес игрушки");
					System.out.println("От:");
					minWeight = scanner.nextDouble();
					System.out.println("До:");
					maxWeight = scanner.nextDouble();

					System.out.println("Цена игрушки");
					System.out.println("От:");
					minCost = scanner.nextDouble();
					System.out.println("До:");
					maxCost = scanner.nextDouble();

					System.out.println("Ограничение по возрасту");
					System.out.println("От:");
					minAgeLimit = scanner.nextInt();
					System.out.println("До:");
					maxAgeLimit = scanner.nextInt();

					Filter filter = new FilterByMainCriteria(minSize, maxSize, minWeight, maxWeight, minCost, maxCost,
															minAgeLimit, maxAgeLimit);

					for (Toy toy : Playroom) {
						if(filter.check(toy)) {
							System.out.println(toy);
						}
					}
				}
				default -> {}
			}
		}
	}
}
