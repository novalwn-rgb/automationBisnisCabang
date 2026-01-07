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

Mobile.tap(findTestObject('Brinsmart/Dashboard/BtnTambah'), 0)

Mobile.tap(findTestObject('Brinsmart/Page 1/RadioButton - Tidak'), 0)

Mobile.tap(findTestObject('Brinsmart/Page 1/RadioButton - Non Captive'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Brinsmart/Page 1/Sumber Bisnis/KlikSumberBisnis'), 0)

Mobile.tap(findTestObject('Brinsmart/Page 1/Sumber Bisnis/SB - Direct'), 0)

Mobile.setText(findTestObject('Brinsmart/Page 1/InputCOB'), 'PROPERTY', 0)

Mobile.setText(findTestObject('Brinsmart/Page 1/InputTOC'), 'PSAKI', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Brinsmart/Page 1/Status Penutupan/PilihStatusPenutupan'), 0)

Mobile.tap(findTestObject('Brinsmart/Page 1/Status Penutupan/android.widget.TextView - New'), 0)

Mobile.scrollToText('Lanjutkan', FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Brinsmart/Page 1/InputTertanggung'), 'BandingFinal2', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Brinsmart/Page 1/Department/PilihDepartemen'), 0)

Mobile.tap(findTestObject('Brinsmart/Page 1/Department/android.widget.TextView - Fire  Engineering'), 0)

Mobile.tap(findTestObject('Brinsmart/Page 1/Segmen/PilihSegmen'), 0)

Mobile.tap(findTestObject('Brinsmart/Page 1/Segmen/android.widget.TextView - BANCASSURANCE'), 0)

Mobile.tap(findTestObject('Brinsmart/Page 1/BtnLanjutkan 1'), 0)

Mobile.tap(findTestObject('Brinsmart/Page 2/Tanggal/Periode awal'), 0)

Mobile.tap(findTestObject('Brinsmart/Page 2/Tanggal/TglAwal 17'), 0)

Mobile.tap(findTestObject('Brinsmart/Page 2/Tanggal/BtnTgl - OK'), 0)

Mobile.tap(findTestObject('Brinsmart/Page 2/Tanggal/Periode akhir'), 0)

Mobile.tap(findTestObject('Brinsmart/Page 2/Tanggal/TglAkhir 18'), 0)

Mobile.tap(findTestObject('Brinsmart/Page 2/Tanggal/BtnTgl - OK'), 0)

Mobile.setText(findTestObject('Brinsmart/Page 2/InputTSI'), '10.000.000', 0)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('Brinsmart/Page 2/InputShare'), '70', 0)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('Brinsmart/Page 2/InputAkuisisi'), '10', 0)

Mobile.scrollToText('Lanjutkan', FailureHandling.STOP_ON_FAILURE)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('Brinsmart/Page 2/InputInformasiObjek'), 'Lorem Ipsum is simply dummy text of the printing and typesetting industry', 
    0)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('Brinsmart/Page 2/InputlossRecord'), 'Testing QA', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Brinsmart/Page 2/Frekuensi Claim/PilihFrekuensiClaim'), 0)

Mobile.tap(findTestObject('Brinsmart/Page 2/Frekuensi Claim/android.widget.TextView - 6'), 0)

Mobile.setText(findTestObject('Brinsmart/Page 2/InputLossImprovement'), 'Testing QA', 0)

Mobile.hideKeyboard()

//Case Error
//				Mobile.tap(findTestObject('Brinsmart/Dashboard/FirstSubList'), 0)
//				
//				Mobile.scrollToText('Lanjutkan', FailureHandling.STOP_ON_FAILURE)
//				
//				Mobile.tap(findTestObject('Brinsmart/Page 1/BtnLanjutkan 1'), 0)
//				
//				Mobile.scrollToText('Lanjutkan', FailureHandling.STOP_ON_FAILURE)
//				
//				Mobile.tap(findTestObject('Brinsmart/Page 2/Frekuensi Claim/PilihFrekuensiClaim'), 0)
//				
//				Mobile.tap(findTestObject('Brinsmart/Page 2/Frekuensi Claim/android.widget.TextView - 6'), 0)
//				
//				Mobile.tap(findTestObject('Brinsmart/Page 2/BtnLanjutkan 2'), 0)
//End Case Error
Mobile.tap(findTestObject('Brinsmart/Page 2/BtnLanjutkan 2'), 0)

Mobile.tap(findTestObject('Brinsmart/Sample Dokumen/BtnTambah Dokumen'), 0)

Mobile.setText(findTestObject('Brinsmart/Sample Dokumen/InputNamaDok'), 'Sample Dok PDF', 0)

Mobile.tap(findTestObject('Brinsmart/Sample Dokumen/AcceptNamaDok'), 0)

Mobile.tap(findTestObject('Brinsmart/Sample Dokumen/AttachDok'), 0)

Mobile.tap(findTestObject('Brinsmart/Sample Dokumen/DokPdf'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Brinsmart/Sample Dokumen/InputNoteMessage'), 'Lanjut TMO', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Brinsmart/BtnAjukan'), 0)

Mobile.tap(findTestObject('Brinsmart/Btn BacktoHome'), 0)
//Sementara
//Mobile.tap(findTestObject('Brinsmart/Dashboard/FirstSubList'), 0)
//
//Mobile.scrollToText('Update', FailureHandling.STOP_ON_FAILURE)

//end sementara

Mobile.closeApplication()

