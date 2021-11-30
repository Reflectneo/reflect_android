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

Mobile.startApplication('/Users/anuragnawal/Downloads/app-uat-debug (8).apk', true)

Mobile.setText(findTestObject('Object Repository/TestBS/android.widget.EditText - Email address (1)'), 'mobile1@ab.com', 
    0)

Mobile.setText(findTestObject('Object Repository/TestBS/android.widget.EditText - Password (1)'), 'Aa@123456', 0)

Mobile.tap(findTestObject('Object Repository/TestBS/android.widget.Button - Login (1)'), 0)

Mobile.tap(findTestObject('Object Repository/TestBS/android.widget.Button - Verify (1)'), 0)

Mobile.getText(findTestObject('Object Repository/TestBS/android.widget.TextView - JOD 500.500'), 0)

Mobile.tap(findTestObject('Object Repository/TestBS/android.widget.Button'), 0)

Mobile.tap(findTestObject('Object Repository/TestBS/android.view.ViewGroup (1)'), 0)

Mobile.setText(findTestObject('Object Repository/TestBS/android.widget.EditText - 0 (1)'), '50', 0)

Mobile.tap(findTestObject('Object Repository/TestBS/android.widget.Button - Next (1)'), 0)

Mobile.tap(findTestObject('Object Repository/TestBS/android.widget.Button - Yes'), 0)

Mobile.setText(findTestObject('Object Repository/TestBS/android.widget.EditText - Card Number'), '4475220041777659', 0)

Mobile.tap(findTestObject('Object Repository/TestBS/android.widget.Button - Submit'), 0)

Mobile.setText(findTestObject('Object Repository/TestBS/android.widget.EditText (6)'), '6', 0)

Mobile.setText(findTestObject('Object Repository/TestBS/android.widget.EditText (7)'), '6', 0)

Mobile.setText(findTestObject('Object Repository/TestBS/android.widget.EditText (8)'), '6', 0)

Mobile.setText(findTestObject('Object Repository/TestBS/android.widget.EditText (9)'), '6', 0)

Mobile.setText(findTestObject('Object Repository/TestBS/android.widget.EditText (10)'), '6', 0)

Mobile.setText(findTestObject('Object Repository/TestBS/android.widget.EditText (11)'), '6', 0)

Mobile.tap(findTestObject('Object Repository/TestBS/android.widget.Button - Verify (2)'), 0)

Mobile.closeApplication()

