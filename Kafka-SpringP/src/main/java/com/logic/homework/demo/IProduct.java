package com.logic.homework.demo;

import org.springframework.web.bind.annotation.RequestParam;

/**
 * CopyRright(c)2017-2020 Logic  <p>
 * FileName  IProduct <p>
 * Describe  <p>
 * author   logic <p>
 * version  v1.0 <p>
 * CreateDate  2021-01-03 11:13 <p>
 */
public interface IProduct {

    public String send(@RequestParam String msg);
}
