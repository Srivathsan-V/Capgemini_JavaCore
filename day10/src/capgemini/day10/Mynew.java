package capgemini.day10;

import java.util.ArrayList;
import java.util.List;

class Company{
	private String name;
	private String type;
	private int turnover;
	public Company(String name, String type, int turnover) {
		super();
		this.name = name;
		this.type = type;
		this.turnover = turnover;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getTurnover() {
		return turnover;
	}
	public void setTurnover(int turnover) {
		this.turnover = turnover;
	}
}
class Record{
	public List<Company> companies  = new ArrayList<Company>();

	
	public String addCompany(Company company) {
		companies.add(company);
		return "Added";
	}
}



public class Mynew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company c1 = new Company("Doselect","IT",300);
		Record r = new Record();
		System.out.println(r.addCompany(c1));

	}

}


