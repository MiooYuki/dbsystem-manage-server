package com.miooyuki.docsys.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.miooyuki.docsys.common.result.ResponseResult;
import com.miooyuki.docsys.entity.Document;
import com.miooyuki.docsys.entity.vo.DocumentVo;
import com.miooyuki.docsys.mapper.DocumentMapper;
import com.miooyuki.docsys.service.DocumentService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DocumentServiceImpl implements DocumentService {

    @Autowired
    DocumentMapper documentMapper;

    @Override
    public ResponseResult<List<DocumentVo>> findAll() {
        List<Document> documentList = documentMapper.selectList(null);
        List<DocumentVo> voList = new ArrayList<>();
        for (Document document : documentList) {
            DocumentVo vo = new DocumentVo();
            BeanUtils.copyProperties(document, vo);
            voList.add(vo);
        }
        ResponseResult<List<DocumentVo>> response = ResponseResult.success();
        response.setData(voList);
        return response;
    }

    @Override
    public ResponseResult<Page<DocumentVo>> findPage(long current, long size) {
        return null;
    }

    @Override
    public ResponseResult<DocumentVo> findById(String id) {
        Document document = documentMapper.selectById(id);
        if (document != null) {
            DocumentVo vo = new DocumentVo();
            BeanUtils.copyProperties(document, vo);
            ResponseResult<DocumentVo> response = ResponseResult.success("获取成功");
            response.setData(vo);
            return response;
        }
        return ResponseResult.fail("获取失败");
    }

    @Override
    public ResponseResult<String> add(Document document) {
        if (documentMapper.insert(document) > 0) {
            return ResponseResult.success("新建成功");
        } else {
            return ResponseResult.fail("创建失败");
        }
    }

    @Override
    public ResponseResult<String> deleteById(String id) {
        if (documentMapper.deleteById(id) > 0) {
            return ResponseResult.success("删除成功");
        } else {
            return ResponseResult.fail("删除失败");
        }
    }

    @Override
    public ResponseResult<String> edit(Document document) {
        if (documentMapper.updateById(document) > 0) {
            return ResponseResult.success("修改成功");
        }
        return ResponseResult.fail("修改失败");
    }

}
