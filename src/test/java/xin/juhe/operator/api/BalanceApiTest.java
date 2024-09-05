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
import xin.juhe.operator.model.OutResponseOfBalance;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BalanceApi
 */
@Disabled
public class BalanceApiTest {

    private final BalanceApi api = new BalanceApi();

    /**
     * 获取用户余额
     *
     * 获取用户余额
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getBalanceTest() throws ApiException {
        OutResponseOfBalance response = api.getBalance();
        // TODO: test validations
    }

}
