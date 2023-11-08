import java.io.*;
import java.util.*; 


interface Product{
	void showPrice();
}

class Warehouse implements Product{
	
	String name = "Book";
	int price = 1234;
	
	public void Warehouse(){	
		loadProducts();
	}
	
	public void showPrice(){
		System.out.println("Product name: "+name+", Price: "+price);
	}
	
	public void loadProducts(){
		System.out.println("Loading all the products...");
	} 
} 


class GlobalDistributor implements Product{
	
	private Warehouse warehouse;
	
	public void showPrice(){
		if(warehouse == null){
			warehouse =  new Warehouse();
		}
		warehouse.showPrice();
	}
}

class ProxyRetailStore{

	public static void main(String[] args){
		
		Product product = new GlobalDistributor();
		
		product.showPrice();
		
		System.out.println("After some time...");
		
		product.showPrice();
	}
}
