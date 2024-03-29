package com.miooyuki.docsys.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.miooyuki.docsys.common.result.ResponseResult;
import com.miooyuki.docsys.entity.Document;
import com.miooyuki.docsys.entity.vo.DocumentVo;

import java.util.List;

public interface DocumentService {

    ResponseResult<List<DocumentVo>> findAll();

    ResponseResult<Page<DocumentVo>> findPage(long current, long size);

    ResponseResult<DocumentVo> findById(String id);

    ResponseResult<String> add(Document document);

    ResponseResult<String> deleteById(String id);

    ResponseResult<String> edit(Document document);

}
