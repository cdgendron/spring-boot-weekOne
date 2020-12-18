package com.gendronPortfolio.socialMediaApi.repository;

import org.springframework.data.repository.CrudRepository;

import com.gendronPortfolio.socialMediaApi.entity.Post;

public interface PostRepository extends CrudRepository<Post, Long> {

}
