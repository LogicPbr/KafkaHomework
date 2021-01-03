package com.logic.homework.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * CopyRright(c)2017-2020 Logic  <p>
 * Package com.logic.homework.demo
 * FileName  Product <p>
 * Describe  <p>
 * author   logic <p>
 * version  v1.0 <p>
 * CreateDate  2021-01-03 11:10 <p>
 */
@Service
public class Product implements IProduct{
    @Autowired
    private KafkaTemplate<String,Object> kafkaTemplate;

    public String send(String msg){
        kafkaTemplate.send("topictest", msg);
        return "ok";
    }
}
