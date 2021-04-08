package Toys;

public class Doll extends Toy
{
	private final String sex;

	public String getSex()
	{
		return sex;
	}

	public Doll(String name, double size, double weight, double cost, int ageLimit, String sex) {
		this.name = name;
		this.size = size;
		this.weight = weight;
		this.cost = cost;
		this.ageLimit = ageLimit;
		this.sex = sex;
	}

	public static class DollBuilder extends Builder {
		private String sex;

		public DollBuilder setSex(String sex) {
			this.sex = sex;

			return this;
		}

		public Doll build() {
			return new Doll(name, size, weight, cost, ageLimit, sex);
		}
	}

	@Override
	public String toString() {
		return super.toString() + "; " + "sex: " + sex;
	}
}
