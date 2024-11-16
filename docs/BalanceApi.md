# BalanceApi

All URIs are relative to *https://api.juhe.xin*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBalance**](BalanceApi.md#getBalance) | **POST** /user/api/v1/balance | 获取用户余额


<a name="getBalance"></a>
# **getBalance**
> OutResponseOfBalance getBalance()

获取用户余额

获取用户余额

### Example
```java
// Import classes:
import xin.juhe.operator.ApiClient;
import xin.juhe.operator.ApiException;
import xin.juhe.operator.Configuration;
import xin.juhe.operator.auth.*;
import xin.juhe.operator.models.*;
import xin.juhe.operator.api.BalanceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.juhe.xin");
    
    // Configure OAuth2 access token for authorization: Authorization
    OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setAccessToken("YOUR ACCESS TOKEN");

    BalanceApi apiInstance = new BalanceApi(defaultClient);
    try {
      OutResponseOfBalance result = apiInstance.getBalance();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BalanceApi#getBalance");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OutResponseOfBalance**](OutResponseOfBalance.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**201** | Created |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

