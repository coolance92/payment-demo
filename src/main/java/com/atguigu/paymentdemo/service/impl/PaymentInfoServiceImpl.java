package com.atguigu.paymentdemo.service.impl;

import com.atguigu.paymentdemo.entity.PaymentInfo;
import com.atguigu.paymentdemo.mapper.PaymentInfoMapper;
import com.atguigu.paymentdemo.service.PaymentInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class PaymentInfoServiceImpl extends ServiceImpl<PaymentInfoMapper, PaymentInfo> implements PaymentInfoService {

}
