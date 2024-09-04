/*
 * 运营商业务API接口
 * 运营商业务API接口平台应用程序接口文档
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: henryxm@163.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package xin.juhe.operator.api;

import xin.juhe.operator.ApiException;
import xin.juhe.operator.model.CodeRequest;
import xin.juhe.operator.model.CodeVerify;
import xin.juhe.operator.model.OutResponseOfCodeResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OperatorApi
 */
@Ignore
public class OperatorApiTest {

    private final OperatorApi api = new OperatorApi();

    
    /**
     * 请求下发验证码接口
     *
     * 请求下发验证码接口
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void requestTest() throws ApiException {
        CodeRequest request = null;
        OutResponseOfCodeResponse response = api.request(request);

        // TODO: test validations
    }
    
    /**
     * 请求校验验证码接口
     *
     * 请求校验验证码接口
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void verifyTest() throws ApiException {
        CodeVerify verify = null;
        OutResponseOfCodeResponse response = api.verify(verify);

        // TODO: test validations
    }
    
}
