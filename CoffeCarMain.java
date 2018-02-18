
public class CoffeCarMain {

	public static void main(String[] args) {
		
		CoffeCar espresso = new CoffeCar();
		
		espresso.getSortOfCoffe("Mix");
		espresso.getName("Espresso");
		espresso.getRegion("Ergacefe");
		espresso.getTaste("Taste of barries and caramel");
		espresso.getWeight(120);
		espresso.totalWeight = 400;
		
		System.out.println(espresso.toString());
		espresso.printStaticSum();
		espresso.printSum();
		
		CoffeCar kenia = new CoffeCar("Niery", "Kenia", "Nacuru", "Chocolate");
	    kenia.totalWeight = 400;
        
	    System.out.println(kenia.toString());
		espresso.printStaticSum();
		espresso.printSum();
		
		CoffeCar sunrise = new CoffeCar("Mundo Novo", "Sunrise", "Serrado", "Taste of peanut, hazelnut and milk chocolate", 200, 376);
	
		System.out.println(sunrise.toString());
		espresso.printStaticSum();
		espresso.printSum();
	}

}
