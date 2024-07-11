package com.example.testdemo.controller;

import com.example.testdemo.dto.PersonAddParams;
import com.example.testdemo.entity.Person;
import com.example.testdemo.vo.Result;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/person")
public class PersonController {

    private static final List<Person> personList = new ArrayList<>();

    /**
     * 新增接口
     *
     * @param params
     * @return
     */
    @PostMapping("/add")
    public Result add(@RequestBody PersonAddParams params) {
        Person person = new Person();
        BeanUtils.copyProperties(params, person);
        person.setId(UUID.randomUUID().toString());
        personList.add(person);
        return Result.success(null);
    }

    /**
     * 列表接口
     *
     * @return
     */
    @GetMapping("/list")
    public Result<List<Person>> list() {
        return Result.success(personList);
    }
}

