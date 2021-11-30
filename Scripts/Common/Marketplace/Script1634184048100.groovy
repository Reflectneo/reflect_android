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

Mobile.startApplication('/Users/anuragnawal/Downloads/app-uat-debug (5).apk', true)

WebUI.callTestCase(findTestCase('All_TestCases/Login_Page_Testcases/Email_Login_Screen/NEO_105_TC_07_Validate Login using email and password'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Marketplace/androidx.cardview.widget.MarketPlace'), 0)

Mobile.tap(findTestObject('Object Repository/Marketplace/android.widget.TextView - SHOW ALL'), 0)

WebUI.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Marketplace/android.widget.ListView'), 0)

Mobile.tap(findTestObject('Object Repository/Marketplace/android.view.View - Durable Copper Bench Somethign Else'), 0)

Mobile.tap(findTestObject('Object Repository/Marketplace/android.widget.Button - Add to cart'), 0)

Mobile.getText(findTestObject('Object Repository/Marketplace/android.widget.Button - Apply promo code'), 0)

Mobile.tap(findTestObject('Object Repository/Marketplace/android.widget.Button - Checkout'), 0)

Mobile.tap(findTestObject('Object Repository/Marketplace/android.view.View'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.getText(findTestObject('Object Repository/Marketplace/android.widget.EditText - teat'), 0)

Mobile.getText(findTestObject('Object Repository/Marketplace/android.widget.EditText - mobile'), 0)

Mobile.getText(findTestObject('Object Repository/Marketplace/android.widget.EditText - testmobile1ab.com'), 0)

Mobile.getText(findTestObject('Object Repository/Marketplace/android.widget.EditText - 962789524444'), 0)

Mobile.tap(findTestObject('Object Repository/Marketplace/android.widget.RadioButton - Home delivery service (3JOD Amman - 5JOD other  package) - pay upfront'), 
    0)

Mobile.getText(findTestObject('Object Repository/Marketplace/android.widget.EditText - Jordan'), 0)

Mobile.getText(findTestObject('Object Repository/Marketplace/android.view.View - City'), 0)

Mobile.getText(findTestObject('Object Repository/Marketplace/android.widget.EditText'), 0)

Mobile.getText(findTestObject('Object Repository/Marketplace/android.widget.EditText (1)'), 0)

Mobile.getText(findTestObject('Object Repository/Marketplace/android.widget.EditText (2)'), 0)

Mobile.getText(findTestObject('Object Repository/Marketplace/android.widget.EditText (3)'), 0)

Mobile.tap(findTestObject('Object Repository/Marketplace/android.widget.CheckBox - Save as default'), 0)

Mobile.tap(findTestObject('Object Repository/Marketplace/android.widget.RadioButton - Personal pickup at one of the Store pickup points (FREE)'), 
    0)

Mobile.tap(findTestObject('Object Repository/Marketplace/android.widget.Button - Review and Confirm'), 0)

Mobile.getText(findTestObject('Object Repository/Marketplace/android.widget.TextView - Back'), 0)

Mobile.tap(findTestObject('Object Repository/Marketplace/android.widget.Button - Confirm'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.closeApplication()

