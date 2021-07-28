
public class Pizza {
	private String description;
	private int qty;
	
	@Override
	public String toString() {
		return "Pizza [description=" + description + ", qty=" + qty + "]";
	}
	public Pizza(String description, int qty) {
		super();
		this.description = description;
		this.qty = qty;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	

}
