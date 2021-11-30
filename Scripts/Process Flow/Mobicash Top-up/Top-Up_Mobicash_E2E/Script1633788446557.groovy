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

'Click on Card Dashboard'
Mobile.tap(findTestObject('Card Dashboard/android.widget.TextView - Total Balance'), 0)

'Click on Top up plus icon'
Mobile.tap(findTestObject('Top Up/Top Up Home/android.widget.Button-Open Top Up'), 0)

'Click on Card Top-up'
Mobile.tap(findTestObject('Top Up/Top Up Home/android.widget.TextView - Debitcredit card Top-up'), 0)

'Take A screenshot'
Mobile.takeScreenshot()

'Enter Top-up amount'
Mobile.setText(findTestObject('Top Up/Card Top-up/android.widget.EditText - Top-up Amount'), '500', 0)

'Click on Next'
Mobile.tap(findTestObject('Top Up/Card Top-up/android.widget.Button - Next'), 0)

'CLick Yes Button'
Mobile.tap(findTestObject('Top Up/Card Top-up/android.widget.Button - No For Arab Bank debit card'), 10)

Mobile.delay(2)

'CLick Yes Button'
Mobile.tap(findTestObject('Top Up/Card Top-up/android.widget.Button - Yes  For Arab Bank debit card'), 10)

Mobile.delay(10)

'Verify Mobi Cash Screen'
Mobile.tap(findTestObject('Top Up/Card Top-up/android.widget.Button - Pay the bill'), 10)

Mobile.delay(5)

'Take A screenshot'
Mobile.takeScreenshot()

'Enter Card Number'
Mobile.setText(findTestObject('Top Up/Card Top-up/android.widget.EditText - Card number'), GlobalVariable.Card_Number, 0)

'Enter Expiry Date'
Mobile.setText(findTestObject('Top Up/Card Top-up/android.widget.EditText - Valid thru'), GlobalVariable.ExpiryDate, 0)

'Enter CVV'
Mobile.setText(findTestObject('Top Up/Card Top-up/android.widget.EditText - CVV'), GlobalVariable.CVV, 0)

Mobile.takeScreenshot()

'Click on  Continue Button'
Mobile.tap(findTestObject('Top Up/Card Top-up/android.widget.Button - Continue'), 10)

Mobile.delay(10)

Mobile.takeScreenshot()

'CLick on Pay Button'
Mobile.tap(findTestObject('Top Up/Card Top-up/android.view.View - Pay'), 10)

Mobile.delay(5)

Mobile.tap(findTestObject('Top Up/Card Top-up/android.view.View-Child'), 10)
Mobile.delay(2)

Mobile.tap(findTestObject('Top Up/Card Top-up/android.view.View-Parent'), 10)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Top Up/Card Top-up/android.widget.Button - Done'), 10)

Mobile.takeScreenshot()

