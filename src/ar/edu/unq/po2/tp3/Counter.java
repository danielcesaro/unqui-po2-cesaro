package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Counter {
	List<Integer> counter = new ArrayList<Integer>();
	
	int getEvenOcurrences() {
		int n = 0;
		
		counter.forEach(e -> {
			if ((e % 2) == 0) {
				n++;
			});
		
		return n;
	}
}
