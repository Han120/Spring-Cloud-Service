package com.ahut.system.controller;

/**
 * @author hanzijian
 * @description:
 * @create 2021-05-21 15:28
 */

import com.ahut.api.domain.Dept;
import com.ahut.system.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dept")
public class DeptController {
    @Autowired
    private DeptService service;

    @PostMapping("/add")
    public boolean add(@RequestBody Dept dept) {
        return service.add(dept);
    }

    @GetMapping("/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return service.get(id);
    }

    @GetMapping("/list")
    public List<Dept> list() {
        return service.list();
    }
}
