package com.demo.tests.web.base.homepage;

import com.demo.pages.web.LoginPage;
import com.demo.pages.web.validator.HomePageValidator;
import com.demo.tests.web.base.ExcelReader;
import com.demo.tests.web.base.WebSetup;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

class HomePageTest extends WebSetup {

	@DataProvider
    Object[][] Authentication() throws Exception{

         Object[][] data = ExcelReader.getTableArray(System.getProperty("user.dir")+"//src//test//resources//TestData.xlsx","Sheet1");
         
         return (data);

		}

  @Test(dataProvider="Authentication")
  void testHomePageComponents(String username, String password, String templateText) {
    HomePageValidator homepage = new LoginPage()
      .loginToApplication(username, password).getHomePageValidator();

    HomePageAssert.assertThat(homepage)
      .templateEquals(templateText)
      .assertAll();
  }

}
