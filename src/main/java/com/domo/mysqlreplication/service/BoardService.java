package com.domo.mysqlreplication.service;

import com.domo.mysqlreplication.Entity.Board;
import com.domo.mysqlreplication.dto.BoardDto;
import com.domo.mysqlreplication.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional
public class BoardService {
    private final BoardRepository boardRepository;

    @Transactional(readOnly = true)
    public List<BoardDto.Response> findAll() {

        List<BoardDto.Response> list = boardRepository.findAll().stream()
                .map((board) -> new BoardDto.Response(board.getTitle()))
                .collect(Collectors.toList());
        return list;
    }

    @Transactional
    public BoardDto.Response save(String title) {
        Board board = new Board(title);
        Board saveBoard = boardRepository.save(board);
        return BoardDto.Response.builder()
                .title(saveBoard.getTitle())
                .build();
    }
}
