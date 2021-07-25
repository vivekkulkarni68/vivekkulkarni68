package schedular;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCollections {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Player> l = new ArrayList<Player>();
		l.add(new Player());
		l.add(new Player());
		l.add(new Player());
		int i = Collections.binarySearch(l, new Player());

	}

}
