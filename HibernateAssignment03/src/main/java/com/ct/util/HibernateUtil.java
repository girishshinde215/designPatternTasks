package com.ct.util;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.ct.model.Director;
import com.ct.model.Hollywood;
import com.ct.model.Movie;

public class HibernateUtil {

	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {

		if (sessionFactory == null) {
			try {
				Configuration configuration = new Configuration();
				Properties settings = new Properties();
				settings.put(Environment.DRIVER, "com.microsoft.sqlserver.jdbc.SQLServerDriver");
				settings.put(Environment.URL, "jdbc:sqlserver://localhost;databaseName=TestDB3;instanceName=SQLEXPRESS2019");
				settings.put(Environment.USER, "sa");
				settings.put(Environment.PASS, "Password_123");
				settings.put(Environment.DIALECT, "org.hibernate.dialect.SQLServerDialect");
				settings.put(Environment.SHOW_SQL, "true");
				settings.put(Environment.FORMAT_SQL, "true");
				settings.put(Environment.HBM2DDL_AUTO, "update");
				configuration.setProperties(settings);
				configuration.addAnnotatedClass(Director.class);
				configuration.addAnnotatedClass(Hollywood.class);
				configuration.addAnnotatedClass(Movie.class);
				ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
		                   .applySettings(configuration.getProperties()).build();
				
				sessionFactory = configuration.buildSessionFactory(serviceRegistry);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
		}
		return sessionFactory;
	}
}

