 interface Vehicle{
	 void parking();
	 void start();
}

class Car implements Vehicle{
	@Override
	public void parking(){
		System.out.println("Car Parking");
	}
	
	@Override
	public void start(){
		System.out.println("Car Starting");
	}
}

class Van implements Vehicle{
	@Override
	public void parking(){
		System.out.println("Van Parking");
	}
	
	@Override
	public void start(){
		System.out.println("Van Starting");
	}
}                                                           

class Demo{
	public static void main(String args[]){
		Vehicle[] vehicles = new Vehicle[2];
		vehicles[0] = new Car();
		vehicles[1] = new Van();
		
		for(Vehicle v : vehicles){
			v.parking();
			v.start();
		}
	}
}
