import java.io.*;
import java.util.*; 


interface Components{
	void showPrice();
}

class LeafObjects implements Components{
	
	String name;
	int price;
	
	public LeafObjects(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	public void showPrice(){
		System.out.println(name + " : " + price);
	}
}

class CompositeObjects implements Components{
	
	String name;
	List<Components> components = new ArrayList<>();
	
	public CompositeObjects(String name){
		this.name = name;
	}
	
	public void addComponents(Components com){
		components.add(com);
	}
	
	public void showPrice(){
		System.out.println(name);
		for(Components cm: components){
			cm.showPrice();
		}
	}
}

class CompositeHousing{
	
	public static void main(String[] args){
		
		//Leaf Objects
		Components chair = new LeafObjects("Chair", 2000);
		Components table = new LeafObjects("Table", 10000);
		Components tv = new LeafObjects("TV", 20000);
		Components fan = new LeafObjects("Fan", 3000);
		Components light = new LeafObjects("Light", 200);
		Components bed = new LeafObjects("Bed", 12000);
		Components sofa = new LeafObjects("Sofa", 8000);
		
		
		//Composite Objects
		CompositeObjects livingRoom = new CompositeObjects("Living Room");
		CompositeObjects bedRoom = new CompositeObjects("Bed Room");
		CompositeObjects officeRoom = new CompositeObjects("Office Room");
		CompositeObjects house = new CompositeObjects("House");
 
	
		//Adding Leaf Objects
		livingRoom.addComponents(sofa);
		livingRoom.addComponents(tv);
		livingRoom.addComponents(light);
		livingRoom.addComponents(fan);
		livingRoom.addComponents(table);
		
		bedRoom.addComponents(bed);
		bedRoom.addComponents(light);
		bedRoom.addComponents(fan);
		
		officeRoom.addComponents(table);
		officeRoom.addComponents(chair);
		officeRoom.addComponents(light);
		officeRoom.addComponents(fan);
		
		
		//Adding Composite Objects
		house.addComponents(livingRoom);
		house.addComponents(bedRoom);
		house.addComponents(officeRoom);
		
		//Showing Prices
		house.showPrice();
	}
}
