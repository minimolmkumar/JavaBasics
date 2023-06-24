package demo;
/**
 * 
 * Code to show return functionality
 */
public class Store1 {
	
		  // instance fields
		  String productType;
		  double price;
		  
		  // constructor method
		  public Store1(String product, double initialPrice) {
		    productType = product;
		    price = initialPrice;
		  }
		  public double getPriceWithTax(){
		    double totalPrice;
		    totalPrice = price + price * 0.08;
		    return totalPrice;
		  }
		  // increase price method
		  public void increasePrice(double priceToAdd){
		    double newPrice = price + priceToAdd;
		    price = newPrice;
		  }
		  
		  // get price with tax method

		  // main method
		  public static void main(String[] args){
			  Store1 lemonadeStand = new Store1("Lemonade", 3.75);
		   double lemonadePrice = lemonadeStand.getPriceWithTax();
		    System.out.println(lemonadePrice);

		  }
	
}
