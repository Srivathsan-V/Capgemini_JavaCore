package com.myprep;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.*;
public class Students {

	public static void main(String[] args) {
	String[] listOfString = {"jeva","jaho","die"};
		// TODO Auto-generated method stub
		List<String> listOfStringStartsWithJ = listOfString.Stream().filter( s -> s.startsWith("J")).collect(Collectors.toList());

		

	}

}
