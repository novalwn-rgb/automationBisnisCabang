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
import com.kms.katalon.core.testobject.SelectorMethod as SelectorMethod

WebUI.openBrowser('https://staging.underwriting.web.brinesia.app/')

WebUI.setText(findTestObject('Underwriting/Login/inputEmail'), 'ery.sukartini')

WebUI.click(findTestObject('BusinessRM/buttonEnter'))

WebUI.waitForAlert(10, FailureHandling.STOP_ON_FAILURE)

WebUI.acceptAlert()

WebUI.setText(findTestObject('Underwriting/Login/inputOTP'), '123456')

WebUI.click(findTestObject('Underwriting/Approve TMO/Dashboard/burgerMenu'))

WebUI.click(findTestObject('Other Cabang/Lampung/UW/Menu/Menu Akseptasi COB'))

WebUI.click(findTestObject('BusinessRM/closeInstallApp'))

WebUI.click(findTestObject('Other Cabang/Lampung/UW/Menu/Menu Approval'))

WebUI.click(findTestObject('Underwriting/Approve JTL/Dashboard/LastNextSub'))

WebUI.click(findTestObject('Other Cabang/Lampung/UW/Ery/LastSubDetail1'))

WebUI.scrollToElement(findTestObject('Other Cabang/Lampung/UW/Ery/SecSubjectivity'), 0)

WebUI.scrollToElement(findTestObject('Underwriting/Approve JTL/SecFasterDecision1'), 0)

WebUI.setText(findTestObject('Other Cabang/Lampung/UW/Ery/InputDisposisi'), 'Lorem Ipsum is simply dummy text of the printing and typesetting industry.')

WebUI.sendKeys(findTestObject('Other Cabang/Lampung/UW/Ery/InputDisposisi'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Other Cabang/Lampung/UW/Ery/InputPutusan'), 'Lorem Ipsum is simply dummy text of the printing and typesetting industry.')

WebUI.sendKeys(findTestObject('Other Cabang/Lampung/UW/Ery/InputPutusan'), Keys.chord(Keys.ENTER))

WebUI.scrollToElement(findTestObject('Putusan/SecDok Putusan'), 0)

WebUI.delay(10)

WebUI.click(findTestObject('Underwriting/Approve JTL/Btn Closing Instruction1'))

WebUI.waitForAlert(10, FailureHandling.STOP_ON_FAILURE)

WebUI.acceptAlert()

WebUI.waitForAlert(10, FailureHandling.STOP_ON_FAILURE)

WebUI.acceptAlert()

// Case Error
//WebUI.click(findTestObject('Other Cabang/Padang/UW/Nila/LastSubDetail1'))
//
//WebUI.scrollToElement(findTestObject('Other Cabang/Padang/UW/Nila/SecSubjectivity'), 0)
//
//WebUI.scrollToElement(findTestObject('Underwriting/Approve JTL/SecFasterDecision1'), 0)
//
//WebUI.scrollToElement(findTestObject('Putusan/SecDok Putusan'), 0)
//
WebUI.closeBrowser()

