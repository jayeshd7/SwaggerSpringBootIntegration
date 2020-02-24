package com.naptex.prep.springbootsample.model;

public class Country
{
	private String code;
	private String name;
	private Continent continent;
	private int population;

	public String getCode()
	{
		return code;
	}

	public void setCode(String code)
	{
		this.code = code;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Continent getContinent()
	{
		return continent;
	}

	public void setContinent(Continent continent)
	{
		this.continent = continent;
	}

	public int getPopulation()
	{
		return population;
	}

	public void setPopulation(int population)
	{
		this.population = population;
	}
}
