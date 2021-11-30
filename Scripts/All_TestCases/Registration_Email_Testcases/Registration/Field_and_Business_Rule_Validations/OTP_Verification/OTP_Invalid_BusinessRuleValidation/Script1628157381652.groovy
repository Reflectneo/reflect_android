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
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.AppiumDriver as AppiumDriver
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

Mobile.setText(findTestObject('User_Registration/Registration_Screen/MobileVerificationViaOTP/android.widget.EditText'), 
    '5', 0)

Mobile.setText(findTestObject('User_Registration/Registration_Screen/MobileVerificationViaOTP/android.widget.EditText (1)'), 
    '5', 0)

Mobile.setText(findTestObject('User_Registration/Registration_Screen/MobileVerificationViaOTP/android.widget.EditText (2)'), 
    '5', 0)

Mobile.setText(findTestObject('User_Registration/Registration_Screen/MobileVerificationViaOTP/android.widget.EditText (3)'), 
    '5', 0)

Mobile.setText(findTestObject('User_Registration/Registration_Screen/MobileVerificationViaOTP/android.widget.EditText (4)'), 
    '5', 0)

Mobile.setText(findTestObject('User_Registration/Registration_Screen/MobileVerificationViaOTP/android.widget.EditText (5)'), 
    '6', 0)

Mobile.takeScreenshot()

//Mobile.verifyElementExist(findTestObject('User_Registration/Registration_Screen/MobileVerificationViaOTP/android.widget.Button - Verify'),	0)
Mobile.tap(findTestObject('User_Registration/Registration_Screen/MobileVerificationViaOTP/android.widget.Button - Verify'), 
    10)

'5 sec wait'
Mobile.delay(5)



'Verify Invalid OTP'
Mobile.verifyElementExist(findTestObject('User_Registration/Registration_Screen/MobileVerificationViaOTP/android.widget.TextView - The code you entered is not valid'), 
    0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('User_Registration/Registration_Screen/MobileVerificationViaOTP/android.widget.Button - OK'), 
    10)


