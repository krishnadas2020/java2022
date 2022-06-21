package array;

import java.util.ArrayList;
import java.util.Collections;

public class UniqueValues {

	public static void main(String[] args) {
		Integer[] values = { 1, 2, 3, 3, 4, 2, 5, 4, 6, 7, 8, 9};
		ArrayList<Integer> nonRep = new ArrayList<>();

		Collections.addAll(nonRep, values);

		for (int i = 0; i < nonRep.size(); i++) {
			for (int j = i + 1; j < nonRep.size(); j++) {
				if (nonRep.get(i) == nonRep.get(j)) {

					nonRep.remove(j);
					nonRep.remove(i);

				}
			}

		}
		System.out.print(nonRep);

	}

}
