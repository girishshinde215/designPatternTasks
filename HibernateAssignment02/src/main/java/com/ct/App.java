package com.ct;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class App 
{
    public static void main( String[] args )
    {
       
    	SessionFactory sf = HibernateUtil.getSessionFactory();
    	Session session = sf.openSession();
    	
        session.beginTransaction();
        
        Locker locker = new Locker();
        locker.setRent(1100);
        locker.setLockerType("Small");
        
        Customer customer = new Customer();
        customer.setCustomerName("William");
        customer.setDateofBirth("17-05-1995");
        customer.setAddress("Kolkata");
        customer.setPhone("9067767872");
        customer.setLocker(locker);
        
        session.save(customer);
        
        session.getTransaction().commit();
        
        session.close();
        
    }
}
