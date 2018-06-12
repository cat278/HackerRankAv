
public class Car {
	int max_speed = 100;
	int min_speed = 0;
	double weight = 4079;
	boolean isTheCarOn = false ;
	char condition = 'A' ;
	String nameOfCar = "Temptations";
	
	public void printVariables() {
		System.out.println(max_speed);
		System.out.println(min_speed);
		System.out.println(weight);
		System.out.println(isTheCarOn);
		System.out.println(condition);
		System.out.println(nameOfCar );
	}
	
	public void wreckCar() {
		condition = 'C';
		isTheCarOn = true;
	}
   
	public void upGrade() {
		min_speed=max_speed;
		max_speed= max_speed +1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Car familyCar = new Car();
 familyCar.printVariables();
 
 Car aliceCar = familyCar ;
 familyCar.wreckCar(); 
 System.out.println("Alice's Car ");
 aliceCar.printVariables();
 familyCar.upGrade();
 familyCar.printVariables();
	}
	

}
