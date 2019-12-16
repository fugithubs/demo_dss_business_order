package com.dss.order.controller;

import com.dss.order.domain.Student;
import com.dss.order.service.StudentService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
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

    private final static Logger logger = LoggerFactory.getLogger(StudentController.class);

    @Resource
    private StudentService studentService;

    @GetMapping("/all")
    public ResponseEntity<JsonResult> getAllSutdent() {
        logger.info("<<执行/student/all方法开始>>");
        JsonResult result = new JsonResult();
        List<Student> students = studentService.selectByExample(null);
        if (students != null && students.size() > 0) {
            result.setStatus(JsonResult.RESULT_OK);
            result.setResult(students);
            logger.info("<<执行/student/all方法返回数据>>");
            return ResponseEntity.ok(result);
        }
        result.setStatus(JsonResult.RESULT_FAIL);
        logger.error("<<执行/student/all方法无数据>>");
        return ResponseEntity.ok(result);
    }

    /**
     * 分页查询学生数据
     * @param page
     * @return
     */
    @GetMapping("/page")
    public ResponseEntity<JsonResult> getPageInfo(@RequestParam("page") Integer page){
        if (page==null) {
            page = 1;
        }
        PageHelper.startPage(page,3);
        List<Student> students = studentService.selectByExample(null);
        PageInfo<Student> pageInfo = new PageInfo<>(students);
        JsonResult result = new JsonResult();
        result.setStatus(JsonResult.RESULT_OK);
        result.setResult(pageInfo);
        return ResponseEntity.ok(result);
    }
}
