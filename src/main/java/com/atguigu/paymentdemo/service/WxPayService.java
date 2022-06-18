package com.atguigu.paymentdemo.service;

import java.security.GeneralSecurityException;
import java.util.Map;

public interface WxPayService {

    Map<String, Object> nativePay(Long productId) throws Exception;

    void processOrder(Map<String, Object> bodyMap) throws GeneralSecurityException;

    void cancelOrder(String orderNo) throws Exception;

    String queryOrder(String orderNo) throws Exception;

}
