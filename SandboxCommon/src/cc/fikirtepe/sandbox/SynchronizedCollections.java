package cc.fikirtepe.sandbox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedCollections {

	public static void main(String[] args) {
		
		List<String> list = Collections.synchronizedList(new ArrayList<String>());

	}	
}
