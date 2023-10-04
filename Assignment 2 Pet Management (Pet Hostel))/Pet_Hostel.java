import java.io.*;
import java.util.*;  


class Pet_Info{
	public static Map<Integer,String> pet_map = new HashMap<Integer,String>();  
	   
	void insert_pet_info(int room_id, String pet_name){
		pet_map.put(room_id, pet_name);
		System.out.println("Room "+room_id+" is booked for "+pet_name);
		System.out.println("Pet info is inserted");
	}
	
	void erase_pet_info(int room_id){
		System.out.println(pet_map.get(room_id)+" is released from room "+room_id);
		pet_map.remove(room_id);
		System.out.println("Pet info is erased");
	}
	
	void show_info(){
		for(Map.Entry m : pet_map.entrySet()){  
   			System.out.println(m.getKey()+" "+m.getValue());  
  		}  
	}
}


class Pet_Room extends Pet_Info{	
	public static int total_rooms = 60;
	public static int booked_rooms = 0;
	public static int available_rooms = total_rooms-booked_rooms;
		
	void available_rooms(){
		System.out.println("Available Rooms: "+available_rooms);
	}
	public static boolean check_available_room(int room_num){
		if(pet_map.containsKey(room_num)){
			System.out.println("Room "+room_num+" is not available");
			return false;
		}
		else{
			System.out.println("Room "+room_num+" is available");
			return true;
		}
	}
}

class Booking extends Pet_Room{
	void Book_Pet_Room(int num_of_rooms){
		if(available_rooms >= num_of_rooms){
			booked_rooms += num_of_rooms;
			available_rooms -= num_of_rooms;
		}
		else{
			System.out.println("Rooms are not available");
		}
	}
	void Release_Pet_Room(int num_of_rooms){
		if(booked_rooms >= num_of_rooms){
			booked_rooms -= num_of_rooms;
			available_rooms += num_of_rooms;
		}
		else{
			System.out.println("Can not release available rooms");
		}	
	}
} 


class Pet_Hostel extends Pet_Room{
	public static void main(String args[]){
		//Initializing classes
		Scanner inp = new Scanner(System.in);
		Pet_Room pr = new Pet_Room();
		Booking b = new Booking();
		Pet_Info pi = new Pet_Info();
		
		while(true){
			System.out.println("\nMenu: ");
			System.out.println("Press 1 to see all info.");
			System.out.println("Press 2 to Book Room");
			System.out.println("Press 3 to Release Room");
			System.out.println("Press 4 to Exit");
			
			int choice = inp.nextInt();
			
			if(choice == 1){
				System.out.println("\nTotal Rooms: "+pr.total_rooms);
				System.out.println("Booked Rooms: "+pr.booked_rooms);
				System.out.println("Available Rooms: "+pr.available_rooms);
				System.out.println("Room number and Corresponding Pet IDs: ");
				pi.show_info();
			}
			else if(choice == 2){
				System.out.print("\nEnter room number --- pet name to Book: ");
				Scanner inp1 = new Scanner(System.in);
				int room_id = inp1.nextInt();
				
				if(!check_available_room(room_id)) continue;
				
				String pet_name = inp1.nextLine();
				pi.insert_pet_info(room_id, pet_name);
				b.Book_Pet_Room(1);
			}
			else if(choice == 3){
				System.out.print("\nEnter room number to Release: ");
				int room_id = inp.nextInt();
				pi.erase_pet_info(room_id);
				b.Release_Pet_Room(1);
			}
			else if(choice == 4) break;
		}		
	}
}

