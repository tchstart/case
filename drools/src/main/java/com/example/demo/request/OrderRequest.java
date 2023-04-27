package com.example.demo.request;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderRequest {
 /**
  * 客户号
  */
 private String customerNumber;
 /**
  * 年龄
  */
 private Integer age;
 /**
  * 订单金额
  */
 private Integer amount;
 /**
  * 客户类型
  */
 private CustomerType customerType;
}