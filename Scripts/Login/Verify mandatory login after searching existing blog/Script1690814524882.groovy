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

Mobile.startApplication(RunConfiguration.getProjectDir() + GlobalVariable.appPath, true)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Enter your existing site address'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Site address (1)'), 'https://samplekatalontomi.wordpress.com/', 
    0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Continue (7)'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Email address (5)'), 'ahmadbustomi1507@gmail.com', 
    0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Continue (8)'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Password (2)'), 'Tu4nt0m1!', 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Continue (9)'), 0)

WebUI.verifyTextPresent('samplekatalontomi.wordpress.com', false)

Mobile.closeApplication()

