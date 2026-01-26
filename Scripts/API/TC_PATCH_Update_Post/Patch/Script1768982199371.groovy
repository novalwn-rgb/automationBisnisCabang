import com.kms.katalon.core.testobject.ResponseObject

ResponseObject response =
    com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords.sendRequest(
        com.kms.katalon.core.testobject.ObjectRepository.findTestObject(
            'API/Posts/PATCH_Update_Post'
        )
    )

com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords.verifyResponseStatusCode(response, 200)

println response.getResponseBodyContent()
