package com.hibernateDemo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Job.class)
				.buildSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		try {
			//"from Job j where j.jobTitle='%of%'"
			session.beginTransaction();
			List<Job> jobs = session.createQuery("from Job j group by j.maxSalary").getResultList();
			for (Job job : jobs) {
				System.out.println(job.getJobTitle());
			}
//		
//			Job job= new Job();
//			job.setJobTitle("Software Engineer");
//			job.setMinSalary(5000);
//			job.setMaxSalary(7000);
//			session.save(job);
			
//		     Job job= session.get(Job.class, 1);
//		     
//             job.setMaxSalary(900000);
//             System.out.println(job.getMaxSalary());
			session.getTransaction().commit();
			
		} finally {
			session.close();
		
	}

	}
}
