package com.xworkz.Recipe;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RecipeDAO {
	
	
	
	public boolean insert(RecipeDTO dto)
	{
		boolean flag=true;
		try {
			Configuration conf=new Configuration();
			System.out.println("created config");
			conf.configure();
			SessionFactory factory=conf.buildSessionFactory();
			System.out.println("created factory");
			Session session=factory.openSession();
			System.out.println("created Session");
			Transaction trans=session.beginTransaction();
			System.out.println("Saving..DTO");
			session.save(dto);
			trans.commit();
			System.out.println("DTO saved successfully..");
			
		return flag;
		
	}
catch (Exception e) {
			
			System.err.println("Exception in saving RecipeDTO");
			e.printStackTrace();
		}
		return flag;

}
}
