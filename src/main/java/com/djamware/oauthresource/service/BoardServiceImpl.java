package com.djamware.oauthresource.service;

import com.djamware.oauthresource.entity.Board;
import com.djamware.oauthresource.repository.IBoardRepository;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements IBoardService {
    private final IBoardRepository boardRepository;

    public BoardServiceImpl(IBoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    @Override
    public Iterable<Board> findAll() {
        return boardRepository.findAll();
    }
}
