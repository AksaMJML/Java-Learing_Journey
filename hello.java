import java.util.*;

interface Vehicle{
	void accelarate();
	void accelarate(int speed);
}  
class Car implements Vehicle{
	public void accelarate(){
		System.out.println("Car accelarated ");
	}
	
	public void accelarate(int speed){
		System.out.println("Car accelarated " + speed);
	}
	
}

class Bus implements Vehicle{
	public void accelarate(){
		System.out.println("Bus accelarated ");
	}
	public void accelarate(int speed){
		System.out.println("Bus accelarated " + speed);
	}
}

class Van implements Vehicle{
	public void accelarate(){
		System.out.println("Van accelarated ");
	}
	public void accelarate(int speed){
		System.out.println("Van accelarated " + speed);
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
			v1.accelarate(100);	
		}	
	}
}
