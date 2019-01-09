package jas.kum.shopingbackend.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages={"jas.kum.shopingbackend.dto"})
@EnableTransactionManagement
public class HibernateConfig {
	
 private final static String DATABASE_URL="jdbc:h2:tcp://localhost/~/onlineshopping";
 private final static String DATABASE_DRIVER="org.h2.Driver";
 private final static String DATABASE_DIALECT="org.hiberate.dialect.H2Dialect";
 private final static String DATABASE_USERNAME="sa";
 private final static String DATABASE_PASSWORD="";
 
 @Bean
 private DataSource getDataSource(){
	 BasicDataSource dataSource= new BasicDataSource();
	 /*providing the database information*/
	 dataSource.setDriverClassName(DATABASE_DRIVER);
	 dataSource.setUrl(DATABASE_URL);
	 dataSource.setUsername(DATABASE_USERNAME);
	 dataSource.setPassword(DATABASE_PASSWORD);
	return dataSource;
 }
	
 /*session factory will available*/
 @Bean
 public SessionFactory getSessionFactory(DataSource dataSource){
	 LocalSessionFactoryBuilder builder= new LocalSessionFactoryBuilder(dataSource);
	 
	 builder.addProperties(getHibernateProperties());
	 builder.scanPackages("jas.kum.shopingbackend.dto");
	 
	return builder.buildSessionFactory();
	 
 }

 /*all the hibernate properties wiill be returned in this method*/
private Properties getHibernateProperties() {
	// TODO Auto-generated method stub
	Properties properties=new Properties();
	properties.put("hibernate.dialect", DATABASE_DIALECT);
	properties.put("hibernate.show_sql", "true");
	properties.put("hibernate.format_sql", "true");
	return properties;
}

//transactionmanager bean
@Bean
public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory){
	HibernateTransactionManager hibernateTransactionManager=new HibernateTransactionManager(sessionFactory);
	return hibernateTransactionManager;
}

}
