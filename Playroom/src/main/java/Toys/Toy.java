package Toys;

abstract public class Toy {
	protected String name;
	protected Double size;
	protected Double weight;
	protected Double cost;
	protected int ageLimit;
	
	public String getName() {
		return name;
	}
	
	public Double getSize() {
		return size;
	}
	
	public Double getWeight() {
		return weight;
	}
	
	public Double getCost()	{
		return cost;
	}
	
	public Integer getAgeLimit() {
		return ageLimit;
	}

	abstract public static class Builder {
		protected String name;
		protected Double size;
		protected Double weight;
		protected Double cost;
		protected int ageLimit;

		public Builder setName(String name) {
			this.name = name;

			return this;
		}

		public Builder setSize(double size) {
			this.size = size;

			return this;
		}

		public Builder setWeight(double weight) {
			this.weight = weight;

			return this;
		}

		public Builder setCost(double cost) {
			this.cost = cost;

			return this;
		}

		public Builder setAgeLimit(int ageLimit) {
			this.ageLimit = ageLimit;

			return this;
		}
	}

	@Override
	public String toString() {
		return "Name: " + name + "; " + "size: " + size.toString() + "; " + "weight: " + weight.toString()
				+ "; " + "cost: " + cost.toString() + "; " + "age limit: " + ageLimit;
	}
}
