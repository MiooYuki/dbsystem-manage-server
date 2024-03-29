package com.miooyuki.docsys.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Document {

    // ID
    @TableId(type = IdType.ASSIGN_UUID)
    private String id;
    // 文档名称
    private String name;
    // 文档描述
    private String description;
    // 文档封面地址
    private String imageUrl;

}
