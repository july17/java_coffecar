
public class CoffeCar {
	
	private String sort;
	private String name;
	private String taste;
	private String region;
	private int weight;
	
	public static int totalWeight; 
	
	//Constructors
    
    public CoffeCar() {}
    
    public CoffeCar (String sort, String name, String taste, String region  ) {
    	this.sort = sort;
    	this.name = name;
    	this.taste = taste;
    	this.region = region;
    }
    
   public CoffeCar (String sort, String name, String taste, String region, int weight, int totalWeight) {
	   this.sort = sort;
   	   this.name = name;
   	   this.taste = taste;
   	   this.region = region;
   	   this.weight = weight;
   	   this.totalWeight = totalWeight;
   }
   
   //Access methods
   
   public void getSortOfCoffe(String sort) {
	   this.sort = sort;
   }
   
   public void  getName(String name) {
	   this.name = name;
   }
   
   public void getTaste(String taste) {
	   this.taste = taste;
   }
   
   public void getRegion(String region) {
	   this.region = region;
   }
   
   public void getWeight(int weight) {
	   this.weight = weight;
   } 
   
   public String toString () {
	   return  "Sort of coffe.: " + this.sort 
			   + "\nName.: " + this.name
			   + "\nThe taste of coffe.: " + this.taste
			   + "\nRegion.: " + this.region
			   + "\nWeight of coffe.: " + this.weight
			   + "\nTotal weihgt.: " + this.totalWeight;
	}
   
   public static void printStaticSum() {
	   System.out.println("totalWeight.: " + totalWeight + "\n");
   }
   
   public void printSum() {
	   System.out.println("totalWeight.: " + totalWeight + "\n");
   }
   
   public void resetValues(String sort, String name, String taste, String region, int weight, int totalWeight) {
	   this.sort = sort;
   	   this.name = name;
   	   this.taste = taste;
   	   this.region = region;
   	   this.weight = weight;
   	   this.totalWeight = totalWeight;
   }
}		  
   
