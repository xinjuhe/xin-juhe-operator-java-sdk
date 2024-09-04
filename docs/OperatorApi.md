# OperatorApi

All URIs are relative to *https://api.juhe.xin*

Method | HTTP request | Description
------------- | ------------- | -------------
[**request**](OperatorApi.md#request) | **POST** /sw/api/v1/code/request | 请求下发验证码接口
[**verify**](OperatorApi.md#verify) | **POST** /sw/api/v1/code/verify | 请求校验验证码接口


<a name="request"></a>
# **request**
> OutResponseOfCodeResponse request(request)

请求下发验证码接口

请求下发验证码接口

### Example
```java
// Import classes:
import xin.juhe.operator.ApiClient;
import xin.juhe.operator.ApiException;
import xin.juhe.operator.Configuration;
import xin.juhe.operator.auth.*;
import xin.juhe.operator.models.*;
import xin.juhe.operator.api.OperatorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.juhe.xin");
    
    // Configure OAuth2 access token for authorization: Authorization
    OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setAccessToken("YOUR ACCESS TOKEN");

    OperatorApi apiInstance = new OperatorApi(defaultClient);
    CodeRequest request = new CodeRequest(); // CodeRequest | request
    try {
      OutResponseOfCodeResponse result = apiInstance.request(request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OperatorApi#request");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CodeRequest**](CodeRequest.md)| request |

### Return type

[**OutResponseOfCodeResponse**](OutResponseOfCodeResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**201** | Created |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

<a name="verify"></a>
# **verify**
> OutResponseOfCodeResponse verify(verify)

请求校验验证码接口

请求校验验证码接口

### Example
```java
// Import classes:
import xin.juhe.operator.ApiClient;
import xin.juhe.operator.ApiException;
import xin.juhe.operator.Configuration;
import xin.juhe.operator.auth.*;
import xin.juhe.operator.models.*;
import xin.juhe.operator.api.OperatorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.juhe.xin");
    
    // Configure OAuth2 access token for authorization: Authorization
    OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setAccessToken("YOUR ACCESS TOKEN");

    OperatorApi apiInstance = new OperatorApi(defaultClient);
    CodeVerify verify = new CodeVerify(); // CodeVerify | verify
    try {
      OutResponseOfCodeResponse result = apiInstance.verify(verify);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OperatorApi#verify");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **verify** | [**CodeVerify**](CodeVerify.md)| verify |

### Return type

[**OutResponseOfCodeResponse**](OutResponseOfCodeResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**201** | Created |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

