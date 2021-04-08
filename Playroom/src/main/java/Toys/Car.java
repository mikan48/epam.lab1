package Toys;

public class Car extends Toy {

	private final boolean rideable;
	private final boolean radioControl;

	private final String color;
	
	public boolean isRideable() 
	{
        return rideable;
    }
    
    public boolean hasRadioControl() 
	{
        return radioControl;
    }
	
	public String getColor()
	{
		return color;
	}

	public Car(String name, double size, double weight, double cost, int ageLimit, boolean rideable,
			   boolean radioControl, String color) {
		this.name = name;
		this.size = size;
		this.weight = weight;
		this.cost = cost;
		this.ageLimit = ageLimit;
		this.rideable = rideable;
		this.radioControl = radioControl;
		this.color = color;
	}

	public static class CarBuilder extends Builder {
		private boolean rideable;
		private boolean radioControl;
		private String color;

		public CarBuilder isRideable(boolean rideable) {
			this.rideable = rideable;

			return this;
		}

		public CarBuilder hasRadioControl(boolean radioControl) {
			this.radioControl = radioControl;

			return this;
		}

		public CarBuilder setColor(String color) {
			this.color = color;

			return this;
		}

		public Car build() {
			return new Car(name, size, weight, cost, ageLimit, rideable, radioControl, color);
		}
	}

	@Override
	public String toString() {
		return super.toString() + "; " + "is rideable: " + rideable + "; " + "has radio control" + radioControl
				+ "; " + "color:" + color;
	}
}
