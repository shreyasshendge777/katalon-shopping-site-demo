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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.applicationURL)

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Create an Account'))

WebUI.setText(findTestObject('Object Repository/Page_Create New Customer Account/input_First Name_firstname'), firstname)

WebUI.setText(findTestObject('Object Repository/Page_Create New Customer Account/input_Last Name_lastname'), lastname)

WebUI.setText(findTestObject('Object Repository/Page_Create New Customer Account/input_Email_email'), email)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Create New Customer Account/input_Password_password'), passwordone)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Create New Customer Account/input_Confirm Password_password_confirmation'), 
    conformpass)

WebUI.click(findTestObject('Object Repository/Page_Create New Customer Account/span_Create an Account'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_My Account/div_Thank you for registering with Main Web_e69dd7'), 
    'Thank you for registering with Main Website Store.')

WebUI.click(findTestObject('Object Repository/Page_My Account/button_Change'))

WebUI.click(findTestObject('Object Repository/Page_My Account/a_Sign Out'))

WebUI.closeBrowser()

