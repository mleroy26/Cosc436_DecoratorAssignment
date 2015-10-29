package decorator_assignment;

public class Item {
	private String description;
	private String price;
	
	
	public Item(String description, String price){
		this.description=description;
		this.price=price;
		
	}
	public String getDescription(){
		return description;
	}
	public String getPrice(){
		return price;
	}
}
