package com.naptex.prep.springbootsample.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties
public class DbHandler
{
	static
	{
		System.out.println("Load SQLite JDBC driver");
		{
			try
			{
				Class.forName("org.sqlite.JDBC");
			}
			catch (Throwable ex)
			{
				System.out.println("Could not initialize sqlite driver");
				ex.printStackTrace();
				throw new ExceptionInInitializerError(ex);
			}
		}
	}

	@Value("${dao.my.key}")
	private String myKey;

	public DbHandler()
	{
		System.out.println("DbHandler initialized");
	}

	public void setMyKey(String myKey)
	{
		this.myKey = myKey;
	}

	public String getMyKey()
	{
		return myKey;
	}
}
