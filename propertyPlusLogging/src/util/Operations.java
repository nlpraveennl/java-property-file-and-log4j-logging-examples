package util;

import org.apache.log4j.Logger;

public class Operations 
{
	private Logger log=MyLogger.LOGGER;
	public int devide(int x,int y) throws ArithmeticException
	{
		log.info("This is Operations class");
		return x/y;
	}
}
