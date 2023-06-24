package demo;

public class Car {
	 
    String color;
 
    public Car(String carColor) {
        color = carColor;
    }
 
    public static void main(String[] args){
        Car myCar = new Car("pink");
        System.out.println(myCar);
    }
 
  public String toString(){
       return "This is a " + color + " car!";
   }
}
