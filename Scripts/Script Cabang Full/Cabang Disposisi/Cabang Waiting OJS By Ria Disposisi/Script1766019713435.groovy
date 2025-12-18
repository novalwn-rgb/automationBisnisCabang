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

//Step 1 Cabang
WebUI.openBrowser('https://staging.cabang.web.brinesia.app/')

WebUI.setText(findTestObject('Underwriting/Login/inputEmail'), 'ria.novriani')

WebUI.click(findTestObject('BusinessRM/buttonEnter'))

WebUI.waitForAlert(10, FailureHandling.STOP_ON_FAILURE)

WebUI.acceptAlert()

WebUI.setText(findTestObject('Underwriting/Login/inputOTP'), '123456')

WebUI.click(findTestObject('Underwriting/Approve TMO/Dashboard/burgerMenu'))

WebUI.click(findTestObject('Cabang/Menu/Menu PenerbitanPolis'))

WebUI.click(findTestObject('BusinessRM/closeInstallApp'))

WebUI.click(findTestObject('Cabang/Menu/SubMenuDisposisi'))

WebUI.click(findTestObject('Cabang/Dashboard/SubDetail By Ria Disposisi'))

WebUI.scrollToElement(findTestObject('Cabang/Disposisi/SecDisposisi'), 0)

WebUI.setText(findTestObject('Cabang/Disposisi/PilihDisposisi'), 'Septian Adi Wibowo')

WebUI.sendKeys(findTestObject('Cabang/Disposisi/PilihDisposisi'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Cabang/Disposisi/NoteDisposisi'), 'Bisa Dilanjut testing Automation QA2')

WebUI.click(findTestObject('Cabang/BtnSubmit by Ria'))

WebUI.waitForAlert(10, FailureHandling.STOP_ON_FAILURE)

WebUI.acceptAlert()

//script test suite
WebUI.click(findTestObject('BusinessRM/BurgerMenu'))

WebUI.click(findTestObject('BusinessRM/SignOut'))

