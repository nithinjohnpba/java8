
package in.co.java8.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import in.co.java8.comparator.dto.Laptop;

/**
 * Hello world!
 */
public class App {

	public static void main(String[] args) {

		List<Laptop> laptops = new ArrayList<Laptop>();
		laptops.add(new Laptop("dell", 2, 53000));
		laptops.add(new Laptop("asus", 4, 33000));
		laptops.add(new Laptop("hp", 8, 73000));
		

		Comparator<Laptop> com = new Comparator<Laptop>() {

			public int compare(Laptop o1, Laptop o2) {

				if (o1.getRam() > o2.getRam())
					return 1;
				else if (o1.getRam() < o2.getRam())
					return -1;
				// TODO Auto-generated method stub
				return 0;
			}
		};

		Collections.sort(laptops,com);
		Iterator<Laptop> itr = laptops.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next().toString());
		}
	}
}
