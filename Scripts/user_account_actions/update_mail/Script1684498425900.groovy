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

WebUI.click(findTestObject('Object Repository/Page_Home Page/button_Change'))

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_My Account'))

WebUI.click(findTestObject('Object Repository/Page_My Account/span_Edit'))

WebUI.click(findTestObject('Object Repository/Page_Account Information/input_Last Name_change_email'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Account Information/input_Current Password_current_password'), 
    '9NLz+4tGZcQ=')

WebUI.setText(findTestObject('Object Repository/Page_Account Information/input_Email_email'), 'shreyasshendge16@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Account Information/input_Current Password_current_password'), 
    'of74Vg7RlpvqmTAp11jSRw==')

WebUI.click(findTestObject('Object Repository/Page_Account Information/span_Save'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Customer Login/div_You saved the account information'), 
    0)

WebUI.setText(findTestObject('Object Repository/Page_Customer Login/input_Email_loginusername'), 'shreyasshendge16@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Customer Login/input_Password_loginpassword'), 'of74Vg7RlpvqmTAp11jSRw==')

WebUI.click(findTestObject('Object Repository/Page_Customer Login/span_Sign In'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_My Account/span_My Account'), 0)

