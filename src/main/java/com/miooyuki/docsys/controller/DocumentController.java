package com.miooyuki.docsys.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.miooyuki.docsys.common.result.ResponseResult;
import com.miooyuki.docsys.entity.Document;
import com.miooyuki.docsys.entity.vo.DocumentVo;
import com.miooyuki.docsys.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/document")
public class DocumentController {

    @Autowired
    DocumentService documentService;

    /**
     * 查询所有文档列表
     */
    @GetMapping("/list")
    public ResponseResult<List<DocumentVo>> findAll() {
        return documentService.findAll();
    }

    /**
     * 分页查询文档列表
     * @param current 当前页码
     * @param size    每页条数
     */
    @GetMapping("/list/{current}/{size}")
    public ResponseResult<Page<DocumentVo>> findPage(@PathVariable("current") long current, @PathVariable("size") long size) {
        return documentService.findPage(current, size);
    }

    /**
     * 根据ID查询文档
     * @param id 文档ID
     */
    @GetMapping("/get")
    public ResponseResult<DocumentVo> findById(@RequestParam("id") String id) {
        System.out.println(id);
        return documentService.findById(id);
    }

    /**
     * 新建文档
     * @param document 文档数据
     */
    @PostMapping("/create")
    public ResponseResult<String> addDocument(@RequestBody Document document) {
        return documentService.add(document);
    }

    /**
     * 删除文档
     * @param id 文档ID
     */
    @DeleteMapping("/delete")
    public ResponseResult<String> deleteDocument(@RequestParam("id") String id) {
        return documentService.deleteById(id);
    }

    /**
     * 修改文档
     * @param document 修改的数据
     */
    @PutMapping("/edit")
    public ResponseResult<String> editDocument(@RequestBody Document document) {
        return documentService.edit(document);
    }

    /**
     * 上传文件
     * @param file 文件
     */
    @PostMapping("/upload")
    public ResponseResult<String> upload(MultipartFile file) throws IOException {
        String fileName = System.currentTimeMillis() + "";
        System.out.println(file.getName());
        System.out.println(file.getOriginalFilename());
        file.transferTo(new File("D:/Software/File Storage/miooyuki-docsys/" + fileName));
        ResponseResult<String> response = ResponseResult.success();
        response.setData("上传成功");
        return response;
    }

}
