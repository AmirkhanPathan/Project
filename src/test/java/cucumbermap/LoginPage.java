package cucumbermap;

import java.util.Hashtable;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import support.HTMLReportGenerator;
import support.ProjectOperations;

public class LoginPage 
{
	@When("^User open browser as \"(.*)\" with exe as$")
	public void user_open_browser_as_with_exe_as(String bname) throws Throwable 
	{
		Object[] input=new Object[1];
        input[0]=bname;
        
       Hashtable<String,Object> output=ProjectOperations.browserLaunch(input);
       HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"^User open browser as \"([^\"]*)\" with exe as \"([^\"]*)\"$",output.get("MESSAGE").toString());
       
	}

	@When("^User open URL as$")
	public void user_open_URL_as() throws Throwable 
	{
		
       
        Hashtable<String,Object> output1=ProjectOperations.openApplication();
        HTMLReportGenerator.StepDetails(output1.get("STATUS").toString(),"^User open URL as \"([^\"]*)\"$",output1.get("MESSAGE").toString());
	}

	@When("^User enter username as \"([^\"]*)\"$")
	public void user_enter_username_as(String username) throws Throwable 
	{
		Object[] input2=new Object[2];
        input2[0]="//*[@id='txtuId']";
        input2[1]=username;
        Hashtable<String,Object> output2=ProjectOperations.sendInput(input2);
        HTMLReportGenerator.StepDetails(output2.get("STATUS").toString(),"^User enter username as \"([^\"]*)\"$",output2.get("MESSAGE").toString());
	}

	@When("^User enter password as \"([^\"]*)\"$")
	public void user_enter_password_as(String password) throws Throwable 
	{
		 Object[] input3=new Object[2];
         input3[0]="//*[@id='txtPword']";
         input3[1]=password;
         Hashtable<String,Object> output3=ProjectOperations.sendInput(input3);
         
         HTMLReportGenerator.StepDetails(output3.get("STATUS").toString(),"^User enter password as \"([^\"]*)\"$",output3.get("MESSAGE").toString());
	}

	@When("^User click on login button$")
	public void user_click_on_login_button() throws Throwable 
	{
		 Object[] input4=new Object[1];
         input4[0]="//*[@id='login']";
         Hashtable<String,Object> output4=ProjectOperations.clickOnElement(input4);
         HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(),"^User click on login button$",output4.get("MESSAGE").toString());
	}

	@When("^User click on branches button$")
	public void user_click_on_branches_button() throws Throwable 
	{
		 Object[] input5=new Object[1];
         input5[0]="(//*[@width='132'])[1]";
         Hashtable<String,Object> output5=ProjectOperations.clickOnElement(input5);
         HTMLReportGenerator.StepDetails(output5.get("STATUS").toString(),"^User click on branches button$",output5.get("MESSAGE").toString());
	}

	@When("^User select country$")
	public void user_select_country() throws Throwable 
	{
		Object[] input6=new Object[1];
        input6[0]="//*[@name='lst_countryS']";
        Hashtable<String,Object> output6=ProjectOperations.selectCountry(input6);
        HTMLReportGenerator.StepDetails(output6.get("STATUS").toString(),"^User select country$",output6.get("MESSAGE").toString());
	}

	@When("^User select state$")
	public void user_select_state() throws Throwable 
	{
		Object[] input7=new Object[1];
        input7[0]="//*[@name='lst_stateS']";
        Hashtable<String,Object> output7=ProjectOperations.selectState(input7);
        HTMLReportGenerator.StepDetails(output7.get("STATUS").toString(),"^User select state$",output7.get("MESSAGE").toString());
	}

	@When("^User select city$")
	public void user_select_city() throws Throwable 
	{
		Object[] input8=new Object[1];
        input8[0]="//*[@name='lst_cityS']";
        Hashtable<String,Object> output8=ProjectOperations.selectCity(input8);
        HTMLReportGenerator.StepDetails(output8.get("STATUS").toString(),"^User select city$",output8.get("MESSAGE").toString());
		
	}
	    

	@When("^User click on search button$")
	public void user_click_on_search_button() throws Throwable 
	{
		Object[] input9=new Object[1];
        input9[0]="//*[@name='btn_search']";
        Hashtable<String,Object> output9=ProjectOperations.clickOnElement(input9);
        HTMLReportGenerator.StepDetails(output9.get("STATUS").toString(),"^User click on search button$",output9.get("MESSAGE").toString());
	}

	@Then("^Application shows all branches to user$")
	public void application_shows_all_branches_to_user() throws Throwable 
	{
		Object[] input10=new Object[2];
		 input10[0]="//*[@id='lab19']";
        input10[1]="Branch Details";
        Hashtable<String,Object> output10=ProjectOperations.validation(input10);
       
        HTMLReportGenerator.StepDetails(output10.get("STATUS").toString(),"^Application shows all branches to user$",output10.get("MESSAGE").toString());
	}

}
