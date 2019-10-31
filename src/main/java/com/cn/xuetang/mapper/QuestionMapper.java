package com.cn.xuetang.mapper;

import com.cn.xuetang.po.Quentions;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface QuestionMapper {

    int insertQuestion(Quentions quentions);

    Quentions selectOne(String q_id);

    List<Quentions> selectAll(@Param("q_fl")String q_fl);

    int delOne(String q_id);
}
