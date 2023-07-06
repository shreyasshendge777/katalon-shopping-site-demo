package com.helper.address

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.googlecode.javacv.cpp.avcodec.AVCodecContext.Get_buffer
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
//import org.apache.commons.lang.RandomStringUtils as RandStr

import internal.GlobalVariable

public class AddressHelper {
	
	
 //randomNumber=rnd.nextInt(5);
/* public int get_random_data()
 {
 Random rnd = new Random();
 randomNumber = (rnd.nextInt(10));
 return randomNumber;
 }
 */

@Keyword
public void add_new_address() {


	WebUI.click(findTestObject('Object Repository/Page_Home Page/button_Proceed to Checkout'))

	WebUI.click(findTestObject('Object Repository/Page_Checkout/span_New Address'))

	WebUI.setText(findTestObject('Object Repository/Page_Checkout/input_Company_company'), 'company')

	WebUI.setText(findTestObject('Object Repository/Page_Checkout/input_Street Address Line 1_street0'), 'Test Address')

	WebUI.setText(findTestObject('Object Repository/Page_Checkout/input_Street Address Line 2_street1'), 'Test Address1')

	WebUI.setText(findTestObject('Object Repository/Page_Checkout/input_Street Address Line 3_street2'), 'Test Address2')

	WebUI.setText(findTestObject('Object Repository/Page_Checkout/input_City_city'), 'city')

	WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Checkout/select_Please select a region, state or pro_d80c8a'),
			'24', true)


	//Random rnd = new Random();
	//randomNumber = (rnd.nextInt(10));

	WebUI.setText(findTestObject('Object Repository/Page_Checkout/input_ZipPostal Code_postcode'),'23456')

	WebUI.setText(findTestObject('Object Repository/Page_Checkout/input_Phone Number_telephone'), '46576')

	WebUI.click(findTestObject('Object Repository/Page_Checkout/span_Ship here'))

	WebUI.click(findTestObject('Object Repository/Page_Checkout/span_Next'))

	WebUI.click(findTestObject('Object Repository/Page_Checkout/span_Place Order'))

	WebUI.verifyElementText(findTestObject('Object Repository/Page_Success Page/span_Thank you for your purchase'), 'Thank you for your purchase!')
}

@Keyword
public void edit_existing_address() {

	//WebUI.click(findTestObject('Object Repository/Page_Customer Login/span_Sign In'))

	WebUI.click(findTestObject('Object Repository/Page_Home Page/button_Change'))

	WebUI.click(findTestObject('Object Repository/Page_Home Page/a_My Account'))

	WebUI.click(findTestObject('Object Repository/Page_My Account/span_Edit Address'))

	WebUI.setText(findTestObject('Object Repository/Page_Edit Address/input_First Name_firstname'), 'shree')

	WebUI.setText(findTestObject('Object Repository/Page_Edit Address/input_Last Name_lastname'), 'ram')

	WebUI.setText(findTestObject('Object Repository/Page_Edit Address/input_Company_company'), 'my comp')

	WebUI.setText(findTestObject('Object Repository/Page_Edit Address/input_Street Address Line 1_street'), 'aaert')

	WebUI.setText(findTestObject('Object Repository/Page_Edit Address/input_Street Address Line 2_street'), 'sdtfyjfh')

	WebUI.setText(findTestObject('Object Repository/Page_Edit Address/input_Street Address Line 3_street'), 'xyrr3')

	WebUI.setText(findTestObject('Object Repository/Page_Edit Address/input_City_city'), 'newyork')

	WebUI.setText(findTestObject('Object Repository/Page_Edit Address/input_ZipPostal Code_postcode'), '419087')

	WebUI.click(findTestObject('Object Repository/Page_Edit Address/span_Save Address'))

	WebUI.click(findTestObject('Object Repository/Page_Address Book/div_You saved the address'))

	WebUI.verifyElementText(findTestObject('Object Repository/Page_Address Book/div_You saved the address'), 'You saved the address.')


}

@Keyword
public void with_existing_address() {

	WebUI.click(findTestObject('Object Repository/Page_Home Page/button_Proceed to Checkout'))

	WebUI.click(findTestObject('Object Repository/Page_Checkout/div_ram     Tare     abc road, abc road, ab_f80e55'))

	WebUI.click(findTestObject('Object Repository/Page_Checkout/div_ram     Tare     abc road, abc road, ab_f80e55'))

	WebUI.click(findTestObject('Object Repository/Page_Checkout/span_Next'))

	WebUI.click(findTestObject('Object Repository/Page_Checkout/span_Place Order'))

}
}


