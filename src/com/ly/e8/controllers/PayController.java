package com.ly.e8.controllers;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ly.e8.config.Config;
import com.ly.e8.entity.Callback;
import com.ly.e8.entity.Order;
import com.ly.e8.helper.Helper;
import com.ly.e8.helper.SignUtil;

@Controller
@RequestMapping("/")
public class PayController {
	
	//下单页面
	@GetMapping("/")
	public String view(Model model) {
		model.addAttribute("callback", Config.notify_url);
		return "index";
	}
	
	//下单接口
	@SuppressWarnings("deprecation")
	@PostMapping("pay")
	public void placeOrder(Order order, HttpServletRequest request, HttpServletResponse response) throws IOException {
		//空参数过滤并转为URL请求格式
		String signParams = Helper.filterNullParams(order, null);
		//RSA签名
		String sign = SignUtil.getSign("RSA_1_256", signParams);
		//所有value进行urlEncode
		String params = Helper.valueToUrlEncode(signParams)+"&ly_sign="+URLEncoder.encode(sign);
		//重定向
		response.sendRedirect(Config.req_url+"?"+params);
	}
	
	//异步回调接口
	@PostMapping("callback")
	@ResponseBody
	public String callback(Callback callback){
		boolean valid = false;
		String errMsg = "";
		try {
			valid = Helper.checkSign(callback);//验证签名
			//业务逻辑
		} catch (Exception e) {
			errMsg = e.getMessage();
		}
		return valid ? "ok" : errMsg;
	}
	
	//同步回调接口
	@GetMapping("callback")
	public String callback(Callback callback, Model model) throws Exception {
		boolean valid = false;
		String errMsg = "";
		try {
			valid = Helper.checkSign(callback);//验证签名
			//业务逻辑
		} catch (Exception e) {
			errMsg = e.getMessage();
		}
		model.addAttribute("message", valid ? "回调成功" : errMsg != "" ? errMsg : "验签失败");
		return "pay_result";
	}
	
}
