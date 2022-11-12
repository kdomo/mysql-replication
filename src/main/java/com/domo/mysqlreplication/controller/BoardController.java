package com.domo.mysqlreplication.controller;

import com.domo.mysqlreplication.service.BoardService;
import com.domo.mysqlreplication.dto.BoardDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
public class BoardController {
    private final BoardService boardService;

    @GetMapping("/boards")
    public List<BoardDto.Response> findAll() {
        return boardService.findAll();
    }

    @PostMapping("/boards")
    public BoardDto.Response save(@RequestBody String title){
        log.info("BoardDto.Request : title : {}", title);
        return boardService.save(title);
    }

}
