
public class Order {	
	private final Pizza pizza;
	private final String topping;
	private final String crust;
	private final String rice;
	private final String paratha;
	private Order(Builder builder) {
		this.paratha = builder.paratha;
		this.topping = builder.topping;
		this.crust = builder.crust;
		this.rice = builder.rice;
		this.pizza = builder.pizza;
	}
	
	@Override
	public String toString() {
		return "Order [pizza=" + pizza + ", topping=" + topping + ", crust=" + crust + ", rice=" + rice + ", paratha="
				+ paratha + "]";
	}
	public Pizza getPizza() {
		return pizza;
	}	
	public String getTopping() {
		return topping;
	}	
	public String getCrust() {
		return crust;
	}	
	public String getRice() {
		return rice;
	}	
	public String getParatha() {
		return paratha;
	}
	public static class Builder {
		private Pizza pizza;
		private String topping;
		private String crust;
		private String rice;
		private String paratha;
		public Order build(){
			return new Order(this);
		}
		public Builder pizza(Pizza descr) {
			this.pizza = descr;
			return this;
		}
		public Builder paratha(String descr) {
			this.paratha = descr;
			return this;
		}
		public Builder rice(String descr) {
			this.rice = descr;
			return this;
		}
		public Builder topping(String descr) {
			this.rice = descr;
			return this;
		}
	}
}


