import java.io.*;
import java.util.*; 


interface Purchase{
	public void makePurchase(Products product);
}

class Products{
	protected Purchase purchase;
	
	public Products(){
		purchase = null;
	}
	
	public void setPurchase(Purchase purchase){
		this.purchase = purchase;
	}
	
	public Purchase getPurchase(){
		return purchase;
	}
}

class Coke implements Purchase{
	public void makePurchase(Products product){
		System.out.println("Purchase Request for Coke");
		product.setPurchase(this);
	}
	
	public String toString(){
		return "Coke has been successfully purchased";
	}
}

class Pepsi implements Purchase{
	public void makePurchase(Products product){
		System.out.println("Purchase Request for Pepsi");
		product.setPurchase(this);
	}
	
	public String toString(){
		return "Pepsi has been successfully purchased";
	}
}

class StateVending{
	public static void main(String[] args){
		Products product = new Products();
		
		Coke coke = new Coke();
		coke.makePurchase(product);
		System.out.println(product.getPurchase().toString());
		
		Pepsi pepsi = new Pepsi();
		pepsi.makePurchase(product);
		System.out.println(product.getPurchase().toString());
	}
}
