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
public class Category {

    // ID
    @TableId(type = IdType.ASSIGN_UUID)
    private String id;
    // 分类名称
    private String name;

}
