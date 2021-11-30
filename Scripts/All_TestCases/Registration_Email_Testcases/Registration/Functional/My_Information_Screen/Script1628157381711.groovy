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
import com.kms.katalon.core.annotation.Keyword as Keyword

Mobile.setText(findTestObject('User_Registration/Registration_Screen/MyInformation/android.widget.EditText - First Name'), 
    'Jack', 0)

Mobile.setText(findTestObject('User_Registration/Registration_Screen/MyInformation/android.widget.EditText - Last Name'), 
    'Daniel', 0)

Mobile.tap(findTestObject('User_Registration/Registration_Screen/MyInformation/android.widget.EditText - Gender'), 0)

Mobile.selectListItemByLabel(findTestObject('User_Registration/Registration_Screen/MyInformation/android.widget.CheckedTextView - Male'), 
    'Male', 1)

//Mobile.tap(findTestObject('User_Registration/Registration_Screen/MyInformation/android.widget.EditText - When is your birthday'), 5)
Mobile.tap(findTestObject('User_Registration/Registration_Screen/MyInformation/android.widget.ImageButton'), 0)

Mobile.longPress(findTestObject('User_Registration/Registration_Screen/MyInformation/android.widget.EditText - 2021'), 1993, 
    FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('User_Registration/Registration_Screen/MyInformation/android.widget.EditText - 2021'), '1993', 
    0)

Mobile.longPress(findTestObject('User_Registration/Registration_Screen/MyInformation/android.widget.EditText - Aug'), 0)

Mobile.hideKeyboard()
Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('User_Registration/Registration_Screen/MyInformation/android.widget.Button - Continue'), 0)

//Mobile.setText(findTestObject('User_Registration/Registration_Screen/MyInformation/android.widget.EditText - 2021'), '1993', 0)
//Mobile.tap(findTestObject('User_Registration/Registration_Screen/MyInformation/android.widget.Button'), 0)
//def RN = ((Math.random() * 16473289) as int)
//println("'$RN'")
String mail = CustomKeywords.'com.arabbank.RandomEmail.RandomEmail.getEmail'('Nikhil', 'Gmail.com')

Mobile.setText(findTestObject('User_Registration/Registration_Screen/MyInformation/android.widget.EditText - Email'), mail, 
    0)

Mobile.setText(findTestObject('User_Registration/Registration_Screen/MyInformation/android.widget.EditText - Password'), 
    'Aa@123456', 0)

Mobile.setText(findTestObject('User_Registration/Registration_Screen/MyInformation/android.widget.EditText - Confirm Password'), 
    'Aa@123456', 1)

Mobile.swipe(400, 600, 0, 0)

Mobile.tap(findTestObject('User_Registration/Registration_Screen/MyInformation/android.widget.Button - Signup'), 60)

Mobile.delay(30, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot()

