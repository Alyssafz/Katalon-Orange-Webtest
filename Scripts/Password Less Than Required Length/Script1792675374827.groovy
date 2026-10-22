import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.llm.keyword.LlmKeywords as LLM
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

WebUI.openBrowser(null)

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

WebUI.callTestCase(findTestCase('Login Success'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Password Less Than Required Length/Page_OrangeHRM/button_Add'))

WebUI.click(findTestObject('Password Less Than Required Length/Page_OrangeHRM/div_Select'))

WebUI.click(findTestObject('Password Less Than Required Length/Page_OrangeHRM/div_Admin'))

WebUI.click(findTestObject('Password Less Than Required Length/Page_OrangeHRM/div_Select_1'))

WebUI.click(findTestObject('Password Less Than Required Length/Page_OrangeHRM/div_Admin'))

WebUI.setText(findTestObject('Password Less Than Required Length/Page_OrangeHRM/input_Type for hints'), 'jan')

WebUI.click(findTestObject('Password Less Than Required Length/Page_OrangeHRM/span_Jane Jane Doe Doe'))

WebUI.setText(findTestObject('Password Less Than Required Length/Page_OrangeHRM/input_oxd-input oxd-input-active'), 'kuraku')

WebUI.setEncryptedText(findTestObject('Password Less Than Required Length/Page_OrangeHRM/input_oxd-input oxd-input-active_1'), 
    'hsPFm2cfhkw=')

WebUI.setEncryptedText(findTestObject('Password Less Than Required Length/Page_OrangeHRM/input_oxd-input oxd-input-active_2'), 
    'hsPFm2cfhkw=')

WebUI.click(findTestObject('Password Less Than Required Length/Page_OrangeHRM/button_Save'))

WebUI.click(findTestObject('Password Less Than Required Length/Page_OrangeHRM/span_Should have at least 7 characters'))

WebUI.click(findTestObject('Password Less Than Required Length/Page_OrangeHRM/input_oxd-input oxd-input-active oxd-input-er'))

