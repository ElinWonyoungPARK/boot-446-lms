package com.example.demo.sym.web;

import java.util.HashMap;
import java.util.Map;

import com.example.demo.sym.service.ManagerService;
import com.example.demo.sym.service.model.ManagerDto;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ManagerController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired ManagerService managerService;
    @PostMapping("/managers")
    public Map<?, ?> register(@RequestBody ManagerDto manager) {
        var map = new HashMap<>();
        logger.info("등록하려는 관리자정보: "+manager.toString());
        int result = managerService.register(manager);
        map.put("message", (result == 1) ? "SUCCESS" : "FAILURE");
        return map;
    }
}
