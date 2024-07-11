package com.example.testdemo.controller;

import com.example.testdemo.dto.InfoAddParams;
import com.example.testdemo.dto.PersonAddParams;
import com.example.testdemo.entity.Info;
import com.example.testdemo.entity.Person;
import com.example.testdemo.vo.Result;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/info")
public class InfoController {

    private static final List<Info> infoList = new ArrayList<>();

    /**
     * 新增接口
     *
     * @param params
     * @return
     */
    @PostMapping("/add")
    public Result add(@RequestBody InfoAddParams params) {
        Info info = new Info();
        BeanUtils.copyProperties(params, info);
        info.setId(UUID.randomUUID().toString());
        infoList.add(info);
        return Result.success(null);

    }

    /**
     * 列表接口
     *
     * @return
     */
    @GetMapping("/list")
    public Result<List<Info>> list() {
        return Result.success(infoList);
    }

}

