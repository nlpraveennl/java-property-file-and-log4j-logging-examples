package util;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Properties;

@SuppressWarnings("unchecked")
public class PropertyReader 
{
	public static final HashMap<String, String> PROPERTIES_MAP=new HashMap<String, String>();
	public static final Properties PROPERTIES= new Properties();
	static
	{
		System.out.println("static block of Property Reader");
		try 
		{
			ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
			PROPERTIES.load(classLoader.getResourceAsStream("/config.properties"));
			Enumeration<String> keys = (Enumeration<String>) PROPERTIES.propertyNames();
			while(keys.hasMoreElements())
			{
				String key=keys.nextElement();
				PROPERTIES_MAP.put(key, PROPERTIES.getProperty(key));
			}
		}catch (Exception e) 
		{
			e.printStackTrace();
		} 
	}
}
