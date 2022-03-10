package capgemini.day9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numlist = new ArrayList<Integer>();
		numlist.add(10);
		numlist.add(30);
		numlist.add(50);
		numlist.add(60);
		numlist.add(70);
		
		//working of filter method
		List<Integer> filterlist = new ArrayList<Integer>();
		long c = numlist.stream().filter(n->n == 60).count();
		System.out.println(c);
		System.out.println("Filtered List: "+filterlist);
		
		//working of map method
		List<Integer> maplist = numlist.stream().map(a->a*2).collect(Collectors.toList());
		System.out.println("Map Demo: "+maplist);
		
		//returns the number of element in stream
		long c1 = numlist.stream().count();
		System.out.println(c1);
		

		System.out.println("max" +numlist.stream().min(Collections.reverseOrder()));
		
		System.out.println("min"+ numlist.stream().max(Collections.reverseOrder()));
		
		


		

	}

}
