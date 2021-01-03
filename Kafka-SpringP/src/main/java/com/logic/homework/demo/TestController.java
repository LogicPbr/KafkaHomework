package com.logic.homework.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * CopyRright(c)2017-2020 Logic  <p>
 * Package com.logic.homework.demo
 * FileName  TestController <p>
 * Describe  <p>
 * author   logic <p>
 * version  v1.0 <p>
 * CreateDate  2021-01-03 11:12 <p>
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private IProduct product;

    @RequestMapping("/test")
    public void test(String msg) {
        product.send(msg);
    }
}
