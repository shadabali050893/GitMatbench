package crudManyreturnhiberClientWorkDemoResult;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import hibernateUtil.HibernateUtil;

public class Result {

	Scanner sc = new Scanner(System.in);
	
	public void insertData() {
		
			Demo x=new Demo();
			List<ClientReturn> cl=x.m2();
			for(ClientReturn z:cl) 
			{
				SessionFactory sf = HibernateUtil.getSessionFactory();
				Session ss = sf.openSession();
				Transaction tx = ss.beginTransaction();
				
			 ss.save(z);
			 tx.commit();
			}
			
         
		System.out.println("data inserted successfully !!!");
		
	}

	public void getclient() {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session ss = sf.openSession();
	//Query org.hibernate.query.	
	Query<ClientReturn>	q1=ss.getNamedQuery("getClient");
	List<ClientReturn> l=q1.getResultList();
			for(ClientReturn e:l)
			{
			System.out.println(e);
			}
		
	}

	public void getsingleclient() {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session ss = sf.openSession();
	//Query org.hibernate.query.	
	Query<ClientReturn>	q2=ss.getNamedQuery("getsingleClient");
	System.out.println("take id to get single client");
	
	q2.setParameter("i", sc.nextInt());
	List<ClientReturn> l=q2.getResultList();
			for(ClientReturn e:l)
			{
			System.out.println(e);
			}
		
	}

	public void updateclient() {
		
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session ss = sf.openSession();
		Transaction tx = ss.beginTransaction();
		
		Query<ClientReturn>	q3=ss.getNamedQuery("updateClient");
		
		System.out.println("take new name string");
		q3.setParameter("nm", sc.next());
		
		System.out.println("take new addr string");  
		q3.setParameter("ad",sc.next());
		
		System.out.println("take id to update");
		q3.setParameter("i", sc.nextInt());
		
		q3.executeUpdate();
		tx.commit();
		
	}

	public void deleteclient() {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session ss = sf.openSession();
		Transaction tx = ss.beginTransaction();
		
		Query<ClientReturn>	q4=ss.getNamedQuery("deleteClient");
		
		System.out.println("take id to delete");
		q4.setParameter("i", sc.nextInt());
		q4.executeUpdate();
		tx.commit();
		
	}

}
