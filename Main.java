
public class Main {

	public static void main(String[] args) {
		
		System.out.println("");
		
		Item item1 = new Item("Picanha", 59.99, 1);
		Item item2 = new Item("Coca Zero", 5.00, 2);
		Item item3 = new Item("Castanha", 8.90, 3);
		Item item4 = new Item("Queijo Coalho", 34.00, 4);
		
		Carrinho c = new Carrinho();
		c.adicionarItem(item1);
		c.adicionarItem(item2);
		c.adicionarItem(item3);
		c.adicionarItem(item4);
		
		c.removerItem(4);
		c.adicionarItem(item2);
		
		c.calcularPreco();
	}

}
