package com.dss.order.controller;

import com.dss.order.domain.Student;
import com.dss.order.service.StudentService;
import io.swagger.annotations.Api;
import kafka.utils.Json;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.xml.ws.Response;
import java.util.List;

/**
 * @author xiaorong.fu
 * @version 1.0
 * @ClassName StudentController
 * @Description TODO
 * @date 2019/12/16 16:49
 **/
@RestController
@RequestMapping("/student")
@Api(value = "StudentController", description = "测试相关API")
public class StudentController {

    @Resource
    private StudentService studentService;

    @RequestMapping(name = "/all", method = RequestMethod.GET)
    public ResponseEntity<JsonResult> getAllSutdent() {
        JsonResult result = new JsonResult();
        List<Student> students = studentService.selectByExample(null);
        if (students != null && students.size() > 0) {
            result.setStatus(JsonResult.RESULT_OK);
            result.setResult(students);
            return ResponseEntity.ok(result);
        }
        result.setStatus(JsonResult.RESULT_FAIL);
        return ResponseEntity.ok(result);
    }
}
