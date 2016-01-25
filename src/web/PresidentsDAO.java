package web;

import java.util.List;

public interface PresidentsDAO
{
	public void createPresidentList();
	public President getPresidentNumber();
	public int getPresListNum();
	public void setPresListNumMinus();
	public void setPresListNumAddition();
	public List<President> getPresList();
	public void setPresListNum(int i);
}
