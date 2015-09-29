package util;

import org.apache.log4j.Logger;

public interface MyLogger 
{
	Logger LOGGER = Logger.getLogger(new Object() { }.getClass().getEnclosingClass());
}
