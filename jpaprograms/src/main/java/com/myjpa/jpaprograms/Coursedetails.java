package com.myjpa.jpaprograms;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="Coursedetails")
public class Coursedetails implements Serializable {
	
	private static final long serialVersionUID = 7469471348010165686L;

	@Id //primary key field
	@Column(name="courseid")
	private int courseid;
	
	@Column(name="facultyname")
	private String facultyname;
	
	@Column(name="coursename")
	private String coursename;
	public int getCourseid() {
		return courseid;
	}
	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}
	public String getFacultyname() {
		return facultyname;
	}
	public void setFacultyname(String facultyname) {
		this.facultyname = facultyname;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	@Override
	public String toString() {
		return "Coursedetails [courseid=" + courseid + ", facultyname=" + facultyname + ", coursename=" + coursename
				+ "]";
	}


}
