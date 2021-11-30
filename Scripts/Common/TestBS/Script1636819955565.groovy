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

Mobile.startApplication('bs://86de7f6c25f7ca42f4b43560c65ef4a47eb9d1be', true)

Mobile.delay(20, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/TestBS/android.widget.Button - English'), 0)

Mobile.tap(findTestObject('Object Repository/TestBS/android.widget.Button - Skip'), 0)

Mobile.tap(findTestObject('Object Repository/TestBS/android.widget.Button - Have an account Login'), 0)

Mobile.setText(findTestObject('Object Repository/TestBS/android.widget.EditText - Email address'), 'mobile1@ab.com', 0)

Mobile.setText(findTestObject('Object Repository/TestBS/android.widget.EditText - Password'), 'Aa@123456', 0)

Mobile.tap(findTestObject('Object Repository/TestBS/android.widget.Button - Login'), 0)

Mobile.delay(20, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Object Repository/TestBS/android.widget.EditText'), '6', 0)

Mobile.setText(findTestObject('Object Repository/TestBS/android.widget.EditText (1)'), '6', 0)

Mobile.setText(findTestObject('Object Repository/TestBS/android.widget.EditText (2)'), '6', 0)

Mobile.setText(findTestObject('Object Repository/TestBS/android.widget.EditText (3)'), '6', 0)

Mobile.setText(findTestObject('Object Repository/TestBS/android.widget.EditText (4)'), '6', 0)

Mobile.setText(findTestObject('Object Repository/TestBS/android.widget.EditText (5)'), '6', 0)

Mobile.tap(findTestObject('Object Repository/TestBS/android.widget.Button - Verify'), 0)

WebUI.callTestCase(findTestCase('Common/Swipe_Saving Space'), [:], FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/TestBS/android.widget.Button - Add Saving Space'), 0)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/TestBS/android.view.ViewGroup'), 0)

Mobile.setText(findTestObject('Object Repository/TestBS/android.widget.EditText - What do you want to name this space'), 
    'TestBS', 0)

Mobile.setText(findTestObject('Object Repository/TestBS/android.widget.EditText - Where are you going'), 'Cloud', 0)

Mobile.setText(findTestObject('Object Repository/TestBS/android.widget.EditText - When are you traveling'), 'Network', 0)

Mobile.tap(findTestObject('Object Repository/TestBS/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/TestBS/android.widget.ImageView'), 0)

Mobile.setText(findTestObject('Object Repository/TestBS/android.widget.EditText - 0'), '20', 0)

Mobile.tap(findTestObject('Object Repository/TestBS/android.widget.Button - Next'), 0)

Mobile.closeApplication()

