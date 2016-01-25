package web;

import java.io.Serializable;

//Talking Point  7
public class President implements Serializable
{

	private String firstName;
	private String middleName;
	private String lastName;
	private int termNumber;
	private int startYear;
	private int endYear;
	private String party;
	private int presidentNumber;
	private String location;

	public President(String firstName, String lastName, int termNumber, int startYear, int endYear, String party,
			int presNum, String loc)
	{

		this.firstName = firstName;
		this.lastName = lastName;
		this.termNumber = termNumber;
		this.startYear = startYear;
		this.endYear = endYear;
		this.party = party;
		this.middleName = "";
		this.presidentNumber = presNum;
		this.location = loc;
	}

	public President(String firstName, String middleName, String lastName, int termNumber, int startYear, int endYear,
			String party, int presNum, String loc)
	{

		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.termNumber = termNumber;
		this.startYear = startYear;
		this.endYear = endYear;
		this.party = party;
		this.presidentNumber = presNum;
		this.location = loc;
	}

	public String getLocation()
	{
		return location;
	}

	public int getPresidentNumber()
	{
		return presidentNumber;
	}

	public void setPresidentNumber(int presidentNumber)
	{
		this.presidentNumber = presidentNumber;
	}

	public int getTermNumber()
	{
		return termNumber;
	}

	public void setTermNumber(int termNumber)
	{
		this.termNumber = termNumber;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getMiddleName()
	{
		return middleName;
	}

	public void setMiddleName(String middleName)
	{
		this.middleName = middleName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public int getStartYear()
	{
		return startYear;
	}

	public void setStartYear(int startYear)
	{
		this.startYear = startYear;
	}

	public int getEndYear()
	{
		return endYear;
	}

	public void setEndYear(int endYear)
	{
		this.endYear = endYear;
	}

	public String getParty()
	{
		return party;
	}

	public void setParty(String party)
	{
		this.party = party;
	}

	public String getFullName()
	{
		return firstName + " " + middleName + " " + lastName;
	}

	public String getTermYears()
	{
		return startYear + " - " + endYear;
	}

	@Override
	public String toString()
	{
		return "President " + firstName + " " + middleName + " " + lastName + ", Full Terms Served: " + termNumber / 4
				+ ", Years Served: " + termNumber + ", " + startYear + " - " + endYear + ", party: " + party
				+ ", President Number " + presidentNumber;
	}

}
