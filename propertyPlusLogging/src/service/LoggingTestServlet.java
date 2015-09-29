package service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import util.MyLogger;
import util.Operations;

public class LoggingTestServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	private Logger log=MyLogger.LOGGER;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
	throws ServletException, IOException
	{
		log.info("Do POST method :) ");
		log.info("This is Information");
		log.debug("This is debug message");
		log.trace("This is tracing");
		log.warn("This is warning");
		log.error("This is error message");
		log.fatal("This is fatal message");
		
		try
		{
			int ans=new Operations().devide(10, 0);
			log.info(ans);
		}catch(ArithmeticException e)
		{
			log.fatal(e);
			log.log(Level.WARN, e);
		}
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	throws ServletException, IOException 
	{
		log.info("Do GET method :) ");
		log.info("This is Information");
		log.debug("This is debug message");
		log.trace("This is tracing");
		log.warn("This is warning");
		log.error("This is error message");
		log.fatal("This is fatal message");
		
		try
		{
			int ans=new Operations().devide(10, 0);
			log.info(ans);
		}catch(ArithmeticException e)
		{
			log.fatal(e);
			log.log(Level.WARN, e);
		}
		
	}
}
