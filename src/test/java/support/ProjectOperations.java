package support;

import java.util.Hashtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumbermap.ConfigReader;

public class ProjectOperations 
{       public static ConfigReader config;
	    public static WebDriver driver=null;
        public static Hashtable<String,Object> outputParameters=new Hashtable<String,Object>();
       public static Hashtable<String,Object> browserLaunch(Object[]inputParameters)
        {
    	  try {
        	String bname=(String) inputParameters[0];
        	
         if(bname.equalsIgnoreCase("chrome"))
         {
        	 System.setProperty("webdriver.chrome.driver",config.getDriverPathChrome());
         	driver=new ChromeDriver();
         	driver.manage().window().maximize();
         }
         else if(bname.equalsIgnoreCase("FF"))
         {
        	 System.setProperty("webdriver.geckodriver.driver",config.getDriverPathFF());
         	driver=new ChromeDriver();
         	driver.manage().window().maximize();
         }
         outputParameters.put("STATUS", "PASS");
   	     outputParameters.put("MESSAGE","methodUsed:browserLaunch,Input Given:" + inputParameters[0]);
    	  }
    	 
    	  catch(Exception e)
    	  {
    		  outputParameters.put("STATUS", "FAIL");
        	  outputParameters.put("MESSAGE","methodUsed:browserLaunch,Input Given:" + inputParameters[0]);
    	  }
    	  return outputParameters;
        }	
       
        public static Hashtable<String,Object> openApplication()
        {try {
        	
        	driver.get(config.getApplicationUrl());
        	 outputParameters.put("STATUS", "PASS");
       	  outputParameters.put("MESSAGE","methodUsed:openApplication,Input Given:");
             }
        
  	      catch(Exception e)
  	       {
  	    	 outputParameters.put("STATUS", "FAIL");
  	    	  outputParameters.put("MESSAGE","methodUsed:openApplication,Input Given:" );
  	       }
          return outputParameters;
      }
        
        public static Hashtable<String,Object> sendInput(Object[]inputParameters)
   {   try {
            String XPATH=(String) inputParameters[0];
            String data=(String) inputParameters[1];
            driver.findElement(By.xpath(XPATH)).sendKeys(data);
            outputParameters.put("STATUS", "PASS");
      	  outputParameters.put("MESSAGE","methodUsed:sendInput,Input Given:" + inputParameters[0]);
   }
	  catch(Exception e)
	  {
		  outputParameters.put("STATUS", "FAIL");
    	  outputParameters.put("MESSAGE","methodUsed:sendInput,Input Given:" + inputParameters[0]);
	  }
          return outputParameters;
  }
        
        public static Hashtable<String,Object> clickOnElement(Object[]inputParameters)
        {try {
        	String XPATH=(String) inputParameters[0];
        	driver.findElement(By.xpath(XPATH)).click();
        	 outputParameters.put("STATUS", "PASS");
       	  outputParameters.put("MESSAGE","methodUsed:clickOnElement,Input Given:" + inputParameters[0]);
        }
  	  catch(Exception e)
  	  {
  		 outputParameters.put("STATUS", "FAIL");
   	  outputParameters.put("MESSAGE","methodUsed:clickOnElement,Input Given:" + inputParameters[0]);
  	  }
        return outputParameters;
        }
        
        public static Hashtable<String,Object> selectCountry(Object[]inputParameters)
        {   try {
        	String XPATH=(String) inputParameters[0];
        	
            Select country=new Select(driver.findElement(By.xpath(XPATH)));
            country.selectByIndex(1);
            outputParameters.put("STATUS", "PASS");
      	  outputParameters.put("MESSAGE","methodUsed:selectCountry,Input Given:" + inputParameters[0]);
        }
  	  catch(Exception e)
  	  {
  		 outputParameters.put("STATUS", "FAIL");
   	  outputParameters.put("MESSAGE","methodUsed:selectCountry,Input Given:" + inputParameters[0]);
  	  }
        return outputParameters;
            
        }
        public static Hashtable<String,Object> selectState(Object[]inputParameters)
        {try {
        	String XPATH=(String) inputParameters[0];
        	
        	Select state=new Select(driver.findElement(By.xpath(XPATH)));
        	state.selectByIndex(5);
        	 outputParameters.put("STATUS", "PASS");
       	  outputParameters.put("MESSAGE","methodUsed:selectState,Input Given:" + inputParameters[0]);
        }
  	  catch(Exception e)
  	  {
  		 outputParameters.put("STATUS", "FAIL");
   	  outputParameters.put("MESSAGE","methodUsed:selectState,Input Given:" + inputParameters[0]);
  	  }
        return outputParameters;
        	
        }
        
        public static Hashtable<String,Object> selectCity(Object[]inputParameters)
        {try {
        	String XPATH=(String) inputParameters[0];
        	
        	Select city=new Select(driver.findElement(By.xpath(XPATH)));
        	city.selectByIndex(1);
        	 outputParameters.put("STATUS", "PASS");
       	  outputParameters.put("MESSAGE","methodUsed:selectCity,Input Given:" + inputParameters[0]);
        }
  	  catch(Exception e)
  	  {
  		 outputParameters.put("STATUS", "FAIL");
   	  outputParameters.put("MESSAGE","methodUsed:selectCity,Input Given:" + inputParameters[0]);
  	  }
        return outputParameters;
        }
        
        public static Hashtable<String,Object> validation(Object[]inputParameters)
        {try {
        	String XPATH=(String) inputParameters[0];
        		String text=(String) inputParameters[1];
        	String actualText=driver.findElement(By.xpath(XPATH)).getText();
        	if(actualText.equals(text)) 
        	{
        		System.out.println("Test Case Pass");
        	}
        	else if(actualText.equals(text))
        	{
        		System.out.println("Test Case Fail");
        	}	
        	 outputParameters.put("STATUS", "PASS");
       	  outputParameters.put("MESSAGE","methodUsed:validation,Input Given:" + inputParameters[0]);
        }
  	  catch(Exception e)
  	  {
  		 outputParameters.put("STATUS", "FAIL");
   	  outputParameters.put("MESSAGE","methodUsed:validation,Input Given:" + inputParameters[0]);
  	  }
        return outputParameters;
        }
        
        
}






























