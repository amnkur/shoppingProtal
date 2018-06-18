package com.home.backend.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages={"com.home.backend.dto"})
@EnableTransactionManagement
public class HibernateConfig {
	public final static String DATABASE_URL = "jdbc:oracle:thin:@localhost:1521:xe";
	public final static String DATABASE_DRIVER = "oracle.jdbc.driver.OracleDriver";
	public final static String DATABASE_DIALECT = "org.hibernate.dialect.Oracle9iDialect";
	public final static String USERNAME = "hr";
	public final static String PASSWORD = "hr";
}
