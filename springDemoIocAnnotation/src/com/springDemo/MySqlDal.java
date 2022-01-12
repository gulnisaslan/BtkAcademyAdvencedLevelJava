package com.springDemo;

import org.springframework.stereotype.Component;

@Component("database")
public class MySqlDal implements ICustomerDal{
	String connectionString;
	public String getConnectionString() {
		return connectionString;
	}
	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}

	@Override
	public void add() {
		System.out.println("Connection String : "+ this.connectionString);
		System.out.println("MySql veritabaný ile baðlandýnýz. ");
		
	}

}
