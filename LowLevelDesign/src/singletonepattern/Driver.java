package singletonepattern;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService executor = Executors.newFixedThreadPool(2);  
		executor.execute(()->TVset.getTVsetInstance());
		executor.execute(()->TVset.getTVsetInstance());

		

	}

}
