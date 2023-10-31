package asawari;

import java.util.List;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.asawari.base.TestBase;
import com.asawari.pages.HomePage;

public class HomePageTests extends TestBase {

	@Test
	public void verifySearchResultsOnSearchingFalcon() {
		//HomePage homepage = new HomePage();
		//do not initialise other object in a normal way. it will give null pointer exception.
		//initialse by PageFactory object
		
		HomePage homepage = PageFactory.initElements(getDriver(), HomePage.class);
		homepage.searchProduct("Falcon");
		
		//getDriver().navigate().refresh();     //to refresh the url
		
		List<String> productTitles= homepage.getProductTitles();
		for (String productTitle : productTitles) {
			Assert.assertTrue(productTitle.contains("Falcon"));
		}
	}

}
