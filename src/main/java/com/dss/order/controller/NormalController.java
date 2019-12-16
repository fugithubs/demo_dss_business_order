package com.dss.order.controller;


import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/normal")
@Api(value = "NormalController", description = "测试相关API")
public class NormalController {

    private final static Logger logger = LoggerFactory.getLogger(NormalController.class);

    @PostMapping("/get/params")
    public ResponseEntity<JsonResult> getParams(@RequestParam("name") String name,
                                                @RequestParam("age") Integer age,
                                                @RequestParam("hight") Double hight) {
        logger.info("param name is "+name+",param age is "+age+",param hight is "+hight);
        JsonResult result = new JsonResult();
        if (name == null || name == "" || age == null) {
            result.setStatus(JsonResult.RESULT_ERROR);
            result.setResult("param is empty.");
            return ResponseEntity.ok(result);
        }
        result.setStatus(JsonResult.RESULT_OK);
        Map<String, Object> map = new HashMap<>(2);
        map.put("name", name);
        map.put("age", age);
        map.put("hight",hight);
        result.setResult(map);
        return ResponseEntity.ok(result);
    }

    @PostMapping("/testback")
    public ResponseEntity<JsonResult> testback() {
        JsonResult result = new JsonResult();
        result.setStatus(JsonResult.RESULT_OK);
        result.setResult("test result back.");
        return ResponseEntity.ok(result);
    }
}
