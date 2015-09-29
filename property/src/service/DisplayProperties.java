package service;

import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.PropertyReader;

public class DisplayProperties extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	throws ServletException, IOException 
	{
		System.out.println("((doGet))");
		HashMap<String, String> propMap = PropertyReader.PROPERTIES_MAP;
		System.out.println(propMap);
		
		Properties props = PropertyReader.PROPERTIES;
		System.out.println(props);
		resp.getWriter().print(props);
	}
}
