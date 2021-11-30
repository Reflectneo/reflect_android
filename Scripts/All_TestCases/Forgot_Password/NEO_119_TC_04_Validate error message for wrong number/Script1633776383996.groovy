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

Mobile.setText(findTestObject('Forgot Password/android.widget.EditText - Mobile Number'), '770909090', 0)

Mobile.tap(findTestObject('Forgot Password/android.widget.Button - Reset Password'), 0)

'5 sec wait'
Mobile.delay(5)

Mobile.takeScreenshot()

'Verify error message for wrong mobile number'
Mobile.verifyElementExist(findTestObject('Forgot Password/android.widget.TextView - The information you entered is invalid'), 
    0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Forgot Password/android.widget.Button - OK'), 0)

Mobile.setText(findTestObject('Forgot Password/android.widget.EditText - Mobile Number'), '781234568', 0)

Mobile.tap(findTestObject('Forgot Password/android.widget.Button - Reset Password'), 10)

