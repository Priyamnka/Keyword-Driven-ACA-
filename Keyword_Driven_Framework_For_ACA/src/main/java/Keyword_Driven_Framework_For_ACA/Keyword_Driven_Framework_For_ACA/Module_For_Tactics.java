package Keyword_Driven_Framework_For_ACA.Keyword_Driven_Framework_For_ACA;

import java.time.Duration;
import java.util.List;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Module_For_Tactics {
	
	public String Filter_Name;
	public String FilterScopeNewName;
	
	public void Filter_Select_DeSelect() throws Throwable
	{
		try
		{
			if (Get_Driver.getdriver().findElements(By.xpath("//div[starts-with(@class, 'react-checkbox-tree rct-disabled rct-icons-fa4') and contains(@id, 'rct-')]")).size() == 1)
            {
				System.out.println("\n" + "Attempted Filter_Scope_Select_DeSelect by clicking the CheckBox for : Filter Scope are Disabled" + "\n");
            }
			else
			{
				Thread.sleep(1000);
				List<WebElement> checkboxes = Get_Driver.getdriver().findElements(By.xpath("//*[@class='far fa-check-square']"));
				int elementsCount = checkboxes.size();                
				Random rnd = new Random();
                int Random_Value = rnd.nextInt(2);
                checkboxes.get(Random_Value).click();
                Thread.sleep(2000);

                System.out.println("\n" + "Filter_Select_DeSelect : Executed Successfully");
			}
		}
		catch (Exception ex)
		{
			System.out.println("\n" + "Filter_Scope_Select_DeSelect : " + ex.getMessage());
		}
	}
	
	public void Filter_Apply_Button() throws Throwable
    {
        try
        {
            if (FrameworkConstants.moduleName == "OPTIMIZE")
            {
            	List<WebElement> listA = Get_Driver.getdriver().findElements(By.xpath("//*[@id='main']/div/div/div/div[2]/div/div/div/div"));
            	for (int i= 0; i<listA.size(); i++) {

        			if(listA.get(i).getText().equalsIgnoreCase("Apply")) 
        			{   
        				System.out.println("\n" + "Filter_Apply_Button : " + listA.get(i).getText());
        				listA.get(i).click();
        			}
            	}
            }
            else
            {
            	List<WebElement> listA = Get_Driver.getdriver().findElements(By.xpath("//*[@id='main']/div/div/div/div[2]/div/div/div"));
            	for (int i= 0; i<listA.size(); i++) {
            		
        			if(listA.get(i).getText().equalsIgnoreCase("Apply")) 
        			{   
        				System.out.println("\n" + "Filter_Apply_Button : " + listA.get(i).getText());
        				listA.get(i).click();
        			}
            	}
            }
            Thread.sleep(2000);
            WebDriverWait wait_1 = new WebDriverWait(Get_Driver.getdriver(), Duration.ofSeconds(10));
            wait_1.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div[1]/div")));
            Thread.sleep(2000);
        }
        catch (Exception ex)
        {
        	System.out.println("\n" + "Filter_Apply_Button : " + ex.getMessage());
        }
    }
	
	public void Filter_Save()
    {
        try
        {
        	if (FrameworkConstants.moduleName == "OPTIMIZE")
            {
        		Get_Driver.getdriver().findElement(By.xpath("//*[@id='main']/div/div/div/div/div/div/div/i[2]")).click(); //For OPTIMIZE Tab
            }
        	else
            {
        		Get_Driver.getdriver().findElement(By.xpath("//*[@id='main']/div/div/div/div/div/div/i[2]")).click(); //For TACTICS Tab
            }
            Thread.sleep(1000);
            WebDriverWait wait_1 = new WebDriverWait(Get_Driver.getdriver(), Duration.ofSeconds(10));
            wait_1.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
            Thread.sleep(2000);
            
            System.out.println("\n" + "Filter_Save : Executed Successfully");
        }
        catch (Exception ex)
        {
        	System.out.println("\n" + "Filter_Save : " + ex.getMessage());
        }
    }
	
	public void Filter_Scope_Typing_New_Name_and_Description()
    {
		String New_Scenario_Name = "";
        try
        {
            Thread.sleep(500);
            New_Scenario_Name = Global_Functions.Auto_Generate_New_Scenario_Name();
            

            Thread.sleep(500);
            Get_Driver.getdriver().findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/input")).sendKeys(New_Scenario_Name); //Typing On New Name
            Thread.sleep(1000);

            Get_Driver.getdriver().findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/textarea")).sendKeys(New_Scenario_Name); //Typing On Description
            Thread.sleep(1000);
            
            Filter_Name = New_Scenario_Name;

            System.out.println("\n" + "Filter_Scope_Typing_New_Name_and_Description : Executed Successfully");
        }
        catch (Exception ex)
        {
        	System.out.println("\n" + "Filter_Scope_Typing_New_Name_and_Description : " + ex.getMessage());
        }
    }
	
	public void Filter_Scope_Save_And_Delete_This_Scope()
    {
        try
        {
        	List<WebElement> listA = Get_Driver.getdriver().findElements(By.xpath("/html/body/div[4]/div/div/div/div/div/div[3]/div"));
        	for (int i= 0; i<listA.size(); i++) {
        		
    			if(listA.get(i).getText().equalsIgnoreCase("Save")) 
    			{   
    				System.out.println("\n" + "Filter_Apply_Button : " + listA.get(i).getText());
    				listA.get(i).click();
    			}
        	}
        	Thread.sleep(1000);
            WebDriverWait wait_1 = new WebDriverWait(Get_Driver.getdriver(), Duration.ofSeconds(10));
            wait_1.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
            Thread.sleep(2000);
            
            if (FrameworkConstants.moduleName == "OPTIMIZE")
            {
            	Get_Driver.getdriver().findElement(By.xpath("//*[@id='main']/div/div/div/div/div/div/div[1]/i[1]")).click();	//For OPTIMIZE Tab
            }
            else
            {
            	Get_Driver.getdriver().findElement(By.xpath("//*[@id='main']/div/div/div/div[2]/div/div[1]/i[1]")).click();		//For Others Tab
            }
            Thread.sleep(1000);
            WebDriverWait wait_2 = new WebDriverWait(Get_Driver.getdriver(), Duration.ofSeconds(10));
            wait_2.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
            Thread.sleep(1000);

            FilterScopeNewName = Filter_Name;

            List<WebElement> listB = Get_Driver.getdriver().findElements(By.xpath("/html/body/div/div/div/div/div/div/div[3]/div[1]"));
            
            if (listB.size() != 0)
            {
            	for (int i= 0; i<listB.size(); i++) {
            		
        			if(listB.get(i).getText().equalsIgnoreCase(FilterScopeNewName))
        			{   
        				System.out.println("\n" + "Filter_Apply_Button : " + listB.get(i).getText());
        				listB.get(i).click();
        			}
            	}
            	
            	
            	
//                var e = driver.FindElements(By.XPath("/html/body/div/div/div/div/div/div/div[3]/div[1]")).ToList();
//                List<IWebElement> f = new List<IWebElement>();
//                e.ForEach(x =>
//                {
//                    f.AddRange(x.FindElements(By.XPath("/html/body/div[4]/div/div/div/div/div/div/div[1]/div")).ToList().Where(b => b.Text == FilterScopeNewName));
//                });
//
//                if (f.Any())
//                    f.First().Click();
//                Thread.Sleep(2000);

            	List<WebElement> listC = Get_Driver.getdriver().findElements(By.xpath("/html/body/div/div/div/div/div/div/div/div/div[3]/div"));
            	for (int i= 0; i<listB.size(); i++) {
            		
        			if(listB.get(i).getText().equalsIgnoreCase("Delete"))
        			{   
        				System.out.println("\n" + "Filter_Apply_Button : " + listB.get(i).getText());
        				listB.get(i).click();
        			}
            	}
            	Thread.sleep(1000);
                WebDriverWait wait_3 = new WebDriverWait(Get_Driver.getdriver(), Duration.ofSeconds(10));
                wait_2.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='main']/div/div[2]/div[1]/div/div")));
                Thread.sleep(1000);
            	
//                var g = driver.FindElements(By.XPath("/html/body/div/div/div/div/div/div/div/div/div[3]/div")).ToList();
//                List<IWebElement> h = new List<IWebElement>();
//                g.ForEach(x =>
//                {
//                    h.AddRange(x.FindElements(By.XPath("/html/body/div/div/div/div/div/div/div/div/div[3]/div/div")).ToList().Where(b => b.Text == "Delete"));
//                });
//
//                if (h.Any())
//                    h.First().Click();
//                Thread.Sleep(1000);
            	
//                WebDriverWait wait_3 = new WebDriverWait(driver, timeSpan_1);
//                bool element_3 = wait.Until(ExpectedConditions.InvisibilityOfElementLocated(By.XPath("//*[@id='main']/div/div[2]/div[1]/div/div")));
//                Thread.Sleep(1000);

                Get_Driver.getdriver().findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/div[4]/div[1]")).click();    // Edit PopUp > Close Button
                Thread.sleep(4000);

                //return "Attempted Filter_Scope_Edit_Popup_Scope_Same_Name_Select by clicking the Same Name from the Scope List and Delete";
            }
            else
            {
                //return "Filter_Scope_Save_And_Delete_This_Scope : No such element";
            }

        }
        catch (Exception ex)
        {
        	System.out.println("\n" + "Filter_Scope_Save_And_Delete_This_Scope : " + ex.getMessage());
        }
    }
	
	
	
}
