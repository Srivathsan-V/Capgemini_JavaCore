package com.myjpa.jpaprograms;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import com.myjpa.jpaprograms.Coursedetails;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
    

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Coursedetails");
		EntityManager entityManager = emf.createEntityManager();
	 

		javax.persistence.Query q = entityManager.createQuery("Select c from Coursedetails c");
		List<Coursedetails> resultList = new ArrayList<Coursedetails>();
		resultList = q.getResultList();
		System.out.println("no of courses:" + resultList.size());
		for (Coursedetails next : resultList) {
			System.out.println("Course:No " + next.getCourseid());
			System.out.println("Course:Name " + next.getCoursename());
			System.out.println("Course:Name " + next.getFacultyname());

		}

	
	}  


}


