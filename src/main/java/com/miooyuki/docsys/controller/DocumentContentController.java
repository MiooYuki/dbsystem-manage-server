package com.miooyuki.docsys.controller;

import com.miooyuki.docsys.service.DocumentContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/document/content")
public class DocumentContentController {

    @Autowired
    DocumentContentService service;

    @GetMapping("/get/{id}")
    public String getContent(@PathVariable String id) {
        return service.getById(id);
    }

}
