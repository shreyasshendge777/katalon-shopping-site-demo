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

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Contact Us'))

WebUI.setText(findTestObject('Object Repository/Page_Contact Us/input_Name_name'), 'abc')

WebUI.setText(findTestObject('Object Repository/Page_Contact Us/input_Email_email'), 'wwee@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Contact Us/input_Phone Number_telephone'), '7897654367')

WebUI.setText(findTestObject('Object Repository/Page_Contact Us/textarea_Whats on your mind_comment'), 'my questions 346776')

WebUI.click(findTestObject('Object Repository/Page_Contact Us/span_Submit'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Contact Us/div_Thanks for contacting us with your comm_f3fccf'), 
    'Thanks for contacting us with your comments and questions. We\'ll respond to you very soon.')

