package com.miooyuki.docsys.service.impl;

import com.miooyuki.docsys.common.result.ResponseResult;
import com.miooyuki.docsys.entity.Category;
import com.miooyuki.docsys.mapper.CategoryMapper;
import com.miooyuki.docsys.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryMapper categoryMapper;

    @Override
    public ResponseResult<List<Category>> findAll() {
        List<Category> categories = categoryMapper.selectList(null);
        ResponseResult<List<Category>> response = ResponseResult.success();
        response.setData(categories);
        return response;
    }

}
