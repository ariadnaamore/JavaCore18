package homeworksetmin;

import java.util.HashSet;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Application {

	public static void main(String[] args) {
		
		
		Set<RandomClass> rc = new HashSet<RandomClass>();
		
		rc.add(new RandomClass ("SomeText1", 11));
		rc.add(new RandomClass ("SomeText2", 22));
		rc.add(new RandomClass ("SomeText3", 33));
		rc.add(new RandomClass ("SomeText4", 44));
		rc.add(new RandomClass ("SomeText5", 55));
		
		System.out.println("HashSet elements in the ramdom order: ");
		for (RandomClass rcItem : rc) {
			System.out.println(rcItem);


			Set<RandomClass> rc1 = new LinkedHashSet<RandomClass>();	
			rc1.add(new RandomClass ("SomeText1", 11));
			rc1.add(new RandomClass ("SomeText2", 22));
			rc1.add(new RandomClass ("SomeText3", 33));
			rc1.add(new RandomClass ("SomeText4", 44));
			rc1.add(new RandomClass ("SomeText5", 55));
			System.out.println();
			System.out.println("LinkedHashSet elements in order to adding : ");
			for (RandomClass rc1Item : rc1) {
				System.out.println(rc1Item);
			}
			
			
			Set<RandomClass> rc2 = new TreeSet<RandomClass>();
			rc2.add(new RandomClass ("SomeText1", 11));
			rc2.add(new RandomClass ("SomeText2", 22));
			rc2.add(new RandomClass ("SomeText3", 33));
			rc2.add(new RandomClass ("SomeText4", 44));
			rc2.add(new RandomClass ("SomeText5", 55));
			
			System.out.println();
			System.out.println("TreeSet elements in Comparable default order: ");
			for (RandomClass rc2Item : rc2) {
				System.out.println(rc2Item);
			}
			
			Set<RandomClass> rc3 = new TreeSet<RandomClass>();
			rc3.add(new RandomClass ("SomeText1", 11));
			rc3.add(new RandomClass ("SomeText2", 22));
			rc3.add(new RandomClass ("SomeText3", 33));
			rc3.add(new RandomClass ("SomeText4", 44));
			rc3.add(new RandomClass ("SomeText5", 55));
			
			System.out.println();
			System.out.println("TreeSet elements in Comparable set order: ");
			for (RandomClass rc3Item : rc3) {
				System.out.println(rc3Item);
			}
		}
	}
}
