package com.miooyuki.docsys.service;

import com.miooyuki.docsys.common.result.ResponseResult;
import com.miooyuki.docsys.entity.Category;

import java.util.List;

public interface CategoryService {

    ResponseResult<List<Category>> findAll();

}
