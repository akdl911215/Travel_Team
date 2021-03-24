package com.example.demo.fds.repository;

import org.eclipse.jdt.internal.compiler.codegen.ExceptionLabel;

public interface FeedsBoardRepository {

    public void create(FeedsBoard board) throws Exception;
    public List<FeedsDto> list() throws Exception;
    public FeedsBoard read(Long boardNo) throws Exception;
    public void delete(Long boardNo) throws Exception;
    public void update(FeedsBoard board) throws Exception;

}