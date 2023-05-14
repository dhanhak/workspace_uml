package p05;

import java.util.List;

public class Cart {
	private List<Item> items;

	public Cart(List<Item> items) {
		super();
		this.items = items;
	}

	public Cart() {
		super();
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public void addItem(Item item) {
		this.items.add(item);
	}

}
