package homeWorkMin;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;




	
     public class ListInteger {
    	 
    	 
    	 
    	 public static void main(String[] args) {
	
    	 List<Integer> intList = new ArrayList<Integer>(); 
    	 intList.add(1); 
    	 intList.add(2); 
    	 intList.add(100);
    	 System.out.println("Список " + intList); 
    	 //Список буде працювати
    	 
    	//intList.add("String 1");
    	
    	 //буде помилка компілятора, оскільки недозволений тип
    	 //данних намагаються додати до списку integer
    	 //Exception in thread "main" java.lang.Error: Unresolved compilation problem:  
    	    //Type mismatch: cannot convert from String to Integer 
    	
    	 
    	 

	
}
}