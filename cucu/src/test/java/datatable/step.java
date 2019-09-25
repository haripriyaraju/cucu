package datatable;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class step {
	@Given ("there are {word} fruits")
	public void abd(String a,DataTable t){
		List<Map<String,String>> data = t.asMaps(String.class,String.class);
		for (int i=0;i<data.size();i++)
		{
			System.out.println("There are "+a+" fruits "+data.get(i).get("with"));
		}
	}
	@When ("i eat {word} fruits")
	public void ghh(String a) {
		System.out.println("I eat "+a +" fruits");
		
		
	}
    @Then ("i have {word} furits")
    public void fyy(String a) {
    	System.out.println("I have "+a+" furits");
    	System.out.println("***************************************");
    }
}
