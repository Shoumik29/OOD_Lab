import java.io.*;


interface Workers {
	void workers_name();
	void workers_id();
}


interface Pet {
	void pet_id();
	void pet_type();
}


class Pet_Care implements Workers, Pet{	
	
	public void workers_name(){
		System.out.println("Set Worker Name");
	}
	
	public void workers_id(){
		System.out.println("Set Workers ID");
	}
	
	public void pet_id(){
		System.out.println("Pet ID");
	}
	
	public void pet_type(){
		System.out.println("Pet Type");
	}
}

class Multiple_inheritance{
	public static void main(String args[]){
		
		Pet_Care p1 = new Pet_Care();
		p1.pet_id();
		p1.pet_type();
		p1.workers_name();
		p1.workers_id();
		p1.pet_Doctor();
	}
}
