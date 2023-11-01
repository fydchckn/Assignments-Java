import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        
    	
    	//Creating an ArrayList
    	ArrayList<String> studentList = new ArrayList<String>();
    	
    	//Creating a list of students
    	studentList.add("Kent Bryan Famulagan");
    	studentList.add("Julimar Cobacha");
    	studentList.add("Alexis Pantinople");
    	studentList.add("Jose June Geonzon");
    	studentList.add("Anthony Amorio");
    	studentList.add("Lander Villaruz");
    	studentList.add("Marfe Perlas");
    	
    	//Creating a random class
    	Random rd = new Random();
    	
    	//Creating a loop with random index
    	for(int i=6; i<studentList.size(); i++ ) 
    	{
    		int index = rd.nextInt(studentList.size());
    		
    		System.out.println("The random name are: "+studentList.get(index));    		
    	}
    	
    	
    }
}
