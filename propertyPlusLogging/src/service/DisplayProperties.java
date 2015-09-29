package service;

import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import util.MyLogger;
import util.PropertyReader;

public class DisplayProperties extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	private Logger log=MyLogger.LOGGER;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	throws ServletException, IOException 
	{
		HashMap<String, String> propMap = PropertyReader.PROPERTIES_MAP;
		log.info(propMap);
		
		Properties props = PropertyReader.PROPERTIES;
		log.info(props);
		resp.getWriter().print(props);
	}
}
