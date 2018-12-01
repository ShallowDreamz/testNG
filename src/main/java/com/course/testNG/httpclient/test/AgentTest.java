package com.course.testNG.httpclient.test;

import com.course.testNG.httpclient.httpclientUtils.HttpClientDriver;
import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;

public class AgentTest {
    private final static Logger logger = LoggerFactory.getLogger(AgentTest.class);
    @Test
    public void getListAll(){
        String url = "http://192.168.47.128:8080/agent3.0/selectEmployeeUseRedis/12";
        String body = "{\"id\" :\"1\" ,\"name\" : \"\",\"sex\" : \"\",\"age\":\"\",\"address\" : \"\",\"birthday\" : \"\"}";
        HashMap map = new HashMap();
        map.put("Content-Type","application/json");
        JSONObject jsonObject = JSONObject.parseObject(body);
        List list = null;
        try {
            list = HttpClientDriver.httpPost(url,jsonObject,map);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        logger.info("=====" + list);
    }
}
