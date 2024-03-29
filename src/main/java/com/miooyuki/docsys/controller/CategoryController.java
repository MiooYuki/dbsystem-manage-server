package com.miooyuki.docsys.controller;

import com.miooyuki.docsys.common.result.ResponseResult;
import com.miooyuki.docsys.entity.Category;
import com.miooyuki.docsys.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    /**
     * 获取所有分类
     */
    @GetMapping("/list")
    public ResponseResult<List<Category>> findAll() {
        return categoryService.findAll();
    }

}
