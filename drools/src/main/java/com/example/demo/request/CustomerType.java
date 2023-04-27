package com.example.demo.request;

/**
 * @className: CustomerType
 * @author: woniu
 * @date: 2023/4/25
 **/
public enum CustomerType {
    LOYAL, NEW, DISSATISFIED;

    public String getValue() {
        return this.toString();
    }

}
