package capgemini.day9;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Comparator;

class Employee {
	public static int sum = 0;
	public static int avg = 0;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getiD() {
		return iD;
	}

	public void setiD(int iD) {
		this.iD = iD;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeM [name=" + name + ", iD=" + iD + ", salary=" + salary + "]";
	}

	Employee() {

	}

	public Employee(String name, int iD, int salary) {
		super();
		this.name = name;
		this.iD = iD;
		this.salary = salary;
	}

	private String name;
	private int iD;
	private int salary;
}

public class EmsCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		LinkedList<Employee> linkedlist = new LinkedList<Employee>();
		while (true) {

			System.out.println("Enter 1 for create a LinkedList of employee");
			System.out.println("Enter 2 for Display a LinkedList of employee");
			System.out.println("Enter 3 for search employee");
			System.out.println("Enter 4 for delete a employee");
			System.out.println("Enter 6 Sort the Employee ASC BY Name");
			System.out.println("Enter 7 Sort the Employee DESC By Name");
			System.out.println("Enter 8 Sort the Employee ASC BY Salary");
			System.out.println("Enter 9 Sort the Employee DESC By Salary");
			System.out.println("Enter 10 Minimun paid salary employee");
			System.out.println("Enter 11 maximum salry of employee");
			System.out.println("Enter 12 Avg of employee Salary");
			System.out.println("Enter 13 Sum of employee Salary");

			System.out.println("enter 5 for exit");
			int user = sc.nextInt();

			if (user == 1) {
				System.out.println("Enter the size of the employee linkedlist ");
				int size = sc.nextInt();
				for (int i = 0; i < size; i++) {

					System.out.println("Enter name Employee " + i);
					String name = sc.next();
					System.out.println("Enter Id Employee " + i);
					int id = sc.nextInt();
					System.out.println("Enter Salary Employee " + i);
					int salary = sc.nextInt();
					linkedlist.add(new Employee(name, id, salary));
				}
				System.out.println("Created LinkedList: " + linkedlist);
			}
			if (user == 2) {
				for (int i = 0; i < linkedlist.size(); i++) {
					if (linkedlist.get(i).getiD() != 0) {
						System.out.println(linkedlist.get(i));
					}
				}
			}
			if (user == 3) {
				System.out.println("Enter name which you want to search");
				String name = sc.next();
				boolean k = true;
				for (int i = 0; i < linkedlist.size(); i++) {
					if (linkedlist.get(i).getName().equalsIgnoreCase(name)) {
						System.out.println("Employee Found " + linkedlist.get(i).toString());
						k = false;
						break;

					}
				}
				if (k) {
					System.out.println("Record not Found");
				}

			}
			if (user == 4) {
				boolean deleteFlag = true;
				for (int i = 0; i < linkedlist.size(); i++) {
					System.out.println(linkedlist.get(i));
				}
				System.out.println("Enter the id for which you want to delete the employee");
				int id = sc.nextInt();
				for (int i = 0; i < linkedlist.size(); i++) {
					if (linkedlist.get(i).getiD() == id) {
						System.out.println("Deleting record " + linkedlist.get(i).toString());
						linkedlist.remove(i);
						deleteFlag = false;
						break;

					}
				}
				if (deleteFlag) {
					System.out.println("No Matching Id found");
				}

			}
			if (user == 5) {
				break;
			}
			if (user == 6) {
				Namecomparator namesort = new Namecomparator();
				System.out.println("Before Sorting by name: ");
				for (int i = 0; i < linkedlist.size(); i++) {
					if (linkedlist.get(i).getiD() != 0) {
						System.out.println(linkedlist.get(i));
					}
				}
				linkedlist.sort(namesort);
				System.out.println("After Sorting by name: ");
				for (int i = 0; i < linkedlist.size(); i++) {
					if (linkedlist.get(i).getiD() != 0) {
						System.out.println(linkedlist.get(i));
					}
				}

			}
			if (user == 7) {
				Comparator<Employee> descnamesort = Collections.reverseOrder(new Namecomparator());
				System.out.println("Before Sorting by name: ");
				for (int i = 0; i < linkedlist.size(); i++) {
					if (linkedlist.get(i).getiD() != 0) {
						System.out.println(linkedlist.get(i));
					}
				}
				linkedlist.sort(descnamesort);
				System.out.println("After Sorting by name: ");
				for (int i = 0; i < linkedlist.size(); i++) {
					if (linkedlist.get(i).getiD() != 0) {
						System.out.println(linkedlist.get(i));
					}
				}
			}
			if (user == 8) {
				Salarycomparator salarysort = new Salarycomparator();
				System.out.println("Before Sorting by salary: ");
				for (int i = 0; i < linkedlist.size(); i++) {
					if (linkedlist.get(i).getiD() != 0) {
						System.out.println(linkedlist.get(i));
					}
				}
				linkedlist.sort(salarysort);
				System.out.println("After Sorting by salary: ");
				for (int i = 0; i < linkedlist.size(); i++) {
					if (linkedlist.get(i).getiD() != 0) {
						System.out.println(linkedlist.get(i));
					}
				}

			}
			if (user == 9) {
				Comparator<Employee> descsalarysort = Collections.reverseOrder(new Salarycomparator());
				System.out.println("Before Sorting by salary: ");
				for (int i = 0; i < linkedlist.size(); i++) {
					if (linkedlist.get(i).getiD() != 0) {
						System.out.println(linkedlist.get(i));
					}
				}
				linkedlist.sort(descsalarysort);
				System.out.println("After Sorting by salary: ");
				for (int i = 0; i < linkedlist.size(); i++) {
					if (linkedlist.get(i).getiD() != 0) {
						System.out.println(linkedlist.get(i));
					}
				}

			}
			if (user == 10) {
				int min = linkedlist.get(0).getSalary();
				int index = 0;
				for (int i = 1; i < linkedlist.size(); i++) {
					if (linkedlist.get(i).getSalary() < min) {
						min = linkedlist.get(i).getSalary();
						index = i;
					}
				}
				System.out.println("Minimum Paid salary employee: " + linkedlist.get(index).getName());

				if (user == 11) {
					int max = linkedlist.get(0).getSalary();
					int index1 = 0;
					for (int i = 1; i < linkedlist.size(); i++) {
						if (linkedlist.get(i).getSalary() > max) {
							max = linkedlist.get(i).getSalary();
							index1 = i;
						}
					}
					System.out.println("Maximum Paid salary employee: " + linkedlist.get(index1).getName());
				}

				if (user == 13) {
					for (int i = 0; i < linkedlist.size(); i++) {
						Employee.sum = Employee.sum + linkedlist.get(i).getSalary();
					}
					System.out.println("Sum of Employee salary: " + Employee.sum);
				}
				if (user == 12) {
					Employee.avg = (Employee.sum / linkedlist.size());
					System.out.println("Sum of Employee salary: " + Employee.avg);

				}
				if (user == 3) {
					int index2 = 0;
					Scanner sc1 = new Scanner(System.in);
					for (int i = 0; i < linkedlist.size(); i++) {
						if (linkedlist.get(i).getName() == sc1.toString()) {
							index2 = i;
						}
					}
					System.out.println("Employee is found at: " + index2);

				}

			}

		}
	}

}