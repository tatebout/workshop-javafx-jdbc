package application;

import java.util.ArrayList;
import java.util.List;

public class Program {
	
	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.00));
		list.add(new Product("HD Case", 80.90));
	
		list.sort((p1, p2) -> p1.getPrice().compareTo(p2.getPrice()));
		
		list.forEach(System.out::println);
	}
}