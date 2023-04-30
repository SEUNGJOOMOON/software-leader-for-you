package com.test.controller;

import com.test.model.BoardVO;
import com.test.service.BoardService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class BoardController {

    private final BoardService boardService;

    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @GetMapping("/boards")
    public String findAll(Model model) {
        List<BoardVO> boardList = boardService.findAll();
        model.addAttribute("boardList", boardList);
        return "boardList";
    }

    @GetMapping("/board/{id}")
    public String findById(@PathVariable Long id, Model model) {
        BoardVO board = boardService.findById(id);
        model.addAttribute("board", board);
        return "boardUpdate";
    }

    @GetMapping("/board/new")
    public String createForm(Model model) {
        model.addAttribute("board", new BoardVO());
        return "boardInsert";
    }

    @PostMapping("/board/new")
    public String create(BoardVO board) {
        boardService.save(board);
        return "redirect:/boards";
    }

    @GetMapping("/board/edit/{id}")
    public String updateForm(@PathVariable Long id, Model model) {
        BoardVO board = boardService.findById(id);
        model.addAttribute("board", board);
        return "board/form";
    }

    @PostMapping("/board/edit/{id}")
    public String update(@PathVariable Long id, BoardVO board) {
        boardService.update(board);
        return "redirect:/board/" + id;
    }

    @GetMapping("/board/delete/{id}")
    public String deleteById(@PathVariable Long id) {
        boardService.deleteById(id);
        return "redirect:/boards";
    }
}
