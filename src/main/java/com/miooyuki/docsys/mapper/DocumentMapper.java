package com.miooyuki.docsys.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.miooyuki.docsys.entity.Document;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DocumentMapper extends BaseMapper<Document> {

}
