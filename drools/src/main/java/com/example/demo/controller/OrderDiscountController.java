package com.example.demo.controller;


import com.example.demo.request.OrderDiscount;
import com.example.demo.request.OrderRequest;
import com.example.demo.service.OrderDiscountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Spring Boot 整合 规则引擎Drools，很强！
 *  *网上购物，
 *  * 需要根据不同的规则计算商品折扣，
 *  * 比如VIP客户增加5%的折扣，
 *  * 购买金额超过1000元的增加10%的折扣等，
 *  * 而且这些规则可能随时发生变化，
 *  * 甚至增加新的规则。
 *  * 我们可以通过规则引擎来实现，Drools 就是一个开源的业务规则引擎
 */
@RestController
public class OrderDiscountController {

    @Autowired
    private OrderDiscountService orderDiscountService;

    @PostMapping("/get-discount")
    public ResponseEntity<OrderDiscount> getDiscount(@RequestBody OrderRequest orderRequest) {
        OrderDiscount discount = orderDiscountService.getDiscount(orderRequest);
        return new ResponseEntity<>(discount, HttpStatus.OK);
    }
}