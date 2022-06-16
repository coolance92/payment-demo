package com.atguigu.paymentdemo.service;

import java.security.GeneralSecurityException;
import java.util.Map;

public interface WxPayService {

    Map<String, Object> nativePay(Long productId) throws Exception;

}
