import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.driver.WebUIDriverType as DriverType

/**
 * "Test Cases/Combinator"
 */

// run Mobile test
Mobile.callTestCase(findTestCase("Test Cases/BrinsmartCabang/tes"), null)

// run WebUI test while launching PC Chrome browser explicitly without calling WebUI.openBrowser('')
WebUI.callTestCase(findTestCase("Test Cases/BrinsmartCabang/Captive/02 UW - Approve TMO"), null)