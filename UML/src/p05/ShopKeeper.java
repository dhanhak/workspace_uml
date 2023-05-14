package p05;

public class ShopKeeper {
	private Cart cart;
	
	public int makeBillPaper(){
//		int sum = 0;
//		for(Item i : cart.getItems()) {
//			sum += i.getItemPrice();
//		}
		Item i = new Item();
		return i.getItemPrice();
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}
	
	public void calculate(Calculator calculator) {}
	
}
