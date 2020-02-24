package com.naptex.prep.springbootsample.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naptex.prep.springbootsample.dao.CountryDao;
import com.naptex.prep.springbootsample.model.Country;

@Service
public class CountryService
{
	@Autowired
	private CountryDao countryDao;

	public List<Country> getAllCountries()
	{
		return countryDao.getCountries();
	}
}
