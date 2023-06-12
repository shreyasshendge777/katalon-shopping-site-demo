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

WebUI.click(findTestObject('Object Repository/Page_Push It Messenger Bag/button_Proceed to Checkout'))

WebUI.verifyElementPresent(findTestObject('Page_Checkout/input_Email Address_username'), GlobalVariable.applicationTimeout)

WebUI.setText(findTestObject('Object Repository/Page_Checkout/input_Email Address_username'), 'Affdqqqq@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Checkout/input_First Name_firstname'), 'add')

WebUI.setText(findTestObject('Object Repository/Page_Checkout/input_Last Name_lastname'), 'cghvhj')

WebUI.setText(findTestObject('Object Repository/Page_Checkout/input_Company_company'), 'chjbjk')

WebUI.setText(findTestObject('Object Repository/Page_Checkout/input_Street Address Line 1_street0'), 'vgjhbkj')

WebUI.setText(findTestObject('Object Repository/Page_Checkout/input_Street Address Line 2_street1'), 'bjkbkj')

WebUI.setText(findTestObject('Object Repository/Page_Checkout/input_Street Address Line 3_street2'), 'hiljl')

WebUI.setText(findTestObject('Object Repository/Page_Checkout/input_City_city'), 'vhjhkhkl')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Checkout/select_Please select a region, state or pro_d80c8a'), 
    '24', true)

WebUI.setText(findTestObject('Object Repository/Page_Checkout/input_ZipPostal Code_postcode'), '5876897')

WebUI.click(findTestObject('Object Repository/Page_Checkout/div_First Name                             _fcb15f'))

WebUI.setText(findTestObject('Object Repository/Page_Checkout/input_Phone Number_telephone'), '3456788')

WebUI.click(findTestObject('Object Repository/Page_Checkout/input_Carrier Title_ko_unique_5'))

WebUI.click(findTestObject('Object Repository/Page_Checkout/span_Next'))

WebUI.click(findTestObject('Object Repository/Page_Checkout/span_Place Order'))

