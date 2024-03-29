package com.miooyuki.docsys.service.impl;

import com.miooyuki.docsys.mapper.DocumentContentMapper;
import com.miooyuki.docsys.service.DocumentContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DocumentContentServiceImpl implements DocumentContentService {

    @Autowired
    DocumentContentMapper mapper;

    @Override
    public String getById(String id) {
        return mapper.selectById(id).getContent();
    }

}
