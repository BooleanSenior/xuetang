package com.cn.xuetang.mapper;

import com.cn.xuetang.po.KnowledgeCustom;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@Mapper
public interface KnowledgeMapper {

   // @Select("select * from knowledge")
       List<KnowledgeCustom> selectKnowledgeList();
}
