package com.myprep;
import java.io.*;
import java.util.*;
import java.util.regex.*;

class Student{
	private String name;
	private String collegeName;
	private float perentage;
	private float scholarship;
	public Student(String name, String collegeName, float perentage) {
		this.name = name;
		this.collegeName = collegeName;
		this.perentage = perentage;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", collegeName=" + collegeName + ", perentage=" + perentage + ", scholarship="
				+ scholarship + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public float getPerentage() {
		return perentage;
	}
	public void setPerentage(float perentage) {
		this.perentage = perentage;
	}
	public float getScholarship() {
		return scholarship;
	}
	public void setScholarship(float scholarship) {
		this.scholarship = scholarship;
	}
	
}
	class Portal{
		ArrayList<Students> studentList = new ArrayList<Students>();
		public void assignscholarship() {
			for(int i=0;i<studentList.size();i++) {
				if(studentList.get(i).getPerentage()>=91) {
					studentList.get(i).setScholarship(10000);
				}
				else if(studentList.get(i).getPerentage()>=81) {
					studentList.get(i).setScholarship(5000);
				}
				else if(studentList.get(i).getPerentage()<81) {
					studentList.get(i).setScholarship(0);
				}
			}
		}
		public String totalMaxScholarshipOfCollege() {
			String clgname = "";
			float max = studentList.get(0).getScholarship();
			for(int i =0;i<studentList.size();i++) {
				if(studentList.get(i).getScholarship()>max) {
					max = studentList.get(i).getScholarship();
					clgname = studentList.get(i).getCollegeName();
				}
			}
			return clgname;
		}
		public float totalScholarship() {
			float total = 0.0f;
			for(int i=0;i<studentList.size();i++) {
				total = total+studentList.get(i).getScholarship();
			}
			return total;
		}
	}
	
public class MyArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Portal obj = new Portal();
		obj.studentList.add(new Students());
		obj.studentList.add(new Students("Bob","NIT",94));
		obj.studentList.add(new Students("Alice","Abcd",59));
		System.out.println(obj.studentList);
		obj.assignscholarship();
		System.out.println(obj.totalScholarship());
		System.out.println(obj.totalMaxScholarshipOfCollege());
		for(int i =0;i<obj.studentList.size();i++) {
			System.out.println(obj.studentList.get(i));
		}
		
	}

}


