package web;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadPresidents
{
	public static void main(String[] args)
	{
		Object o = null;
		Object o1 = null;
		Object o2 = null;
		Object o3 = null;
		Object o4 = null;
		Object o5 = null;
		try
		{
			FileInputStream fin = new FileInputStream("WhigParty.txt");
			ObjectInputStream in = new ObjectInputStream(fin);
			try
			{
				o = in.readObject();
			} catch (ClassNotFoundException e)
			{
				System.err.println(e.getMessage());
			}
			fin = new FileInputStream("DemoParty.txt");
			in = new ObjectInputStream(fin);
			try
			{
				o1 = in.readObject();
			} catch (ClassNotFoundException e)
			{
				System.err.println(e.getMessage());
			}
			fin = new FileInputStream("RepuParty.txt");
			in = new ObjectInputStream(fin);
			try
			{
				o2 = in.readObject();
			} catch (ClassNotFoundException e)
			{
				System.err.println(e.getMessage());
			}
			fin = new FileInputStream("IndeParty.txt");
			in = new ObjectInputStream(fin);
			try
			{
				o3 = in.readObject();
			} catch (ClassNotFoundException e)
			{
				System.err.println(e.getMessage());
			}
			fin = new FileInputStream("DemoRepuParty.txt");
			in = new ObjectInputStream(fin);
			try
			{
				o4 = in.readObject();
			} catch (ClassNotFoundException e)
			{
				System.err.println(e.getMessage());
			}
			fin = new FileInputStream("FedParty.txt");
			in = new ObjectInputStream(fin);
			try
			{
				o5 = in.readObject();
			} catch (ClassNotFoundException e)
			{
				System.err.println(e.getMessage());
			}
		} catch (IOException e)
		{
			System.err.println(e.getMessage());
		}
		System.out.println("Whig Party");
		System.out.println(o);
		System.out.println("Democrat Party");
		System.out.println(o1);
		System.out.println("Republican Party");
		System.out.println(o2);
		System.out.println("Independant Party");
		System.out.println(o3);
		System.out.println("Democratic-Republican Party");
		System.out.println(o4);
		System.out.println("Federalist Party");
		System.out.println(o5);
	}
}
