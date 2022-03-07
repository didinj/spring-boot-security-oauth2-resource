package com.djamware.oauthresource.service;

import com.djamware.oauthresource.entity.Board;

public interface IBoardService {
    Iterable<Board> findAll();
}
