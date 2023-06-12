import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.click(findTestObject('Object Repository/Page_Customer Login/span_Sign In'))

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

