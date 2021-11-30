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

'Start The application'
Mobile.startApplication('bs://30690c8e0c9387d4de5e2cbd0d6f9e5db931769c', true)

Mobile.delay(5)

Mobile.takeScreenshot()

'Navigate to signup-page'
if (Mobile.verifyElementVisible(findTestObject('AfterInvokeApplication/android.widget.Button - English'), 10) == true) {
    Mobile.tap(findTestObject('AfterInvokeApplication/android.widget.Button - English'), 0)

    Mobile.tap(findTestObject('AfterInvokeApplication/android.widget.Button - Skip'), 5)
}

'Click on Login Button'
Mobile.tap(findTestObject('User_Login/android.widget.Button - Have an account Login'), 30)

'Enter Valid Email on EMail ID fields'
Mobile.setText(findTestObject('User_Login/android.widget.EditText - Email address'), 'mobile1@ab.com', 0)

'Enter Valid Password on Password  fields'
Mobile.setText(findTestObject('User_Login/android.widget.EditText - Password'), 'Aa@123456', 0)

'Click on Login Button'
Mobile.tap(findTestObject('User_Login/android.widget.Button - Login'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('All_TestCases/Registration_Email_Testcases/Registration/Functional/OTP_Verification'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(30)

Mobile.takeScreenshot()

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

'Take A screenshot'
Mobile.takeScreenshot()

Mobile.tap(findTestObject('User_Registration/Registration_Screen/MobileVerificationViaOTP/android.widget.Button - Verify'), 
    10)

Mobile.takeScreenshot()

Mobile.delay(5)

'Click On Done'
Mobile.tap(findTestObject('Top Up/Card Top-up/android.widget.Button - Done'), 10)

Mobile.delay(5)

//def TB = TotalBalance + '100'
//def FinalTotalBalance = Mobile.getText(findTestObject('User_Registration/Registration_Screen/MobileNumberForRegistration/android.widget.EditText - Mobile Number'), 
// 10)
'Verify Total Balance'

//Mobile.verifyEqual(FinalTotalBalance, TB)
'Take A screenshot'
Mobile.takeScreenshot()

Mobile.delay(5)

Mobile.closeApplication()

