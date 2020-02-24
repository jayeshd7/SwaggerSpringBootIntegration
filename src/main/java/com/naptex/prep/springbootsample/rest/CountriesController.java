package com.naptex.prep.springbootsample.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.naptex.prep.springbootsample.model.Country;
import com.naptex.prep.springbootsample.services.CountryService;

@RestController
@RequestMapping("/api")
public class CountriesController
{
	private final CountryService countryService;

	@Autowired
	public CountriesController(CountryService countryService)
	{
		this.countryService = countryService;
	}

	@RequestMapping("/country")
	public List<Country> getCountries()
	{
		return countryService.getAllCountries();
	}
}
