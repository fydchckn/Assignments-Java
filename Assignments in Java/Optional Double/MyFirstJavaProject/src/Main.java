import java.util.Optional;

public class Main {
    public static void main(String[] args) {
       
    	Optional<Double> ov = Optional.of(55.5);      	
    	
    	
    	//Checking the value if present
    	
    	if(ov.isPresent()) {
    		Double value = ov.get();
    		System.out.println("The value is present "+value );
    	}
    	else {
    		System.out.println("No value is present");
    	}
    	
    	
    	//Checking the value if empty
    	Optional<Double> oe = Optional.empty();
    	
    	Double emptyvalue = oe.orElse(0.0);
    	System.out.println("Default Value is: "+emptyvalue);
    	
    	
    	
    	
    }
}
