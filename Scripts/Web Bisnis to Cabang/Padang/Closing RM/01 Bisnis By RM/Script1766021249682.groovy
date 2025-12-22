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
import java.util.Arrays as Arrays

WebUI.openBrowser('https://staging.tis.web.brinesia.app/')

WebUI.setText(findTestObject('BusinessRM/inputEmail'), 'cob.padang.rm')

WebUI.click(findTestObject('BusinessRM/buttonEnter'))

WebUI.waitForAlert(10, FailureHandling.STOP_ON_FAILURE)

WebUI.acceptAlert()

WebUI.setText(findTestObject('BusinessRM/inputOTP'), '123456')

WebUI.waitForAlert(10, FailureHandling.STOP_ON_FAILURE)

WebUI.dismissAlert()

WebUI.click(findTestObject('BusinessRM/BurgerMenu'))

WebUI.click(findTestObject('Other Cabang/Padang/Bisnis/Menu Aksep COB'))

WebUI.click(findTestObject('Other Cabang/Padang/Bisnis/Menu Submission'))



//WebUI.click(findTestObject('BusinessRM/tambahData'))
//
//WebUI.click(findTestObject('BusinessRM/TidakSub'))
//
//def dropdownObject1 = findTestObject('BusinessRM/Nama Relationship Manager')
//
//WebUI.selectOptionByLabel(dropdownObject1, 'COB Jakarta 1 RM', false)
//
//WebUI.click(findTestObject('BusinessRM/closeInstallApp'))
//
//// Closing Instruction by RM
//WebUI.click(findTestObject('BusinessRM/Non-Captive'))
//
//WebUI.click(findTestObject('BusinessRM/sumberBisnis'))
//
//def dropdownObject2 = findTestObject('BusinessRM/sumberBisnis')
//
//WebUI.selectOptionByLabel(dropdownObject2, 'Direct', false)
//
//WebUI.waitForElementClickable(findTestObject('BusinessRM/sumberBisnis'), 0)
//
//WebUI.setText(findTestObject('BusinessRM/COB'), 'PROPERTY')
//
//WebUI.sendKeys(findTestObject('BusinessRM/COB'), Keys.chord(Keys.ENTER))
//
//WebUI.waitForElementClickable(findTestObject('BusinessRM/COB'), 0)
//
//WebUI.setText(findTestObject('BusinessRM/TOC'), 'Rumahku')
//
//WebUI.sendKeys(findTestObject('BusinessRM/TOC'), Keys.chord(Keys.ENTER))
//
//WebUI.waitForElementClickable(findTestObject('BusinessRM/TOC'), 0)
//
//def dropdownObject3 = findTestObject('BusinessRM/StatusPenutupan')
//
//WebUI.selectOptionByLabel(dropdownObject3, 'New', false)
//
//WebUI.setText(findTestObject('BusinessRM/Tertanggung'), 'Web NonCaptive')
//
//WebUI.click(findTestObject('BusinessRM/lewatiPeriode'))
//
//WebUI.delay(2)
//
//WebUI.scrollToElement(findTestObject('BusinessRM/Departement'), 0)
//
//def dropdownObject4 = findTestObject('BusinessRM/Departement')
//
//WebUI.selectOptionByLabel(dropdownObject4, 'Wholesale', false)
//
//def dropdownObject5 = findTestObject('BusinessRM/Segment')
//
//WebUI.selectOptionByLabel(dropdownObject5, 'INDIVIDUAL', false)
//
//def dropdownObject6 = findTestObject('BusinessRM/TSI_Currency')
//
//WebUI.selectOptionByLabel(dropdownObject6, 'IDR', false)
//
//WebUI.setText(findTestObject('BusinessRM/input_TSI'), '120000000')
//
//WebUI.setText(findTestObject('BusinessRM/input_Share'), '10')
//
//WebUI.setText(findTestObject('BusinessRM/input_Biaya Akuisisi'), '14')
//
//WebUI.setText(findTestObject('BusinessRM/Informasi Objek'), 'Lorem Ipsum is simply dummy text of the printing and typesetting industry.')
//
//WebUI.setText(findTestObject('BusinessRM/input_Loss Record'), 'testing')
//
//def dropdownObject7 = findTestObject('BusinessRM/Frekuensi Klaim')
//
//WebUI.selectOptionByLabel(dropdownObject7, '4', false)
//
//WebUI.setText(findTestObject('BusinessRM/Loss Improvement'), 'testing')
//
//WebUI.setText(findTestObject('BusinessRM/Submission Note'), 'Lanjut TMO')
//
//WebUI.click(findTestObject('BusinessRM/buttonNext'))
//
//WebUI.waitForAlert(10, FailureHandling.STOP_ON_FAILURE)
//
//WebUI.acceptAlert()




//Case error
WebUI.click(findTestObject('BusinessRM/FirstSubList'))

WebUI.click(findTestObject('BusinessRM/buttonNext'))

WebUI.waitForAlert(10, FailureHandling.STOP_ON_FAILURE)

WebUI.acceptAlert()


WebUI.click(findTestObject('BusinessRM/tambahDok'))

WebUI.setText(findTestObject('BusinessRM/namaDok'), 'Dokumen Sample')

WebUI.uploadFile(findTestObject('BusinessRM/AddDok'), 'C:/Users/ACER/Downloads/Sample Dokumen/sample2.jpg')

WebUI.click(findTestObject('BusinessRM/buttonAjukan'))

WebUI.waitForAlert(10, FailureHandling.STOP_ON_FAILURE)

WebUI.acceptAlert()

WebUI.waitForAlert(10, FailureHandling.STOP_ON_FAILURE)

WebUI.acceptAlert()

//Case error 2
//WebUI.scrollToElement(findTestObject('Other Cabang/Padang/Bisnis/Sec Akseptasi'), 0)
//
//WebUI.click(findTestObject('BusinessRM/closeInstallApp'))

WebUI.closeBrowser()