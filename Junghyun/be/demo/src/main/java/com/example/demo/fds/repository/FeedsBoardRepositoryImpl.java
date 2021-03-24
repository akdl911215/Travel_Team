package com.example.demo.fds.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import jdk.internal.jline.internal.Log;


@Repository
public class FeedsBoardRepositoryImp implements FeedsBoardRepository {

    private final JdbcTemplate JdbcTemplate;

    @Override
    public void create(FeedsBoard board) throws Exception {
        Log.info("FeedsBoardRepo create()");

        String query = insert into board(title, content, writer) values(?, ?, ?);

        jdbcTemplate.update(query, board.getTile(), board.getContent(), board.getWriter());
    }

    @Override
    public void delete(Long boardNo) throws Exception {
        String query = "delete from board where board_no = ?";
        JdbcTemplate.update(query, boardNo);
    }

    @Override
    public List<FeedsDto> list() throws Exception {
      log.info("fBoardRepo list()");

      List<FeedsDto> results = JdbcTemplate.query(
          "select board_no, title, content, writer, reg_Date, hash_tag, add_location from board where board_no > 0 order by board_no desc, reg_date desc",
          new RowMapper<FeedsDto>() {
              @Override
              public FeedsDto mapRow(Resultset rs, int rowNum)
          }
      ))
        return null;
    }

    @Override
    public FeedsBoard read(Long boardNo) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void update(FeedsBoard board) throws Exception {
        // TODO Auto-generated method stub
        
    }

    

}
