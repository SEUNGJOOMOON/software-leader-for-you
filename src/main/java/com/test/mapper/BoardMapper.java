package com.test.mapper;

import com.test.model.BoardVO;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface BoardMapper {

    @Select("SELECT * FROM test_board ")
    List<BoardVO> findAll();

    @Select("SELECT * FROM test_board WHERE id = #{id}")
    BoardVO findById(Long id);

    @Insert("INSERT INTO test_board (title, content, author) VALUES (#{title}, #{content}, #{author})")
    void save(BoardVO boardVO);

    @Update("UPDATE test_board SET title = #{title}, content = #{content}, author = #{author} WHERE id = #{id}")
    void update(BoardVO boardVO);

    @Delete("DELETE FROM test_board WHERE id = #{id}")
    void deleteById(Long id);
}
