package com.example.demo.fds.repository;

import java.util.List;

import com.example.demo.fds.domain.FeedsDto;
import com.example.demo.fds.domain.Feeds;

import org.eclipse.jdt.internal.compiler.codegen.ExceptionLabel;
import org.hibernate.sql.Update;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

interface FeedsCustomRepository {
    title, writer, content, add_location, hash_tag;
}

public interface FeedsBoardRepository extends JpaRepository<Feeds, Long>,
                                                                FeedsCustomRepository {

    @Query("insert into FeedsDto(title, writer, content, add_location, hash_tag) values(:title, :writer, :content, :addLocation, :hashTag)")
    public void create(FeedsDto FeedsDto) throws Exception {
        System.out.println("create()");
        Update(@Param("title")String FeedsDto.getTitle(),
                   @Param("writer")String FeedsDto.getWriter(),
                   @Param("content")String FeedsDto.getContent(),
                   @Param("addLocation")String FeedsDto.getAddLocation(),
                   @Param("hashTag")String FeedsDto.getHashTag());
    }

    @Query("SELECT title, writer, content, add_location, hash_tag FROM feeds")
    public void read(FeedsDto FeedsDto) throws Exception {
        System.out.println("create()");
        Update(@Param("title")String FeedsDto.getTitle(),
                   @Param("writer")String FeedsDto.getWriter(),
                   @Param("content")String FeedsDto.getContent(),
                   @Param("addLocation")String FeedsDto.getAddLocation(),
                   @Param("hashTag")String FeedsDto.getHashTag());
    }

    @Query("")
    public void delete(FeedsDto FeedsDto) throws Exception {
        System.out.println("create()");
        Update(@Param("title")String FeedsDto.getTitle(),
                   @Param("writer")String FeedsDto.getWriter(),
                   @Param("content")String FeedsDto.getContent(),
                   @Param("addLocation")String FeedsDto.getAddLocation(),
                   @Param("hashTag")String FeedsDto.getHashTag());
    }

    @Query("")
    public void update(FeedsDto FeedsDto) throws Exception {
        System.out.println("create()");
        Update(@Param("title")String FeedsDto.getTitle(),
                   @Param("writer")String FeedsDto.getWriter(),
                   @Param("content")String FeedsDto.getContent(),
                   @Param("addLocation")String FeedsDto.getAddLocation(),
                   @Param("hashTag")String FeedsDto.getHashTag());
    }

}  