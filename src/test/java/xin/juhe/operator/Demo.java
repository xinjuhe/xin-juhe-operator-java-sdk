package xin.juhe.operator;

import org.junit.Ignore;
import org.junit.Test;
import xin.juhe.operator.api.OauthApi;
import xin.juhe.operator.api.OperatorApi;
import xin.juhe.operator.auth.OAuth;
import xin.juhe.operator.model.CodeRequest;
import xin.juhe.operator.model.CodeVerify;
import xin.juhe.operator.model.OutResponseOfCodeResponse;

@Ignore
public class Demo {

    @Test
    public void demo() throws ApiException {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.juhe.xin");  // host填写渠道的地址

        // Configure OAuth2 access token for authorization: Authorization
        OAuth oAuth = (OAuth) defaultClient.getAuthentication("Authorization");
        OauthApi api = new OauthApi(defaultClient);

        // 在平台的"账户管理--AccessKey管理"菜单中创建AccessKey，获得AccessKey ID和AccessKey Secret
        String accessKeyId = "AccessKey ID";
        String accessKeySecret = "AccessKey Secret";

        //设置授权登录接口的令牌
        oAuth.setAccessToken(api.getToken(accessKeyId, accessKeySecret));

        OperatorApi apiInstance = new OperatorApi(defaultClient);
        CodeRequest request = new CodeRequest();
        //在后台渠道管理里面创建，创建后，需要填写回调地址，当业务处理成功后将推送数据到你的业务系统
        request.setChannel("channel");
        //用户的手机号码
        request.setMobile("mobile");
        //后台"运营商业务-产品详情"中的产品ID
        request.setProduct("product");
        //提交发送验证码的请求
        OutResponseOfCodeResponse result = apiInstance.request(request);
        if (null != result) {
            if (null != result.getData()) {
                System.out.println("请求下发验证码成功，订单号:" + result.getData().getOrderId());
                //如果未获取到返回的订单号信息，业务可能已失败，无需验证请求
                String orderId = result.getData().getOrderId();
                CodeVerify verify = new CodeVerify();
                //填写用户收到的验证码
                verify.setCode("123456");
                //填写从验证码请求接口中返回的订单号
                verify.setOrderId(orderId);
                //当用户收到验证码后，调用验证接口进行验证，验证成功后，将扣除费用，并回调到业务系统中
                OutResponseOfCodeResponse verifyResponse = apiInstance.verify(verify);
                if (null != verifyResponse) {
                    if (null != verifyResponse.getData()) {
                        System.out.println("验证码验证成功，订单号:" + verifyResponse.getData().getOrderId());
                    } else
                        System.out.println(result.getMsg());
                } else {
                    System.out.println("请求错误");
                }
            } else {
                System.out.println(result.getMsg());
            }
        } else {
            System.out.println("请求错误");
        }
    }

    /**
     * 回调函数示例
     * 使用CallbackData来接收后台回调信息
     * 后台接收到http status code为200，认为回调成功，一般情况，业务系统正常返回有效字符串
    @RequestMapping(value = "demoback", method = RequestMethod.POST)
    public String demoback(@RequestBody CallbackData data, HttpServletRequest servlet) {
        System.out.println( new Gson().toJson(data));
        return "success";
    }
    */
}