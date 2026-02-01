import java.util.*;

class Vehicle{
	public void accelarate(){
		System.out.println("Vehicle accelarated");
	}
}  
class Car extends Vehicle{
	public void accelarate(){
		System.out.println("Car Accelerated");
	}
}

class Bus extends Vehicle{
	public void accelarate(){
		System.out.println("Bus Accelerated");
	}
}

class Van extends Vehicle{
	public void accelarate(){
		System.out.println("Van Accelerated");
	}
}

class Hello{
	public static void main(String args[]){
		List<Vehicle> vehicleList = new ArrayList<>();
		
		vehicleList.add(new Car());
		vehicleList.add(new Van());
		vehicleList.add(new Bus());
		for( Vehicle v1 : vehicleList){
			v1.accelarate();	
		}	
	}
}
