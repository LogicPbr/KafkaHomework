package com.logic.homework.demo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * CopyRright(c)2017-2020 Logic  <p>
 * Package com.logic.homework.demo
 * FileName  Consumer <p>
 * Describe  <p>
 * author   logic <p>
 * version  v1.0 <p>
 * CreateDate  2021-01-03 11:11 <p>
 */
@Component
public class Consumer {

    @KafkaListener(topics = "topictest", groupId = "springboottopic-group")
    public void onMessage(String msg){
        System.out.println("----收到消息："+msg+"----");
    }
}
