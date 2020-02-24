package com.naptex.prep.springbootsample.model;

public enum Continent
{
	ASIA("Asia"), EUROPE("Europe"), AFRICA("Africa"), NORTH_AMERICA("North America"), OCEANIA(
			"Oceania"), SOUTH_AMERICA("South America");

	private final String name;

	Continent(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public static Continent fromString(String name)
	{
		for (Continent continent : Continent.values())
		{
			if (continent.getName().equalsIgnoreCase(name))
			{
				return continent;
			}
		}

		return null;
	}
}
