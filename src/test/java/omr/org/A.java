package omr.org;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.BeforeClass;
import org.junit.Test;
import org.testng.Assert;

import frame.org.BaseClass;

public class A extends BaseClass {
	@BeforeClass
	public static void BeforeClass() {
		browserLaunch("CHROME");

		enterUrl("https://www.omrbranch.com/");

		maximizeWindow();

		implicitWait();
	}

//	@AfterClass
//	public void afterClass() {
//		closeBrowser();
//		
//	}
	// 1.login
	@Test
	public void booking() throws Exception, IOException {
		LoginPage loginPage = new LoginPage();

		loginPage.login(getCellData("Sheet1", 1, 0), getCellData("Sheet1", 1, 1));

		SearchProductPage spp = new SearchProductPage();
		String verifyLoginSuccessMsg = spp.verifyLoginSuccessMsg();
		Assert.assertEquals(verifyLoginSuccessMsg, "Welcome Induja", "to verify the login success message");
		createCellAndCellData("Verification Text", 1, 0, verifyLoginSuccessMsg);

		spp.search(getCellData("Sheet1", 1, 2));

		ProductListingPage pl = new ProductListingPage();
		String searchNuts = pl.searchNuts();
		Assert.assertEquals(searchNuts, "Search Result - nuts", "to verify the search nuts");
		createCellAndCellData("Verification Text", 1, 1, searchNuts);
		pl.click();

		Thread.sleep(1000);
		MyCartPage myc = new MyCartPage();
		String mycartp1 = myc.mycartp();
		Assert.assertEquals(mycartp1, "My Cart", "to verify the my cart message");
		createCellAndCellData("Verification Text", 1, 2, mycartp1);
		String addrp1 = myc.addrp();
		Assert.assertEquals(addrp1, "Delivery Address", "to verify the delivery addr message");
		createCellAndCellData("Verification Text", 1, 3, addrp1);
		String ppaymethod1 = myc.ppaymethod();
		Assert.assertEquals(ppaymethod1, "Payment Method", "payment method mssg");
		createCellAndCellData("Verification Text", 1, 4, ppaymethod1);
		Thread.sleep(5000);

		myc.myCart(getCellData("Sheet1", 1, 3), getCellData("Sheet1", 1, 4), getCellData("Sheet1", 1, 5),
				getCellData("Sheet1", 1, 6), getCellData("Sheet1", 1, 7), getCellData("Sheet1", 1, 8),
				getCellData("Sheet1", 1, 9), getCellData("Sheet1", 1, 10), getCellData("Sheet1", 1, 11),
				getCellData("Sheet1", 1, 12), getCellData("Sheet1", 1, 13), getCellData("Sheet1", 1, 15),
				getCellData("Sheet1", 1, 16), getCellData("Sheet1", 1, 17));
		loginPage.login(getCellData("Sheet1", 1, 0), getCellData("Sheet1", 1, 1));

		MyAcct ct = new MyAcct();
		String orderNumber = ct.orderNumber();
		Thread.sleep(5000);
		String orderdetails1 = ct.orderdetails();
		Assert.assertEquals(orderdetails1, "My Account", "my acct msg");
		createCellAndCellData("Verification Text", 1, 5, orderdetails1);
		createCellAndCellData("Sheet1", 1, 18, orderNumber);

	}

}
