package com.miooyuki.docsys.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DocumentContent {

    // ID
    @TableId
    private String id;
    // 文档ID
    private String docId;
    // 文档内容
    private String content;

}
