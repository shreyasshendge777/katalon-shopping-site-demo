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

WebUI.navigateToUrl('https://magento.softwaretestingboard.com/')

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Sign In'))

WebUI.setText(findTestObject('Object Repository/Page_Customer Login/input_Email_loginusername'), 'shreyasshendge16@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Customer Login/input_Password_loginpassword'), 'of74Vg7RlpvqmTAp11jSRw==')

WebUI.click(findTestObject('Object Repository/Page_Customer Login/span_Sign In'))

WebUI.click(findTestObject('Object Repository/Page_Home Page/span_Shorts_ui-menu-icon ui-icon ui-icon-carat-1-e'))

WebUI.click(findTestObject('Object Repository/Page_Gear/a_Bags'))

WebUI.click(findTestObject('Object Repository/Page_Bags - Gear/img_Add to Compare_product-image-photo'))

WebUI.click(findTestObject('Object Repository/Page_Driven Backpack/span_Add to Cart'))

WebUI.click(findTestObject('Object Repository/Page_Driven Backpack/button_Change'))

WebUI.click(findTestObject('Object Repository/Page_Driven Backpack/a_Sign Out'))

WebUI.closeBrowser()

