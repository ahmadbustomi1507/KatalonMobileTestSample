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

Mobile.startApplication('C:\\Users\\Tomi\\IntelliJIDEAProjects\\MyApplication\\output\\WordPress – Website Builder_22.7_Apkpure.apk', 
    true)

Mobile.tap(findTestObject('Object Repository/android.widget.Button'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Email address (2)'), 'mail@gmail.com', 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Continue (4)'), 0)

Mobile.setText(findTestObject(''), 'testingNewUser', 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Password (1)'), 'samplePassword123!', 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Continue (5)'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/android.widget.TextView - The username or password you entered is incorrect'), 
    'The username or password you entered is incorrect')

Mobile.closeApplication()
