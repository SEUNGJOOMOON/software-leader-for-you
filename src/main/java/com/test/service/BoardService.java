package com.test.service;

import com.test.mapper.BoardMapper;
import com.test.model.BoardVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {

    private final BoardMapper boardMapper;

    public BoardService(BoardMapper boardMapper) {
        this.boardMapper = boardMapper;
    }

    public List<BoardVO> findAll() {
        return boardMapper.findAll();
    }

    public BoardVO findById(Long id) {
        return boardMapper.findById(id);
    }

    public void save(BoardVO boardVO) {
        boardMapper.save(boardVO);
    }

    public void update(BoardVO boardVO) {
        boardMapper.update(boardVO);
    }

    public void deleteById(Long id) {
        boardMapper.deleteById(id);
    }
}
