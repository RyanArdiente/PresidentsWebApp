package web;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;

//Talking Point  6
public class PresidentsFileDAO implements PresidentsDAO
{
	private static final String filename = "WEB-INF/presidents.csv";
	private ServletContext servletContext;
	private List<President> presList;
	public static Integer presListNum = 0;
	private List<String> presLocation = new ArrayList<>();

	@Override
	public int getPresListNum()
	{
		return presListNum;
	}

	@Override
	public void setPresListNumMinus()
	{
		PresidentsFileDAO.presListNum -= 1;
	}

	@Override
	public void setPresListNumAddition()
	{
		PresidentsFileDAO.presListNum += 1;
	}

	public PresidentsFileDAO(ServletContext context)
	{
		servletContext = context;
		presList = new ArrayList<>();
		createPresidentList();
	}

	@Override
	public List<President> getPresList()
	{
		return presList;
	}

	@Override
	public void setPresListNum(int i)
	{
		PresidentsFileDAO.presListNum = i;
	}

	public void setPresList(List<President> presList)
	{
		this.presList = presList;
	}

	// Talking Point 6.5
	public void createPresidentList()
	{
		listLocation();
		int lineCount = 44;
		String[] onePresidentPerString;
		InputStream is = servletContext.getResourceAsStream(filename);
		try (BufferedReader bufIn = new BufferedReader(new InputStreamReader(is)))
		{
			String line;

			onePresidentPerString = new String[lineCount];
			int i = 0;
			while ((line = bufIn.readLine()) != null)
			{
				onePresidentPerString[i] = line;
				i++;
			}
			President[] presidents = new President[lineCount];
			int j = 0;
			for (String president : onePresidentPerString)
			{

				String[] presidentsString = president.trim().split(",");

				String[] termString = presidentsString[4].split("-");
				termString[0] = termString[0].trim();
				int st = (Integer.parseInt(termString[0]));
				int et = (Integer.parseInt(termString[1]));
				int ts = (et - st);

				presList.add(new President(presidentsString[1], presidentsString[2], presidentsString[3], ts,
						Integer.parseInt(termString[0]), Integer.parseInt(termString[1]), presidentsString[5],
						Integer.parseInt(presidentsString[0]), presLocation.get(j)));
				j++;
			}

		} catch (IOException e)
		{
			System.err.println(e.getMessage());
		}

	}

	// Talking Point 6.5
	public void listLocation()
	{
		presLocation.add("presidentsimages/1.jpg");
		presLocation.add("presidentsimages/2.jpg");
		presLocation.add("presidentsimages/3.jpg");
		presLocation.add("presidentsimages/4.jpg");
		presLocation.add("presidentsimages/5.jpg");
		presLocation.add("presidentsimages/6.jpg");
		presLocation.add("presidentsimages/7.jpg");
		presLocation.add("presidentsimages/8.jpg");
		presLocation.add("presidentsimages/9.jpg");
		presLocation.add("presidentsimages/10.jpg");
		presLocation.add("presidentsimages/11.jpg");
		presLocation.add("presidentsimages/12.jpg");
		presLocation.add("presidentsimages/13.jpg");
		presLocation.add("presidentsimages/14.jpg");
		presLocation.add("presidentsimages/15.jpg");
		presLocation.add("presidentsimages/16.jpg");
		presLocation.add("presidentsimages/17.jpg");
		presLocation.add("presidentsimages/18.jpg");
		presLocation.add("presidentsimages/19.jpg");
		presLocation.add("presidentsimages/20.jpg");
		presLocation.add("presidentsimages/21.jpg");
		presLocation.add("presidentsimages/22.jpg");
		presLocation.add("presidentsimages/23.jpg");
		presLocation.add("presidentsimages/24.jpg");
		presLocation.add("presidentsimages/25.jpg");
		presLocation.add("presidentsimages/26.jpg");
		presLocation.add("presidentsimages/27.jpg");
		presLocation.add("presidentsimages/28.jpg");
		presLocation.add("presidentsimages/29.jpg");
		presLocation.add("presidentsimages/30.jpg");
		presLocation.add("presidentsimages/31.jpg");
		presLocation.add("presidentsimages/32.jpg");
		presLocation.add("presidentsimages/33.jpg");
		presLocation.add("presidentsimages/34.jpg");
		presLocation.add("presidentsimages/35.jpg");
		presLocation.add("presidentsimages/36.jpg");
		presLocation.add("presidentsimages/37.jpg");
		presLocation.add("presidentsimages/38.jpg");
		presLocation.add("presidentsimages/39.jpg");
		presLocation.add("presidentsimages/40.jpg");
		presLocation.add("presidentsimages/41.jpg");
		presLocation.add("presidentsimages/42.jpg");
		presLocation.add("presidentsimages/43.jpg");
		presLocation.add("presidentsimages/44.jpg");
	}

	@Override
	public President getPresidentNumber()
	{
		// TODO Auto-generated method stub
		return null;
	}

}