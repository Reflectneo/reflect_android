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

'Invoke application'
WebUI.callTestCase(findTestCase('Common/Invoke_Application'), [:], FailureHandling.CONTINUE_ON_FAILURE)

'Click on Register'
Mobile.tap(findTestObject('User_Registration/Registration_Option/android.widget.Button - Register'), 10)

'Enter AB customer Mobile number'
WebUI.callTestCase(findTestCase('All_TestCases/Registration_Email_Testcases/Registration/Functional/Mobile_Registration_AB_Customer'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

'Verify OTP'
WebUI.callTestCase(findTestCase('All_TestCases/Registration_Email_Testcases/Registration/Functional/OTP_Verification'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

'Enter All details'
WebUI.callTestCase(findTestCase('All_TestCases/Registration_Email_Testcases/Registration/Functional/My_Information_Screen'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('All_TestCases/Registration_Email_Testcases/Registration/Functional/Skip_Screen'), [:], 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('All_TestCases/Registration_Email_Testcases/Registration/Functional/Skip_Screen'), [:], 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('All_TestCases/Registration_Email_Testcases/Registration/Functional/Skip_Screen'), [:], 
    FailureHandling.CONTINUE_ON_FAILURE)

'Select the Interest'
WebUI.callTestCase(findTestCase('All_TestCases/Registration_Email_Testcases/Registration/Functional/Interested_Screen'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

'Click On Open Wallet'
WebUI.callTestCase(findTestCase('All_TestCases/Open_Wallet_Testcases/Open Wallet/Functional/OpenWallet_HomePage'), [:], 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('All_TestCases/Registration_Email_Testcases/Registration/Functional/Skip_Screen'), [:], 
    FailureHandling.CONTINUE_ON_FAILURE)

