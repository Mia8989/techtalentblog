package com.tts.techtalentblog.repo;

import com.tts.techtalentblog.blogpost.BlogPost;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogPostRepository extends CrudRepository<BlogPost, Long> {

}

