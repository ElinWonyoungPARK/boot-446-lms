package com.example.demo.sym.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import java.util.HashMap;
import java.util.Map;

import com.example.demo.sym.service.TeacherService;
import com.example.demo.sym.service.model.TeacherDto;

@RestController
@RequestMapping("/teachers")
public class TeacherController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired TeacherService teacherService;
    @PostMapping ("")
    public Map<?,?> register(@RequestBody TeacherDto teacher){
        var map = new HashMap<>();
        logger.info("등록하려는 강사정보: "+teacher.toString());
        int result = teacherService.register(teacher);
        map.put("message", (result == 1) ? "SUCCESS": "FAILUER");
        return map;
    }
}
