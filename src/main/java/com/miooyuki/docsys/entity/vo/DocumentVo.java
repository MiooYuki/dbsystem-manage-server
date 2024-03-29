package com.miooyuki.docsys.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DocumentVo {

    // ID
    private String id;
    // 文档名称
    private String name;
    // 文档描述
    private String description;
    // 文档封面地址
    private String imageUrl;

}
