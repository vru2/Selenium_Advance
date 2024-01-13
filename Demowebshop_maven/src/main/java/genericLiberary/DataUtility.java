package genericLiberary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DataUtility implements frameWorkConstants {
	
	public String getDataFromProperties(String key) throws IOException
	{
		FileInputStream fis = new FileInputStream(properties_path);
		Properties pobj = new Properties();
		pobj.load(fis);
		return pobj.getProperty(key);
	}
	
	

}
