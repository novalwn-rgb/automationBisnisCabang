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

Mobile.startApplication('C:\\Users\\ACER\\Downloads\\smart-staging (1).apk', false)

Mobile.setText(findTestObject('Brinsmart/Login/InputEmail'), 'cob.jakarta1.admin', 0)

Mobile.hideKeyboard()

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Brinsmart/Login/BtnEnter'), 0)

Mobile.tap(findTestObject('Brinsmart/Login/VerifyOTP'), 0)

Mobile.setText(findTestObject('Brinsmart/Login/otp1'), '1', 0)

Mobile.setText(findTestObject('Brinsmart/Login/otp2'), '2', 0)

Mobile.setText(findTestObject('Brinsmart/Login/otp3'), '3', 0)

Mobile.setText(findTestObject('Brinsmart/Login/otp4'), '4', 0)

Mobile.setText(findTestObject('Brinsmart/Login/otp5'), '5', 0)

Mobile.setText(findTestObject('Brinsmart/Login/otp6'), '6', 0)

Mobile.tap(findTestObject('Brinsmart/Dashboard/BurgerMenu'), 0)

Mobile.tap(findTestObject('Brinsmart/Dashboard/MenuAkseptasi COB'), 0)

Mobile.tap(findTestObject('Brinsmart/Dashboard/SubMenuSubmit'), 0)

Mobile.tap(findTestObject('Brinsmart/Dashboard/FirstSubList'), 0) //tes dulu xpath ini bisa dipakai kesemua tidak

Mobile.scrollToText('Closing Instruction', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Brinsmart/FlowButton/Button - Closing Instruction'), 0)

Mobile.closeApplication()

