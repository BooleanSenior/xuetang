package com.cn.xuetang.mapper;

import com.cn.xuetang.po.CommentCustom;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@Mapper
public interface CommentMapper {

    int insertComment(CommentCustom commentCustom);

    List<CommentCustom> selectOneComment (String c_cover);

    int delOneComment(String c_id);

   // int updateComment(@Param("c_id")String c_id,@Param("c_fellgood")String c_fellgood);

    int updateComment(CommentCustom commentCustom);
}
