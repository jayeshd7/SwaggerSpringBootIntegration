package com.naptex.prep.springbootsample.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.naptex.prep.springbootsample.model.Continent;
import com.naptex.prep.springbootsample.model.Country;
import com.naptex.prep.springbootsample.util.Constants;

@Repository
public class CountryDao
{
	@Autowired
	private DbHandler dbHandler;

	public CountryDao()
	{
		System.out.println("##### CountryDao initialized");
	}

	public List<Country> getCountries()
	{
		System.out.println("!!!!!!! Key = " + dbHandler.getMyKey());
		System.out.println("##### Get countries");
		List<Country> countries = new ArrayList<Country>();
		Country dummy = new Country();
		dummy.setCode("IND");
		dummy.setContinent(Continent.ASIA);
		dummy.setName("India");
		dummy.setPopulation(130 * Constants.BILLION);
		countries.add(dummy);

		dummy = new Country();
		dummy.setCode("DEU");
		dummy.setContinent(Continent.EUROPE);
		dummy.setName("Germany");
		dummy.setPopulation(130 * Constants.MILLION);
		countries.add(dummy);

		return countries;
	}
}
