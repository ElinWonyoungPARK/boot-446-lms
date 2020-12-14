package com.example.demo.sym.service.impl;

import com.example.demo.cmm.mpr.TeacherMapper;
import com.example.demo.sym.service.TeacherService;
import com.example.demo.sym.service.model.TeacherDto;

import org.springframework.beans.factory.annotation.Autowired;

public class TeacherServiceImpl implements TeacherService {
    @Autowired TeacherMapper teacherMapper;
    @Override
    public int register(TeacherDto teacher) {
        return teacherMapper.insert(teacher);
    }
    
}
