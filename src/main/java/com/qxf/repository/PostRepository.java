package com.qxf.repository;

import org.springframework.data.repository.CrudRepository;

import com.qxf.entity.Post;

public interface PostRepository extends CrudRepository<Post, Long>{

}
