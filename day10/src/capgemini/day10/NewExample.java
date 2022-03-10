package capgemini.day10;
import java.util.Scanner;

class Student{
	public String name;
	public int[] score;
	public String status;
	
	public Student(String name,int[] score) {
		this.name = name;
		this.score = score;
		this.status = status;
	}
}

class Validator{
	public String validateScore(Student s) {
		boolean flag = false;
		for(int i =0;i<s.score.length;i++){
			if(s.score[i]>=0&&s.score[i]<=100) {
				flag = true;
				s.status = "success";
			}
			
		}
		if(flag == true) {
			return "Valid";
			
		}
		return "Invalid";
		
	}
}
public class NewExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] sco = new int[] {50,40,30,20,10};
		Student s = new Student("Sri",sco);
		Validator v = new Validator();
		System.out.println(v.validateScore(s));
		System.out.println(s.status);

	}

}
