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

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Log in or sign up with WordPress.com'), 0)

Mobile.setText(findTestObject('android.widget.EditText - Email address'), GlobalVariable.email_1, 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Continue'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Password'), GlobalVariable.password, 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Continue (1)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - CREATE WORDPRESS.COM SITE'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Try the new Jetpack app'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Continue without Jetpack'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Add new site'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Add self-hosted site'), 0)

Mobile.setText(findTestObject('android.widget.EditText - Site address'), GlobalVariable.sampleBlogAddress, 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Continue (2)'), 0)



